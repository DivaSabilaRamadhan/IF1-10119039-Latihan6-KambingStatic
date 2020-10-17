/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA  : Diva Sabila Ramadhan 
 * KELAS : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program Kambing Static
 */
public class KambingStatic {

    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                + Mamalia.jumlahKambing );
    }
    
}
