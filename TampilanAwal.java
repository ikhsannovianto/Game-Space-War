import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TampilanAwal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TampilanAwal extends Actor
{
    /**
     * Act - do whatever the TampilanAwal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter")){
            getWorld().addObject(new TampilanLevel1(),247,292);
            getWorld().removeObject(this);
        }// // Add your action code here.
    }    
}
