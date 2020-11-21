/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan58.TambahKurang;

/**
 *
 * @author aruma
 */
public class SelisihBilangan extends Bilangan{
    Bilangan objBilangan = new Bilangan();
    
    public void tampilSelisih(){
        int hasilSelisih=this.getX()-this.getY();
        System.out.println("Hasil Selisih "+ this.getX()+"-"+this.getY()+" = "+ hasilSelisih);
    }
}
