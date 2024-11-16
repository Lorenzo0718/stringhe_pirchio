/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.esercizio_stringhe;

/**
 *
 * Pirchio Lorenzo 4.inf.D 16/11/2024
 */
public class Esercizio_stringhe {

    public static void main(String[] args) {
        //Instazazione di un oggetto per il richiamo delle funzioni appartenenti della classe Input.
        Input Input = new Input();
        
        Input.scan();
        
        //Instazazione di un oggetto per il richiamo delle funzioni appartenenti della classe ricerca_A.
        ricerca_A cercaA = new ricerca_A(Input);
        
        cercaA.trova_a(Input);
        
        cercaA.stampa();

    }
}
