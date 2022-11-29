import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()

    {
        movetheHero();
        spawnLaser();
    }
    
    public void movetheHero(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-3);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+3);
        }
        if(Greenfoot.isKeyDown("left")&& getX()>=30){
            setLocation(getX()-3,getY());
        }
        if(Greenfoot.isKeyDown("right")&& getX()<=550){
            setLocation(getX()+3,getY());
        }
    }
    int Timer = 0;
    public void spawnLaser(){
        if(Timer == 40){
            getWorld().addObject(new Laser(), getX()+50,getY());
            Timer = 0;
        }
        else{
            Timer++;
        }
    }
    
}
