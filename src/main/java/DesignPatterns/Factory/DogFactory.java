package DesignPatterns.Factory;

public class DogFactory {
    public static void main(String[] args) {
        String[] aa = new String[1];
        aa[0] = "aa";
        main01(aa);
        aa[0] = "small";
        main01(aa);
        aa[0] = "big";
        main01(aa);
    }
    public static void main01(String[] args) {

        if (args[0].equals("small"))
            System.out.println(Dog_01_Implement_01.speak());
        else if (args[0].equals("big"))
            System.out.println(Dog_02_Implement_02.speak());

        else if (args[0].equals("working"))
            System.out.println(Dog_03_Implement_03.speak())
                    ;
        else {
            System.out.println(Dog_03_Implement_03.speak());
        }

    }
}
