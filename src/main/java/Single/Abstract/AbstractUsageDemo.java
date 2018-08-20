package Single.Abstract;

public class AbstractUsageDemo {

    public static void main(String [] args) {
        AbstractMainClassChildSalary s = new AbstractMainClassChildSalary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        AbstractMainClass e = new AbstractMainClassChildSalary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using AbstractChildSalary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
