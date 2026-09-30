package edubridgeJava;

public class Demo {
    
    {
        System.out.println("Instance Block");
    }
    
    static {
        System.out.println("Static Block");
    }

    Demo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
    }
}