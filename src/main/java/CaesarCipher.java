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
            char ch = plainText.charAt(i);
            if(Character.isLetter(ch)){

            } else{
                encrypt()
            }
        }
        return encryptText;
    };

    public static void main(String[]args){

    }
}
