/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting2;

/**
 *
 * @author Classic
 */
public class Sorting2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte b[] = {2, 7, 4, 9, 5};
        byte kosong;
        for (byte i = 0; i < b.length; i++) {
            for (byte j = 0; j < b.length; j++) {
                if (b[i] < b[j]) {
                    kosong = b[i];
                    b[i] = b[j];
                    b[j] = kosong;
                }
            }
        }
        for (byte i = 0; i < b.length; i++) {
            System.out.print(b[i] + "\t");
            
        }
        System.out.println("");
//        selection Sort
        System.out.println("Selection Sort");
        byte bil[] = {4, 2, 1, 8, 5, 10, 9};
        for (byte i = 0; i < bil.length; i++) {
            byte indexmin = i;
            for (byte j = (byte) (i + 1); j < bil.length; j++) {
                if (bil[indexmin] > bil[j]) {
                    indexmin = j;
                }
            }
            byte temp = bil[indexmin];
            bil[indexmin] = bil[i];
            bil[i] = temp;
            
        }
        for (int i = 0; i < bil.length; i++) {
            System.out.print(bil[i]+"\t");
        }
    }
}
