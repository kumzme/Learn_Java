package examples;

public class fibonaciSeriesExamples {
    //0,1,1,2,3,5,8,13, 21,....}

public static long fibrescurive(int i){
    if(i == 0) return 0;
    if (i <=2) return 1;

    long fibTerm = fibrescurive(i -1)+fibrescurive(i-2);
   return fibTerm;
}
public static void fibnaci(int x){
 int lastlast;
 int current =1;
 int last = 0;
 for(int c = 2; c<x;c++){
     lastlast = last;
     last = current;
     current= lastlast+last;
     System.out.print(current);
 }
}
public  static void main(String[] args){

    int numTobePrinted = 20;
    fibnaci(numTobePrinted);
}
}

