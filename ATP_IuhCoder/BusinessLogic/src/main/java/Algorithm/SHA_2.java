package Algorithm;

import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA_2 {
    public String HashCode(String data) throws ATP_ExceptionHandler {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte digest[] = messageDigest.digest(data.getBytes());
            StringBuffer hashCode = new StringBuffer();
            for(int i = 0 ; i < digest.length ; i++){
                hashCode.append(Integer.toString((digest[i] & 0xff) + 0x100,16).substring(1));
            }
            return hashCode.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new ATP_ExceptionHandler(e.getMessage(),11,"SHA_2","Can not create MessageDigest 256");
        }
    }
}
