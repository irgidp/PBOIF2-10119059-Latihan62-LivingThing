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
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama+" bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama+" makan");
    }
    
}
