import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        addEnemy2();
        removeifTouchLaser();
    }
    public Enemy(){
        setRotation(180);
    }
    public void removeifTouchLaser(){
        if(isTouching(Laser.class)){
            getWorld().addObject(new Boom(),getX(), getY());
            removeTouching(Laser.class);
            getWorld().removeObject(this);
        }else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    int Timer = 0;
    public void addEnemy2()
    {
        if(Timer==60){//timer 3 detik ==> 60fps x 3s
            int speed = Greenfoot.getRandomNumber(4)+1;
            getWorld().addObject(new Enemy2(),600,Greenfoot.getRandomNumber(400));
            Timer=0;
            }else{
                Timer++;
            }
    }
}
