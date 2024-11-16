/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercizio_stringhe;

/**
 *
 * Pirchio Lorenzo 4.inf.D 16/11/2024
 */
public class ricerca_A {
    //Dichiarazioni degli attributi che vengono utilizzati nei metodi.
    public char[] parola = new char[30];
    public char LetteraA = 'a';
    public int lettera = 0;
    
    //Costruttore con parametri di tipo scan.
    public ricerca_A(Input Input) {
    
    }
    
    //Creazione di un metodo per trasformazione la stringa inserita dall'utente in una array di carratteri e la ripetizione di a nella stringa.
    public void trova_a(Input Input){

        for(int i = 0; i < Input.input.length(); i++){
            parola[i] = Input.input.charAt(i);
            if (parola[i] == LetteraA){
                lettera = lettera + 1;
            }
        }
        
    }
    
    //Creazione di un metodo per la stampa delle ripetizioni e la lettera A ripetuta n volte.
    public void stampa(){
        System.out.print("\nLa parola dell'utente contiene :" + lettera + " volte la lettera a");
        System.out.print("\n");
        for(int i = 0; i < lettera; i++){
            System.out.print("A");
        }
        System.out.print("\n");
    }
    

}
