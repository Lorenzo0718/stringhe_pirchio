/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercizio_stringhe;

/**
 *
 * @author lenovoù
 */
public class ricerca_A {
    //Inizio : Dichiarazioni dei attributi per la classe che vengono utilizzati dopo nei metodi.
    public char[] parola = new char[30];
    public char LetteraA = 'a';
    public int lettera = 0;
    //Fine : Dichiarazioni dei attributi per la classe che vengono utilizzati dopo nei metodi.
    
    // Inizio : Costruttore all'interno dei parametri di tipo scan.
    public ricerca_A(Input Input) {
    
    }
    // Fine : Costruttore all'interno dei parametri di tipo scan.
    
    // Inizio : Creazione di un metodo per trasformazione di una stringa inserita dall'utente in una array di carratteri e la ripetizione di a nella stringa inserita dall'utente.
    public void trova_a(Input Input){

        for(int i = 0; i < Input.input.length(); i++){
            parola[i] = Input.input.charAt(i);
            if (parola[i] == LetteraA){
                lettera = lettera + 1;
            }
        }
        
    }
    // Inizio : Creazione di un metodo per trasformazione di una stringa inserita dall'utente in una array di carratteri e la ripetizione di a nella stringa inserita dall'utente.
    
    // Inizio : Creazione di un metodo per la stampa delle occorrenze e la lettera A occorrenze volte.
    public void stampa(){
        System.out.print("\nLa parola dell'utente contiene :" + lettera + " volte la lettera a");
        System.out.print("\n");
        for(int i = 0; i < lettera; i++){
            System.out.print("A");
        }
        System.out.print("\n");
    }
    // Fine : Creazione di un metodo per la stampa delle occorrenze e la lettera A occorrenze volte.

}
