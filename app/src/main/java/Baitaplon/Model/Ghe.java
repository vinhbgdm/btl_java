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
public class Ghe implements Serializable{
    private String Maghe;
    private boolean chk;
    private String vitri ;
  
    public Ghe(){
        
    }
    public Ghe(boolean chk,String vitri,String ma){
        this.Maghe=ma;
        this.chk=chk;
        this.vitri=vitri;
    }
    @Override
    public boolean equals(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }
        Ghe other = (Ghe) obj;
        if(!other.getMaghe().equals(Maghe)){
            return false;
        }
        return true;
    }

    public void setMaghe(String Maghe) {
        this.Maghe = Maghe;
    }
    public void setvitri(String vitri){
        this.vitri=vitri;
    }
    public void setchk(boolean a){
        this.chk=a;
    }
    public boolean getchk(){
        return this.chk;
    }
    public String getvitri(){
        return this.vitri;
    }
    public String getMaghe(){
        return this.Maghe;
    }
}
