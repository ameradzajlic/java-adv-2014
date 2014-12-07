package simplegenericextending;
public class MyParentClass<T> {
    public MyParentClass(T t){
        System.out.println(t.getClass().getName());
    }
}
