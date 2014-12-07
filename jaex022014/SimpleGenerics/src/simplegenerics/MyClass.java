package simplegenerics;
public class MyClass<T> {
    public MyClass(T t){
        System.out.println("Class is instantiated with " + (t.getClass().getName()));
    }
}
