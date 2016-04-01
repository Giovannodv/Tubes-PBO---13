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
public class Anggota {
    private Peminjaman[] riwayatPinjaman;
    
    public createPinjaman (Date tanggal){
	Peminjaman.add(new Peminjaman(tanggal));
    }
    
    public kemablikanPinjaman (int i){
        return i;
    }
    
    public viewPinjaman{
    
    }
    
    public viewPinjamanAll {
    
    }
}
