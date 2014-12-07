package hitme;
 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Projectile {
    private Graphic g;
    private float x;
    private float y;
    Tank source;
    Tank target;
    double angle;
    float power,friction,gravity,accy; 
    private List<ProjectileListener> hitListeners;
    public Projectile(Tank source, Tank target, float angle, float power,Graphic g){
        this.g = g;
        this.source = source;
        this.target = target;
        this.angle = angle*Math.PI/180;
        this.power = power*.1f;
        this.friction = 0.015f;
        this.gravity = 0.022f;
        this.x = source.x;
        this.y = 0;
        hitListeners = new LinkedList<>();
    }
    public void addHitListener(ProjectileListener lis){
        this.hitListeners.add(lis);
    }
    public void removeHitListener(ProjectileListener lis){
        this.hitListeners.remove(lis);
    }
    public void emitEvent(ObjectType type){
        Iterator iter = hitListeners.iterator();
        HitEventObject hitObjectType = new HitEventObject(this, type);
        while(iter.hasNext()){
            ProjectileListener lis = (ProjectileListener)iter.next();
            lis.hit(hitObjectType);
        }
    }
    private void draw(){
       g.drawProjectile((int)this.x,(int)this.y);
    } 
    private void clear(){
       g.drawProjectile((int)this.x,(int)this.y,true);
    } 
    public void fire() throws InterruptedException{  
           boolean overlap = ((int)this.x!=(int)this.source.x||this.y>3);
           if(overlap) this.clear();
           this.power-=(this.power>=0)?this.friction:0;
           this.accy-=this.gravity;
           this.x+=this.power*Math.cos(angle);
           this.y+=this.power*Math.sin(angle)+accy;
           if(overlap) this.draw();
           if(this.y<=1){
              if((int)this.x==this.target.x){
                  emitEvent(ObjectType.Tank);
                  return;
              } else if(this.y<=0){
                  emitEvent(ObjectType.Ground);
                  return;
              }
           }
           Thread.sleep(16);
           fire();
    }
}
