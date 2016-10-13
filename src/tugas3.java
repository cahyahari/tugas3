
import java.util.Scanner;
import java.util.*;
 

  public class tugas3 {
      

 private static String kata[] = new String[1000];
 private static String newkata[] = new String[1000];
 
 // methode untuk mengecek kata yg sama
 public static boolean cekKata(int n, String x)
 {
     // inisialisasi
     boolean ketemu=false;
  
     for (int i=0; i <n; i++)
     {
        // jika ada yg sama
        if (kata[i].equalsIgnoreCase(x))
        {
           ketemu=true;
           break;
        }     
     }
     return ketemu;
 }
 public static void tes (String teks , String tampung){
       
    int jumkata[] = new int[1000];
    int indeks[] = new int[1000];
 
    // inisialisasi variabel
    String  temp="";
    boolean ketemu=false;
    int a, k, n, m, count=0, jum;
 
    // inputan dari keyboard
   
  
    //menentukan kata
    for (int i = 0; i<teks.length(); i++){
       //jika ditemukan spasikota kata 
       if (teks.charAt(i)==' '){
         count+=1;
         temp="";
       }
       else
       {
         temp = temp + teks.charAt(i);
         kata[count] = temp;
       }
   }
//     for (int i = 0; i < kata.length; i++) {
//         System.out.println(kata[i]);
//     }
 
   n=count+1;// banyaknya kata dlm suatu kalimat
 
   // eliminasi kata yang sama
   k=0; a=0;
   for (int i=0; i < n; i++)
   {
      if (!cekKata(a, kata[i]))
      {
           //bentuk kata baru dlm array
           newkata[k] = kata[i];
           k++;
      }
      a++;
    }
    m=k; // banyaknya kata yg tlah dieliminasi
    double jumlahtotalkata = 0;
    double jumlahkataterpilih = 0;
    
    
    // proses penghitungan kata dalam suatu kalimat
    for (int i=0; i < m; i++)
    {
        jum=0;
        for (int j=0; j < n; j++)
        {
       if (newkata[i].equalsIgnoreCase(kata[j]))
          jum+=1;
        }
        jumlahtotalkata = jumlahtotalkata + jum;
        //System.out.println("kata = "+newkata[i]+ " jumlahnya "+jum);
           if (newkata[i].equalsIgnoreCase(tampung)) {
//             System.out.println("kata = "+newkata[i]+ " jumlahnya "+jum);
                jumlahkataterpilih = jum ;
         }
    }
//     System.out.println(jumlahtotalkata);
     System.out.println("hasil :" + jumlahkataterpilih / jumlahtotalkata );
  }
 public static void main (String args[]) {   
    //array
    String teks = "kota kata dua kata dan dia dan kamu kata bahwa kota sehingga dalam kota telah kata kata dua kota";
    
     String teks2 = "jika kota sama dengan kandang dalam kota maka dia juga katakan kota itu kata sehingga menjadi kata";
 
     String jumkata[] = new String[2];
    
     jumkata[0] = teks ;
     jumkata[1] = teks2 ;
     
    String tampung = "kota" ;
     System.out.println("kalimat berikut ini");
     System.out.println(teks);
     System.out.println(teks2);
     System.out.println("===================================");
     System.out.println("Tfnya");
     System.out.println("    ");
     
     
     for (int i = 0; i < jumkata.length ; i++) {
         tes(jumkata[i],tampung) ;
     }
  }
}
