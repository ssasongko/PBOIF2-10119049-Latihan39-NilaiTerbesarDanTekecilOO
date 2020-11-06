package Bilangan;
import java.util.Scanner;

/**
 *
 * @author Nur Sasongko
 */
public class Bilangan {
    Scanner scan = new Scanner(System.in);
    
    public int jumlahNilai;
    public String namaPetugas;
    public int[] arrNilai = new int[255];
    
    public void setData(){
        
        int i = 0;
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
        
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scan.nextLine();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        jumlahNilai = scan.nextInt();
        
        while(i < jumlahNilai){
           System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
           arrNilai[i] = scan.nextInt(); 
           i++;
        }
    }
    
    public int getNilaiTerkecil(){
        int nilaiTerkecil = arrNilai[0];
               
        for(int i = 1; i < jumlahNilai; i++){
            if(nilaiTerkecil > arrNilai[i]){
                nilaiTerkecil = arrNilai[i];
            }
        }
        
        return nilaiTerkecil;
    }
    
    public int getNilaiTerbesar(){
        int nilaiTerbesar = arrNilai[0];
        
        for(int i = 1; i < jumlahNilai; i++){
            if(nilaiTerbesar < arrNilai[i]){
                nilaiTerbesar = arrNilai[i];
            }
        }
        
        return nilaiTerbesar;
    }
    
     public void getTampilNilai(){
        int i = 0;
        System.out.println("=====Hasil Nilai Mahasiswa====");
        while(i < jumlahNilai){
            System.out.println("Nilai Mahasiswa ke-" + (i+1)  + " : " + arrNilai[i]);
            i++;
        }
        
        System.out.printf("%nNilai Terkecil adalah %d",getNilaiTerkecil());
        System.out.printf("%nNilai Terbesar adalah %d",getNilaiTerbesar());
        System.out.printf("%n%nPetugas : %s%n",namaPetugas);
    }
}
