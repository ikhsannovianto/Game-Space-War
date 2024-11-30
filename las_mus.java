import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class las_mus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class las_mus extends Actor
{
     private int nyawa;
    
    public void gerak() 
    {
      setLocation(getX(),getY()+5);
       if (getY()>590){
           getWorld().removeObject(this);
        }else{
            cek_kena();
        
    }
}
    
      public void cek_kena(){
        if (isTouching(PesawatUtama.class))
        {
           getWorld().addObject(new ledakan2(),getX(),getY());
           Lev w= (Lev)getWorld();
           w.updateNyawa(-1);
           getWorld().removeObject(this);
           Greenfoot.playSound("meledak.mp3");
           

        }
    }
                
    public void act()
    {
        gerak();
        
    }   
    
    
     
}
