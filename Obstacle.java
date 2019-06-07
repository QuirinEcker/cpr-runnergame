import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    public Obstacle() {
        turn(180);
    }
    
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int deletionCountDown = 60;
    
    public void act() 
    {
        if(deletionCountDown == 0) {
            getWorld().removeObject(this);
        } else {
            setLocation(getX(), getY() + 10);
            deletionCountDown--; 
        }

    }    
}
