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
public class DivideMatrice {
    static public Matrice divideMat(Matrice m)
    {
        for(int i = 0 ; i < 5 ; i++)
        {
            m.left[i] = m.element[i][0];
        }
        for(int i = 0 ; i < 5 ; i++)
        {
            m.right[i] = m.element[i][4];
        }
        for(int i = 0 ; i < 5 ; i++)
        {
            m.top[i] = m.element[0][i];
        }
        for(int i = 0 ; i < 5 ; i++)
        {
            m.bottom[i] = m.element[4][i];
        }
        return m;
    }
    
}
