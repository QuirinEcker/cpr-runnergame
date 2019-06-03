import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObstacleGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObstacleGenerator extends Actor
{
    /**
     * Act - do whatever the ObstacleGenerator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World world = getWorld();
        world.addObject(new Obstacle(), 150, 0);
        Greenfoot.delay(1000);
    }    
}
