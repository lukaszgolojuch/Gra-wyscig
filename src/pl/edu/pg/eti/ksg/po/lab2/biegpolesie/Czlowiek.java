package pl.edu.pg.eti.ksg.po.lab2.biegpolesie;

import java.io.PrintStream;
import java.util.Random;

/**
 *
 * @author TB
 */
public abstract class Czlowiek implements Uczestnik {
    
    /**
     * Płeć
     */
    public enum Plec
    {
        /**
         * Kobieta
         */
        KOBIETA,
        
        /**
         * Mężczyzna
         */
        MEZCZYZNA;
    }
    
    public final String imie;
    public final String nazwisko;
    private final Plec plec;

    protected final Random humorIUwarunkowaniaOsobiste = new Random();
    
    private PrintStream osrodekKomunikacji = null;
    
    public Czlowiek(String imie, String nazwisko, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Plec getPlec() {
        return plec;
    }
    
    /**
     * Przedstaw się
     */
    public abstract void przedstawSie();

    @Override
    public void mowDo(PrintStream ps) {
        osrodekKomunikacji = ps;
    }
    
    protected void wypowiedzSie(String tresc)
    {
        osrodekKomunikacji.print(imie +" "+nazwisko+" mówi: ");
        osrodekKomunikacji.println(tresc);
    }

    @Override
    public String toString() {
        return imie +" "+nazwisko;
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        switch(rodzajTerenu)
        {
            case DROGA:
                wypowiedzSie("Idę sobie drogą.");
                return humorIUwarunkowaniaOsobiste.nextDouble()*0.2 + 0.8; //Od 0.8 do 1.0
            case SCIEZKA:
                wypowiedzSie("Co za ładna ścieżka w lesie");
                return humorIUwarunkowaniaOsobiste.nextDouble()*0.2 + 0.6; //Od 0.6 do 0.8
            case WYSOKI_LAS:
                wypowiedzSie("Idę na przełaj przez las. Może znajdę grzyby?");
                return humorIUwarunkowaniaOsobiste.nextDouble()*0.2 + 0.4; //Od 0.4 do 0.6
            case NISKI_LAS:
                wypowiedzSie("Strasznie dużo gałęzi. Ciężko się idzie.");
                return humorIUwarunkowaniaOsobiste.nextDouble()*0.2 + 0.2; //Od 0.2 do 0.4
            case BAGNO:
            default:
                wypowiedzSie("O rany! Gdzie ja jestem?");
                return humorIUwarunkowaniaOsobiste.nextDouble()*0.2; //Od 0 do 0.2
        }
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
                wypowiedzSie("Dziedzina zadania do rozwiązania: "+dziedzinazadania);
                if (c<=5)
                {
                    return true;
                }
                else
                {
                    return true;
                }
            case FIZYKA:
                wypowiedzSie("Dziedzina zadania do rozwiązania: "+dziedzinazadania);
                if (c<=5)
                {
                    return true;
                }
                else
                {
                    return true;
                }
            case INFORMATYKA:
                wypowiedzSie("Dziedzina zadania do rozwiązania: "+dziedzinazadania);
                if (c<=5)
                {
                    return true;
                }
                else
                {
                    return true;
                }
            case SZTUKA:
                wypowiedzSie("Dziedzina zadania do rozwiązania: "+dziedzinazadania);
                if (c<=5)
                {
                    return true;
                }
                else
                {
                    return true;
                }
            case NAUKI_LESNE:
                wypowiedzSie("Dziedzina zadania do rozwiązania: "+dziedzinazadania);
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
