package Single.Overload;

public class OverloadDemo {
    public static void main(String args[]) {
        String a1 = new PetMainLoad_01().getSound("aa");
        System.out.println(a1);
        Integer[] n = new Integer[1];
        n[0] = 1;
        Integer[] a2 = new PetMainLoad_02().getSound(n);
        System.out.println(a2[0]);
    }
}
