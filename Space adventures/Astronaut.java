public class Astronaut {
    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
* Write a description of class Astronaut here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Astronaut extends Actor
{
    
    boolean touchingMeteor = false; 


     private int speed = 7;
    private int vSpeed = 0;
    private int gravity = 2;
    public void act(){
    move();
    fall();
    if (onGround()) {
            gameOver();
        }
    }
 
    public boolean onGround() {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 16, Ground.class);
        return under != null;
    }
 
    public void gameOver() {
        System.out.println("Game Over!");
        Greenfoot.stop(); 
    }
  public void move()
    {
    {
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(2);
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(4);
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(3);
            setRotation(0);
        }
    }
}
public void hitMeteor()
{
    Actor meteor = getOneIntersectingObject(meteors.class); 
    if(meteor != null)
    {
        World Myworld = getWorld(); 
        myWorld myWorld = (myWorld)myWorld; 
        heatlhBar healthBar = space.gethealthBar(); 
        if(touchingMeteor == false)
        {
            healthbar.loseHealth(); 
            touchingMeteor = true; 

            if(healthBar.health <= 0 )
            {
                System.out.println("Game Over!");
                 Greenfoot.stop();
            }
        }
    }else
    {
        touchingMeteor = false; 
    }
}
 
public void fall(){
        setLocation (getX(),getY()+ vSpeed);
            vSpeed = gravity;

}}
}
