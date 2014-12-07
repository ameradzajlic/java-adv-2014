package batandballwg;

import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal;

public class Ball extends GameObject {
    Game g;
    int speedy;
    public Ball(Game g){
        this.g = g;
        this.posx=this.g.width/2;
        this.posy=this.g.height/2;
        this.speed = 1;
        this.speedy = -1;
    }

    @Override
    public void update() {
        this.posx+=this.speed;
        this.posy+=this.speedy;
        if(this.posx<=0||this.posx>=this.g.width){
            this.speed*=-1;
        }
        if(this.posy<=0||this.posy>=this.g.height){
            this.speedy*=-1;
        }
    }

    @Override
    public void draw() {
        this.g.screen.putString(posx, posy, " ", Terminal.Color.BLACK, Terminal.Color.WHITE, ScreenCharacterStyle.Bold);
        this.g.screen.refresh();
    }
}
