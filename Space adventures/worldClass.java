import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    private healthBar healthbar; 

    public MyWorld() {    
        super(3000, 700, 1); 
        prepare();
        populate();
        populate2();

        
        
    }

    public healthBar getheHealthBar() {
        return healthbar; 
    }

    private void populate(){
        for (int i = 0; i < 7; i++) {
    int randomX = Greenfoot.getRandomNumber(getWidth());
    int randomY = Greenfoot.getRandomNumber(getHeight());
    addObject(new Meteor(), randomX, randomY);
}}

private void populate2(){
        for (int i = 0; i < 14; i++) {
    int randomX = Greenfoot.getRandomNumber(getWidth());
    int randomY = Greenfoot.getRandomNumber(getHeight());
    addObject(new Star(), randomX, randomY);
}}

    private void prepare() {
        Astronaut astronaut = new Astronaut(this);
        addObject(astronaut, 362, 359);
        Ground ground = new Ground();
        addObject(ground, 561, 699);
        UFO ufo = new UFO();
        addObject(ufo, 13, 359);
        Rocket rocket = new Rocket();
        addObject(rocket, 2936, 366);
        healthBar healthbar = new healthBar(); 
        addObject(healthbar, 62, 48);
        Counter counter = new Counter();
        addObject(counter, 192, 48);
    }

    
}
