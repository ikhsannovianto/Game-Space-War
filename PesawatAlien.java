import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesawatAlien extends Actor
{
   
    public int tahan=30;
    private int jeda=0;
   
    
    public void gerak()
    
    {
        setLocation(getX(),getY()+1);
        if(getY()>580){
            setLocation(Greenfoot.getRandomNumber(500),
            Greenfoot.getRandomNumber(50));
        }
            
        }
    
    public void act()
    {
        Lev b = (Lev)getWorld();
        if (b.score >= 1000)
        {
            getWorld().removeObject(this);
        }
       if (b.score < 1000)
       {
           gerak();
       }
       if(tahan==0){
          
       tahan=30;
    }
       if(jeda>0)jeda--;
      if(jeda==1)getWorld().addObject(new las_mus(),getX(),getY()+ 50);
      if(jeda==0)jeda=120;
    }
}   

