/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cybersoft;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author burakaraz
 */
public class ChangeFinalFormat {
    static public ArrayList<String[][]> changeFinalFormat(List<Matrice> m)
    {
        ArrayList<String[][]> result  = new ArrayList<>();
        for(int i = 0 ; i < m.size() ; i++)
        {
            String[][] str = new String[5][5];
            for(int j = 0 ; j < 5 ; j++)
            {
                for(int k = 0 ; k < 5 ; k++)
                {
                    if(m.get(i).element[j][k] == 1)
                    {
                        str[j][k] = "o";
                    }
                    else
                    {
                        str[j][k] = " ";
                    }
                    
                }
            }
            result.add(str);
        }
        return result;
    }
    
}
