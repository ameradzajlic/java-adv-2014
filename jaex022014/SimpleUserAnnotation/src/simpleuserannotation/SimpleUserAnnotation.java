package simpleuserannotation; 
import java.lang.annotation.Annotation; 
public class SimpleUserAnnotation {
    public static void main(String[] args) {
        Class<MyClass> mc_class = MyClass.class;
        System.out.println("All annotations: ");
        for(Annotation annotation : mc_class.getAnnotations()){ 
            System.out.println("Annotation: " + annotation.toString());
        }
        
        MyAnnotation my_annotation = mc_class.getAnnotation(MyAnnotation.class);
        System.out.println("Server name is: " + my_annotation.serverName());
    }
}
