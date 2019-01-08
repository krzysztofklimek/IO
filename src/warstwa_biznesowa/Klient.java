/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warstwa_biznesowa;

/**
 *
 * @author Student
 */
public class Klient extends User{
    
    private int poziom;

    public Klient(String name){
        super(name);
    }
    
    
    public Klient(String ID, String email, String password, String name, String surname, int poziom) {
        super(ID, email, password, name, surname);
             this.poziom=poziom;
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
}
