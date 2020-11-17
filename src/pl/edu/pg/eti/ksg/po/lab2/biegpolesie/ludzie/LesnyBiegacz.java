/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie;

import java.util.Random;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.Czlowiek;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.RodzajTerenu;

/**
 *
 * @author lukaszgolojuch
 */
public class LesnyBiegacz extends Czlowiek{

    public LesnyBiegacz(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec);
    }
    
    @Override
    public void przedstawSie() {
        wypowiedzSie("Cześć! Jestem "+getImie()+" "+getNazwisko()+". Uwielbiam biegać po lesie");
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        //szybciej przemieszcza się przez drogi i sciezki
        if(RodzajTerenu.SCIEZKA.equals(rodzajTerenu))
        {
            wypowiedzSie("Generalnie dobrze się idzie. Tylko trzeba stopy stawiać na tym bardziej suchym, twardszym mchu.");
            return humorIUwarunkowaniaOsobiste.nextDouble()*0.2 + 1.2; 
        }
        if(RodzajTerenu.DROGA.equals(rodzajTerenu))
        {
            wypowiedzSie("Generalnie dobrze się idzie. Tylko trzeba stopy stawiać na tym bardziej suchym, twardszym mchu.");
            return humorIUwarunkowaniaOsobiste.nextDouble()*0.2 + 1.2; 
        }
        else
            return Math.min(1.0, super.predkoscPoruszaniaSie(rodzajTerenu) * 1.1);
    }
    
    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinazadania) {
        return super.rozwiazZadanie(dziedzinazadania);
    }
}
