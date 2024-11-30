import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesawatUtama extends Actor
{
    
     public int tahan=10;
     private int jeda=0;
     private int nyawa;
     
    public void tombol(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
          if (mouse != null){
            setLocation(mouse.getX(), mouse.getY());
         }
         
         if (tahan==0){
         if (Greenfoot.isKeyDown("Q"))
         {
             getWorld().addObject(new PeluruRudal()
             ,getX(),getY());
             Greenfoot.playSound("bullet.wav");
            }
             tahan=10;
           }
           

        }
    
   
    public void act() 
    {
        Lev hp = (Lev)getWorld();
      if (hp.nyawa <= 0)
      {
          getWorld().addObject(new ledakan2(), getX(), getY());
          getWorld().removeObject(this);
      }
       tahan--;
       tombol();
     
       
      if(jeda>0)jeda--;
      if(jeda==1)
      getWorld().addObject(new laser(),getX(),getY()- 50);
    
      if(jeda==0)jeda=20;
    
    }
}   
    
    
    
    
    

    