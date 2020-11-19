/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan60.akatsuki;
/**
NAMA : MUHAMMAD IDRIS MERDEFI
KELAS : PBOIF2
NIM : 10119084
DESKRIPSI PROGAM : PROGRAM INI BERISI PROGRAM Pengkhianat desa (Akatsuki)
 */

import java.util.Scanner;
public class Akatsuki {
    protected String nama, asal, cincin, posisiCincin, partner, ciri;

    public Akatsuki() {
        System.out.println("************************************");
        System.out.println("--------------AKATSUKI--------------");
        System.out.println("************************************");
        System.out.println("Daftar Anggota :");
        System.out.println("1. Pein");
        System.out.println("2. Konan");
        System.out.println("3. Kisame");
        System.out.println("4. Zetsu");
        System.out.println("5. Tobi");
        System.out.println("6. Deidara");
        System.out.println("7. Hidan");
        System.out.println("8. Kakuzu");
        System.out.println("9. Sasori");
        System.out.println("10. Itachi");
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getCincin() {
        return cincin;
    }

    public String getPosisiCincin() {
        return posisiCincin;
    }

    public String getPartner() {
        return partner;
    }
    
    public String getCiri(){
        return ciri;
    }

    public int pilihMember() {
        System.out.print("\nPilih Karakter : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
}
