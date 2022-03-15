/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4ora; 
import static java.lang.System.out; 
import java.util.Arrays;
import java.util.Random; 
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
        
//Csomagoló (burkoló) osztályok 

    //1. Szám osztályok, sztringek
        /*
        out.println("Minimum érték = " + Integer.MIN_VALUE); 
        out.println("Maximum érték = " + Integer.MAX_VALUE); 
        out.println("Byteszám = " + Integer.BYTES); 
        out.println("Bitszám = " + Integer.SIZE); 
        out.println("Típus = " + Integer.TYPE); 
        
        out.println("Minimum érték = " + Float.MIN_VALUE); 
        out.println("Maximum érték = " + Float.MAX_VALUE); 
        out.println("Byteszám = " + Float.BYTES); 
        out.println("Bitszám = " + Float.SIZE); 
        out.println("Típus = " + Float.TYPE); 
        
        out.println("Minimum érték = " + (int) Character.MIN_VALUE); 
        out.println("Maximum érték = " + (int) Character.MAX_VALUE); 
        out.println("Byteszám = " + Character.BYTES); 
        out.println("Bitszám = " + Character.SIZE); 
        
//Példa:  Vizsgáljuk meg néhány metódus működését
        out.println("Konvertálás sztringből = " + Integer.valueOf("5678")); 
        Integer a = 5; 
        Integer b = 4; 
        out.println("Összehasonlítás (nagyobbhoz a kisebbet): " + a.compareTo(b)); 
        out.println("Összehasonlítás (kisebbhez a nagyobbat): " + b.compareTo(a)); 
        out.println("Kisebb = " + Integer.min(a, b)); 
        
        Float f1 = Float.valueOf("5.2e3"); 
        Float f2 = new Float(4.1); 
        out.println("f1 = " + f1 + " f2 = " + f2); 
        out.println("Kisebb = " + Float.min(f1, f2)); 
        out.println("Nagyobb = " + Float.max(f1, f2)); 
        
        Integer c = 135; 
        out.println("Hexadecimális = " + Integer.toHexString(c)); 
        out.println("Oktális = " + Integer.toOctalString(c)); 
        out.println("Bináris = " + Integer.toBinaryString(c)); 
    //Példa:  Vizsgáljuk meg néhány  sztringkezelő metódus működését
        String s1 = "alma"; 
        char data[] = {'k', 'ö', 'r', 't', 'e'}; 
        String s2 = new String(data); 
        String s3 = "szilva"; 
        String s4 = s1 + "mag"; 
        out.println(s1); 
        out.println(s2); 
        out.println(s3); 
        out.println(s4); 
        for (int i=0; i<s2.length(); i++) 
            out.printf("%c ", s2.charAt(i)); 
        out.println(); 
        out.println(s4.toUpperCase()); 
        out.println(s2.indexOf("t")); 
        out.println(s3.substring(2,5)); 
        
        
//Metódusok és osztályok létrehozása
    //1. Metódusok
    //Példa: Írjunk egy kitalálós játékprogramot: 
    Scanner billentyu = new Scanner (System.in); 
    out.print("Kérem a játékosok számát: "); 
    int jatekos = billentyu.nextInt(); 
    int nyero = 0; 
    for(int i =0; i<jatekos; i++){ 
        out.printf("\nKérem a %d. játékost!\n", i+1); 
        int n=tipp(); 
        if(nyero > n)nyero = n; 
    } 
    out.printf("\nA %d. játékos nyert\n", nyero+1); 
    out.println("Köszönöm a játékot"); 
    } 
    private static int tipp() { 
        int tippek = 0; 
        int RSzam = new Random().nextInt(10) + 1; 
        out.print("Írj be egy számot 1 és 10 között: "); 
        int beSzam = billentyu.nextInt(); 
        tippek++; 
        while(beSzam != RSzam) { 
            out.print("*****Tippel újra: "); 
            beSzam = billentyu.nextInt(); 
            tippek++; 
    } 
    out.printf("Eltaláltad! A tipjeid száma = %d\n",tippek); 
    return tippek; 
    
        
     //Példa: Írjunk egy programot, amely metódussal kiszámítja egy téglatest térfogatát.
       Scanner billentyu = new Scanner (System.in); 
       out.print("Kérem a téglatest hosszúságát: "); 
       int a = billentyu.nextInt(); 
       out.print("Kérem a téglatest szélességét: "); 
       int b = billentyu.nextInt(); 
       out.print("Kérem a téglatest magasságát: "); 
       int c = billentyu.nextInt(); 
       out.printf("\nA téglatest térfogata = %d\n", tegla(a, b, c)); 
    } 
    private static int tegla(int a, int b, int c) { 
    return a*b*c; 
    */
    //2. Osztályok
    //PÉLDA: Írjunk meg az előző programot egy új osztály létrehozásával. 
        /*
        Tegla t = new Tegla(); //példányostás
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérem a téglatest hosszúságát: "); 
        int a = billentyu.nextInt(); 
        out.print("Kérem a téglatest szélességét: "); 
        int b = billentyu.nextInt(); 
        out.print("Kérem a téglatest magasságát: "); 
        int c = billentyu.nextInt(); 
        out.printf("\nA téglatest térfogata = %d\n", t.tegla(a, b, c)); 
        */
    // Hallgatói feladatok: 4db 
        //1.a felszint is kiszámolja
        /*
        Tegla t = new Tegla(); //példányostás
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérem a téglatest hosszúságát: "); 
        int a = billentyu.nextInt(); 
        out.print("Kérem a téglatest szélességét: "); 
        int b = billentyu.nextInt(); 
        out.print("Kérem a téglatest magasságát: "); 
        int c = billentyu.nextInt(); 
        out.printf("\nA téglatest térfogata = %d\n", t.tegla(a, b, c)); 
        out.printf("\nA téglatest felszíne = %d\n", t.tegla_2(a, b, c)); 
        */
        //2. hogy ne pédányosítsuk a Tegla osztályt
        /*
        Tegla t = new Tegla(); //példányostás
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérem a téglatest hosszúságát: "); 
        int a = billentyu.nextInt(); 
        out.print("Kérem a téglatest szélességét: "); 
        int b = billentyu.nextInt(); 
        out.print("Kérem a téglatest magasságát: "); 
        int c = billentyu.nextInt(); 
        out.printf("\nA téglatest térfogata = %d\n", t.tegla(a, b, c)); 
        Tegla.tegla_3(a, b, c);
        out.printf("\nA téglatest felszíne = %d\n", Tegla.felszin); 
        */
       /* vagy
        Tegla obj = new Tegla();
        obj.tegla_3(a, b, c);
        System.out.println(obj.felszin);*/
       
    //3.Módosítsák a tömbkezelő feladatot (package tömb_9
   /* Scanner billentyu = new Scanner (System.in); 
    int[] tomb = new int[100]; 
    int db = 0; 
    
    // Feltöltés 
    out.printf("Kérem a %d. számot: ",db+1); 
    tomb[db] = billentyu.nextInt(); 
    while(tomb[db]!=0){ 
        db++; 
        out.printf("Kérem a %d. számot: ",db+1); 
        tomb[db] = billentyu.nextInt(); 
    } 
    
    MinMax.Min(tomb, db);
    MinMax.Max(tomb, db);
    
    // Rendezés 
    Rendez.rendez(tomb, db); 
    for(int i=0; i<db ;i++) out.println(tomb[i]); 
        } 
    } 
    class MinMax{
        public static void Min(int[] t, int n){ 
            int min = t[0]; 
            for(int i=1; i<n; i++)if(min > t[i])min = t[i]; 
            System.out.println("A legkisebb érték = "+ min);
        }  
        public static void Max(int[] t, int n){ 
            int max = t[0]; 
            for(int i=1; i<n; i++)if(max < t[i])max = t[i]; 
            System.out.println("A legnagyobb érték = "+ max); 
        }
    }

    class Rendez{ 
    public static void rendez(int[] t, int n){ 
        int csere; 
            for(int j=0; j<n-1; j++) 
                for(int i=0; i<n-j-1; i++) 
                    if(t[i]>t[i+1]){ 
                        csere=t[i]; 
                        t[i]=t[i+1]; 
                        t[i+1]=csere; 
                    } 
    }
} */
   
//Feladatok: 
        
        beolv();
    }
// Feltöltés 
        static void beolv(){ // Minimum-maximum keresés 
        Scanner billentyu = new Scanner (System.in);
        out.println("Kérem egy karaktert: "); 
        String character = billentyu.nextLine();  
        while (billentyu.hasNextLine()) {
            out.println("Kérem egy karaktert: "); 
            character = billentyu.nextLine(); 
        }
        
        Scanner s=new Scanner(System.in);
    String[] x = new String[10];
    for(int i=0;i<10;i++)
    {   
        x[i]=s.next();
        if(x[i]==".")
            break;
    }
    }   
}