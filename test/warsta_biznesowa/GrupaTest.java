/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warsta_biznesowa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import warstwa_biznesowa.Grupa;
import warstwa_biznesowa.Klient;

/**
 *
 * @author kkk
 */
public class GrupaTest {
    
    @Test
    public void testObecnosc(){
        
        Grupa grupa = new Grupa("grupa");
        grupa.obecnosc("klient");
        
        Map<String, ArrayList<Integer>> listaObecnosci = grupa.getListaObecnosci();
        
        
        //SPRAWDZANIE CZY W LISCIE JEST WPISANA OBECNOSC CZY NIE OBECNOSC
        int wartoscObecnosci = listaObecnosci.get("klient").get(0); 
        assertEquals(wartoscObecnosci, 1);
        
        //SPRAWDZANIE ILE RAZY BYLA WPISANA OBECNOSC
        int iloscObecnosci = listaObecnosci.get("klient").size(); 
        assertEquals(iloscObecnosci, 1);
        
    }
    
    @Test
    public void testNieobecnosc(){
        
        Grupa grupa = new Grupa("grupa");
        grupa.nieobecnosc("klient");
        
        Map<String, ArrayList<Integer>> listaObecnosci = grupa.getListaObecnosci();
        
        
        //SPRAWDZANIE CZY W LISCIE JEST WPISANA OBECNOSC CZY NIE OBECNOSC
        int wartoscObecnosci = listaObecnosci.get("klient").get(0); 
        assertEquals(wartoscObecnosci, 0);
        
        //SPRAWDZANIE ILE RAZY BYLA WPISANA OBECNOSC
        int iloscObecnosci = listaObecnosci.get("klient").size(); 
        assertEquals(iloscObecnosci, 1);
    }
    
}
