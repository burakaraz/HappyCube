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
public class CheckSame {
    static boolean checkMatrices(Matrice m1, Matrice m2)
    {
        for(int i = 0 ; i < 5 ; i++)
        {
            for(int j = 0 ; j < 5 ; j++)
            {
                if(m1.element[i][j] != m2.element[i][j] && m1.id == m2.id)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
}
