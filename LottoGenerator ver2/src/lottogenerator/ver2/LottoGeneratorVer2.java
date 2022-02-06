/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottogenerator.ver2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class LottoGeneratorVer2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int rownumber = 0;
        String rowone = "";
        String rowtwo = "";
        String rowthree = "";
        int[] lotto = new int[7]; // each list/row has 7 numbers
        int randomNumber;   // create variable

        for (int y = 0; y < 3; y++) // the lottery has 3 rows
        {
            for (int i = 0; i < lotto.length; i++) // for the length of one row do this logic
                {
                    randomNumber = (int) (Math.random() * 35+1); // set variable a random number with a max of 35
                    for (int x = 0; x < i; x++) // iterate for each number 
                    {
                        if (lotto[x] == randomNumber) // checks if the number has the same value or not
                        {
                            randomNumber = (int) (Math.random() * 35+1); // set variable a random number with a max of 35
                            x = -1; // restart iteration
                        }
                    }
                    lotto[i] = randomNumber;  // put the number into the list/row
                }
                rownumber++; // for each iteration add +1 to rownumber
                switch(rownumber) 
                {
                    case 1:
                      rowone = Arrays.toString(lotto);
                      break;
                    case 2:
                      rowtwo = Arrays.toString(lotto);
                      break;
                    case 3:
                      rowthree = Arrays.toString(lotto);
                }
        }
            JOptionPane.showMessageDialog( null, "Rad 1 - " + rowone + "\n" + "Rad 2 - "  + rowtwo + "\n" + "Rad 3 - " + rowthree);            
    }        
}
    

