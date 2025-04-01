package com.codey.util;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.properties.PropertyValueEncryptionUtils;
import org.jasypt.util.text.BasicTextEncryptor;

@Slf4j
public final class JasyptEncryptorUtils {
 
 
    private static final String salt = "lybgeek";
 
    private static BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
 
    static {
        basicTextEncryptor.setPassword(salt);
    }
 
    private JasyptEncryptorUtils(){}
 
    /**
     * 明文加密
     * @param plaintext
     * @return
     */
    public static String encode(String plaintext){
        String ciphertext = basicTextEncryptor.encrypt(plaintext);
        return ciphertext;
    }
 
    /**
     * 解密
     * @param ciphertext
     * @return
     */
    public static String decode(String ciphertext){
        ciphertext = "ENC(" + ciphertext + ")";
        if (PropertyValueEncryptionUtils.isEncryptedValue(ciphertext)){
            String plaintext = PropertyValueEncryptionUtils.decrypt(ciphertext,basicTextEncryptor);
            return plaintext;
        }
        log.info("解密失败");
        return "";
    }

    public static void main(String[] args) {
        System.out.println(decode("X230uqpJhWwCUTWawUK/VUCLrSh0kz+X"));
    }
}