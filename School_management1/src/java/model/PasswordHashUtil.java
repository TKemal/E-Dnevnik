package model;

import java.security.MessageDigest;
public class PasswordHashUtil {
    public static String getHashPass(String password) {

        String passwordForHash = "";
        try {
            String plainText = password;
            MessageDigest mdAlgorithm = MessageDigest.getInstance("MD5");
            mdAlgorithm.update(plainText.getBytes());
            byte[] digest = mdAlgorithm.digest();
            StringBuilder hexString = new StringBuilder();

            for (int i = 0; i < digest.length; i++) {
                plainText = Integer.toHexString(0xFF & digest[i]);

                if (plainText.length() < 2) {
                    plainText = "0" + plainText;
                }

                hexString.append(plainText);
            }
            passwordForHash = hexString.toString();

            return passwordForHash;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
