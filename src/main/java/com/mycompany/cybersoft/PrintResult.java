/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cybersoft;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author burakaraz
 */
public class PrintResult {
    static public void printResult(Vector<Vector<Integer>> order, List<Matrice> m)
    {
        ArrayList<String[][]> ar = new ArrayList<>();
        ar = ChangeFinalFormat.changeFinalFormat(m);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("result.txt", "UTF-8");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintResult.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PrintResult.class.getName()).log(Level.SEVERE, null, ex);
        }     
        //System.out.println(m.get(order.get(3)).id);
        //System.out.println(m.get(order.get(0)).id);
        //System.out.println(m.get(order.get(1)).id);
        //System.out.println(m.get(order.get(4)).id);
        //System.out.println(m.get(order.get(5)).id);
        //System.out.println(m.get(order.get(2)).id);
        for(int k = 0 ; k < order.size() ; k++)
        {       
            writer.println("Solution: " + k);
            writer.println("");
            for(int i = 0 ; i < 5 ; i++)
            {
                for(int j = 0 ; j < 5 ; j++)
                {
                    writer.print(ar.get(order.get(k).get(3))[i][j]);
                }
                for(int j = 0 ; j < 5 ; j++)
                {
                    writer.print(ar.get(order.get(k).get(0))[i][j]);
                }
                for(int j = 0 ; j < 5 ; j++)
                {
                    writer.print(ar.get(order.get(k).get(1))[i][j]);
                }
                writer.println("");
            }
            for(int i = 0 ; i < 5 ; i++)
            {
                for(int j = 0 ; j < 5 ; j++)
                {
                    writer.print(" ");
                }
                for(int j = 0 ; j < 5 ; j++)
                {
                    writer.print(ar.get(order.get(k).get(4))[i][j]);
                }
                writer.println("");
            }
            for(int i = 0 ; i < 5 ; i++)
            {
                for(int j = 0 ; j < 5 ; j++)
                {
                    writer.print(" ");
                }
                for(int j = 0 ; j < 5 ; j++)
                {
                    writer.print(ar.get(order.get(k).get(5))[5-i-1][j]);
                }
                writer.println("");
            }
            for(int i = 0 ; i < 5 ; i++)
            {
                for(int j = 0 ; j < 5 ; j++)
                {
                    writer.print(" ");
                }
                for(int j = 0 ; j < 5 ; j++)
                {
                    writer.print(ar.get(order.get(k).get(2))[i][j]);
                }
                writer.println("");
            }
            writer.println("-----------------------");
        }
        if(order.size() == 0)
        {
            writer.print("It is not a cube");
        }
        writer.close();
    }  
}
