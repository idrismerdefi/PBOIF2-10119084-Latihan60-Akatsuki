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
public class Member extends Akatsuki {
    
     public Member () {
        int pilih = pilihMember();
        switch (pilih) {
            case 1:
                this.nama = "Pein";
                this.asal = "Amegakure";
                this.cincin = "零 (Nol, \"Tidak ada\")";
                this.posisiCincin = "Jempol kanan";
                this.partner = "Konan";
                this.ciri = "Rambut lancip, memiliki tindik di hidung dan di bagian tubuh,"
                        + " serta rambut berwarna jingga";
                break;
            case 2:
                this.nama = "Konan";
                this.asal = "Amegakure";
                this.cincin = "白 (\"Putih\")";
                this.posisiCincin = "Jari tengah, tangan kanan";
                this.partner = "Pein";
                this.ciri = "Memiliki aksesoris seperti bunga di kepala";
                break;
            case 3:
                this.nama = "Kisame";
                this.asal = "Kirigakure";
                this.cincin = "南 (\"Selatan\")";
                this.posisiCincin = "Jari manis kiri";
                this.partner = "Itachi";
                this.ciri = "Penampilan seperti ikan hiu";
                break;
                
            case 4:
                this.nama = "Zetsu";
                this.asal = "Kusagakure";
                this.cincin = "亥 (\"Kura-kura\")";
                this.posisiCincin = "Kelingking kanan";
                this.partner = "Tobi";
                this.ciri = "Mempunyai dua kepribadian, kanibal";
                break;
                
            case 5:
                this.nama = "Tobi";
                this.asal = "Konohagakure";
                this.cincin = "玉 (\"Berlian\")";
                this.posisiCincin = "Jempol kiri";
                this.partner = "Deidara, Zetsu";
                this.ciri = "Topeng jingga dengan satu lubang mata dengan pola "
                        + "pusaran yang terpusat pada mata kanan";
                break;
            case 6:
                this.nama = "Deidara";
                this.asal = "Iwagakure";
                this.cincin = "青(\"Biru/Hijau\")";
                this.posisiCincin = "Telunjuk kanan";
                this.partner = "Sasori";
                this.ciri = "Spesialis ledakan menggunakan tanah liat, memanipulasi "
                        + "tanah liat menggunakan mulut di telapak tangan dan dada";
                break;
            case 7:
                this.nama = "Hidan";
                this.asal = "Yugakure";
                this.cincin = "三 (\"Tiga Tingkatan\")";
                this.posisiCincin = "Telunjuk kiri";
                this.partner = "Kakuzu";
                this.ciri = "Tidak bisa mati, membawa sabit besar bermata tiga, "
                        + "rambut cepak berwarna pucat";
                break;
            case 8:
                this.nama = "Kakuzu";
                this.asal = "Takigakure";
                this.cincin = "北 (\"Utara\")";
                this.posisiCincin = "Jari tengah kiri";
                this.partner = "Hidan";
                this.ciri = "Dapat memperpanjang hidupnya dengan cara mengambil "
                        + "jantung manusia, dapat menggunakan seluruh lima elemen chakra";
                break;
            case 9:
                this.nama = "Sasori";
                this.asal = "Sunagakure";
                this.cincin = "玉 (\"Virgo\")";
                this.posisiCincin = "Jempol kiri";
                this.partner = "Deidara";
                this.ciri = "Ahli boneka, tubuh boneka, spesialis racun";
                break;
            case 10:
                this.nama = "Itachi";
                this.asal = "Konohagakure";
                this.cincin = "朱 (\"Merah Darah\")";
                this.posisiCincin = "Jari manis kanan";
                this.partner = "Kisame";
                this.ciri = "Ahli dalam Genjutsu, memakai sharingan dan mangekyo sharingan";
                break;
            case 11:
                this.nama = "Orochimaru";
                this.asal = "Konohagakure";
                this.cincin = "空 (\"Langit\")";
                this.posisiCincin = "Jari Kelingking Kiri";
                this.partner = "Sasori";
                this.ciri = "Penampilan seperti ular, dapat memperpanjang hidup dengan"
                        + " memindahkan jiwanya ke tubuh yang baru";
                break;
            default:
                break;
        }
     }    
    
    @Override
    public int pilihMember() {
        return super.pilihMember();
    }
    
    public void tampilProfil() {
        System.out.println("------------------------------------------");
        System.out.println("\n=============Profil Karakter============");
        System.out.println("------------------------------------------");
        System.out.println("Nama \t\t: " +getNama());
        System.out.println("Asal \t\t: " +getAsal());
        System.out.println("Cincin \t\t: " +getCincin());
        System.out.println("Posisi Cincin \t: " +getPosisiCincin());
        System.out.println("Partner \t: " +getPartner());
        System.out.println("Ciri Khas \t: " +getCiri());
}
}
