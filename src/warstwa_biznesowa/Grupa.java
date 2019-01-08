/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warstwa_biznesowa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Student
 */
public class Grupa {
    private String nazwaGrupy;
    private String ID;
    private List<Klient> klienci;
    private String dni;
    private int godzStart;
    private int godzKoniec;
    private int sala;
    private String planZajec;
    private Map <String, ArrayList<Integer>> listaObecnosci;
   

    
    public Grupa (String nazwa){
        this.nazwaGrupy = nazwa;
        klienci = new ArrayList<>();
        listaObecnosci = new TreeMap <String, ArrayList<Integer>>();
    }
    
    
    public Grupa(String dzien, int godzStart, int godzKoniec, int sala) {
        this.dni = dzien;
        this.godzStart = godzStart;
        this.godzKoniec = godzKoniec;
        this.sala = sala;
    }

    public Grupa(List<Klient> klienci, String dni, int godzStart, int godzKoniec, int sala) {
        this.klienci = klienci;
        this.dni = dni;
        this.godzStart = godzStart;
        this.godzKoniec = godzKoniec;
        this.sala = sala;
    }
    
    public String getNazwaGrupy(){
        return nazwaGrupy;
    }

    
    public String getID() {
        return ID;
    }

    public List<Klient> getKlienci() {
        return klienci;
    }

    public String getDni() {
        return dni;
    }

    public int getGodzStart() {
        return godzStart;
    }

    public int getGodzKoniec() {
        return godzKoniec;
    }

    public int getSala() {
        return sala;
    }

    public String getPlanZajec() {
        return planZajec;
    }

    public Map <String, ArrayList<Integer>> getListaObecnosci() {
        return listaObecnosci;
    }

    public void setKlienci(List<Klient> klienci) {
        this.klienci = klienci;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setGodzStart(int godzStart) {
        this.godzStart = godzStart;
    }

    public void setGodzKoniec(int godzKoniec) {
        this.godzKoniec = godzKoniec;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setPlanZajec(String planZajec) {
        this.planZajec = planZajec;
    }

    public void setListaObecnosci(Map <String, ArrayList<Integer>> listaObecnosci) {
        this.listaObecnosci = listaObecnosci;
    }
    
    public void obecnosc(String nazwaKlienta){
        
        if(listaObecnosci.containsKey(nazwaKlienta)){
            listaObecnosci.get(nazwaKlienta).add(1);
        }
        else{
            String key = nazwaKlienta;
            ArrayList<Integer> value = new ArrayList<>();
            value.add(1);
            listaObecnosci.put(key, value);
        }
    }
    
    public void nieobecnosc(String nazwaKlienta){
        
        if(listaObecnosci.containsKey(nazwaKlienta)){
            listaObecnosci.get(nazwaKlienta).add(0);
        }
        else{
            String key = nazwaKlienta;
            ArrayList<Integer> value = new ArrayList<>();
            value.add(0);
            listaObecnosci.put(key, value);
        }
    }
    
}

