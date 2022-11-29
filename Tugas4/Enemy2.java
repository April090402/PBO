import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        super.removeifTouchLaser();
        spawnLaser();
    }
    int timer = 0;
    public void spawnLaser(){
    if(timer==20){
        getWorld().addObject(new LaserEnemy(),getX()-40, getY());
        timer = 0;
    }
    else{
        timer++;
    }
}

}