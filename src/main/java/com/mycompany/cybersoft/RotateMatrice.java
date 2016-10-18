/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cybersoft;

/**
 *
 * @author burakaraz
 */
public class RotateMatrice {
    static public Matrice rotateMatrice(Matrice m, Integer count)
    {
        Matrice nM = new Matrice(m.id);
        for(int i = 0 ; i < 5 ; i++)
        {
            
            for(int j = 0 ; j < 5 ; j++)
            {
                nM.element[i][j] = m.element[5-j-1][i]; 
            }
        }

        
        if(count == 2)
        {
            Matrice nM1 = new Matrice(m.id);
            for(int i = 0 ; i < 5 ; i++)
            {
                for(int j = 0 ; j < 5 ; j++)
                {
                    nM1.element[i][j] = nM.element[5-j-1][i]; 
                }
            } 
            return nM1;
        }
        if(count == 3)
        {
            Matrice nM2 = new Matrice(m.id);
            for(int i = 0 ; i < 5 ; i++)
            {
                for(int j = 0 ; j < 5 ; j++)
                {
                    nM2.element[i][j] = nM.element[5-j-1][i]; 
                }
            }
            Matrice nM3 = new Matrice(m.id);
            for(int i = 0 ; i < 5 ; i++)
            {
                for(int j = 0 ; j < 5 ; j++)
                {
                    nM3.element[i][j] = nM2.element[5-j-1][i]; 
                }
            } 
            return nM3;
        }      
        return nM;
    }
    
}
