import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random; 

/**
 * Write a description of class ObstacleGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObstacleGenerator extends Actor
{
    int difficulty = 3;
    int delayCounter = 10;
    int score;
    
    public ObstacleGenerator(int difficulty) {
        this.difficulty = difficulty;
        this.score = 0;
    }
    
    
    /**
     * Act - do whatever the ObstacleGenerator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        Runner runner = Runner.runner;
        Random random = new Random();
        if (delayCounter == 0) {
            World world = getWorld();
            
            for (int i = 0; i < difficulty; i++) {
                world.addObject(new Obstacle(), random.nextInt(400), 0);
            }
            
            score++;
            delayCounter = 100;
        }
            delayCounter--;
            
        if (!runner.getFinishedBoolean()) {
            getWorld().showText("Score: " + this.score, getWorld().getWidth() / 2, 10);
        }
    }
}    
