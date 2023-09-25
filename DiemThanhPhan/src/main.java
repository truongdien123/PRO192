/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dienr
 */
import java.util.Scanner;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double x,y,z;
        System.out.println("Nhap diem chuyen can: ");
        x = sc.nextDouble();
        System.out.println("Nhap diem giua ky: ");
        y = sc.nextDouble();
        System.out.println("Nhap diem cuoi ky: ");
        z = sc.nextDouble();
        System.out.println("Diem chuyen can: "+x);
        System.out.println("Diem giua ky: "+y);
        System.out.println("Diem cuoi ky: "+z);
    }
    
}
