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
public class PrintCube {
    static void printCube(List<Side> cube){
        for(int i = 0 ; i < cube.size() ; i++)
        {
            for(int  j = 0 ; j < 5 ;j++)
            {
                System.out.println(cube.get(i).row[j]);
            }
        }
    }
}
