/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitaplon.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Phong implements Serializable{
    public String Maph;
    public int Soghe=60;
    public ArrayList<Ghe> Arrghe = new ArrayList<>();
    public ArrayList<Phim> Arrphim = new ArrayList<>();
    public Phong(String ma,int m){
        Maph=ma;
        String vtri=null;
        int dem=1;
        for(int i=1;i<=60;i++){
            if(i<=10){
                vtri="A"+dem++;
            }else if(i<=20){
                vtri="B"+dem++;
            }else if(i<=30){
                vtri="C"+dem++;
            }else if(i<=40){
                vtri="D"+dem++;
            }else if(i<=50){
                vtri="E"+dem++;
            }else{
                vtri="F"+dem++;
            }
            if(i%10==0){
                dem=1;
            }
            String maghe = "GH"+m++;
            Ghe gh = new Ghe(false,vtri,maghe);
            Arrghe.add(gh); 
        }
    }
    public Phong(String ma){
        this.Maph=ma;
    }
    public Phong(){
        
    }
    public Phong(String ma,ArrayList<Phim> Arrphim,int m) {
        Maph=ma;
        String vtri = null;
        int dem=1;
        for(int i=0;i<20;i++){
            if(i<=10){
                vtri="A"+dem++;
            }else if(i<=20){
                vtri="B"+dem++;
            }else if(i<=30){
                vtri="C"+dem++;
            }else if(i<=40){
                vtri="D"+dem++;
            }else if(i<=50){
                vtri="E"+dem++;
            }else{
                vtri="F"+dem++;
            }
            if(i%10==0){
                dem=1;
            }
            String maghe = "GH"+m++;
            Ghe gh = new Ghe(false,vtri,maghe);
            Arrghe.add(gh);
        }
        this.Arrphim = Arrphim;
        this.Soghe=Soghe;
    }
     @Override
    public boolean equals(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }
        Phong other = (Phong) obj;
        if(!other.getMaph().equals(Maph)){
            return false;
        }
        return true;
    }
    public void setMaph(String Maph) {
        this.Maph = Maph;
    }

    public void setSoghe(int Soghe) {
        this.Soghe = Soghe;
    }

    public void setArrghe(ArrayList<Ghe> Arrghe) {
        this.Arrghe = Arrghe;
    }

    public void setArrphim(ArrayList<Phim> Arrphim) {
        this.Arrphim = Arrphim;
    }

  

    public String getMaph() {
        return Maph;
    }

    public int getSoghe() {
        return Soghe;
    }

    public ArrayList<Ghe> getArrghe() {
        return Arrghe;
    }

    public ArrayList<Phim> getArrphim() {
        return Arrphim;
    }

}
