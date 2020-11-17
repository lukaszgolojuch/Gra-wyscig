/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pg.eti.ksg.po.lab2.biegpolesie;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lukaszgolojuch
 */
public class Zadanie implements ElementTrasy {

    private final DziedzinaZadania dziedzinazadania;
    private Map<Uczestnik,Double> uczestnicyWTerenie = new HashMap<>();
    
    Zadanie(DziedzinaZadania dziedzinazadania) {
        this.dziedzinazadania = dziedzinazadania;
    }
    
    public DziedzinaZadania getDziedzinaZadania() {
        return dziedzinazadania;
    }
    
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

}