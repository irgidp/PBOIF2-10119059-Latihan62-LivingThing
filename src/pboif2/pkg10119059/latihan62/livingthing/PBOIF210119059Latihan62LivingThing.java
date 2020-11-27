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
public class PBOIF210119059Latihan62LivingThing {
    
    public static void main(String[] args) {
        Human human = new Human();
        
        human.setNama("Rizki Adam Kurniawan");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
