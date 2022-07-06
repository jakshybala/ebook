package kg.ebook.model;

/**
 * @author Azat Ibraev
 */
public class Azat {

    public static void main(String[] args) {

        sayHello("Azat", "Ibraev");

        Altynbek altynbek = new Altynbek("Altynbek", "Akmatov", 24);
    }

    public static void sayHello(String a, String b) {
        System.out.println(a + " " + b);
    }
}
