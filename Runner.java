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
    private boolean gameFinished;
    static public Runner runner;
    
    public Runner() {
        gameFinished = false;
        runner = this;
    }
    
    /**
     * Act - do whatever the Runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if (!gameFinished) {
            
            x = getX();
            y = getY();
            
            if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("a")) {
                x += 10;
            } else if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
                x -= 10;
            } else if(crashedIntoCar()) {
                getWorld().showText("defeat", getWorld().getWidth() / 2, 10);
                gameFinished = true;
            }
            
            setLocation(x, y);
        }
    }
    
    public boolean crashedIntoCar() {
        Actor coin = getOneObjectAtOffset(0, 0, Obstacle.class);
        return coin != null;
    }
    
    public boolean getFinishedBoolean() {
        return gameFinished;
    }
}
