package DesignPatterns.Factory;


public class Dog_01_Implement_01 implements MainInterfaceFactory {
    public static String speak() {
        System.out.println("The poodle says \"arf\"");
        return "bb";
    }
}
