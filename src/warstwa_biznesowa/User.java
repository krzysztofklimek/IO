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
public class User {
    protected String ID;
    protected String email;
    protected String password;
    protected String name;
    protected String surname;
    
    public User (String name){
        this.name=name;
    }

    public User(String ID, String email, String password, String name, String surname) {
        this.ID = ID;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
}
