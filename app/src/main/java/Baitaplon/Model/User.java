/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitaplon.Model;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class User implements Serializable{
    public String ID;
    public String TenTK;
    public String Email;
    public String pass;
    public int tuoi;
    public String Hoten ;
    public User(){
       
    }

    public boolean equals(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }
        User other = (User) obj;
        if(!other.getID().equals(ID)){
            return false;
        }
        return true;
    }
    public User(String ID,String TenTK, String Email, String pass,String Hoten,int tuoi) {
        this.ID=ID;
        this.TenTK = TenTK;
        this.Email = Email;
        this.pass = pass;
        this.Hoten = Hoten;
        this.tuoi=tuoi;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTenTK(String Ten) {
        this.TenTK = Ten;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    public String getID() {
        return ID;
    }

    public String getHoten(){
        return this.Hoten;
    }
    public String getTenTK() {
        return TenTK;
    }

    public String getEmail() {
        return Email;
    }

    public String getPass() {
        return pass;
    }

    public int getTuoi() {
        return tuoi;
    }

}
