import java.util.Scanner;
public class CaesarCipher {
//////////////////////////////////////////////////////////encryption codes//////////////////////////////////////////////
    public static String encrypt(String plainText,int n){
        if(n>26){
            n=n%26;
        }else if(n<0){
            n=(n%26)+26;
        }
        String encryptText="";
        int length= plainText.length();
        for (int i=0;i<length;i++){
            char alpha = plainText.charAt(i);
            if(Character.isLetter(alpha)){
                if(Character.isLowerCase(alpha)){
                    char al = (char)(alpha+n);
                    if(al>'z'){
                        encryptText += (char) (n - (26 -n));
                    } else{
                        encryptText +=al;
                    }
                }
                 else if(Character.isUpperCase(alpha)){
                    char al = (char)(alpha+n);
                    if(al>'Z'){
                        encryptText += (char) (n - (26 - n));
                    } else{
                        encryptText +=al;
                    }
                }
                }else{
                encryptText += alpha;
            }
            }
        return encryptText;
        }

///////////////////////////////////////////////////////////////////decryption codes/////////////////////////////////////
    public static String decrypt(String plainText,int n){
        if(n>26){
            n=n%26;
        }else if(n<0){
            n=(n%26)+26;
        }
        String encryptText="";
        int length= plainText.length();
        for (int i=0;i<length;i++){
            char alpha = plainText.charAt(i);
            if(Character.isLetter(alpha)){
                if(Character.isLowerCase(alpha)){
                    char al = (char)(alpha);
                    if(al<'a'){
                        encryptText += (char) (n + (26 -n));
                    } else{
                        encryptText +=al;
                    }
                }
                else if(Character.isUpperCase(alpha)){
                    char al = (char)(alpha);
                    if(al<'A'){
                        encryptText += (char) (n + (26 - n));
                    } else{
                        encryptText +=al;
                    }
                }
            }else{
                encryptText += alpha;
            }
        }
        return encryptText;
    }
/////////////////////////////////////////////////////////out put////////////////////////////////////////////////////////
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
