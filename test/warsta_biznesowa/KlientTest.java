/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warsta_biznesowa;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import warstwa_biznesowa.Grupa;
import warstwa_biznesowa.Klient;

/**
 *
 * @author kkk
 */
public class KlientTest {
    
    @Test
    public void testZapiszSieDoGrupy(){
        String nazwaGrupy = "nazwaGrupy";
        Klient klient = new Klient("klient");
        
        klient.zapiszSieDoGrupy(nazwaGrupy);
        String nazwaDoTestu = klient.getGrupyDoZapisania().get(0);
        assertEquals(nazwaGrupy, nazwaDoTestu);
        
    }
    
    @Test
    public void testWypiszSieZGrupy(){
        
        String nazwaGrupy = "nazwaGrupy";
        Klient klient = new Klient("klient");
        
        //SPRAWDZANIE CZY NAZWA GRUPY DODAŁA SIE DO LISY
        klient.zapiszSieDoGrupy(nazwaGrupy);
        String nazwaDoTestu = klient.getGrupyDoZapisania().get(0);
        assertEquals(nazwaGrupy, nazwaDoTestu);
        
        //SPRAWDZANIE CZY PO USUNIECIU WCZESNIEJ DODANEJ NAZWY GRUPY ZOSTAŁA ONA POPRAWNIE USUNIĘTA
        klient.wypiszSieZGrupy(nazwaGrupy);
        assertEquals(0, klient.getGrupyDoZapisania().size());  
    }
    
    @Test
    public void testSprawdzPlan(){
        
        Grupa grupa = new Grupa("grupa");
        grupa.setPlanZajec("plan zajec");
        List <Grupa> grupy = new ArrayList<>();
        grupy.add(grupa);
        
        Klient klient = new Klient("klient");
        klient.setZapisanyDoGrup(grupy);
        
        assertEquals("plan zajec", klient.sprawdzPlan("grupa"));
    }
    
    
}
