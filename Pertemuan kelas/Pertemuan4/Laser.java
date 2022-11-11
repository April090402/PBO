import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        AtEdge();
    }
    int i = 60;
    public Laser(){
        GreenfootImage laserImage = getImage();
        int laserHeight = laserImage.getHeight()/i;
        int laserWidth = laserImage.getWidth()/i;
        laserImage.scale(laserWidth,laserHeight);
    }
    public void AtEdge(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
