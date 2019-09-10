package cipher;

import java.util.Scanner;
import static cipher.CaesarCipher.encrypt;
import static cipher.decryptString.decrypt;

public class Main {
    public static void main(String[]args){
        System.out.println("welcome to encrypt & decrypt");
        System.out.println("enter Text");
        System.out.println("enter Key");
        Scanner cipher= new Scanner(System.in);
        Scanner key =new Scanner(System.in);
        String message=cipher.nextLine();
        Integer n = key.nextInt();
        String encryptText=encrypt(message,n);
        String decryptText=decrypt(message, n);
        System.out.println(encryptText);
        System.out.println(decryptText);
    }
}


