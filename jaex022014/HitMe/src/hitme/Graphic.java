package hitme; 
import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen; 
import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal;
public class Graphic {
    Screen screen;
    public int height = 20;
    public int width = 70;
    public void init(){
        screen = TerminalFacade.createScreen();
        screen.getTerminal().getTerminalSize().setColumns(width);
        screen.getTerminal().getTerminalSize().setRows(height);
        screen.startScreen();  
        screen.refresh();
    }
    public void drawProjectile(int x, int y, boolean clear){
        screen.putString(x, height-y, " ", Terminal.Color.BLACK, (clear)?Terminal.Color.BLACK:Terminal.Color.RED, ScreenCharacterStyle.Bold);
        screen.refresh();
    }
    public void drawProjectile(int x, int y){
        drawProjectile(x, y, false);
    }
    public void drawTanks(Tank tank1, Tank tank2){ 
        screen.putString(tank1.x, height-1, " ", Terminal.Color.BLACK, Terminal.Color.WHITE, ScreenCharacterStyle.Bold);
        screen.putString(tank2.x, height-1, " ", Terminal.Color.BLACK, Terminal.Color.WHITE, ScreenCharacterStyle.Bold);
        screen.refresh();
    }
}
