package examples;

public class trickyQuestion {
    public static void main(String[] args){
        String input = " arrb6???4xxbl5???eee5 " ;
        char[] chars = input.toCharArray();
        int count = 0 ;
        boolean flag = false;
       for(int i = 0 ; i< chars.length;i++){
           System.out.println(chars[i]);
           if(chars[i] == '?'){
              count = count+1;
           }
       }
       if(count >= 3){
          flag = true;
          System.out.println(flag);
       }
       else{
           flag = false;
           System.out.println(flag);
       }
    }
}
