/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author NAT
 */
public class Bus3 {
    public int Penumpang;
    public int maxPenumpang;
    
    public Bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        Penumpang = 0;
    }
    
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.Penumpang+Penumpang;
        if(temp>maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else{
            this.Penumpang=temp;
        }
    } 
        public void getpenumpang(int password){
            if(password==24){
                System.out.println("Password benar");
            }
            else{
                System.out.println("Password salah");
            }
        }
        
        public void cetakpenumpang(){
            System.out.println("Penumpang Bus sekarang : "+Penumpang);
            System.out.println("Maksimum penumpang yang seharusnya adalah : "+ maxPenumpang);
        }   
    }

