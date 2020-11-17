/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pg.eti.ksg.po.lab2.biegpolesie;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lukaszgolojuch
 */
public class FabrykaElementowTrasy implements ElementTrasy{

    private Map<Uczestnik,Double> uczestnicyWTerenie = new HashMap<>();

    public Map<Uczestnik, Double> getUczestnicyWTerenie() {
        return uczestnicyWTerenie;
    }
    
    @Override
    public Iterable<Uczestnik> getUczestnicy() {
        return uczestnicyWTerenie.keySet();
    }

    @Override
    public void dodajUczestnika(Uczestnik u) {
        uczestnicyWTerenie.put(u, 0.0);
    }

    @Override
    public void usunUczestnika(Uczestnik u) {
        uczestnicyWTerenie.remove(u);
    }

    @Override
    public int getLiczbaUczestnikowNaTrasie() {
        return uczestnicyWTerenie.size();
    }
    
    //========================================================
    
    public static BiegPoLesie gorki(PrintStream mikrofon, PrintStream przestrzenWLesie)
    {
        BiegPoLesie gorki_ = new BiegPoLesie("Górki",mikrofon,przestrzenWLesie);
        
        gorki_.dodajElementTrasy(new Teren(RodzajTerenu.DROGA));
        gorki_.dodajElementTrasy(new Teren(RodzajTerenu.SCIEZKA));
        gorki_.dodajElementTrasy(new Teren(RodzajTerenu.SCIEZKA));
        gorki_.dodajElementTrasy(new Teren(RodzajTerenu.NISKI_LAS));
        gorki_.dodajElementTrasy(new Teren(RodzajTerenu.BAGNO));
//        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.FIZYKA));
//        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
//        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.NAUKI_LESNE));
        gorki_.dodajElementTrasy(new Teren(RodzajTerenu.WYSOKI_LAS));
        
        return gorki_;
    }
    
    public static BiegPoLesie naPrzelajZMatematyka(PrintStream mikrofon, PrintStream przestrzenWLesie) {
        BiegPoLesie naPrzelaj = new BiegPoLesie("Na przełaj z matematyką",mikrofon,przestrzenWLesie);
        
        naPrzelaj.dodajElementTrasy(new Teren(RodzajTerenu.DROGA));
        naPrzelaj.dodajElementTrasy(new Teren(RodzajTerenu.SCIEZKA));
        naPrzelaj.dodajElementTrasy(new Teren(RodzajTerenu.NISKI_LAS));
//        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        naPrzelaj.dodajElementTrasy(new Teren(RodzajTerenu.NISKI_LAS));
//        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        naPrzelaj.dodajElementTrasy(new Teren(RodzajTerenu.NISKI_LAS));
//        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        naPrzelaj.dodajElementTrasy(new Teren(RodzajTerenu.WYSOKI_LAS));
        
        return naPrzelaj;
    }

    public static BiegPoLesie bagiennyMiks(PrintStream mikrofon, PrintStream przestrzenWLesie) {
        BiegPoLesie miks = new BiegPoLesie("Bagienny miks naukowy",mikrofon,przestrzenWLesie);
        
        miks.dodajElementTrasy(new Teren(RodzajTerenu.DROGA));
        miks.dodajElementTrasy(new Teren(RodzajTerenu.SCIEZKA));
        miks.dodajElementTrasy(new Teren(RodzajTerenu.BAGNO));
//        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        miks.dodajElementTrasy(new Teren(RodzajTerenu.BAGNO));
//        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.FIZYKA));
        miks.dodajElementTrasy(new Teren(RodzajTerenu.BAGNO));
//        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.INFORMATYKA));
        miks.dodajElementTrasy(new Teren(RodzajTerenu.BAGNO));
//        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.SZTUKA));
        miks.dodajElementTrasy(new Teren(RodzajTerenu.BAGNO));
//        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.NAUKI_LESNE));
        miks.dodajElementTrasy(new Teren(RodzajTerenu.WYSOKI_LAS));

        return miks;
    }
}
