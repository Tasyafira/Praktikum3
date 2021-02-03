/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Kendaraan {
    
    static void Data (){
        Scanner input = new Scanner(System.in);
        System.out.println("<<<               Data Kendaraan Bermotor              >>>");
        
        String jenis, merk, type, nomorMesin, rangkaMesin, bahan, warnaPlat, warnaKen,pajak, stnk;
        int tahun, cylinder;
    
        System.out.print("Jenis Kendaraan  : ");
        jenis = input.nextLine();
        System.out.print("Merk Kendaraan   : ");
        merk = input.nextLine();
        System.out.print("Type Kendaraan   : ");
        type = input.nextLine();
        System.out.print("Nomor Mesin      : ");
        nomorMesin = input.next();
        System.out.print("Rangka Mesin     : ");
        rangkaMesin = input.next();
        System.out.print("Tahun Buat       : ");
        tahun = input.nextInt();
        System.out.print("Bahan Bakar      : ");
        bahan = input.next();
        System.out.print("Cylinder         : ");
        cylinder = input.nextInt();
        System.out.print("Warna Plat Nomor : ");
        warnaPlat = input.next();
        System.out.print("Warna Kendaraan  : ");
        warnaKen = input.next();
        System.out.print("Tanggal Pajak    : ");
        pajak = input.next();
        System.out.print("Tanggal STNK    : ");
        stnk = input.next();
        
    }
}
