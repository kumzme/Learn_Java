package examples;

/*Reverse word by word  in a String.
 with a space
*/
public class reversingExample {


    public static void main(String[] args){

        String input = " The Sky is blue ";
        reverseWords(input);

    }
    public static void reverseWords(String str){
        String[] aa = str.trim().split(" ");
        String revserString = " ";
        for(int i = aa.length-1; i>= 0 ; i--){
           revserString = revserString + aa[i] + " ";
        }
        System.out.println(revserString);
    }

}
