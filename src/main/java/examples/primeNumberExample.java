package examples;

public class primeNumberExample {

    public static boolean isPrimeNumber(int num ) {

      if(num <= 1){
          return false;
      }
      for(int i = 2; i < num ; i++){
          if (num % i == 0) { return false;}
      }
      return true;
    }
    public  static void getPrimeNumbers(int num){
        System.out.println("number is prime"+isPrimeNumber(2));
        System.out.println("number is prime"+isPrimeNumber(3));
        System.out.println("number is prime"+isPrimeNumber(4));
        System.out.println("number is prime"+isPrimeNumber(7));
        for(int i =2; i <= num ; i++){
            if(isPrimeNumber(num)){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args){
        getPrimeNumbers(7);
    }



}
