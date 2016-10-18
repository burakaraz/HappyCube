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
public class Side { 
    
    String[] row = new String[5];
    Integer id;
    Integer[][] matrice = new Integer[5][5];
       
    public Side(Integer idEl,String[] el) {
        id = idEl;
        for (int i = 0; i < 5; i++) {
            row[i] = el[i];
        }
    }
    
}
