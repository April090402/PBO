import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom extends Actor
{
    /**
     * Act - do whatever the Boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int i = 4;
    public Boom(){
        GreenfootImage BoomImage = getImage();
        int BoomHeight = BoomImage.getHeight()/i;
        int BoomWidth = BoomImage.getWidth()/i;
        BoomImage.scale(BoomWidth,BoomHeight);
    }
    public void act()
    {
        spawnBoom();
    }
    int Timer = 0;
    public void spawnBoom(){
        if(Timer==25){
            getWorld().removeObject(this);
        }else{
            Timer++;
        }
    }
}
