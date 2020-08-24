/**
 * As the name indicates this is the class that runs the password creator.
 * This project mostly utilizes standardized responses based on initial set dialogue and user input.

 * 
 * @author Brandon Chun
 * @date 8/24/2020
 * @version V1.02
 */

/*
 * This class runs the PasswordCreator2 and all of its related code. Because decision one (initial randomized password) is handled in friend.greeting(), only decision two needs to be taken care of, which is a static variable and therefore can be accessed by this class.
 * 
 */
public class PasswordRunner2 extends PasswordCreator
{
    public static void main(String[] args)
    {
        PasswordCreator friend = new PasswordCreator();
        System.out.println (friend.greeting());
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException x)
        {

        }
        if(decision == 2)
        {
            System.out.println (friend.getInfo());
            System.out.println (friend.choice());        
            if(choice == 1)
            {
                System.out.println (friend.fullyRandomize());
            }
            if(choice ==2)
            {
                System.out.println (friend.partiallyMixed());
            }
        }
    }
}

