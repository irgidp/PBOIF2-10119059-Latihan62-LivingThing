/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan living thing menggunakan konsep abstraksi
 */
package pboif2.pkg10119059.latihan62.livingthing;
/**
 *
 * @author Corazon
 */
public class Human extends LivingThing{

    private String nama;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public void walk(String nama) {
        System.out.println(nama+" sedang berjalan");
    }
    
}
