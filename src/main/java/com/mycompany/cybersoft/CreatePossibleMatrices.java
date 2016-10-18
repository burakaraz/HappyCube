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
public class CreatePossibleMatrices {
    static public List<Matrice> createCubes(List<Side> cube)
    {
        List<Matrice> mList = new ArrayList<>(); 
        try
        {
            for(int i = 0 ; i < cube.size() ;i++)
            {
                Matrice m = new Matrice(cube.get(i).id);
                for(int j = 0 ; j < 5 ; j++)
                {         
                    for(int k = 0 ; k < 5 ; k++)
                    {
                        if(cube.get(i).row[j].charAt(k) == 'o')
                        {
                            m.element[j][k] = 1;
                        }
                        else{
                            m.element[j][k] = 0;
                        }                   
                    }
                }
                m = DivideMatrice.divideMat(m);
                mList.add(m);
                for(int j = 1 ; j < 4 ; j++)
                {
                    Matrice mR = new Matrice(m.id);
                    mR = RotateMatrice.rotateMatrice(m, j);
                    Integer count = 0;
                    for(int k = 0 ; k < mList.size() ; k++)
                    {
                        if(CheckSame.checkMatrices(mR, mList.get(k)) == false)
                        {
                            count++;
                        }
                    }
                    if(count == CountId.countID(mList, mR.id))
                    {
                        mR = DivideMatrice.divideMat(mR);
                        mList.add(mR);
                    }             
                }
            }
        }
        catch(StringIndexOutOfBoundsException exception)
        {
                    mList.clear();
        }
        return mList;
    }
}
