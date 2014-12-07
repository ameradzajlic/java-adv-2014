package simplegenericmethods;
public class SimpleGenericMethods {
    public static<A,B> String myMethod(A a, B b){
        String left = String.valueOf(a);
        String right = String.valueOf(b);
        return left+right;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(10,20));
        System.out.println(myMethod("Hello","World"));
    }
}
