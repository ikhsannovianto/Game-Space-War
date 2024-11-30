import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bos extends Actor//Class dari Bos
{
   
    public int tahan=10;//Menyimpan int 10 ke tahan
    private int jeda=0;//Menyimpan int 0 ke jeda
    private int movingCounter = 10;//Menyimpan int 10 ke movingcounter
    
    
    public void gerak()//Method gerak
    
    {
        if (movingCounter < 50) {//Jika kurang dari 50 maka kode akan berjalan
            setLocation(getX() + 1, getY());//bergerak right;
        }
        else if (movingCounter < 90) {
            setLocation(getX() - 1, getY());//bergerak left;
        }
        else {
            movingCounter = 10;
        }
        movingCounter++;//Movingcounter akan berualang kali
    }
    
    public void act()//Method yang digunakan untuk menjalankan dari class Bos 
    {
        Lev a = (Lev)getWorld();
       if (a.nyawaBos > 0)
       {
           gerak();
       }
       if (isTouching(laser.class))
       {
           a.updateHPBos(-1);
           getWorld().addObject(new ledakan2(), getX(), getY());
           a.addScore(10);
           removeTouching(laser.class);
           Greenfoot.playSound("explosion.wav");
       }
       if (isTouching(PeluruRudal.class))
       {
           a.updateHPBos(-1);
           getWorld().addObject(new ledakan2(), getX(), getY());
           a.addScore(10);
           removeTouching(PeluruRudal.class);
           Greenfoot.playSound("explosion.wav");
       }
       if (a.nyawaBos <= 0)
       {
           getWorld().addObject(new ledakan2(), getX(), getY());
           a.addScore(500);
           Greenfoot.playSound("explosion.wav");
           getWorld().removeObject(this);
       }
       if(tahan==0){//Jika tahan sama dengan 0 maka kode dibawah akan berjalan
          
           tahan=10;
       }
       if(jeda>0)jeda--;
       if(jeda==1)getWorld().addObject(new las_mus(),getX(),getY());// Jika jeda sama dengan 1 maka akan menampilkan laser yang muncul dari pesawat boss
       if(jeda==1)getWorld().addObject(new las_mus(),200,150);//Akan muncul laser dengan posisi X = 200 dan Y = 150
       if(jeda==1)getWorld().addObject(new las_mus(),300,150);// Akan muncul laser dengan posisi X = 300 dan Y = 150
       if(jeda==0)jeda=120; // Jeda = 120
    }
}   

