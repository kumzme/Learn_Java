package variables;

public class exampleOnJavaVariables {
    int instanceField;
    static String staticField;
    public  void method(){
        final String localvariable = "Initial Value";
        System.out.println(localvariable);
       }
    public static void   main(String[] args){
        exampleOnJavaVariables nw = new exampleOnJavaVariables();
        System.out.println(nw.instanceField);
        System.out.println(staticField);
        System.out.println(exampleOnJavaVariables.staticField);
        System.out.println(new exampleOnJavaVariables().instanceField);

    }
}
