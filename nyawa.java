import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nyawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nyawa extends Actor
{
    /**
     * Act - do whatever the nyawa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public int tahan=30;
    private int jeda=0;
    private int nyawa;
   
    
    public void gerak()
    
    {
        setLocation(getX(),getY()+1);
        if(getY()>580){
            setLocation(Greenfoot.getRandomNumber(500),
            Greenfoot.getRandomNumber(9));
        }
            
    }
    
    public void terambil()
    {
        if (isTouching(PesawatUtama.class))
       {
           Lev m= (Lev)getWorld();
           m.updateNyawa(1);
           
           getWorld().removeObject(this);
       }
    }
    
    public void act() 
    {
       gerak();
       terambil();
    }
 
}
