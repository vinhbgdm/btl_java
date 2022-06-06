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
public class KhachHang extends User implements Serializable{
    public String diachi ;

    public KhachHang() {
    }

    public KhachHang(String diachi,String ID, String TenTK, String Email, String pass,String Hoten, int tuoi) {
        super(ID, TenTK, Email, pass,Hoten, tuoi);
        this.diachi=diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDiachi() {
        return diachi;
    }
    
}
