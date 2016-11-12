/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothread1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davide
 */
public class EsercizioThread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[]v=new int[100];
        
        Class1 t1=new Class1(v);
        t1.start();
        
        try 
        {
            t1.join(200);
        }catch (InterruptedException ex) {}
        
        Thread t2=new Thread(new Class2(v));
        t2.start();
        try 
        {
            t2.join(200);
        }catch (InterruptedException ex) {}
        
    }
    
    
}
