/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.roboty;

import java.util.Random;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.Robot;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.RodzajTerenu;

/**
 *
 * @author lukaszgolojuch
 */
public class Terminator extends Robot{

    public Terminator(String model, int numerSeryjny) {
        super(model, numerSeryjny);
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        switch(rodzajTerenu)
        {
            case DROGA:
                komunikuj("Wykryto teren: "+rodzajTerenu+". Rozwijanie maksymalnej prędkości.");
                return czynnikiLosowe.nextDouble()*0.1 + 0.95; //Od 0.95 do 1.5
            case SCIEZKA:
                komunikuj("Wykryto teren: "+rodzajTerenu+". Prędkość umiarkowana.");
                return czynnikiLosowe.nextDouble()*0.1 + 0.85; //Od 0.85 do 0.95
            case WYSOKI_LAS:
                komunikuj("Wykryto teren: "+rodzajTerenu+". Nieprzyjazne warunki.");
                return czynnikiLosowe.nextDouble()*0.1 + 0.4; //Od 0.4 do 0.5
            case NISKI_LAS:
                komunikuj("Wykryto teren: "+rodzajTerenu+". Wykryto znaczną liczbę przeszkód.");
                return czynnikiLosowe.nextDouble()*0.2 + 0.2; //Od 0.2 do 0.4
            case BAGNO:
            default:
                komunikuj("Wykryto teren: "+rodzajTerenu+".");
                komunikuj("Awaria silników!");
                return czynnikiLosowe.nextDouble()*0.1; //Od 0.0 do 0.1
        }
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinazadania) {
        if( DziedzinaZadania.FIZYKA.equals(dziedzinazadania) ||  DziedzinaZadania.MATEMATYKA.equals(dziedzinazadania) ||  DziedzinaZadania.INFORMATYKA.equals(dziedzinazadania))
        {
            return true;
        }
        else
        {
            return super.rozwiazZadanie(dziedzinazadania);
        }
    }
    
}
