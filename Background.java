import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepareWorld();
    }
    
    private void prepareWorld() {
        Runner runner = new Runner();
        ObstacleGenerator obstacleGenerator = new ObstacleGenerator();
        this.addObject(runner, 150, 500);
        this.addObject(obstacleGenerator, -100, -100);
    }
}
