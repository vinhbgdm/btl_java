/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitaplon.controler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Files {
    public <T> void ghifile(ArrayList<T> list,String filename){
        FileOutputStream fout = null;
        ObjectOutputStream oss = null;
        try {
            fout = new FileOutputStream(filename);
            oss = new ObjectOutputStream(fout);
            oss.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public <T> ArrayList<T> docfile(String filename){
        FileInputStream fin = null;
        ObjectInputStream oin = null;
        ArrayList<T> list = new ArrayList<>();
        try {
            fin = new FileInputStream(filename);
            oin = new ObjectInputStream(fin);
            list = (ArrayList<T>) oin.readObject();
        } catch (Exception e) {
            System.out.println("File Không có dữ liệu");
        }
        return list;
    }
}
