package reflectioninstancing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionInstancing {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Class gameClass = Class.forName("reflectioninstancing.GameClass");
        Object game_class_object = gameClass.newInstance();
        Method game_start_method = gameClass.getMethod("StartGame", null);
        game_start_method.invoke(game_class_object, null);
        Method game_hit = gameClass.getMethod("hit",int.class);
        game_hit.invoke(game_class_object, 10);
        game_hit.invoke(game_class_object, 20);
        game_hit.invoke(game_class_object, 30);
    }
}
