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
public class CountId {
    static int countID(List<Matrice> m, Integer id)
    {
        Integer count = 0;
        for(int i = 0 ; i < m.size() ; i++)
        {
            if(m.get(i).id == id)
            {
                count++;
            }
        }
        return count;
    }
    
}
