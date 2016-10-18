/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cybersoft;

import java.util.List;

/**
 *
 * @author burakaraz
 */
public class PrintMatrices {
      static void printMatrices(List<Matrice> m){
        for(int i = 0 ; i < m.size() ; i++)
        {
            System.out.println(i + ".Matrice ID= " + m.get(i).id);
            for(int  j = 0 ; j < 5 ;j++)
            {
                for(int k = 0 ; k < 5 ; k++)
                {
                    System.out.print(m.get(i).element[j][k] + " ");
                }
                System.out.println();   
            }
            System.out.println("-------------------");
        }
    }
}
