package pl.edu.pg.eti.ksg.po.lab2.biegpolesie;

import java.io.PrintStream;
import java.util.Random;

/**
 *
 * @author TB
 */
public abstract class Robot implements Uczestnik {

    private final String model;
    private final int numerSeryjny;
    protected final Random czynnikiLosowe = new Random();
    
    private PrintStream mediumKomunikacyjne;
    

    public Robot(String model, int numerSeryjny) {
        this.model = model;
        this.numerSeryjny = numerSeryjny;
    }
    
    
    @Override
    public void mowDo(PrintStream ps) {
        mediumKomunikacyjne = ps;
    }
    
    
    public final String identyfikuj()
    {
        return model+" nr "+numerSeryjny;
    }
    
    protected void komunikuj(String komunikat)
    {
        mediumKomunikacyjne.print(identyfikuj()+" komunikuje: ");
        mediumKomunikacyjne.println(komunikat);
    }

    @Override
    public String toString() {
        return identyfikuj();
    }
    
       @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinazadania) {
        int c;
        Random t = new Random();
        // random integers in [0, 100]
        c=t.nextInt(100);
        switch(dziedzinazadania)
        {
            case MATEMATYKA:
                komunikuj("Dziedzina zadania do rozwiązania: "+dziedzinazadania);
                if (c<=5)
                {
                    return true;
                }
                else
                {
                    return true;
                }
            case FIZYKA:
                komunikuj("Dziedzina zadania do rozwiązania: "+dziedzinazadania);
                if (c<=5)
                {
                    return true;
                }
                else
                {
                    return true;
                }
            case INFORMATYKA:
                komunikuj("Dziedzina zadania do rozwiązania: "+dziedzinazadania);
                if (c<=5)
                {
                    return true;
                }
                else
                {
                    return true;
                }
            case SZTUKA:
                komunikuj("Dziedzina zadania do rozwiązania: "+dziedzinazadania);
                if (c<=5)
                {
                    return true;
                }
                else
                {
                    return true;
                }
            case NAUKI_LESNE:
                komunikuj("Dziedzina zadania do rozwiązania: "+dziedzinazadania);
                if (c<=5)
                {
                    return true;
                }
                else
                {
                    return true;
                }
        }
        return false;
    }
    
    
}
