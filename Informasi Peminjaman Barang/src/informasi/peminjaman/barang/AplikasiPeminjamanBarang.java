/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informasi.peminjaman.barang;

/**
 *
 * @author Giovanno
 */
public class AplikasiPeminjamanBarang {
    private Peminjaman[] riwayatPinjaman;
        private String nama;
        private String jenis;
        private String status;
        private String kondisi;
        private int idBuku;   
    private String nama;
    private String jabatan;
        private Barang[] pinjaman;
    private String nama;
    private char idPetugas;
    
    public createPinjaman (Date tanggal){
        
    }
    public kemablikanPinjaman (int i){
        
    }
    public viewPinjaman{
    
    }
    
    public getCreatePinjaman (){
        
    }
    
    public setNama (String nama){
        this.nama = nama;
    }
    public String getNama;{
        return nama;
    }
    public setJabatan (String jabatan){
        this.jabatan = jabatan;
    }
    public String getJabatan();{
        return jabatan;
    }
    
    public addPeminjaman(Barang b){
        
    }
    public viewStatusPinjaman{
    
    }
    
    public addPinjamanBarang{
        if (nBarang < maxBarang) {
            this.barang[nBarang] = b;
            nBarang++;
        } else {
            System.out.println("Barang Penuh");
        }
            barang.add(p)
    }
    public removePinjamanBarang{
        boolean bertemu = false;
        for (int i=0; i<nBarang; i++) {
            if(barang[i].equals(b)) {
                bertemu = true;
                barang[i] = barang[nBarang-1];
                nBarang--;
                break;
            }
            if (!bertemu) {
                System.out.println("remove barang gagal");
            }
        }
    }
    public changeStatusPinjaman{
    
    }
    
    public void loginAdmin() {
        System.out.println("Nama        : ");
        String nama = scan.next();
        System.out.println("No. Telp    : ");
        String notelp = scan.next();
        if (nama.equals("admin") && notelp.equals("admin")) {
            this.menuAdmin();
        } else {
            System.out.println("Password Admin Salah.");
        }
    }
    
    //==========================================Menu Admin======================================
    public void menuAdmin() {
    int x;
        System.out.println(" ======================");
        System.out.println("      MENU ADMIN      ");
        System.out.println(" ======================");
        System.out.println("|  1.      |");
        System.out.println("|  2.      |");
        System.out.println("|  3.      |");
        System.out.println("|  4.      |");
        System.out.println("|  5.      |");
        System.out.println("|  6.      |");
        System.out.println("|  7.      |");
        System.out.println("|  8.      |");
        System.out.println(" ======================");
        System.out.print("   Masukkan Pilihan Admin :  ");
        x = scan.nextInt();
        this.pilihanAdmin(x); 
}
