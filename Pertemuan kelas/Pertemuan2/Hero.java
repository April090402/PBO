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
        if (Greenfoot.isKeyDown("Up")&& getY()>=30)
        setLocation(getX(),getY()-5);
        if (Greenfoot.isKeyDown("Down")&& getY()<=370)
        setLocation(getX(),getY()+5);
        if (Greenfoot.isKeyDown("Left")&& getY()>=50)
        setLocation(getX()-5,getY());
        if (Greenfoot.isKeyDown("Right")&& getY()<=550)
        setLocation(getX()+5,getY());
    }
}
