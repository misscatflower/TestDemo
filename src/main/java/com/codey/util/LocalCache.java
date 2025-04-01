package com.codey.util;

import org.springframework.util.CollectionUtils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class LocalCache {
    
    // 默认缓存时长, 单位秒
    private static final int DEFAULT_TIMEOUT = 3600;

    // 默认缓存容量
    private static final int DEFAULT_SIZE = 1000;

    // 存储数据
    private static final Map<String, Object> data;

    private static final ScheduledExecutorService executorService;

    //初始化
    static {
        data = new ConcurrentHashMap<>(DEFAULT_SIZE);
        executorService = new ScheduledThreadPoolExecutor(2);
    }

    private LocalCache() {
    }

    // 增加缓存, 默认有效时长
    public static void put(String key, Object value) {
        data.put(key, value);

        //定时器 调度任务，用于根据 时间 定时清除 对应key 缓存
        executorService.schedule(() -> remove(key), DEFAULT_TIMEOUT, TimeUnit.SECONDS);
    }

    // 增加缓存,并设置缓存时长,单位秒
    public static void put(String key, Object value, int timeout) {
        data.put(key, value);
        executorService.schedule(() -> remove(key), timeout, TimeUnit.SECONDS);
    }

    // 增加缓存,并指定过期时间
    public static void put(String key, Object value, LocalDateTime expireTime) {
        data.put(key, value);
        LocalDateTime nowTime = LocalDateTime.now();
        if (nowTime.isAfter(expireTime)) {
            throw new RuntimeException("时间已过期");
        }
        long seconds = Duration.between(nowTime, expireTime).getSeconds();
        executorService.schedule(() -> remove(key), seconds, TimeUnit.SECONDS);
    }

    // 批量增加缓存
    public static void put(Map<String, Object> cache) {
        if (!CollectionUtils.isEmpty(cache)) {
            cache.forEach(LocalCache::put);
        }
    }

    // 批量增加缓存,并设置缓存时长,单位秒
    public static void put(Map<String, Object> cache, int timeout) {
        if (!CollectionUtils.isEmpty(cache)) {
            cache.forEach((key, value) -> put(key, value, timeout));
        }
    }

    // 批量增加缓存并指定过期时间
    public static void put(Map<String, Object> cache, LocalDateTime expireTime) {
        if (!CollectionUtils.isEmpty(cache)) {
            cache.forEach((key, value) -> put(key, value, expireTime));
        }
    }

    // 获取缓存
    public static Object get(String key) {
        return data.get(key);
    }

    // 获取当前缓存中所有的key
    public static Set<String> getAllKeys() {
        return data.keySet();
    }

    // 获取所有缓存
    public static Map<String, Object> getAllCache() {
        return data;
    }

    // 判断缓存是否包含key
    public boolean containKey(String key) {
        return data.containsKey(key);
    }

    // 获取当前缓存大小
    public static int size() {
        return data.size();
    }

    // 删除缓存
    public static void remove(String key) {
        data.remove(key);
    }

    // 清空所有缓存
    public static void clear() {
        if (size() > 0) {
            data.clear();
        }
    }

}