public class SingletonPattern {
    public static void main(String[] args) { 
        MyClass a = MyClass.getInstance();
        MyClass b = MyClass.getInstance();
        System.out.println(a.equals(b));
    }
}
