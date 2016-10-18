/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cybersoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author burakaraz
 */
public class FindPossibleCubes {
    static public Vector<Vector<Integer>> findPossibleCubes(List<Matrice> m)
    {
        int firstM = 0;
        int secondM = 0;
        int thirdM = 0;
        int fourthM = 0;
        int fifthM = 0;
        int sixthM = 0;
        
        int fiOk = 0;
        int seOk = 0;
        int thOk = 0;
        int foOk = 0;
        int fifOk = 0;
        int siOk = 0;
        
        Vector< Vector<Integer>> res = new Vector<>();
        
        
        while(true)
        {
            for(int i = firstM ; i < m.size() ; i++ , firstM++)
            {
                //System.out.println("first: " + firstM);
                fiOk = 1;
                break;
            }
            if(fiOk == 1)
            {
                for(int i = secondM ; i < m.size() ; i++, secondM++)
                {  
                    if(m.get(firstM).id != m.get(i).id && ControlEdge.controlEdge(m.get(firstM).right, m.get(i).left,1))
                    {//System.out.println("second= " + secondM);
                        seOk = 1;
                        break;
                    }
                    if(i == m.size() - 1)
                    {
                        firstM = firstM + 1;
                        secondM = 0;
                        fiOk = 0;
                        break;
                    }
                }
                if(secondM == m.size())
                {
                    secondM = 0;
                    firstM = firstM + 1;
                    seOk = 0;
                    fiOk = 0;
                }
            }
            if(seOk == 1)
            {
                for(int i = thirdM ; i < m.size() ; i++ , thirdM++)
                {
                    if(m.get(firstM).id != m.get(i).id && ControlEdge.controlEdge(m.get(firstM).top, m.get(i).bottom,1)
                            && m.get(secondM).id != m.get(i).id && ControlEdge.controlEdge(m.get(secondM).top, m.get(i).right,-1))
                    {//System.out.println("third= " + thirdM);
                        thOk = 1;
                        break;
                    }
                    if(i == m.size() - 1)
                    {
                        secondM = secondM + 1;
                        thirdM = 0;
                        seOk = 0;
                        break;
                    }
                }
                if(thirdM == m.size())
                {
                    thirdM = 0;
                    secondM = secondM + 1;
                    thOk = 0;
                    seOk = 0;
                }
            }
            if(thOk == 1)
            {
                for(int i = fourthM ; i < m.size() ; i++ , fourthM++)
                {
                    if(m.get(firstM).id != m.get(i).id && ControlEdge.controlEdge(m.get(firstM).left, m.get(i).right,1)
                            && m.get(thirdM).id != m.get(i).id && ControlEdge.controlEdge(m.get(thirdM).left, m.get(i).top,1)
                            && m.get(secondM).id != m.get(i).id)
                    {//System.out.println("fourth= " + fourthM);
                        foOk = 1;
                        break;
                    }
                    if(i == m.size() - 1)
                    {
                        thirdM = thirdM + 1;
                        fourthM = 0;
                        thOk = 0;
                        break;
                    }
                }
                if(fourthM == m.size())
                {
                    fourthM = 0;
                    thirdM = thirdM + 1;
                    foOk = 0;
                    thOk = 0;
                }
            }
            if(foOk == 1)
            {
                for(int i = fifthM ; i < m.size() ; i++ , fifthM++)
                {
                    if(m.get(firstM).id != m.get(i).id && ControlEdge.controlEdge(m.get(firstM).bottom, m.get(i).top,1)
                            && m.get(fourthM).id != m.get(i).id && ControlEdge.controlEdge(m.get(fourthM).bottom, m.get(i).left,-1)
                            && m.get(secondM).id != m.get(i).id && ControlEdge.controlEdge(m.get(secondM).bottom, m.get(i).right,1)
                            && m.get(thirdM).id != m.get(i).id)
                    {//System.out.println("fifth= " + fifthM);
                        fifOk = 1;
                        break;
                    }
                    if(i == m.size() - 1)
                    {
                        fourthM = fourthM + 1;            
                        fifthM = 0;
                        foOk = 0;
                        break;
                    }
                }
                if(fifthM == m.size())
                {
                    fifthM = 0;
                    fourthM = fourthM + 1;
                    fifOk = 0;
                    foOk = 0;
                }
            }
            if(fifOk == 1)
            {            
                for(int i = sixthM ; i < m.size() ; i++ , sixthM++)
                {
                    if(m.get(secondM).id != m.get(i).id && ControlEdge.controlEdge(m.get(secondM).right, m.get(i).right,1)
                            && m.get(thirdM).id != m.get(i).id && ControlEdge.controlEdge(m.get(thirdM).top, m.get(i).top,1)
                            && m.get(fourthM).id != m.get(i).id && ControlEdge.controlEdge(m.get(fourthM).left, m.get(i).left,1)
                            && m.get(fifthM).id != m.get(i).id && ControlEdge.controlEdge(m.get(fifthM).bottom, m.get(i).bottom,1)
                            && m.get(firstM).id != m.get(i).id)
                    {
                        siOk = 1;
                        break;
                    }
                    if(i == m.size() - 1)
                    {
                        fifthM = fifthM + 1;
                        sixthM = 0;
                        fifOk = 0;
                        break;
                    }
                }
                if(sixthM == m.size())
                {
                    sixthM = 0;
                    fifthM = fifthM + 1;
                    siOk = 0;
                    fifOk = 0;
                }
            }
            if(siOk == 1)
            {
                siOk = 0;
                Vector<Integer> order = new Vector<>();
                order.add(firstM);
                order.add(secondM);
                order.add(thirdM);
                order.add(fourthM);
                order.add(fifthM);
                order.add(sixthM);
                sixthM = sixthM + 1;
                /*for(int i = 0 ; i < order.size() ; i++)
                {
                    System.out.println(order.get(i));
                }*/
                res.add(order);
            }
            //System.out.println(firstM);
            if(firstM == m.size())
            {
                break;
            }
        }
        return res;
    }
}
