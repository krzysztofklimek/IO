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
public class Grupa {
    private String nazwaGrupy;
    private String ID;
    private List<Klient> klienci;
    private String dni;
    private int godzStart;
    private int godzKoniec;
    private int sala;
    private String planZajec;
    private String listaObecnosci;

    
    public Grupa (String nazwa){
        this.nazwaGrupy = nazwa;
        klienci = new ArrayList<>();
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

    public String getListaObecnosci() {
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

    public void setListaObecnosci(String listaObecnosci) {
        this.listaObecnosci = listaObecnosci;
    }
    
}

