/*
 * This is the PasswordCreator, and the he is the interactive portion of this password creating app.
 * 
 * @author Brandon Chun
 * @version V1.02
 */
import java.util.*;

public class PasswordCreator extends QuestionSets

{

	public PasswordCreator()
    {
        reader = new Scanner(System.in);
        storeStringAns = new ArrayList<String>();
        storeIntAns = new ArrayList<String>();
    }

    public String greeting()
    {
        System.out.println("Hello friends! My name is PasswordCreator2 and I'm going to be your assistant this wonderful day!");
        wait500();
        System.out.println("I will guide you to make strong, secure passwords for your personal accounts to add security in your life.");
        wait500();
        System.out.println("Enjoy!");
        wait500();
        
        int b = 0;
        int lengthPW = 0;
        String temp = "";

        ArrayList<String> charArray = new ArrayList<String>();
        
        System.out.println("First off, would you like your password completely random or customized?");
        while(b == 0)
        {
            temp = reader.nextLine();
            temp = temp.toLowerCase();
            temp = temp.replaceAll("\\s+","");
            if(temp.equals("random") || temp.equals("rand") || temp.equals("r"))
            {
                decision = 1;
                b++;
            }
            else
            if(temp.equals("customized") || temp.equals("custom") || temp.equals("c"))
            {
                decision = 2;
                b++;
            }
            else
            {
                System.out.println("Answer with \"random\" or \"customized\", please.");
            }
        }
        if(decision == 1)
        {
            int firstWhileLooper = 0;
            System.out.println("Random password, okay!");
            wait500();
            System.out.println("How long would you like your password? Must be between 4 and 16 characters");
            while(firstWhileLooper == 0)
            {
                temp = reader.nextLine();
                if (temp.matches("[0-9]+"))
                {
                    int inputLen = Integer.parseInt(temp);
                    if(inputLen >= 4 && inputLen <= 16)
                    {
                        lengthPW = inputLen;
                        firstWhileLooper++;;
                    }
                    else
                    {
                        System.out.println("You entered " + temp + ". Must be between 4 and 16.");

                    }
                }
                else
                {

                    System.out.println("Please enter alphunumeric characters (0, 1, 2... 9) only!");

                }
            }
            for(char x = 'A'; x <= 'Z'; x++)
            {
                String charToAdd = Character.toString(x);
                charArray.add(charToAdd);
            }
            for(char x = 'a'; x<= 'z'; x++)
            {
                String charToAdd2 = "";
                charToAdd2 += x;
                charArray.add(charToAdd2);
            }
            for(int x = 0; x<= 9; x++)
            {
                String charToAdd2 = "";
                charToAdd2 += x;
                charArray.add(charToAdd2);
            }
            System.out.println( decisionOne(charArray, lengthPW));
            return "Enjoy your password!";
        }

        if( decision == 2)
        {
            System.out.println(decisionTwo());
        }
        return "Okay, let's begin!";
    }

    public String decisionOne(ArrayList<String> charArray, int pwLength)
    {
        String ans = "";
        for(int x = 0; x < pwLength; x++)
        {
            ans += charArray.get( (int) (Math.random() * charArray.size()) );
        }
        return ans;

    }

    public String decisionTwo()
    {
        return "In order to help you make a more personal password, I will be asking you a series of questions and incorporate them into your password.";
    }

    public String getInfo()
    {
        int questionSetNumber = (int) (Math.random() * 9);
        
        if(questionSetNumber == 0)
        {
            part1();
        }
        else if(questionSetNumber == 1)
        {
            part2();
        }
        else if(questionSetNumber == 2)
        {
            part3();
        }
        else if(questionSetNumber == 3)
        {
            part4();
        }
        else if(questionSetNumber == 4)
        {
            part5();
        }
        else if(questionSetNumber == 5)
        {
            part6();
        }
        else if(questionSetNumber == 6)
        {
            part7();
        }
        else if(questionSetNumber == 7)
        {
            part8();
        }
        else if(questionSetNumber == 8)
        {
            part9();
        }
        return "Your answers have been saved :)";
    }

    public String choice()
    {
        int a = 0;
        int b = 0;
        String temp;
        System.out.println("How long would you like your password? (4-16 characters)");
        temp = reader.nextLine();
        wait500();
        while(a == 0)
        {
            if (temp.matches("[0-9]+")) 
            {
                int x = Integer.parseInt(temp);
                if(x < 4)
                {
                    System.out.println("Longer!");
                    temp = reader.nextLine();
                }
                if(x > 16)
                {
                    System.out.println("Shorter!");
                    temp = reader.nextLine();
                }
                if(x>=4 && x<=16)
                {
                    if(checkLength(x))
                    {
                        passwordLength = x;
                        System.out.println("Your wish is my command.");
                        a++;
                    }
                    else
                    {
                        System.out.println("I miscalculated, sorry! Your password should be between 4 and " + totalLength);
                        temp = reader.nextLine();

                    }
                }
            }
            else
            {
                System.out.println("Answer in numbers only, you fool!");
                temp = reader.nextLine();
            }
        }
        System.out.println("Would you like your password completely mixed up or chopped up into phrases?");
        temp = reader.nextLine();
        wait500();
        while(b == 0)
        {
            temp = temp.toLowerCase();
            if (temp.equals("mixed up") || temp.equals("mixed") || temp.equals("m") || temp.equals("chopped up") || temp.equals("chopped") || temp.equals("c"))
            {
                if(temp.equals("mixed up") || temp.equals("mixed") || temp.equals("m"))
                {
                    choice = 1;
                }
                if(temp.equals("chopped up") || temp.equals("chopped") || temp.equals("c"))
                {
                    choice = 2;
                }
                b++;
            }
            else
            {
                System.out.println("Answer with \"mixed up\" or \"chopped up\", please.");
                temp = reader.nextLine();
            }
        }
        return "Your wish is my command. Here is your password: ";
    }

    public boolean checkLength(int length)
    {
        String word = "";
        for(int x = 0; x < storeStringAns.size(); x++)
        {
            word += storeStringAns.get(x);
        }  
        for(int x = 0; x < storeIntAns.size(); x++)
        {
            word += storeIntAns.get(x);
        }  
        totalLength = word.length();
        if(length <= word.length())
        {
            return true;
        }
        return false;
    }
}

