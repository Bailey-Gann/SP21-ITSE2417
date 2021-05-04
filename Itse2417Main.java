// Menu program for ITSE2417 Programming Final Project
// Used with Github to ensure that students know the GitHub process.

// ***************************************************************
// DO NOT MODIFY THIS SECTION
// Any imports needed for your program should be included in 
// your local object
// ***************************************************************
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
// ***************************************************************
// END OF IMPORT SECTION
// ***************************************************************

// ***************************************************************
// OBJECT LIST
// Add your created object to the ArrayList below in the section
// shown for your name.  The code will take care of executing your
// code for you. Replace TempObj with the name of your class file.
// ***************************************************************

public class Itse2417Main
{
    static String semester = "Spring 2021";
    static Scanner myScan = new Scanner(System.in);

    // ***************************************************************
    //  For the menu array, replace TempObj with the name of your class
    //  Please make sure that you
    //      (1) DO NOT DELETEkeyword  new (Your class has to be instantiated)
    //      (2) Put your code on the correct line
    // ***************************************************************

    static ArrayList<Object> menu = new ArrayList<Object>  (
        Arrays.asList(   
            new FinalProj(),          // Beeby 
            new FinalProj(),          // Benitez  
            new FinalProj(),          // Bickham
            new FinalProj(),          // Brenes
            new FinalProj(),          // Cowart
            new FinalProj(),          // Davila
            new FinalProj(),          // Dietrich
            new FinalProj(),          // Fuentes
            new Gann(),          // Gann
            new FinalProj(),          // Hoang
            new FinalProj(),          // Hodson
            new FinalProj(),          // James
            new FinalProj(),          // Jaziri
            new FinalProj(),          // Johnson
            new FinalProj(),          // Khan
            new FinalProj(),          // Leung Woo-Gabriel
            new FinalProj(),          // Murphy
            new FinalProj(),          // Newman
            new FinalProj(),          // Sabine
            new FinalProj(),          // Valdez
            new FinalProj(),          // Wilkerson
            new SmileyMenu()          // Smiley
                     )
                                                            );
    // ***************************************************************
    // END OF MENU OBJECTS LIST
    // ***************************************************************
        // Constants for the menu choices
    final static int MAXCHOICE = menu.size();
    final static int EXIT = 0;
    public static void main(String[] args)
    {
        // Verified user entry
        int selection = -1;

        do
        {
            // Display the menu and get the user's choice.
            selection = showMenu();

            if(selection > 0)
            {
                FinalProject e = (FinalProject) menu.get(selection - 1);
                e.begin();    
            }
        } while (selection != 0);

        myScan.close();
    }

    //*****************************************************************
    // Definition of function showMenu which displays the menu.       *
    //*****************************************************************

    static int showMenu() throws NumberFormatException
    {
        int input = -1;

        System.out.println("*******************************************************************");
        System.out.println("*      Welcome to the " + semester + " Program!");
        System.out.println("*      Make a selection from the list below to see student output");
        System.out.println("*");
        System.out.println("*      Enter 0 and press Enter to Quit.");
        System.out.println("*******************************************************************");

        System.out.println("1.  Beeby");
        System.out.println("2.  Benitez");
        System.out.println("3.  Bickham");
        System.out.println("4.  Brenes");
        System.out.println("5.  Cowart");
        System.out.println("6.  Davila");
        System.out.println("7.  Dietrich");
        System.out.println("8.  Fuentes");
        System.out.println("9.  Gann");
        System.out.println("10. Hoang");
        System.out.println("11. Hodson");
        System.out.println("12. James");
        System.out.println("13. Jaziri");
        System.out.println("14. Johnson");
        System.out.println("15. Khan");
        System.out.println("16. Leung Woo-Gabriel");
        System.out.println("17. Murphy");
        System.out.println("18. Newman");
        System.out.println("19. Sabine");
        System.out.println("20. Valdez");
        System.out.println("21. Wilkerson");
        System.out.println("22. Smiley");
        System.out.println("0.  Exit");
        System.out.println();
        System.out.print("Your selection? ");
        
        try
        {
            input = myScan.nextInt();
            
            if( input < EXIT || input > MAXCHOICE)
            {
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Please enter a number from the menu or 0 to exit."); 
            System.out.println();   
        }

        return input;
    }
}