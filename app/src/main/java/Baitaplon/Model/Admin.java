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
public class Admin implements Serializable{
    private String Tentk;
    private String password;
    public Admin(){
        
    }
    public Admin(String tentk , String pass){
        this.Tentk=tentk;
        this.password=pass;
    }
    @Override
    public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Admin other = (Admin) obj;
        if(!other.gettentk().equals(Tentk)){
            return false;
        }
        return true;
    }
    public void settentk(String tentk){
        this.Tentk=tentk;
    }
    public void setpassword(String pass){
        this.password = pass;
    }
    public String gettentk(){
        return this.Tentk;
    }
    public String getpassword(){
        return this.password;
    }
}
