package Tugas6;
public class TumpukanApp {
    public static void main (String[] args){
        Tumpukan tumpukan = new Tumpukan(5);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(80);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        long nilaitop = tumpukan.peek();
        System.out.println("Nilai Top = "+ nilaitop);
        
        System.out.println();
        System.out.println("Muhammad Farid Baehaqi");
        }
}
