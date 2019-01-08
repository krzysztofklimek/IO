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
import warstwa_biznesowa.Trener;

/**
 *
 * @author kkk
 */
public class TrenerTest {
    
    @Test
    public void testPrzejrzyjListeSwoichGrup(){
        
        Trener trener = new Trener("trener");
        List grupy = new ArrayList<>();
        
        Grupa grupa1 = new Grupa("grupa1");
        Grupa grupa2 = new Grupa("grupa2");
        
        
        //TESTOWANIE FUNCKJI Z PUSTĄ LISTĄ
        trener.setGrupy(grupy);
        assertEquals("", trener.przejrzyjListeSwoichGrup());

        //TESTOWANIE FUNCKJI Z LISTĄ Z JEDNĄ GRUPĄ
        grupy.add(grupa1);
        assertEquals("grupa1 ", trener.przejrzyjListeSwoichGrup());
        
        
        //TESTOWANIE FUNCKJI Z LISTĄ Z DWIEMA GRUPAMI
        grupy.add(grupa2);
        assertEquals("grupa1 grupa2 ", trener.przejrzyjListeSwoichGrup());
    }
    
    @Test
    public void testDodajPlanZajec(){
        
        String planZajec = "szczegółowy plan zajec";
        Trener trener = new Trener("trener");
        Grupa grupa = new Grupa("grupa");
        List grupy = new ArrayList<>();
        grupy.add(grupa);
        
        trener.setGrupy(grupy);
        trener.dodajPlanZajec("grupa", planZajec);
        
        // TEST SPRAWDZAJACY CZY POPRAWNIE DODAŁ SIĘ PLAN ZAJEC
        assertEquals("szczegółowy plan zajec", trener.szukajGrupy("grupa").getPlanZajec());
    }
    
   @Test
   public void testWstawObecnosc(){
       
       Grupa grupa = new Grupa("grupa");
       List<Grupa> grupy = new ArrayList<>();
       grupy.add(grupa);
       Trener trener = new Trener("trener");
       trener.setGrupy(grupy);
       trener.wstawObecnosc("grupa", "klient");
       
       Map<String, ArrayList<Integer>> listaObecnosci = grupa.getListaObecnosci();
       
        //SPRAWDZANIE CZY W LISCIE JEST WPISANA OBECNOSC CZY NIE OBECNOSC
        int wartoscObecnosci = listaObecnosci.get("klient").get(0); 
        assertEquals(wartoscObecnosci, 1);
        
        //SPRAWDZANIE ILE RAZY BYLA WPISANA OBECNOSC
        int iloscObecnosci = listaObecnosci.get("klient").size(); 
        assertEquals(iloscObecnosci, 1);
       
   }
    
   @Test
   public void testWstawNiebecnosc(){
       Grupa grupa = new Grupa("grupa");
       List<Grupa> grupy = new ArrayList<>();
       grupy.add(grupa);
       Trener trener = new Trener("trener");
       trener.setGrupy(grupy);
       trener.wstawNieobecnosc("grupa", "klient");
       
       Map<String, ArrayList<Integer>> listaObecnosci = grupa.getListaObecnosci();
       
        //SPRAWDZANIE CZY W LISCIE JEST WPISANA OBECNOSC CZY NIE OBECNOSC
        int wartoscObecnosci = listaObecnosci.get("klient").get(0); 
        assertEquals(wartoscObecnosci, 0);
        
        //SPRAWDZANIE ILE RAZY BYLA WPISANA OBECNOSC
        int iloscObecnosci = listaObecnosci.get("klient").size(); 
        assertEquals(iloscObecnosci, 1);
       
   }
}
