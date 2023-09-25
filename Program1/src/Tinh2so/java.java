/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tinh2so;

/**
 *
 * @author dienr
 */
import java.util.Scanner;
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,tong,hieu, tich, thuong;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextInt();
        System.out.println("Nhap b:");
        b = sc.nextInt();
        tong = a+b;
        hieu = a-b;
        tich = a*b;
        thuong = a/b;
        System.out.println("Tong cua a va b: "+tong);
        System.out.println("Hieu cua a va b: "+hieu);
        System.out.println("Tich cua a va b: "+tich);
        System.out.println("Thuong cua a va b: "+thuong);
    }
    
}
