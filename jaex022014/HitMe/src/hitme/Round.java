package hitme;
import java.util.HashMap;
import java.util.Random;
public class Round {
    public Tank userTank;
    public Tank computerTank;
    public int[] hitscount;
    public int current;
    public Graphic g;
    public void generateComputerTank(){
        Random r = new Random();
        computerTank = new Tank(r.nextInt(g.width-userTank.x)+userTank.x);
    }
    public Round(Integer user_x, Graphic g) throws InterruptedException{
        this.g = g;
        current = 0;
        hitscount = new int[2]; //0 player, 1 computer
        userTank = new Tank(user_x);
        start();
    }
    public void start() throws InterruptedException{
        generateComputerTank();
        UI.displayPositions(userTank.x, computerTank.x);
        this.g.init();
        this.g.drawTanks(userTank, computerTank);
        turn();
    }
    public void turn() {
        Projectile p;
        if(current==0){
            HashMap<String,Float> cannonPos = UI.getCannonPos(); 
            Float angle = cannonPos.get("angle");
            Float power = cannonPos.get("power");
            p = new Projectile(userTank, computerTank, angle, power,g);
        } else {
            Random r = new Random();
            p = new Projectile(computerTank,userTank,r.nextFloat()*(90)+90,r.nextFloat()*(25)+5,g);
        } 
        p.addHitListener(new ProjectileListener() {
            @Override
            public void hit(HitEventObject evt) {
                if(evt.type==ObjectType.Ground){
                    UI.displayMessage("Miss");
                    if(current==0){
                        UI.displayMessage("Computer move...");
                        try { Thread.sleep(2000); } catch(InterruptedException ex){ ex.printStackTrace(); }
                        current = 1;
                    } else {
                        current = 0;
                    }
                     turn();  
                }
                else if(evt.type==ObjectType.Tank){
                    end();
                }
            }
        });
        try { hitscount[current]++; p.fire(); } catch(InterruptedException ex){ ex.printStackTrace(); }
    }
    public void end(){
        UI.displayMessage("Hit");
        UI.displayMessage("Computer moves : " + hitscount[0]);
        UI.displayMessage("Player moves : " + hitscount[1]);
    }
}
