public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        String b = myClass.printMethod();
        String c = String.format("~~~<%s>~~~", b);
        System.out.println(c);
    }
}