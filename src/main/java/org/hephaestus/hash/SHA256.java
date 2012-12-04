package org.hephaestus.hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * User: radutoev
 * Date: 12.11.2012
 * Time: 19:56
 */
public class SHA256
{
    private static final String ALGORITHM = "SHA-256";

    private static final String UTF8_ENCODING = "UTF-8";

    public static String hash(String value) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        MessageDigest messageDigest = MessageDigest.getInstance(ALGORITHM);
        byte[] hash = messageDigest.digest(value.getBytes(UTF8_ENCODING));
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < hash.length ; ++i){
            sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
}
