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
public class AddMirrorMatrices {
    static public List<Matrice> addMirrorMatrice(List<Matrice> m)
    {
        int size = m.size();
        for(int i = 0 ; i < size ; i++)
        {
            Matrice nM = new Matrice(m.get(i).id);
            for(int j = 0 ; j < 5 ; j++)
            {
                for(int k = 0 ; k < 5 ; k++)
                {
                    nM.element[j][k] = m.get(i).element[j][5-k-1];
                }
            }
            Integer count = 0;
            for(int k = 0 ; k < m.size() ; k++)
            {
                if(CheckSame.checkMatrices(nM, m.get(k)) == false)
                {
                    count++;
                }
            } 
            if(count == CountId.countID(m, nM.id))
            {
                nM = DivideMatrice.divideMat(nM);
                m.add(nM);
            } 
        }
        return m;     
    }
    
}
