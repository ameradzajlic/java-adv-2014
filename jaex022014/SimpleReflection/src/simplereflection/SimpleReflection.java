package simplereflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SimpleReflection {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        class MyClass {
            public int x;
            public int y;
        }
        MyClass mc = new MyClass();
        Class cl = MyClass.class;
        Class cl1 = mc.getClass();   
        Class cl2 = Class.forName("simplereflection.SimpleReflection$1MyClass");
        System.out.println(cl==cl1&&cl1==cl2);
        
        //Get fields
        for(Field f : cl.getFields()){
            System.out.println("Field name: " + f.getName());
        }  
        //Get methods
        for(Method m : cl.getMethods()){
            System.out.println("Method name: " + m.getName());
        } 
    }
}
