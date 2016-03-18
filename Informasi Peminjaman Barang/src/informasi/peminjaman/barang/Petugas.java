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
public class Petugas {
    private String nama;
    private char idPetugas;
    
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
}
