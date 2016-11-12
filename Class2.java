/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothread1;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davide
 */
public class Class2 implements Runnable{

     private  int[]v;

    
    public Class2(int[] vettore) {
        this.v = vettore;
    }
    
    public int[] genera(int[] v)
    {
        for(int i=0;i<this.v.length;i++)
        {
            v[i]= (int) (Math.random()*100);
        }
        return v;
    }
    
    public int[]ordina(int[]v)
    {
        for(int i=0;i<this.v.length;i++)
        {
            for(int k=0;k<this.v.length;k++)
            {
                if(v[i]<v[k])
                {
                    int app=v[i];
                    v[i]=v[k];
                    v[k]=app;
                }
            }
        }
        return v;
    }
    @Override
    public void run()
    {
       genera(this.v); 
        try 
        {
            sleep(200);
        }catch (InterruptedException ex){} 
       ordina(this.v);   
       
         try {
             sleep(400);
         } catch (InterruptedException ex) {
             Logger.getLogger(Class2.class.getName()).log(Level.SEVERE, null, ex);
         }
       for(int i=0;i<this.v.length;i++)
       {
           System.out.println("Vettore-2: "+this.v[i]);
       }
    }
}
