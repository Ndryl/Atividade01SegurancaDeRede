package com.exemple;

import java.util.Base64;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.InvalidKeyException;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message to encode using DES");
        String userInput = scanner.nextLine();

        try {
            // Step 1: Generate a DES key (DEVE TER 8 BYTES!)
            String secretKey = "secreteKey";
            DESKeySpec desKeySpec = new DESKeySpec(secretKey.getBytes());
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey1 = secretKeyFactory.generateSecret(desKeySpec);

            // Step 2: Create a cipher instance for encryption and descryption

            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            // step 3: Initialize the Cipher for encrypton
            cipher.init(Cipher.ENCRYPT_MODE, secretKey1);
            // step 4: Encrypt the plaintext
            byte[] cipherTextArray = cipher.doFinal(userInput.getBytes());
            String cipherTextString = Base64.getEncoder().encodeToString(cipherTextArray);
            System.out.println("Cipher text of input data is: " + cipherTextString);
            // step 6: Initialize the Cipher for descryption
            cipher.init(Cipher.DECRYPT_MODE, secretKey1);
            byte[] decodeData = cipher.doFinal(Base64.getDecoder().decode(cipherTextString));

            // step 7: Decrypt the ciphertext
            System.out.println("The decoded data is: " + new String(decodeData));

        } catch (InvalidKeyException e) {
            System.err.println("Chave inválida: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}