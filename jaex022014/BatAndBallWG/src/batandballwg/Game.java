package batandballwg; 
import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import java.util.ArrayList;
import java.util.List; 
public class Game<T extends GameObject> {
    public List<T> allObjects;
    public int width;
    public int height;
    Screen screen;
    
    public Game(){
        allObjects = new ArrayList<>();
        width = 60;
        height = 20;
        screen = TerminalFacade.createScreen();
        screen.getTerminal().getTerminalSize().setColumns(width);
        screen.getTerminal().getTerminalSize().setRows(height);
        screen.startScreen(); 
    }
    public void run() throws InterruptedException{
        while(true){
            screen.clear();
            for(T obj : allObjects){
                obj.update();
                obj.draw();
            }
            Thread.sleep(70);
        }
    }
}
