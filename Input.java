/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercizio_stringhe;

/**
 *
 * @author lenovoù
 */


import java.util.Scanner;


public class Input {
    public String input;
        //Inizio : Creazione di un metodo per l'input dell'utente.
        public void scan(){
            Scanner Scan = new Scanner(System.in);
            System.out.print("inserisci la parola : ");
            input = Scan.next();
        }
        //Fine : Creazione di un metodo per l'input dell'utente.
        
        
        
}
