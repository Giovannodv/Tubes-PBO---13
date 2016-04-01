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
    
    public void loginUser() {
        System.out.print("Username        : ");
        String username = scan.next();
        System.out.println("Password    : ");
        String password = scan.next();
        if (nama.equals("User") && password.equals("user")) {
            this.menuUser();
        } else {
            System.out.println("Password User Salah.");
        }
    }
    
    //==========================================Menu User======================================
    public void menuUser() {
    int x;
        System.out.println(" ======================");
        System.out.println("        MENU USER      ");
        System.out.println(" ======================");
        System.out.println("|  1. Create new user     				|");
        System.out.println("|  2. Add pinjaman     					|");
        System.out.println("|  3. Add / Remove Barang     			|");
        System.out.println("|  4. Change Status Pinjaman     		|");
        System.out.println("|  5. view kondisi Barang     			|");
        System.out.println("|  6. Status Peminjaman     			|");
        System.out.println("|  7. Status Barang     				|");
        System.out.println("|  8. View Daftar Pinjaman	    		|");
	System.out.println("|  9. View Daftar Barang Suatu Pinjaman	|");
	System.out.println("|  10. Logout							|");
	System.out.println("|  11. Exit								|");
        System.out.println(" ======================");
        System.out.print("   Masukkan Pilihan User :  ");
        x = scan.nextInt();	
        this.pilihanUser(x); 
}
    public void pilihanUser(int a) {

        switch (a) {
			
            case 1:
		();
		createNewUser();
                menuUser();
                break;
            case 2:
		addPinjaman();
                menuUser();
                break;
            case 3:
                addorremoveBarang();
                menuUser();
                break;
            case 4:
                changeStatusPinjaman();
                menuUser();
                break;
            case 5:
                ();
                menuUser();
                break;
            case 6:
		();
		menuUser
                break;
            case 7:
		();
		menuUser();
                break;
            case 8:
                ();
                menuUser();
                break;
            case 9:
                ();
                menuUser();
                break;
            case 10:
                mainMenu();
                break;
            case 11:
                ex = true;
                System.exit(0);
                break;
        }
    }
}