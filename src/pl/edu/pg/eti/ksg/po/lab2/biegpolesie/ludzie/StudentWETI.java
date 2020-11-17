/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie;

import java.util.Random;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.RodzajTerenu;

/**
 *
 * @author lukaszgolojuch
 */
public class StudentWETI extends StudentPolitechniki{
    
    public StudentWETI(String imie, String nazwisko, Plec plec, String kierunek) {
        super(imie, nazwisko, plec, kierunek);
    }
    
    @Override
    public void przedstawSie() {
        wypowiedzSie("Cześć! Jestem "+getImie()+" "+getNazwisko()+". Jestem studentem WETI, więc umiem informatykę");
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        if(RodzajTerenu.BAGNO.equals(rodzajTerenu))
        {
            wypowiedzSie("Generalnie dobrze się idzie. Tylko trzeba stopy stawiać na tym bardziej suchym, twardszym mchu.");
            return humorIUwarunkowaniaOsobiste.nextDouble()*0.2 + 0.2; //Od 0.2 do 0.4
        }
        else
            return Math.min(1.0, super.predkoscPoruszaniaSie(rodzajTerenu) * 1.1);
    }
    
    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinazadania) {
        int c;
        Random t = new Random();
        // random integers in [0, 100]
        c=t.nextInt(100);
        
        if(c<=99.99 && DziedzinaZadania.INFORMATYKA.equals(dziedzinazadania))
        {
            return true;
        }
        else
        {
            return super.rozwiazZadanie(dziedzinazadania);
        }
    }
}


