public class MyClass {
    public String printMethod() {
        int a = 10;
        String firstString = String.format("---<%d>---", a);
        System.out.println(firstString);
        return firstString;
    }
}