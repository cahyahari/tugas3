import java.util.*;
 
public class tugas2 {
    

 private static String kata[] = new String[1000];
 private static String newkata[] = new String[1000];
 
 // methode untuk mengecek kata yg sama
 public static boolean cekKata(int n, String x)
 {
     // inisialisasi
     boolean find=false;
  
     for (int i=0; i <n; i++)
     {
        // jika ada yg sama
        if (kata[i].equalsIgnoreCase(x))
        {
           find=true;
           break;
        }     
     }
     return find;
 }
 
 public static void main (String args[]) {   
    //array
    int jumkata[] = new int[1000];
    int index[] = new int[1000];
 
    // inisialisasi variabel
    String teks, temp="";
    boolean ketemu=false;
    int a, b, c, d, count=0, jum;
 
    // inputan dari keyboard
    System.out.print("Masukkan kalimat = ");
    Scanner obj = new Scanner(System.in);
    teks = obj.nextLine();
 
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
// 
   c=count+1;// banyaknya kata dlm suatu kalimat
 
   // eliminasi kata yang sama
   b=0; a=0;
   for (int i=0; i < c; i++)
   {
      if (!cekKata(a, kata[i]))
      {
           //bentuk kata baru dlm array
           newkata[b] = kata[i];
           b++;
      }
      a++;
    }
    d=b; // banyaknya kata yg tlah dieliminasi
  
    // proses penghitungan kata dalam suatu kalimat
    for (int i=0; i < d; i++)
    {
        jum=0;
        for (int j=0; j < c; j++)
        {
       if (newkata[i].equalsIgnoreCase(kata[j]))
          jum+=1;
        }
        System.out.println("kata = "+newkata[i]+ " jumlahnya "+jum);
    }
    
  }
}
