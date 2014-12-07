package hitme; 
import java.util.EventObject; 
public class HitEventObject extends EventObject {
    public ObjectType type;
    public HitEventObject(Object source, ObjectType type){
        super(source);
        this.type = type;
    }
}
