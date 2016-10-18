package com.mycompany.cybersoft;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/**
 *
 * @author burakaraz
 */
public class MakeCubes {
    private static String currDirectory = new File("").getAbsolutePath(); 
    
    public static void main(String [] args)
	{
            List<Side> cube = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(currDirectory + "/src/main/resources/blue_cube_not.txt")))
		{
                    String curLine;
                    int i = 0;
                    String[] el = new String[5]; 
                    Integer id = 1;
                    while ((curLine = br.readLine()) != null) {             
                        el[i] = curLine;
                        i++;        
                        if( i == 5)
                        {
                            i = 0;
                            Side s = new Side(id,el);
                            cube.add(s);
                            id++;
                        }
                    }
                    //PrintCube.printCube(cube);
                    List<Matrice> mList = new ArrayList<>();
                    mList = CreatePossibleMatrices.createCubes(cube);
                    //System.out.println(mList.size());
                    mList = AddMirrorMatrices.addMirrorMatrice(mList);
                    //PrintMatrices.printMatrices(mList);
                    //System.out.println(mList.size());
                    Vector<Vector<Integer>> result = new Vector<>();
                    result = FindPossibleCubes.findPossibleCubes(mList);
                    PrintResult.printResult(result, mList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
