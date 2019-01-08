package warsta_biznesowa;


import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;
//import warstwa_biznesowa.*;
import warstwa_biznesowa.Aplikacja;
import warstwa_biznesowa.Grupa;
import warstwa_biznesowa.Klient;
import warstwa_biznesowa.Trener;



public class AplikacjaTest {

    
    @Test
    public void testSzukajKlienta(){
        Klient klient = new Klient("klientDoWyszukania");
        List <Klient> klienci = new ArrayList<>();
        klienci.add(klient);
        Aplikacja aplikacja = new Aplikacja();
        aplikacja.setKlienci(klienci);
        
        
        //TESTOWANA METODA WYSZUKUJĄCA GRUPĘ PO WPISANIU NAZWY 
        Klient wyszukanyKlient = aplikacja.szukajKlienta("klientDoWyszukania");
        
        //SPRAWDZAMY CZY ZNALEZIONO JAKĄKOLWIEK GRUPĘ, A NASTĘPNIE CZY ZOSTAŁA ZNALEZIONA ODPOWIEDNIA GRUPA
        assertNotNull(wyszukanyKlient);
        assertEquals("klientDoWyszukania", wyszukanyKlient.getName());
    }
    
    
    @Test
    public void testSzukajTrenera(){
        
        Trener trener = new Trener("trenerDoWyszukania");
        List <Trener> trenerzy = new ArrayList<>();
        trenerzy.add(trener);
        Aplikacja aplikacja = new Aplikacja();
        aplikacja.setTrenerzy(trenerzy);
        
        //TESTOWANA METODA WYSZUKUJĄCA TRENERA PO WPISANIU NAZWY 
        Trener wyszukanyTrener = aplikacja.szukajTrenera("trenerDoWyszukania");
        
        //SPRAWDZAMY CZY ZNALEZIONO JAKIEGOKOLWIEK TRENERA, A NASTĘPNIE CZY ZOSTAŁ ZNALEZIONY ODPOWIEDNI TRENER
        assertNotNull(wyszukanyTrener);
        assertEquals("trenerDoWyszukania", wyszukanyTrener.getName());
        
    }
    
    
    @Test
    public void testSzukajGrupy(){
        
        Grupa grupa = new Grupa("grupaDoWyszukania");
        List <Grupa> grupy = new ArrayList<>();
        grupy.add(grupa);
        Aplikacja aplikacja = new Aplikacja(grupy);
        
        //TESTOWANA METODA WYSZUKUJĄCA GRUPĘ PO WPISANIU NAZWY 
        Grupa wyszukanaGrupa = aplikacja.szukajGrupy("grupaDoWyszukania");
        
        //SPRAWDZAMY CZY ZNALEZIONO JAKĄKOLWIEK GRUPĘ, A NASTĘPNIE CZY ZOSTAŁA ZNALEZIONA ODPOWIEDNIA GRUPA
        assertNotNull(wyszukanaGrupa);
        assertEquals("grupaDoWyszukania", wyszukanaGrupa.getNazwaGrupy());
    }
    
    
    @Test
    public void testUsunKlienta(){
        Klient klient = new Klient("klientDoUsunięcia");
        List <Klient> klienci = new ArrayList<>();
        klienci.add(klient);
        
        //TESTOWANIE CZY DOBRZE DODANO GRUPE
        assertEquals(klienci.size(), 1);
        
        Aplikacja aplikacja = new Aplikacja();
        aplikacja.setKlienci(klienci);
        
        aplikacja.usuńKlienta("klientDoUsunięcia");
        
        //SPRAWDZAMY CZY GRUPA ZOSTAŁA USUNIĘTA
        assertEquals(klienci.size(), 0);
       
    }
    
    
    @Test
    public void testUsunTrenera(){
        Trener trener = new Trener("trenerDoUsunięcia");
        List <Trener> trenerzy = new ArrayList<>();
        trenerzy.add(trener);
        
        //TESTOWANIE CZY DOBRZE DODANO GRUPE
        assertEquals(trenerzy.size(), 1);
        
        Aplikacja aplikacja = new Aplikacja();
        aplikacja.setTrenerzy(trenerzy);
        
        aplikacja.usuńTrenera("trenerDoUsunięcia");
        
        //SPRAWDZAMY CZY GRUPA ZOSTAŁA USUNIĘTA
        assertEquals(aplikacja.getTrenerzy().size(), 0);
       
    }
  
    
    @Test
    public void testPrzydzielTrenerowiGrupe(){
        
        Trener trener = new Trener("trener");
        List <Trener> trenerzy = new ArrayList<>();
        trenerzy.add(trener);
        
        Grupa grupa = new Grupa("grupa");
        List <Grupa> grupy = new ArrayList<>();
        grupy.add(grupa);
        
        Aplikacja aplikacja = new Aplikacja();
        aplikacja.setTrenerzy(trenerzy);
        aplikacja.setGrupy(grupy);
        
        //TESTOWANIE PRZYDZIELANIA TRENEROWI GRUPY POPRZEZ SPRAWDZENIE ZWRACANEJ WIADOMOSCI
        assertEquals("przydzielenie trenerowi grupy zakończone powodzeniem", 
                aplikacja.przydzielTrenerowiGrupe("grupa", "trener"));
        
     
        
    }
    
    
    @Test
    public void testDodajKlientaDoGrupy(){
        
        Klient klient = new Klient("klient");
        List <Klient> klienci = new ArrayList<>();
        klienci.add(klient);
        
        Grupa grupa = new Grupa("grupa");
        List <Grupa> grupy = new ArrayList<>();
        grupy.add(grupa);
        
        Aplikacja aplikacja = new Aplikacja();
        aplikacja.setKlienci(klienci);
        aplikacja.setGrupy(grupy);
        
        //TESTOWANIE DODAWANIA KLIENTA DDO GRUPY
        assertEquals("zapisanie klienta do grupy zakończone powodzeniem", 
                aplikacja.dodajKlientaDoGrupy("grupa", "klient"));

        
        //TESTOWANIE DODAWANIA KLIENTA DDO GRUPY ZE ZŁĄ NAZWĄ GRUPY
        assertEquals("nie udało się przydzielić klienta do grupy", 
                aplikacja.dodajKlientaDoGrupy("złaNazwa", "klient"));
        
        
    }
    
   
    @Test
    public void testPrzejrzyjListeWszystkichKlientow(){
        
        Klient klient = new Klient("klient");
        List <Klient> klienci = new ArrayList<>(); 
        Aplikacja aplikacja = new Aplikacja();        
        
        //TESTOWANIE FUNCKJI Z PUSTĄ LISTĄ
        aplikacja.setKlienci(klienci);
        assertEquals("", aplikacja.przejrzyjListeWszystkichKlientow());

        //TESTOWANIE FUNCKJI Z LISTĄ Z JEDNYM KLIENTEM
        klienci.add(klient);
        assertEquals("klient ", aplikacja.przejrzyjListeWszystkichKlientow());
        
    }
    
    
    @Test
    public void testPrzejrzyjListeWszystkichTrenerow(){
        
        Trener trener = new Trener("trener");
        List <Trener> trenerzy = new ArrayList<>();
        Aplikacja aplikacja = new Aplikacja();
        
        
        //TESTOWANIE FUNCKJI Z PUSTĄ LISTĄ
        aplikacja.setTrenerzy(trenerzy);
        assertEquals("", aplikacja.przejrzyjListeWszystkichTrenerow());

        //TESTOWANIE FUNCKJI Z LISTĄ Z JEDNYM TRENEREM
        trenerzy.add(trener);
        assertEquals("trener ", aplikacja.przejrzyjListeWszystkichTrenerow());    
                     
    }
    
