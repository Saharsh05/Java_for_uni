public class StartScreen {
    // make a new class after world for example like myworld create one called startScreen
    //then chose a background for startscreen on greenfoot when making the world
    //once the world is created right click on the world and press new StartScreen() this will display the start screen. 
    // make the start screen the same size as the world 
    // take screenshot of the powerpoint start screen and save in laptop as a png file. 
    // then under the actor super class create a sub class called Introduction. then import in the picture of the powerpoint. then compile and set it to the middle of the start screen 
    // then save the world so the picture stays there 
    // then in the startscreen class go into and scroll down and in the prepear section make sure that the powerpoint fits the whole screen 
    // the code would look something like this 

    public void prepare()
    {
        Introduction introduction = new Introduction(); 
        addObject (introduciton,xxx,xxx); 

    }

    // then in the StartScreen class this is what you need to write

    public void act()
    {
        if(Greenfoot.isKeyDown("enter")); 
        Greenfoot.setWorld(new myWorld()); 
    }
    
    }

