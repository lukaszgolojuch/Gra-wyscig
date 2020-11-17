package pl.edu.pg.eti.ksg.po.lab2;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.BiegPoLesie;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.Czlowiek;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.FabrykaElementowTrasy;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.RodzajTerenu;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.Teren;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.Uczestnik;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie.BagiennyBiegacz;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie.StudentWETI;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.roboty.RobotMobilny;

/**
 *
 * @author TB
 */
public class Javalab2 extends FabrykaElementowTrasy{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Set<Uczestnik> uczestnicy = new HashSet<>();
        uczestnicy.add(new BagiennyBiegacz("Krzysztof", "Kowalski", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new StudentWETI("Łukasz", "Gołojuch", Czlowiek.Plec.MEZCZYZNA, "Informatyka"));
        uczestnicy.add(new RobotMobilny(1));
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w aplikacji Bieg po Lesie. Wybierz bieg: ");
        System.out.println("1. Górki");
        System.out.println("2. Na przełaj z Matematyką");
        System.out.println("3. Bagienny miks naukowy");
        int wybor = scanner.nextInt();
        
        BiegPoLesie bieg;
        
        switch(wybor)
        {
            default:
                System.out.println("Niezany wybór. Wybieranie opcji nr 1.");
            case 1:
                bieg = FabrykaElementowTrasy.gorki(System.out, System.out);
                break;
            case 2:
                bieg = FabrykaElementowTrasy.naPrzelajZMatematyka(System.out, System.out);
                break;
            case 3:
                bieg = FabrykaElementowTrasy.bagiennyMiks(System.out, System.out);
                break;
        }
        
        for(Uczestnik u : uczestnicy)
        {
            bieg.dodajUczestnika(u);
        }
        
        bieg.przeprowadzImpreze();
    }
    
    
    
}
