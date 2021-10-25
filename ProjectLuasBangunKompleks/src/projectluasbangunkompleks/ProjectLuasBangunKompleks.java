/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author acer
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //* Project 1
        Persegi p=new Persegi();
        int luasPersegi=p.hitungLuas(42); 
        
        Lingkaran LA=new Lingkaran();
        double luasDuaLingkaran = 2*(LA.hitungLuas(3.14, 21));
        
        double totalLuasBangun=luasPersegi+luasDuaLingkaran;
        System.out.println("Luas bangun project 1 adalah "+totalLuasBangun+" satuan luas.");
        
        //* Project 2
        Lingkaran LB=new Lingkaran();
        double setengahLingkaranBesar=(1.0/2)*(LB.hitungLuas(3.14, 14));
        
        Lingkaran LC=new Lingkaran();
        double setengahLingkaranKecil=(1.0/2)*(LC.hitungLuas(3.14, 7));
        
        double totalLuasBangun2=setengahLingkaranBesar-(2*setengahLingkaranKecil);
        System.out.println("Luas bangun project 2 adalah "+totalLuasBangun2+" satuan luas.");
    
    }  
}
