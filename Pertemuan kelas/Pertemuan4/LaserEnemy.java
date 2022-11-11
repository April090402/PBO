import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserEnemy extends Actor
{
    /**
     * Act - do whatever the LaserEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int i = 30;
    public LaserEnemy()
    {
        GreenfootImage laserEnemyImage = getImage();
        int newHeight = laserEnemyImage.getHeight()/i;
        int newWidth = laserEnemyImage.getWidth()/i;
        laserEnemyImage.scale(newWidth,newHeight);
        setRotation(180);
    }
    int speed = 7;
    public void act()
    {
        move(5);
        removeifAtEdge();
    }
    public void removeifAtEdge()
    {
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
