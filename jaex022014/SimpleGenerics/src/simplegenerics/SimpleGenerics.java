package simplegenerics;
public class SimpleGenerics {
    public static void main(String[] args) {
        //Valid
        MyClass mc = new MyClass("Hello"); //I am good, but I am raw type
        //Invalid
        MyClass<Integer> mc1 = new MyClass<>("hello"); //Hey, you said I will receive Integer only!
        //Invalid
        MyClass<Integer> mc2 = new MyClass<Integer>("hello"); //Same here!
        //Valid
        MyClass<Integer> mc3 = new MyClass<>(10); //I am good!
        //Valid
        MyClass<Integer> mc4 = new MyClass<Integer>(20); //Me too!
        System.out.println(mc3);
        System.out.println(mc4);
    }
}
