/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitaplon.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author LENOVO
 */
public class NhanVien implements Serializable{
    private String Manv;
    private float hesoluong;
    private String Calam;
    private String Hoten;
    private int tuoi ;
    private String Email ;
    private String Diachi ;
    private String anh;
    public NhanVien(){
        
    }

    public NhanVien(String Manv,float hesoluong, String Calam, String Hoten, int tuoi, String Email, String Diachi,String anh) {
        this.Manv=Manv;
        this.hesoluong = hesoluong;
        this.Calam = Calam;
        this.Hoten = Hoten;
        this.tuoi = tuoi;
        this.Email = Email;
        this.Diachi = Diachi;
        this.anh = anh;
    }

    @Override
    public boolean equals(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }
        NhanVien other = (NhanVien) obj;
        if(!other.getManv().equals(Manv)){
            return false;
        }
        return true;
    }
    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getHoten() {
        return Hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getEmail() {
        return Email;
    }

    public String getDiachi() {
        return Diachi;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    
    

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public void setCalam(String Calam) {
        this.Calam = Calam;
    }

    public float getHesoluong() {
        return hesoluong;
    }

    public String getCalam() {
        return Calam;
    }
    public String getanh(){
        return this.anh;
    }
        
    
}
