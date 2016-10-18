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
public class Matrice {
    Integer[][] element = new Integer[5][5];
    Integer id;
    Integer[] left = new Integer[5];
    Integer[] right = new Integer[5];
    Integer[] top = new Integer[5];
    Integer[] bottom = new Integer[5];

    public Matrice(Integer idEl) {
        id = idEl;
        for(int i = 0 ; i < 5 ; i++)
        {
            for(int j = 0 ; j < 5 ; j++)
            {
                element[i][j] = -1;
            }
        }
    }
    
}
