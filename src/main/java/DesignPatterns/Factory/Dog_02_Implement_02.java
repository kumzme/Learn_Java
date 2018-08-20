package DesignPatterns.Factory;

public class Dog_02_Implement_02 implements MainInterfaceFactory {
    public static  String speak() {
        System.out.println("The Rottweiler says (in a very deep voice) \"WOOF!\"");
        return "ccc";
    }
}
