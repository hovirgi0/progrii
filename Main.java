/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3ora;
import static java.lang.System.out;
import java.util.ArrayList; //dinamikus listához
import java.util.LinkedList; //láncolt listához
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //3ora
        /*
        final int MAX=5;
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[MAX];
        // Feltöltés
        for(int i=0; i<MAX; i++){
            out.printf("Kérem az %d. számot: ", i+1);
            tomb[i] = billentyu.nextInt();
        }
        // Minimum-maximum keresés
        int min, max;
        min = max = tomb[0];
        for(int i=1; i<MAX; i++){
            if(min > tomb[i])min = tomb[i];
            if(max < tomb[i])max = tomb[i];
        }
        out.println("A legkisebb érték = " + min);
        out.println("A legnagyobb érték = " + max);
        // Rendezés
        int csere;
        for(int j=0; j<MAX-1; j++)
            for(int i=0; i<MAX-j-1; i++)
                if(tomb[i]>tomb[i+1]){
                    csere=tomb[i];
                    tomb[i]=tomb[i+1];
                    tomb[i+1]=csere;
        }
        // Kiírás kiterjesztett for ciklussal
        for(int i: tomb){
            out.println(i);
        }*/
        //3.ora 1.es gyak feladat
        /*
        Scanner billentyu = new Scanner (System.in);
        ArrayList<String> homek = new ArrayList<>();
        out.print("Kérek egy hőmérsékletet: ");
        String hom = billentyu.nextLine();
        //nem jó mert statikus kell nem dinamikus: statikus alapból meg vannka adva az elemek és nem bekérjük
        while(hom.length()!=0){ //tömb feltöltése 
            homek.add(hom);
            out.print("Kérek egy nevet: ");
            hom = billentyu.nextLine();
        }
        out.println(homek);
        */
        /*
        //2. gyak feladat
        Scanner billentyu = new Scanner (System.in);
        ArrayList<Integer> korok = new ArrayList<>(); //dinamikus tömb
        out.print("Kérek egy életkort: ");
        int kor = billentyu.nextInt(); //nextInt mert int-et kérünk be
       
        while(kor != 0){ //tömb feltöltése 
            korok.add(kor);
            out.print("Kérek egy életkort: ");
            kor = billentyu.nextInt();
        }
        int keres = 0;
        if(kor >= 30 && kor <= 59) { 
            keres++;
            out.printf("A 30 és 59 fok közötti életkorok száma: %d", keres);
        } 
        //2. Dinamikus tömb (ArrayList osztály)
        /*
        Scanner billentyu = new Scanner (System.in);
        ArrayList<String> nevek = new ArrayList<>();
        out.print("Kérek egy nevet: ");
        String nev = billentyu.nextLine();
        while(nev.length()!=0){
            nevek.add(nev);
            out.print("Kérek egy nevet: ");
            nev = billentyu.nextLine();
        }
        out.println(nevek);
        out.println("Az elemek száma = " + nevek.size());
    //Tetszőleges elem kiírása
        out.print("Kérem a keresendő név indexét: ");
        int szam = billentyu.nextInt();
        out.println("A keresett név: " + nevek.get(szam));
    //Elem módosítása
        out.print("Kérem a módosítandó név indexét: ");
        szam = billentyu.nextInt();
        out.println("A keresett név: " + nevek.get(szam));
        out.print("Kérem az új nevet: ");
        nev = billentyu.next();
        nevek.set(szam, nev);
        out.println(nevek);
    //Elem törlése
        out.print("Kérek egy indexet: ");
        szam = billentyu.nextInt();
        out.println("A törlendő név: " + nevek.get(szam));
        nevek.remove(szam);
        out.println(nevek);
       */
        //3. A láncolt lista (LinkedList osztály)
        /*
        Scanner billentyu = new Scanner (System.in);
        LinkedList<String> nevek = new LinkedList<>(); 
        out.print("Kérek egy nevet: ");
        String nev = billentyu.nextLine();
        while(nev.length()!=0){
            nevek.add(nev);
            out.print("Kérek egy nevet: ");
            nev = billentyu.nextLine();
        }
        out.println(nevek);
        //Lista eleje+vége
        out.print("Kérek egy nevet a lista elejére: ");
        nev = billentyu.nextLine();
        nevek.addFirst(nev);
        
        out.print("Kérek egy nevet a lista végére: ");
        nev = billentyu.nextLine();
        nevek.addLast(nev);
        //Elem beszúrásának indexe
        out.println(nevek); 
        out.print("Kérem a beszurandó név indexét: ");
        int szam = billentyu.nextInt();
        //Elem beszúrása
        out.print("Kérem a beszurandó nevet: ");
        nev = billentyu.next();
        nevek.add(szam, nev);
        //Elem törlése+index
        out.println(nevek); 
        out.print("Kérem a törlendő elem indexet: ");
        szam = billentyu.nextInt();
        out.println("A törlendő név: " + nevek.get(szam));
        nevek.remove(szam);
        out.println(nevek);
        //Elem törlése
        out.print("Kérem a törlendő elemet: ");
        nev = billentyu.next();
        nevek.remove(nev);
        out.println(nevek);
        */
        //+Feladat
        /*
        Scanner billentyu = new Scanner (System.in);
        LinkedList<String> nevek = new LinkedList<>(); 
        out.print("Kérek egy nevet: ");
        String nev = billentyu.nextLine();
        while(nev.length()!=0){
            nevek.add(nev); 
            out.print("Kérek egy nevet: ");
            nev = billentyu.nextLine();
        }
        out.println(nevek);
        out.println("A lista elemeinek száma = " + nevek.size());
    //Elem keresése
        out.print("Kérek egy keresendő nevet: ");
        nev = billentyu.nextLine();
        if(nevek.contains(nev))out.printf("A %s név megtalálható!\n", nev);
        else out.printf("A %s név nem található meg!\n", nev);
        out.println(nevek);
    //Adott elem módosítása 
        out.print("Kérem a módosítandó elem indexet: ");
        int szam = billentyu.nextInt();
        out.print("Kérem az új nevet: ");
        nev = billentyu.next();
        nevek.set(szam, nev);
        out.println(nevek); */
        //4. Hallgatói feladatok: 
        /*
        int i;
        Scanner bill = new Scanner (System.in);
        LinkedList<OB_def> adatok = new LinkedList<>();
        OB_def OB = new OB_def();
    //Rendezett feltöltés
        out.printf("Kérem az azonosítót: ");
        OB.azon = bill.nextInt();
        while(OB.azon!=0){
            out.printf("Kérem a nevet: ");
            OB.nev = bill.next();
            out.printf("Kérem a fizetést: ");
            OB.fizetes = bill.nextFloat();
            for(i=0; i<adatok.size(); i++){
                if(adatok.get(i).azon > OB.azon){
                adatok.add(i, OB);
                break;
        }   }
        if( i == adatok.size())adatok.add(OB);
        OB = new OB_def();
        out.printf("Kérem az azonosítót: ");
        OB.azon = bill.nextInt();
        }
    //Kiírás
        for(i = 0; i < adatok.size(); i++)
        out.printf("%10d %20s %10.2f\n",adatok.get(i).azon, adatok.get(i).nev, adatok.get(i).fizetes);
        }
    public static class OB_def{
        public Integer azon;
        public String nev;
        public Float fizetes;
        */
        
