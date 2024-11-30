import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Actor
{
     private int score;
    
    
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void gerak() 
    {
      setLocation(getX(),getY()-5);
       if (getY()<20){
           getWorld().removeObject(this);
       }else{
           cek_kena();
       }
    }    
    
    public void cek_kena(){
        if (isTouching(PesawatAlien.class))
        {
            getWorld().addObject(new ledakan(),getX(),getY());
            Lev m= (Lev)getWorld();
            m.addScore(20);
           
          
            Greenfoot.playSound("explosion.wav");
            removeTouching(PesawatAlien.class);
            getWorld().removeObject(this);
            

        }
    }
    
    public void act()
    {   
        gerak();
    } 
}
