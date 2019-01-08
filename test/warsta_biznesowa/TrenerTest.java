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
    public void testSprawdzObecnosc(){
        
    }
    
}
