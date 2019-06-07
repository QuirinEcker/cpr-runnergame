import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        Runner runner = new Runner();
       
        System.out.println(
            "Bitte geben sie eine Schwierigkeitsstufe ein zwischen 1 und 10)"
        );
        ObstacleGenerator obstacleGenerator =
            new ObstacleGenerator(5);
        
        this.addObject(runner, 150, 500);
        this.addObject(obstacleGenerator, -100, -100);
    }
}
