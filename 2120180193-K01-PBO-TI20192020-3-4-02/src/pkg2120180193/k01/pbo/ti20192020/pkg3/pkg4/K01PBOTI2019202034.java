package pkg2120180193.k01.pbo.ti20192020.pkg3.pkg4;

public class K01PBOTI2019202034 {

    
    public static void main(String[] args) {
        //instansiasi dari class mahasiswa
        
        //membuat objek mhs1 dari class mahasiswa
        mahasiswa mhs1= new mahasiswa ();
        //membuat objek mhs2 dari class mahasiswa
        mahasiswa mhs2= new mahasiswa ();
        //membuat objek mhs3 dari class mahasiswa
        mahasiswa mhs3= new mahasiswa ();
        //membuat objek mhs4 dari class mahasiswa
        mahasiswa mhs4= new mahasiswa ();
        //membuat objek mhs5 dari class mahasiswa
        mahasiswa mhs5= new mahasiswa ();
        
        //memunculkan tulisan "Biodata Mahasiswa  :", \n = untuk membuat enter
        System.out.println("Biodata Mahasiswa : \n");
        
        //mengakses method
        //memasukan data dari ke-5 mahasiswa, dan memanggil method
        mhs1.tampil_biodata("Renggasta Septian Aloda","2120180199","Ds. Sukoharjo Kec.Kalitidu Kab.Bojonegoro \n");
        mhs2.tampil_biodata("Rahma Melyana Romadhoni", "2120180198","Ds.Kepohbaru Kec.Kepohbaru Kab.Bojonegoro \n");
        mhs3.tampil_biodata("Muhammad Anang Bukhori Muslim", "2120180186", "Ds.Balenrejo Kec.Balen Kab.Bojonegoro \n");
        mhs4.tampil_biodata("Yusi Andriani", "2120180210","Ds.Kumpulrejo Kec.Parengan Kab.Tuban \n");
        mhs5.tampil_biodata("Muhammd Nurul Huda","2120180189", "Ds.Lengkong Kec.Balen Kab.Bojonegoro \n");
    }
    
}
