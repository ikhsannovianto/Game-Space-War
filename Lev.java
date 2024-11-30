import greenfoot.*; 
public class Lev extends World
{
      private int jeda=0;
      public int score;
      public int nyawa = 3;
      private int time;
      public int nyawaBos = 150;//Menyimpan int ke nyawaBos
      
       
    /**
     * Constructor for objects of class Lev.
     * 
     */
    public Lev()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        tampilnyawa();
        tampilscore();
        showTime();
        time = 0;
        addObject (new PesawatUtama(),250,550);
        tampilNyawaBos();
    }
    
    public void updateNyawa(int point)
    {
        nyawa = nyawa + point;
        tampilnyawa();
        showText("Nyawa:"+nyawa, 400 , 25);
        if(nyawa <=0)
        {
            addObject(new over(), 250, 300);
        }
    }
    
    public void tampilnyawa()
    {
        showText("Nyawa:"+nyawa, 400 , 25); 
    }
    
    public void updateHPBos(int hp)
    {
        nyawaBos = nyawaBos + hp;
        tampilNyawaBos();
        if (nyawaBos <= 0)
        {
            
            addObject(new win(), 250, 300);
        }
    }
    
    public void tampilNyawaBos()
    {
        
        showText("Nyawa Boss: 150/"+nyawaBos, 100, 575);    
    }
    
    private void tampilscore()
    {
       
        showText ("Score:" + score, 100, 25);
        
        if (score == 1000)
        {
            addObject(new Bos(), 250, 150);
        }
    }
    
    public void addScore(int points)
    {
        score = score + points;
        tampilscore();
        showText("Score:"+score, 100, 25);
      
    }
    
    private void countTime()
    {
        if (nyawa > 0 )
        {
            time++;
        }
        
        if (nyawa <= 0)
        {
            time = time + 0;
        }
         showTime();
    
    
    }

    private void showTime()
    {
        showText("Time: " + (time/60), 250, 25);
    }
    
    public void act()
    { 
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new PesawatAlien(), Greenfoot.getRandomNumber(559), 580);
        }
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new nyawa(), Greenfoot.getRandomNumber(500), 580);
        }
        countTime ();
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld (new Lev());
        }
    }
    
}
