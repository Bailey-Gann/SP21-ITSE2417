import java.util.Random;

/* A Program that has the user input the size of a die,
// and outputs the roll. It is entirely possible to rig this program into
// someone's favor, but for this excersise I will keep it simple...
*/
public class Gann implements FinalProject
{
    public Gann()
    {

    }
    public void begin()
    {
        Random generator = new Random();
        int sides;
        //Used to ensure legal die size for input
        boolean dieSize = true;
        boolean checkDie = false;
        
        //Used in the Exit System
        boolean EXIT = true;
        
        

        do{
        System.out.println("Input a legal die size (4, 6, 10, 12 or 20): ");
        System.out.println("Type '0' for EXIT...");
        sides = Itse2417Main.myScan.nextInt();  
        
        //Main computation
        if(sides == 4 || sides == 6 || sides == 10 || sides == 12 || sides == 20)
        {
            int roll = generator.nextInt(sides) + 1;
            System.out.println("Your roll is: " + roll + " out of " + sides);
            checkDie = true;
        }
        //Exit system
        else if(sides == 0)
        {
            EXIT = false;
            
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Thanks for playing! See ya next time!");
        }
        //Illegal Die size
        /*
            I could have made an exception to exit straight from the program,
            but decided to keep it simpler and just send you back to loop's beginning.
        */
        else if(checkDie == false && sides != 0)
        { dieSize = false; }

        if(dieSize == false)
        {
            System.out.println("Illegal die size! Please input a proper number...");
        }

        checkDie = false;

        }while (EXIT);
        

        


    }
    

}