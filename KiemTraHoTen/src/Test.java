/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dienr
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ds = new ArrayList<String>();
        ds.add("Nguyen Trong Tin");
        ds.add("Truong Chau Dien");
        ds.add("Nguyen Khanh Tin");
        ds.add("Thai Bao Duy");
        ds.add("Huynh Tan Luc");
        String hovaten;
        System.out.println("Nhap ho va ten: ");
        hovaten = sc.nextLine();
        
        for(int i=0; i<ds.size(); i++){
            if(ds.contains(hovaten)){
                System.out.println("Yes");
                
                break;
            }else 
                System.out.println("No");
            break;
        }
        
    }
}
    

