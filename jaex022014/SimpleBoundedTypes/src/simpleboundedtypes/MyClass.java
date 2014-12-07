package simpleboundedtypes;
public class MyClass<T extends Number> { 
    public MyClass(T t){
        System.out.println(t.getClass().getName());
    }
}
