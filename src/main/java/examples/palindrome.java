package examples;

public class palindrome {
    public static void main(String[] args){
        String s = "ababa";
        palindrome(s);
    }
    public static void palindrome(String str){
        int s = str.length();
        for(int i = 0 ; i <s/2; i++){
            if(str.charAt(i) == str.charAt(s-i-1)){
                System.out.println("string is palindrom"+" " +str);
            }

        }
    }
}
