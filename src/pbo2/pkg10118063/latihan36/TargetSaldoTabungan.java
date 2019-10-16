/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan36;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SaldoTabungan saldotabungan = new SaldoTabungan();
        
        saldotabungan.setSaldo(3500000);
        saldotabungan.setBunga(0.08);
        saldotabungan.setSaldoTarget(6000000);
        
        saldotabungan.hitungSaldo();
    }
    
}
