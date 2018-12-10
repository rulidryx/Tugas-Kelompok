
package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Utama {

    public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    int pilih;
    do {  
    System.out.println("========Menu========");
        System.out.println("1. Program 1");
        System.out.println("2. Program 2");
        System.out.println("3. Program 3");
        System.out.println("4. Exit");
        System.out.println("Masukkan pilihan: ");
        pilih = S.nextInt();
        
        switch(pilih){
            case 1:
                Nomer1();
                break;
            case 2:
                Nomer2();
                break;
            case 3:
                file();
                break;
            case 4:
                System.exit(0);
                    }
        }while (pilih!= 4);
    }  

    private static void Nomer1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Nomer2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void file() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