//Gyakorló feladatok:

    //1.statikus tömb
    /*
        final int MAX=5;
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[MAX];
        // Feltöltés
        for(int i=0; i<MAX; i++){
            out.printf("Kérem az %d. hőmérsékletet ", i+1);
            tomb[i] = billentyu.nextInt();
        }
        //hőm szám keresés
        int keres;
        keres = tomb[0];
        for(int i=1; i<MAX; i++){
            if(tomb[i] >= 0 && tomb[i] <= 100) keres++;
        }
        out.println("A 0 és 100 fok közötti hőmérsékletek száma: " + keres);
    */
    //2. dinamikus tömb 
    /*
    Scanner billentyu = new Scanner (System.in);
    ArrayList<Integer> korok = new ArrayList<>();
    
    out.print("Kérek egy életkort: ");
    int kor = billentyu.nextInt();
    
    while(kor !=0 ){
    korok.add(kor);
    out.print("Kérek egy életkort:  ");
    kor = billentyu.nextInt();
    }
    out.println(korok);
    
    int keres;
    keres =  kor;
    if(kor >= 30 && kor <= 59){ keres++;
    }
    out.println("A 30 és 59 fok közötti életkorok száma:  " + korok.get(keres+1));
    */
    
    //3.statikus tömb
    /*
    final int MAX=5;
    Scanner billentyu = new Scanner (System.in);
    int[] tomb = new int[MAX];
    int db=0;
    // Feltöltés
    for(int i=0; i<MAX; i++){
        out.printf("Kérem a %d. osztályzatot: ", i+1);
        tomb[i] = billentyu.nextInt(); 
        db++;            
        }
    //hőm szám keresés
    int osszeg=0; int atlag;
    atlag = tomb[0];
    for(int i=1; i<MAX; i++){
        if(i==MAX)
            out.println("\nNincs ilyen elem\n");
        else {
            osszeg += tomb[i];
            atlag = (osszeg / db) + 1; 
            }

        }
    out.println("Az osztályzatok átlaga:" + atlag);
    */
    
    //4.statikus tömb
    /*
    final int MAX=6;
    Scanner billentyu = new Scanner (System.in);
    int[] tomb = new int[MAX];
    int db=0;
    // Feltöltés
    for(int i=0; i<MAX; i++){
        out.printf("Kérem a kocka %d. oldalának hosszát: ", i+1);
        tomb[i] = billentyu.nextInt(); 
        db++;            
        }
    //térfogat és felszín
    int ter, felsz;
    ter = tomb[0];
    felsz = tomb[0];
    int i;
	for(i=0; i<MAX; i++){
            if(i==MAX)
            out.println("\nNincs ilyen elem\n");
        else {
		ter = (tomb[i]) * (tomb[i+1]);
		felsz = 6 * ((tomb[i]) * (tomb[i]));
	}

    }
    out.println("A kocka területe: " + ter);
    out.println("A kocka felszíne: " + felsz);
    //nem jó
    */
    
    //5. dinamikus tömb    
    Scanner billentyu = new Scanner (System.in);
    ArrayList<Integer> napok = new ArrayList<>();
    
    out.print("Kérem a %d. nap soszámát: ");
    int nap = billentyu.nextInt();
    
    while(nap !=0 ){
        napok.add(nap);
        out.print("Kérem a %d. nap soszámát:  ");
        nap = billentyu.nextInt();
     /*       switch(nap){
            case 1, 2, 12 -> out.println("tél");
            case 3, 4, 5 -> out.println("tavasz");
            case 6, 7, 8 -> out.println("tavasz");;
            case 9, 10, 11 -> out.println("ősz");
            default -> out.println("Hibás hónapszám");
                    
            }*/
            if(nap < 1 || nap > 12){ out.println("tél"); }
            else if(nap = 3 || nap = 4 || nap = 5){ out.println("tavasz"); }
            else if(nap = 6 || nap = 7 || nap = 8){ out.println("tavasz"); }
            else if(nap = 9 || nap = 10 || nap = 11){ out.println("ősz");  }
            

    out.println(napok);
    }
}
}