    @Test
    public void testPrzejrzyjListeWszystkichGrup(){
     
        Grupa grupa = new Grupa("grupa");
        List<Grupa> grupy = new ArrayList<>();
        Aplikacja aplikacja = new Aplikacja();
       
        //TESTOWANIE FUNCKJI Z PUSTĄ LISTĄ
        aplikacja.setGrupy(grupy);
        assertEquals("", aplikacja.przejrzyjListeWszystkichGrup());

        //TESTOWANIE FUNCKJI Z LISTĄ Z JEDNĄ GRUPĄ
        grupy.add(grupa);
        assertEquals("grupa ", aplikacja.przejrzyjListeWszystkichGrup());
        
    }
    
    @Test
    public void testUsunGrupe(){
        Grupa grupa = new Grupa("grupaDoUsunięcia");
        List <Grupa> grupy = new ArrayList<>();
        grupy.add(grupa);
        
        //TESTOWANIE CZY DOBRZE DODANO GRUPE
        assertEquals(grupy.size(), 1);
        
        Aplikacja aplikacja = new Aplikacja(grupy);
        
        //TESTOWANA METODA USUWAJĄCA GRUPE O WPISANEJ NAZWIE 
        assertEquals(aplikacja.usunGrupe("grupaDoUsunięcia"), "grupa została usunięta");
        
        //SPRAWDZAMY CZY GRUPA ZOSTAŁA USUNIĘTA A NASTĘPNIE CZY WYŚWIETLA SIĘ INFORMACJA O NIEZNALEZIONEJ GRUPUE
        assertEquals(grupy.size(), 0);
        assertEquals(aplikacja.usunGrupe("innaNazwa"), "nie znaleziono grupy");
    }
    
 
    @Test
    public void testDodajGrupe(){
        
        Aplikacja aplikacja = new Aplikacja();
        
        //SPRAWDZANIE ROZMARU LISTY PRZED DODANIEM GRUPY
        assertEquals(aplikacja.getGrupy().size(), 0);
        aplikacja.dodajGrupe("pon", 12, 13, 112);
        
        //SPRAWDZANIE ROZMIARU LISTY PO DODANIU GRUPY 
        assertEquals(aplikacja.getGrupy().size(), 1);
        
    }
    
    
}
