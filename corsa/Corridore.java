/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio_corridori;

/**
 *
 * @author andre
 */
public class Corridore implements Runnable{
    
    public static int contatore = 0;
    public String nome;
    public static int metriPercorsi = 100;
  
    public Corridore(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void run() {
        try{
            while (contatore < metriPercorsi) {
                contatore ++;
                Thread.sleep(200);
                System.out.println(nome + " " + contatore + " metri");
            }
        } catch (InterruptedException e) {
            System.out.println("Eccezione: " + e);
        }
        System.out.println("Il corridore " + nome + " ha percorso " + contatore + " metri " + "ed è arrivato al traguardo");
    }
}
