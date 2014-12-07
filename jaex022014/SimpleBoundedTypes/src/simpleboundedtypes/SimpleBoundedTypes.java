package simpleboundedtypes;
public class SimpleBoundedTypes {
    public static void main(String[] args) {
        new MyClass(10);
        new MyClass(10.5);
        new MyClass(2147483648l); 
        new MyClass((short)65000); 
        new MyClass((byte)65000); 
        //new MyClass("Hello!"); //not working 
    }
}
