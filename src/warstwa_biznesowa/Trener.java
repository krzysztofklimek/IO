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
public class Trener extends User {
   
    private List<Grupa> grupy;
    
    
    public Trener (String name){
        super(name);
        grupy = new ArrayList<>();
    }
    
    public Trener(String ID, String email, String password, String name, String surname, List<Grupa> grupy) {
        super(ID, email, password, name, surname);
        this.grupy=grupy;
    }

    public List<Grupa> getGrupy() {
        return grupy;
    }

    public void setGrupy(List<Grupa> grupy) {
        this.grupy = grupy;
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
    
    
    //------------------------------METODY PODLEGAJĄCE TESTOWANIU:
    
    public String przejrzyjListeSwoichGrup(){
        String lista = "";
        
        for(Grupa gr : grupy){
            lista += gr.getNazwaGrupy() + " ";
        }
    
        return lista;
    }
    
    public void dodajPlanZajec(String nazwaGrupy, String plan){
        Grupa grupa = szukajGrupy(nazwaGrupy);
        
        grupa.setPlanZajec(plan);
    }
    
    public void wstawObecnosc(String nazwaGrupy, String nazwaKlienta){
                
        Grupa grupa = szukajGrupy(nazwaGrupy);
        grupa.obecnosc(nazwaKlienta);
    }
    
    public void wstawNieobecnosc(String nazwaGrupy, String nazwaKlienta){
        
        Grupa grupa = szukajGrupy(nazwaGrupy);
        grupa.nieobecnosc(nazwaKlienta);
    }
    
    
}
