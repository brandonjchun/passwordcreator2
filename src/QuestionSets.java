/**
 * Here are nine question sets that I personally have created.
 * Since there is user input involved, I have created bounds to ensure that the system does not crash.
 * This was probably the most code intensive portion of the project, as I had to qualify specific criteria for the questions, with different boundaries for each individual quesitons.
 * 
 * @author Brandon Chun
 * @version V1.02
 */

public class QuestionSets extends PasswordFunctions
{
    public QuestionSets()
    {
    }

    public void part1()
    {
        String temp;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("First question, who is your favorite music artist?");
        temp = reader.nextLine();
        while(b == 0)
        {
            if(isInput(temp))
            {
                storeStringAns.add(temp);
                b++;
            }
            else
            {
            	System.out.println("Why did you enter a blank space? :(");
                System.out.println("Try again!");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("I agree, dope artist! Next question. What are the first three digits of your phone number?");
        temp = reader.nextLine();
        temp = temp.replaceAll("\\s+","");
        while(a == 0)
        {
            if(isInput(temp))
            {
                if (temp.matches("[0-9]+") && temp.length() > 2 && temp.length() < 4) 
                {
                    storeIntAns.add(temp);
                    a++;
                }
                else
                {
                    if(!temp.matches("[0-9]+"))
                    {
                        System.out.println("Answer in numbers only, you fool!");
                    }
                    else
                    {
                        if(temp.length() > 3 )
                        {
                            System.out.println("First three digits, your answer is too long!");
                        }
                        if(temp.length() < 3)
                        {
                            System.out.println("First three digits, your answer is too short!");
                        }
                    }

                    temp = reader.nextLine();

                    temp = temp.replaceAll("\\s+","");
                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Alright, now for the last question. What is your last name?");
        temp = reader.nextLine();
        while(c==0)
        {
            if(isInput(temp))
            {
                if(temp.length() > 1)
                {
                    if(temp.length()>10)
                    {
                        System.out.println("Wow that's a long last name. :o");
                    }
                    storeStringAns.add(temp);
                    c++;
                }

                else if(temp.length() == 1)
                {
                     System.out.println("Your full name please! Not your initial!");
                     temp = reader.nextLine();
                }
                else
                {
                    System.out.println("You don't have a last name?");
                    System.out.println("Try again.");
                    temp = reader.nextLine();
                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
    }

    public void part2()
    {
        String temp;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Alright first question, what is your favorite color?");
        temp = reader.nextLine();
        while(b == 0)
        {
            if(isInput(temp))
            {
                if(temp.length() > 2 && temp.length() < 9)
                {
                    storeStringAns.add(temp);
                    b++;
                }
                else
                {
                    if(temp.length() == 0)
                    {
                        System.out.println("A blank space! Did you mean white? Type out \"white\" then");
                    }
                    else
                    {
                        System.out.println("Bro that's not even a color!");
                    }
                    temp = reader.nextLine();
                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Next question! When is your birthday? (ex.0817)") ;
        temp = reader.nextLine(); 
        temp = temp.replaceAll("\\s+","");
        while(a == 0)
        {
            if(isInput(temp))
            {
                if (temp.matches("[0-9]+") && temp.length() == 4) 
                {
                    int x = Integer.parseInt(temp);
                    if(realBirthday(x))
                    {
                        if(tooShort(x))
                        {
                            temp = fixTooShort(x);
                        }
                        storeIntAns.add(temp);
                        a++;
                    }
                    else
                    {
                        System.out.println("That's not even a real birthday, you fool!");
                        temp = reader.nextLine();
                    }
                }
                else
                {
                    if(!temp.matches("[0-9]+"))
                    {
                        System.out.println("Answer in numbers only, you fool!");
                    }
                    if(temp.length() < 4)
                    {
                        System.out.println("That's not even a real birthday, you fool!");
                    }
                    if(temp.length() > 4)
                    {
                        System.out.println("That's not even a real birthday, you fool!");
                    }
                    temp = reader.nextLine();
                    temp = temp.replaceAll("\\s+","");
                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Last question. What city do you live in?");
        temp = reader.nextLine();
        while(c==0)
        {
            if(isInput(temp))
            {
                if(temp.length() > 1)
                {
                    storeStringAns.add(temp);
                    c++;
                }
                else
                {
                    System.out.println("That's not even a real city!");
                    temp = reader.nextLine();
                    temp = temp.replaceAll("\\s+","");
                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
    }

    public void part3()
    {
        String temp;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("First question! Where are you from?");
        temp = reader.nextLine();
        while(b == 0)
        {
            temp = reader.nextLine();
            temp = temp.replaceAll("\\s+","");
            if(isInput(temp))
            {
                if(temp.length() > 2 && temp.length() < 9)
                {
                    storeStringAns.add(temp);
                    b++;
                }
                else
                {
                    System.out.println("Pretty sure that's not an ethnicity... try again!");
                }
            }
        }
        
        System.out.println("On a scale of one to ten, how sexy would you describe yourself as?");
        while(a == 0)
        {
            temp = reader.nextLine();
            temp = temp.replaceAll("\\s+","");
            if(isInput(temp))
            {
                if(temp.matches("[0-9]+"))
                {
                    int x = Integer.parseInt(temp);
                    if (x >= 1 && x <= 10)
                    {
                        storeIntAns.add(temp);
                        a++;
                    }
                    else
                    {
                        if(x<1)
                        {
                            System.out.println("Be more confident! Bigger number!");
                        }
                        else
                        {
                            System.out.println("On a scale of 1-10, dummy!");
                        }
                        temp = reader.nextLine();

                    }
                }
                else
                {
                    if(!temp.matches("[0-9]+") && temp.contains("[0-9]+"))
                    {
                        System.out.println("Not negative numbers!!!");
                    }
                    else
                    if(!temp.matches("[0-9]+"))
                    {
                        System.out.println("Answer in numbers only, you fool!");
                    }
                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Okay. Last question. What is your favorite word?");
        while(c==0)
        {
            temp = reader.nextLine();
            boolean ppp = false;
            int counter = 0;
            for(int x = 0; x<temp.length(); x++)
            {
                String checker = temp.substring(x,x+1);
                if(checker.equals(" "))
                {
                    ppp = true;
                    counter++;
                }
            }
            counter = counter - 1;
            if(isInput(temp))
            {
                if(ppp)
                {
                    System.out.println("Man I said one word, not " + counter);
                }
                else
                {
                    
                    System.out.println("Wow that's totally swell bro!");
                    storeStringAns.add(temp);
                    c++;
                }
            }
            else
            {
                System.out.println("Hold up wait a second...");
                System.out.println("Did you mean \"blank\" is your favorite word?");
                System.out.println("Please type it out buddy. :)");
            }
        }
    }

    public void part4()
    {
        String temp;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Alright first question, what is your blood type?(ex.AB)");
        temp = reader.nextLine();
        temp = temp.replaceAll("\\s+","");
        while(a == 0)
        {
            if(isInput(temp))
            {
                if(!temp.matches("[0-9]+") && temp.length() < 3 && temp.length() > 0)
                {
                    if(temp.equals("AB") ||
                    temp.equals("Ab") ||
                    temp.equals("aB") ||
                    temp.equals("ab") ||
                    temp.equals("B") ||
                    temp.equals("b") ||
                    temp.equals("A") ||
                    temp.equals("a") ||
                    temp.equals("O") ||
                    temp.equals("o"))
                    {
                        storeStringAns.add(temp);
                        a++;
                    }
                    else
                    {
                        System.out.println("That's not even a blood type fam!");
                        temp = reader.nextLine();
                    }
                }
                else
                {
                    if(temp.matches("[0-9]+"))
                    {
                        System.out.println("Numbers only please. (No plus or minus signs)") ;
                        temp = reader.nextLine();

                    }
                    else
                    {
                        System.out.println("Bruh why did you play me like that try again.") ;
                        temp = reader.nextLine();

                    }
                }
            }
            else
            {
                System.out.println("That's not a viable answer. Please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Next question! If you could be any age forever, what age would it be?") ;
        while(b == 0)
        {
            temp = reader.nextLine();
            if(isInput(temp))
            {
                if (temp.matches("[0-9]+") && temp.length() > 0) 
                {
                    if(temp.length() > 2)
                    {
                        System.out.println("Respect your elders :D");
                    }
                    storeIntAns.add(temp);
                    b++;
                }
                else
                {
                    if(!temp.matches("[0-9]+"))
                    {
                        System.out.println("Answer in numbers only, you fool!");
                    }
                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
            }
        }
        
        System.out.println("Okay next question; in one word, what do you think of this survey?");
        temp = reader.nextLine();
        while (c == 0)
        {
            if(isInput(temp))
            {
                for(int x = 0; x<temp.length(); x++)
                {
                    if(temp.substring(x,x+1).equals(" "))
                    {
                        System.out.println("Only one word buddy.");
                        temp = reader.nextLine();
                    }
                }
                c++;
                storeStringAns.add(temp);
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
    }

    public void part5()
    {
        String temp;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("What's your favorite music genre?");
        temp = reader.nextLine();
        while (b==0)
        {
            if(isInput(temp))
            {
                storeStringAns.add(temp);
                b++;
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Without looking, guess what time it is. (ex.0817)") ;
        temp = reader.nextLine();
        while(a == 0)
        {
            if(isInput(temp))
            {
                if (temp.matches("[0-9]+"))
                {
                    if(temp.length() > 3)
                    {
                        if(temp.length() < 5)
                        {
                            int x = Integer.parseInt(temp);
                            if(x <=2400)
                            {
                                if(tooShort(x))
                                {
                                    temp = fixTooShort(x);
                                }
                                storeIntAns.add(temp);
                                a++;
                            }
                            else
                            {
                                System.out.println("A real time!");
                                temp = reader.nextLine();

                            }
                        }
                        else
                        {
                            System.out.println("Too long!");
                            temp = reader.nextLine();

                        }
                    }
                    else
                    {
                        System.out.println("Too short!");
                        temp = reader.nextLine();

                    }
                }
                else
                {
                    if(!temp.matches("[0-9]+"))
                    {
                        System.out.println("Answer in numbers only, you fool!");
                    }
                    temp = reader.nextLine();

                }
            }
            else
            {
                System.out.println("That's not a viable answer. Please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Last question! What was the last thing you bought?");
        temp = reader.nextLine();
        while (c==0)
        {
            if(isInput(temp))
            {
                storeStringAns.add(temp);
                c++;
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
    }

    public void part6()
    {
        String temp;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Who was the last person you ate dinner with?");
        temp = reader.nextLine();
        while (b==0)
        {
            if(isInput(temp))
            {
                storeStringAns.add(temp);
                b++;
            }
            else
            {
                System.out.println("Thats not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Next question! How many keys do you have on your keychain?") ; 
        temp = reader.nextLine();
        while(a == 0)
        {
            if(isInput(temp))
            {
                if (temp.matches("[0-9]+")) 
                {
                    int x = Integer.parseInt(temp);
                    if(x > 10)
                    {
                    	System.out.println("...");
                    	wait500();
                        System.out.println("That's a lot of keys!");
                    }
                    storeIntAns.add(temp);
                    a++;
                }
                else
                {
                    if(!temp.matches("[0-9]+"))
                    {
                        System.out.println("Answer in numbers only, you fool!");
                    }
                    temp = reader.nextLine();

                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Which came first, the chicken or the egg?");
        temp = reader.nextLine();
        while(c==0)
        {
            if(isInput(temp))
            {
                temp = temp.toLowerCase();
                if(temp.contains("chicken") || temp.contains("egg"))
                {
                    storeStringAns.add(temp);
                    c++;
                }
                else
                {
                    System.out.println("Answer with \"chicken\" or \"egg\" fam");
                    temp = reader.nextLine();

                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
    }

    public void part7()
    {
        String temp;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("In one word, what do you do most when you get bored?");
        temp = reader.nextLine();
        while (b==0)
        {
            if(isInput(temp))
            {
                storeStringAns.add(temp);
                b++;
            }
            else
            {
                System.out.println("Thats not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("On average, how many rings before you answer the phone?") ;
        temp = reader.nextLine();
        while(a == 0)
        {
            if(isInput(temp))
            {
                if (temp.matches("[0-9]+")) 
                {
                    if(temp.length() > 7)
                    {
                        System.out.println("That's literally impossible.");
                        temp = reader.nextLine();

                    }
                    else
                    {

                        int x = Integer.parseInt(temp);
                        if(x > 15)
                        {
                            System.out.println("Okay... but phones don't even ring that long. :(");
                        }
                        storeIntAns.add(temp);
                        a++;
                    }
                }
                else
                {
                    if(!temp.matches("[0-9]+"))
                    {
                        System.out.println("Answer in numbers only, you fool!");
                    }
                    temp = reader.nextLine();

                }
            }
            else
            {
                System.out.println("Thats not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Now, for the last question. Would you rather go skydiving or bungee jumping?");
        temp = reader.nextLine();
        while(c==0)
        {
            if(isInput(temp))
            {
                temp = temp.toLowerCase();
                temp = temp.replaceAll("\\s+","");
                if(temp.equals("skydiving") || temp.equals("bungeejumping")|| temp.equals("jumping")|| temp.equals("bungee"))
                {
                storeStringAns.add(temp);
                    c++;
                }
                else
                {
                    System.out.println("Answer with \"skydiving\" or \"bungee jumping\" fam");
                    temp = reader.nextLine();

                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
    }

    public void part8()
    {
        String temp;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("What kind of car brand do you have, and/or want to have (ex. Hyundai)?");
        temp = reader.nextLine();
        while(b==0)
        {
            temp = temp.replaceAll("\\s+","");
            temp = temp.toLowerCase();
            if(isInput(temp))
            {
                if(temp.equals("honda") ||
                temp.equals("toyota") ||
                temp.equals("ford") ||
                temp.equals("acura") ||
                temp.equals("bmw") ||
                temp.equals("bugatti") ||
                temp.equals("cadillac") ||
                temp.equals("chevrolet") ||
                temp.equals("buick" )||
                temp.equals("bentley")||
                temp.equals("chrysler") ||
                temp.equals("ferrari") ||
                temp.equals("fiat") ||
                temp.equals("geely" )||
                temp.equals("generalmotors" )||
                temp.equals("gmc" )||
                temp.equals("jaguar" )||
                temp.equals("jeep") ||
                temp.equals("kia") ||
                temp.equals("koenigsegg") ||
                temp.equals("lamborghini") ||
                temp.equals("land rover") ||
                temp.equals("lexus") ||
                temp.equals("maserati") ||
                temp.equals("mazda") ||
                temp.equals("mercedesbenz") ||
                temp.equals("benz") ||
                temp.equals("mercedes") ||
                temp.equals("mitsubishi") ||
                temp.equals("pagani") ||
                temp.equals("peugeot") ||
                temp.equals("porsche")||
                temp.equals("nissan") ||
                temp.equals("ram") ||
                temp.equals("renault") ||
                temp.equals("rollsroyce") ||
                temp.equals("saab") ||
                temp.equals("subaru") ||
                temp.equals("suzuki")||
                temp.equals("tatamotors") ||
                temp.equals("tesla") ||
                temp.equals("volkswagen") ||
                temp.equals("volvo") ||
                temp.equals("hennessey") ||
                temp.equals("lincoln") ||
                temp.equals("dodge"))
                {
                    storeStringAns.add(temp);
                    b++;
                }
                else
                {
                    System.out.println("Bro that's not even a car brand.");  
                    temp = reader.nextLine();
                }
            }
            else
            {
                System.out.println("That's not a viable answer. please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("If you won the lottery how many hours would you wait to tell people?") ;
        temp = reader.nextLine();
        while(a == 0)
        {
            if(isInput(temp))
            {
                if (temp.matches("[0-9]+")) 
                {
                    int x = Integer.parseInt(temp);
                    if(x>100000)
                    {
                        System.out.println("Bro you gonna wait until you die or what.") ;
                    }
                    storeIntAns.add(temp);
                    a++;
                }
                else
                {
                    if(!temp.matches("[0-9]+"))
                    {
                        System.out.println("Answer in numbers only, you fool!");
                    }
                    temp = reader.nextLine();
                }
            }
            else
            {
                System.out.println("That's not a viable answer. Please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Where would you retire?");
        temp = reader.nextLine();
        while (c==0)
        {
            if(isInput(temp))
            {
                storeStringAns.add(temp);
                c++;
            }
            else
            {
                System.out.println("That's not a viable answer. Please try again :)");
                temp = reader.nextLine();
            }
        }
    }

    public void part9()
    {
        String temp;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("What do you want to be when you grow up?");
        temp = reader.nextLine();
        while (b==0)
        {
            if(isInput(temp))
            {
                storeStringAns.add(temp);
                b++;
            }
            else
            {
                System.out.println("That's not a viable answer. Please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("On average what time do you go to sleep? (ex.0945)") ;
        temp = reader.nextLine();
        while(a == 0)
        {
            if(isInput(temp))
            {
                if (temp.matches("[0-9]+") && (temp.length() > 3 && temp.length() < 5)) 
                {
                    int x = Integer.parseInt(temp);
                    if(realTime(x))
                    {
                        if(tooShort(x))
                        {
                            temp = fixTooShort(x);
                        }
                        storeIntAns.add(temp);
                        a++;
                    }
                    else
                    {
                        System.out.println("Enter a real time!");
                        temp = reader.nextLine();

                    }
                }
                else
                {
                    if(!temp.matches("[0-9]+"))
                    {
                        System.out.println("Answer in numbers only, you fool!");
                    }
                    temp = reader.nextLine();

                }
            }
            else
            {
                System.out.println("Thats not a viable answer. Please try again :)");
                temp = reader.nextLine();
            }
        }
        
        System.out.println("Name one thing that is under your bed.");
        temp = reader.nextLine();
        while (c==0)
        {
            if(isInput(temp))
            {
                storeStringAns.add(temp);
                c++;
            }
            else
            {
                System.out.println("That's not a viable answer. Please try again :)");
                temp = reader.nextLine();
            }
        }
    }
}