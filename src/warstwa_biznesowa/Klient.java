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
public class Klient extends User{
    
    private int poziom;
    private List<String> grupyDoZapisania;
    private List<Grupa> zapisanyDoGrup;

    public Klient(String name){
        super(name);
        grupyDoZapisania = new ArrayList<>();
        zapisanyDoGrup = new ArrayList<>();
    }
    
    
    public Klient(String ID, String email, String password, String name, String surname, int poziom) {
        super(ID, email, password, name, surname);
             this.poziom=poziom;
    }
    
    
    public Grupa szukajGrupy(String nazwaGrupy){
        Grupa grupa = null;
        for(Grupa gr : zapisanyDoGrup){
            if(gr.getNazwaGrupy().equals(nazwaGrupy)){
                grupa = gr;
            }
            //return grupa;
    }
    return grupa;
    }
    
    public void zapiszSieDoGrupy(String nazwaGrupy){
        grupyDoZapisania.add(nazwaGrupy);
    }
    
    public void wypiszSieZGrupy(String nazwaGrupy){
        grupyDoZapisania.remove(nazwaGrupy);
    }
    
    
    
    public String sprawdzPlan(String nazwaGrupy){
        Grupa grupa = szukajGrupy(nazwaGrupy);
        return grupa.getPlanZajec();
    }
    
    
    public List<String> getGrupyDoZapisania(){
        return grupyDoZapisania;
    }
    
    
    
    public int getPoziom() {
        return poziom;
    }

    public String getName(){
            return name;
        }
        
    public void setPoziom(int poziom) {
        this.poziom = poziom;
    }
    public void setZapisanyDoGrup(List<Grupa> zapisanyDoGrup){
        this.zapisanyDoGrup = zapisanyDoGrup;
    }
}
