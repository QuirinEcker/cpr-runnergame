import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner extends Actor
{
    private int x;
    private int y;
    
    public Runner() {
    }
    /**
     * Act - do whatever the Runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        x = getX();
        y = getY();
        
        if(Greenfoot.isKeyDown("right")) {
            x += 25;
        } else if(Greenfoot.isKeyDown("left")) {
            x -= 25;
        }
        
        setLocation(x, y);
    }    
}
