/**
 * PasswordFunctions essentially holds the two main options that the user is given in terms of creating their password.
 * The functions to fullyRandomize their password or have it partially mixed are created here.
 * 
 * @author Brandon Chun
 * @version V1.02
 */

import java.util.*;

public class PasswordFunctions extends PreconditionTester
{
    
    public int passwordLength;
    public static int choice;
    public static int decision;


    /*
     * This method is used when the user would like to completely randomize their password after they have inputed their answers to the question set.
     * 
     * 
     */
    public String fullyRandomize()
    {
        ArrayList<String> ans = new ArrayList<String>();
        //ArrayList adds all characters to use from the respective ArrayLists to randomize the password.
        
        String word = "";
        String password = "";
        for(int x = 0; x < storeStringAns.size(); x++)
        {
            word += storeStringAns.get(x);
        }  
        //Copies all word answers from QuestionSets to a single word.
        
        for(int x = 0; x < storeIntAns.size(); x++)
        {
            word += storeIntAns.get(x);
        }  
        
        //Copies all integer answers from QuestionSets to a single word, with an array to track used indices
        int[] intCopier = new int[word.length()];
        int intCopierCounter = 0;
        for(int y = 0; y < intCopier.length; y++)
        {
            intCopier[y] = word.length() + 1;
        }
        //Makes sure that if number generated is 0, array isn't changed
        for(int x = word.length()-1; x>=0 ; x--)
        {
            int randomCharIndex = (int) (Math.random() * word.length());
            for(int y = 0; y < intCopier.length; y++)
            {
                while( intCopier[y] == randomCharIndex )               
                {
                	randomCharIndex = (int) (Math.random() * (word.length())); 
                    y = 0;
                }
                //Makes sure there are no repeats.
            }
            intCopier[intCopierCounter] = randomCharIndex;
            intCopierCounter++;
            String temp = word.substring(randomCharIndex, randomCharIndex+1);
            ans.add(temp);
        }
        for(int x = 0; x < passwordLength; x++)
        {
            password += ans.get(x);
        }

        return password;
    }

    /*
     * This method is used when the user would like to partially mix their responses to make their password.
     * Takes the responses from storeStringAns and storeIntAns ArrayLists and combines them into one password, with order of responses randomized.
     * 
     */
    public String partiallyMixed()
    {
        ArrayList<String> ans = new ArrayList<String>();
        String password = "";
        int length = storeStringAns.size() + storeIntAns.size();
        for(int x = 0; x < storeStringAns.size(); x++)
        {
            ans.add(storeStringAns.get(x));
        }  
        for(int x = 0; x < storeIntAns.size(); x++)
        {
            ans.add(storeIntAns.get(x));
        }  
        for(int x = length-1; x >= 0 ; x--)
        {
            int randomWordIndex = (int) (Math.random() * ans.size());
            String temp = ans.get(x);
            ans.set(x, ans.get(randomWordIndex));
            ans.set(randomWordIndex, temp);
        }
        for(int x = 0; x < length; x++)
        {
            password += ans.get(x);
        }

        return password.substring(0, passwordLength);
    }
}
