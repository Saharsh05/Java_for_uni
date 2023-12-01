public class UFO {
    [11:49 AM] Georgia Allen
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**

* Write a description of class UFO here.

* 

* @author (your name) 

* @version (a version number or a date)

*/

public class UFO extends Actor

{

    private static final int chaseSpeed = 1;
 
    public void act()

    {

         Actor target = getWorld().getObjects(Astronaut.class).get(0);

         move(chaseSpeed);

        }

}

[11:50 AM] Georgia Allen
healthBar
[11:50 AM] Georgia Allen
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import greenfoot.Color;

/**

* Write a description of class healthBar here.

* 

* @author (your name) 

* @version (a version number or a date) 

*/

public class healthBar extends Actor 

{

    int health = 5;

    int healthBarWidth = 100;

    int healthBarHeight = 17;

    int pixelsPerHealth = (int)healthBarWidth/health;

    public healthBar(){

    update();

}

    public void act()

    {

        // Add your action code here.

    }

    public void update(){

        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));

        GreenfootImage myImage = getImage();

        myImage.setColor(Color.WHITE);

        myImage.drawRect(0,0,healthBarWidth + 1, healthBarHeight + 1);

        myImage.setColor(Color.RED);

        myImage.fillRect(1,1, health*pixelsPerHealth,healthBarHeight);

    }

    public void loseHealth(){

        health--;

    }

}
}
