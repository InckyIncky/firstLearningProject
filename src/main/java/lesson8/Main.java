package lesson8;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.toString());
        System.out.println(Integer.toHexString(15));

        Pencil parker = new Pencil(28, "Parker");
        Pencil corina = new Pencil(28, "Corina");

        System.out.println("Ravni? " + parker.equals((corina)));
        Pencil parker2 = new Pencil(28, "Parker");
        Pencil expensive = new Pencil(300, "expensive");

        System.out.println("Ravni?" + parker2.equals(expensive));
        System.out.println("Ravni? " + parker.equals(expensive));
        System.out.println(parker2);
        System.out.println(expensive);
    }
}
