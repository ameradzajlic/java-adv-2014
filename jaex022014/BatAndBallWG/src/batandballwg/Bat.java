package batandballwg;

import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal;

public class Bat extends GameObject {
    Game g;
    int width;
    public Bat(Game g){
        this.g = g;
        this.width = 5;
        this.posx = this.g.width/2-this.width/2;
        this.posy = this.g.height-3;
        this.speed = 2;
    }

    @Override
    public void update() {
         this.posx+=this.speed;
         if(this.posx<=0||this.posx>=this.g.width-this.width){
             this.speed*=-1;
         }
    }

    @Override
    public void draw() {
        this.g.screen.putString(posx, posy, "     ", Terminal.Color.BLACK, Terminal.Color.WHITE, ScreenCharacterStyle.Bold);
        this.g.screen.refresh();
    }
}
