public class PublicExample {
    public int publicNumber = 10;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }
}

class AnotherClass {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println(obj.publicNumber); // Accessing public data member
        obj.publicMethod(); // Calling public method
    }
}
