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
public class Esercizio_Corridori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Corridore corridore1 = new Corridore("Mario");
        Thread thread1 = new Thread(corridore1);
        
        Corridore corridore2 = new Corridore("Bruno");
        Thread thread2 = new Thread(corridore2);
        
        try{
            thread1.start();
        }catch(Exception e){
            System.out.println("Eccezione: " + e);
        }
        
        try{
            thread2.start();
        }catch(Exception e){
            System.out.println("Eccezione: " + e);
        }
        
        try{
            thread1.join();
        }catch(InterruptedException e){
            System.out.println("Eccezione: " + e);
        }
        
        try{
            thread2.join();
        }catch(InterruptedException e){
            System.out.println("Eccezione: " + e);
        }
    }
}
