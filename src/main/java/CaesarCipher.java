import java.util.Scanner;
public class CaesarCipher {
    public static String encrypt(String plainText,int n){
        if(n>26){
            n=n%26;
        }else if(n<26){
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
                        encryptText += (char) (n - (26 + n));
                    } else{
                        encryptText +=al;
                    }
                }
                } else if(Character.isUpperCase(alpha)){
                    char al = (char)(alpha+n);
                    if(al>'Z'){
                        encryptText += (char) (n - (26 + n));
                    } else{
                        encryptText +=al;
                    }

                }else{
                encryptText += alpha;

            }
            }
        return encryptText;
        }
    public static String dencrypt(String plainText,int n){
        if(n>26){
            n=n%26;
        }else if(n<26){
            n=(n%26)+26;
        }
        String encryptText="";
        int length= plainText.length();
        for (int i=0;i<length;i++){
            char alpha = plainText.charAt(i);
            if(Character.isLetter(alpha)){
                if(Character.isLowerCase(alpha)){
                    char al = (char)(alpha+n);
                    if(al<'a'){
                        encryptText += (char) (n + (26 - n));
                    } else{
                        encryptText +=al;
                    }
                }
            } else if(Character.isUpperCase(alpha)){
                char al = (char)(alpha+n);
                if(al<'A'){
                    encryptText += (char) (n + (26 -n));
                } else{
                    encryptText +=al;
                }

            }else{
                encryptText += alpha;

            }
        }
        return encryptText;
    }



    public static void main(String[]args){
        System.out.println("welcome to encript & decrypt");
        System.out.println("welcome to encript & decrypt");
        Scanner cipher= new Scanner(System.in);
        String message=cipher.nextLine();
        String encryptText=encrypt(message,3);
        String decryptText=dencrypt(message, 3);
        System.out.println(encryptText);
        System.out.println(decryptText);



    }
}
