/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warstwa_biznesowa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Aplikacja {
    
    
    
    private List<Grupa> grupy;
    private List<Trener> trenerzy;
    private List<Klient> klienci;


    public Aplikacja(){
        grupy = new ArrayList<>();
        trenerzy = new ArrayList<>();
    }
    
    public Aplikacja (List<Grupa> grupy){
        this.grupy = grupy;
    }
    
    
    public List<Grupa> getGrupy() {
        return grupy;
    }

    public void setGrupy(List<Grupa> grupy) {
        this.grupy = grupy;
    }

    public List<Trener> getTrenerzy() {
        return trenerzy;
    }

    public void setTrenerzy(List<Trener> trenerzy) {
        this.trenerzy = trenerzy;
    }

    public void setKlienci(List<Klient> klienci) {
        this.klienci = klienci;
    }
    
    //------------------------------METODY PODLEGAJĄCE TESTOWANIU:
    
    public Klient szukajKlienta(String name){
        
        Klient klient = null;
        for(Klient kl : klienci){
            if(kl.getName().equals(name)){
                klient = kl;
            }
     
        }
    return klient;
    }
    
    public Trener szukajTrenera(String name){
    Trener trener = null;
    for(Trener tr : trenerzy ){
        if(tr.getName().equals(name)){
            trener = tr;
        }
    }
    return trener;
}
    
    public Grupa szukajGrupy(String nazwaGrupy){
        Grupa grupa = null;
        for(Grupa gr : grupy){
            if(gr.getNazwaGrupy().equals(nazwaGrupy)){
                grupa = gr;
            }
            //return grupa;
        }
    return grupa;
    }
    
    public void usuńKlienta(String name){
        
        Klient klient = szukajKlienta(name);
        klienci.remove(klient);
        
    }

    public void usuńTrenera(String name){
        
        Trener trener = szukajTrenera(name);
        trenerzy.remove(trener);
        
    }
    
    public String przydzielTrenerowiGrupe (String nazwaGrupy, String nazwaTrenera){
     String feedback = "nie udało się przydzielić grupy trenerowi";
     Trener trener = szukajTrenera(nazwaTrenera);
     Grupa grupa = szukajGrupy(nazwaGrupy);
     
     if( trener !=null && grupa !=null){
         trener.getGrupy().add(grupa);
         feedback = "przydzielenie trenerowi grupy zakończone powodzeniem";
     }
     return feedback;
 }
    
    public String dodajKlientaDoGrupy (String nazwaGrupy, String nazwaKlienta){
     String feedback = "nie udało się przydzielić klienta do grupy";
     Klient klient = szukajKlienta(nazwaKlienta);
     Grupa grupa = szukajGrupy(nazwaGrupy);
     
     if( klient !=null && grupa !=null){
         grupa.getKlienci().add(klient);
         feedback = "zapisanie klienta do grupy zakończone powodzeniem";
     }
     return feedback;
 }
    
    public String przejrzyjListeWszystkichKlientow(){
        String lista = "";
        for(Klient kl : klienci){
            lista += kl.getName() + " ";
        }
        return lista;
    }
    
    public String przejrzyjListeWszystkichTrenerow(){
        String lista = "";
        for(Trener tr : trenerzy){
            lista += tr.getName() + " ";
        }
        return lista;
    }
    
    public String przejrzyjListeWszystkichGrup(){
        String lista = "";
        for(Grupa gr : grupy){
            lista += gr.getNazwaGrupy() + " ";
        }
        return lista;
    }
    
       
    public String usunGrupe(String nazwaGrupy){
    String feedback = "nie znaleziono grupy";
    Grupa grupa = szukajGrupy(nazwaGrupy);
    if(grupa != null){
        grupy.remove(grupa);
        feedback = "grupa została usunięta";
    }
    return feedback;
}
 
 
    public void dodajGrupe(String dzien, int godzStart, int godzKoniec, int sala){
     grupy.add(new Grupa(dzien, godzStart, godzKoniec, sala));
 }


    
}