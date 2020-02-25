/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Feb 2020
 * Created for: ICS4U
 * This program chooses a random number from 1 to a specified max range from
 * user
 *
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class RollDie {

    public static void main(String[] arg) {
		
        int MaxValue;
        int RandNum;

        MaxValue = 0;
        RandNum = 0;

        Scanner UserInput = new Scanner(System.in);
	
        while (MaxValue <= 0) {

            System.out.print("Input The Max Value(+):");
            MaxValue = UserInput.nextInt();
	}
	
        RandNum = RollDie(MaxValue);
        System.out.print("Your Random Number is " + RandNum + ".");

	}

        public static int RollDie(int MaxValue) {
            //returns random integer
            Random randGen = new Random();
			
            int RandNum;

            // Generates random number from 1-max range	
            RandNum = randGen.nextInt(MaxValue) + 1;
            return RandNum;
        }

}