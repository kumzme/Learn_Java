package Single.Override;

public class OverrideUsageDemo {
    public static void main(String[] args)
    {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        OverrideMainClass obj1 = new OverrideMainClass();
        obj1.show();

        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        OverrideChildClass obj2 = new OverrideChildClass();
        obj2.show();
    }

}
