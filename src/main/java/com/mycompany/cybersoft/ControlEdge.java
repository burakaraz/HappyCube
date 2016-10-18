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
public class ControlEdge {
    static public boolean controlEdge(Integer[] m1, Integer[] m2, int n)
    {
        if(n == 1)
        {
            Integer counter = 0;
            for(int i = 0 ; i < 5 ; i++)
            {
                if(m1[i] + m2[i] < 2)
                {
                    counter++;
                }
            }
            if(m1[1] + m2[1] == 1 && m1[2] + m2[2] == 1 && m1[3] + m2[3] == 1)
            {
                counter++;
            }

            if(counter == 6)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            Integer counter = 0;
            for(int i = 0 ; i < 5 ; i++)
            {
                if(m1[i] + m2[5-i-1] < 2)
                {
                    counter++;
                }
            }
            if(m1[1] + m2[3] == 1 && m1[2] + m2[2] == 1 && m1[3] + m2[1] == 1)
            {
                counter++;
            }

            if(counter == 6)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
}
