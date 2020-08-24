/**
 * The PreconditionTester is, as the name indicates, a couple of preconditions I created to help with junk responses.
 * Some nuances like time, dates, and birthdays were taken into consideration and edited here.
 * 
 * @author Brandon Chun
 * @version V1.02
 */

import java.util.Scanner;
import java.util.*;

public class PreconditionTester
{
    public Scanner reader;
    public ArrayList<String> storeStringAns;
    public ArrayList<String> storeIntAns;
    public static int totalLength;

    public PreconditionTester()
    {

    }

    public void wait500()
    {
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException x)
        { 

        }
    }

    /*
     * Tests if the birthday is within January to December (1-12). If the month is represented by a single character (aka 1-9), then the string is length 3.
     * Then, the date of the last two digits were also taken into considerations. For example, February 
     * 
     */
    public boolean realBirthday(int date)
    {
        String main = Integer.toString(date);
        String tempMonth;
        String tempDay;
        
        if(main.length() == 3)
        {
        	tempMonth = main.substring(0,1);
        	tempDay = main.substring(1,3);
        }
        else
        {
        	tempMonth = main.substring(0,2);
        	tempDay = main.substring(2,4);
        }
        
        int month = Integer.parseInt(tempMonth);
        int day = Integer.parseInt(tempDay);
        if(month == 1)
        {
        	if(day < 32 && day >= 1)
        	{
        		return true;
        	}
        }
        if(month == 2)
        {
        	if(day < 30 && day >= 1)
        	{
        		return true;
        	}
        }
        if(month == 3)
        {
        	if(day < 32 && day >= 1)
        	{
        		return true;
        	}
        }
        if(month == 4)
        {
        	if(day < 31 && day >= 1)
        	{
        		return true;
        	}
        }
        if(month == 5)
        {
        	if(day < 32 && day >= 1)
        	{
        		return true;
        	}
        }
        if(month == 6)
        {
        	if(day < 31 && day >= 1)
        	{
        		return true;
        	}
        }
        if(month == 7)
        {
        	if(day < 32 && day >= 1)
        	{
        		return true;
        	}
        }
        if(month == 8)
        {
        	if(day < 32 && day >= 1)
        	{
        		return true;
        	}
        }
        if(month == 9)
        {
        	if(day < 31 && day >= 1)
        	{
        		return true;
        	}
        }
        if(month == 10)
        {
        	if(day < 32 && day >= 1)
        	{
        		return true;
        	}
        }
        if(month == 11)
        {
        	if(day < 31)
        	{
        		return true;
        	}
        }
        if(month == 12)
        {
        	if(day < 32 && day >= 1)
        	{
        		return true;
        	}
        }
        return false;
    }


    //When a response is leading with a 0 (e.g. 0123) it returns "123" when you convert it to a string so this boolean function checks if a given response will be shortened in the conversion process.
    public boolean tooShort(int bday)
    {
        String fixer = Integer.toString(bday);
        if(fixer.length() == 3)
        {
            return true;
        }
        return false;
    }

    //This method will fix the short-length issue by adding a 0 in front of the string.
    public String fixTooShort(int bday)
    {
        String fixer = Integer.toString(bday);
        String ans = "0";
        ans += fixer;
        return ans;
    }

    /*
     * Checks if a time is between the military time 0000 to 2400. 
     * Also checks if the minute portion is under 60.
     */
  
    public boolean realTime(int time)
    {
        String main = Integer.toString(time);
        Boolean b = false;
        String checker = "";
        if(time <= 2400 && time >= 0)
        {
            if(main.length() == 3)
            {
                checker = main.substring(1);
            }
            else
            {
                checker = main.substring(2);
            }
            int x = Integer.parseInt(checker);
            b = x < 60;
        }
        return b;
    }


    public boolean isInput (String temp)
    {
        int x = temp.length();
        int count = 0;
        for(int a = 0; a < temp.length(); a++)
        {
            if(temp.substring(a,a+1).equals(" "))
            {
                return false;
            }
            else
            {
                count++;
            }
        }
        return x != 0 || count == temp.length();

    }
}

