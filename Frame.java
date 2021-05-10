package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.lang.*;
import java.util.*;
import java.lang.String;
import java.util.Random;

public class Frame {

    static void Line()
    {
        System.out.println("----------------------------------------------------");
    }
    static void t(){System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");}

    // Foreground Colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // BackGround Colors
    public static final String ANSI_Black = "\u001B[40m";
    public static final String ANSI_red = "\u001B[41m";
    public static final String ANSI_green = "\u001B[42m";
    public static final String ANSI_yellow = "\u001B[43m";
    public static final String ANSI_blue = "\u001B[44m";
    public static final String ANSI_purple = "\u001B[45m";
    public static final String ANSI_cyan = "\u001B[46m";
    public static final String ANSI_white = "\u001B[47m";
    public static final String ANSI_reset = "\u001B[0m";


    public static final int PASSWORD_LENGTH = 8;


    static void Ascii_art()
    {
        try
        {
            //constructor of file class having file as argument
            File file=new File("Ascii.txt");
            FileInputStream fis=new FileInputStream(file);     //opens a connection to an actual file
            System.out.println("file content: ");
            int r=0;


            while((r=fis.read())!=-1)
            {
                System.out.print(ANSI_GREEN + (char)r);      //prints the content of the file
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    static void ABout_us()
    {
        try
        {
            //constructor of file class having file as argument
            File file=new File("About Us.txt");
            FileInputStream fis=new FileInputStream(file);     //opens a connection to an actual file
            System.out.println("file content: ");
            int r=0;


            while((r=fis.read())!=-1)
            {
                System.out.print(ANSI_Black+(char)r+ANSI_reset);      //prints the content of the file
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }



    public static boolean is_Valid_Password(String password)
    {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        int SpecCount=0;
        for (int i = 0; i < password.length(); i++)
        {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else if (is_Special(ch)) SpecCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2 && SpecCount >= 2 );
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

    public static boolean is_Special(char ch) {

        return (   ch == '!'
                || ch == '@'
                || ch == '#'
                || ch == '$'
                || ch == '%'
                || ch == '^'
                || ch == '&'
                || ch == '*'
                || ch == '('
                || ch == ')'
                || ch == '_'
                || ch == '-'
                || ch == '='
                || ch == '.'
                || ch == ','
                || ch == ';'
                || ch == '"'
                || ch == '['
                || ch == ']'
                || ch == '/'
                || ch == '<'
                || ch == '>'
                || ch == ':'
                || ch == '{'
                || ch == '}'
                || ch == '|');
    }
    static String Username;
    static String Phone_number;
    static String Email;
    static String Address;
    static String Password;
    static String Confirm_Password;

    // KEVAL CODE
    public static void SubMenu()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(ANSI_RED+"\nPress 0 to exit the application");
        System.out.println("Press 1 to explore Main Menu");
        System.out.println("Press 2 to explore more choices of Sub Menu"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter your choice : "+ANSI_RESET);
        int choice = scan.nextInt();

        switch(choice)
        {
            case 0 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            case 1 : while(true)
            {
                MainMenu();
            }
            case 2 :

                break;
            default: System.out.println("Invalid Choice!! Please enter a valid choice..."); SubMenu();
        }
    }
    static void MI()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Support Staff"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"\t\t\t\t2. Wicket-Keepers"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"\t\t\t\t3. Batsmen"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"\t\t\t\t4. Bowlers"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"\t\t\t\t5. All-Rounders"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"\t\t\t\t6. Close Application"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 to 6 : "+ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : MIstaff(); SubMenu();
                break;
            case 2 : MIwk(); SubMenu();
                break;
            case 3 : MIbat(); SubMenu();
                break;
            case 4 : MIbowl(); SubMenu();
                break;
            case 5 : MIall(); SubMenu();
                break;
            case 6: System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default : System.out.println("Invalid Choice!! Please enter a valid choice...");
        }
    }

    static void MIstaff()
    {
        System.out.println(ANSI_Black+"\t\t\t\tName                                      Role");
        System.out.println("\t\t\t\t------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1.  Mukesh Ambani                         Owner");
        System.out.println("\t\t\t\t2.  Akash Ambani                          CEO");
        System.out.println("\t\t\t\t3.  Rahul Sanghvi                         Team manager");
        System.out.println("\t\t\t\t4.  Sachin Tendulkar                      Team Icon");
        System.out.println("\t\t\t\t5.  Zaheer Khan                           Director of Cricket Operations");
        System.out.println("\t\t\t\t6.  Rohit Sharma                          Captain");
        System.out.println("\t\t\t\t7.  Mahela Jayawardene                    Head coach");
        System.out.println("\t\t\t\t8.  Robin Singh                           Batting coach");
        System.out.println("\t\t\t\t9.  Shane Bond                            Bowling coach");
        System.out.println("\t\t\t\t10. James Pamment                         Fielding coach");
        System.out.println("\t\t\t\t11. John Wright                           Head of Talent Scouting");
        System.out.println("\t\t\t\t12. T. A. Sekhar                          Talent scout");
        System.out.println("\t\t\t\t13. Kiran More                            Talent scout");
        System.out.println("\t\t\t\t14. Parthiv Patel                         Talent scout");
        System.out.println("\t\t\t\t15. CKM Dhananjai                         Data Performance Manager");
        System.out.println("\t\t\t\t16. Kevin Sims                            Physiotherapist");
        System.out.println("\t\t\t\t17. Sizwe Hadebe                          Asst. physiotherapist");
        System.out.println("\t\t\t\t18. Ashutosh Nimse                        Asst. physiotherapist");
        System.out.println("\t\t\t\t19. Paul Chapman                          Strength and conditioning coach");
        System.out.println("\t\t\t\t20. Pratik Kadam                          Asst. strength and conditioning coach");
        System.out.println("\t\t\t\t21. Nagendra Prasad                       Asst. strength and conditioning coach");
        System.out.println("\t\t\t\t22. L. Varun                              Video analyst");
        System.out.println("\t\t\t\t23. Amit Shah                             Sports massage therapist");
        System.out.println("\t\t\t\t24. Vijaya Kushwa                         Asst. sports massage therapist");
        System.out.println("\t\t\t\t25. Mayur Satpute                         Asst. sports massage therapist");
        System.out.println("\t\t\t\t26. Kinita Kadakia Patel                  Sports Nutritionist");
        System.out.println("\t\t\t\t**************************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void MIwk()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Quinton de Kock                         Left-handed batsman");
        System.out.println("\t\t\t\t2. Ishan Kishan                            Left-handed batsman");
        System.out.println("\t\t\t\t3. Aditya Tare                             Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void MIbat()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Rohit Sharma                            Right-handed batsman");
        System.out.println("\t\t\t\t2. Surya Kumar Yadav                       Right-handed batsman");
        System.out.println("\t\t\t\t3. Chris Lynn                              Right-handed batsman");
        System.out.println("\t\t\t\t4. Saurabh Tiwary                          Left-handed batsman");
        System.out.println("\t\t\t\t5. Anmolpreet Singh                        Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void MIbowl()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Bowling Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Jasprit Bumrah                          Right-arm fast");
        System.out.println("\t\t\t\t2. Trent Boult                             Left-arm fast-medium");
        System.out.println("\t\t\t\t3. Nathan Coulter-Nile                     Right-arm fast");
        System.out.println("\t\t\t\t4. Adam Milne                              Right-arm fast");
        System.out.println("\t\t\t\t5. Dhawal Kulkarni                         Right-arm medium-fast");
        System.out.println("\t\t\t\t6. Rahul Chahar                            Right-arm leg break");
        System.out.println("\t\t\t\t7. Jayant Yadav                            Right-arm off break");
        System.out.println("\t\t\t\t8. Mohsin Khan                             Left-arm medium-fast");
        System.out.println("\t\t\t\t9. Yudhvir Singh Charak                    Right-arm fast-medium");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void MIall()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                Batting Style                 Bowling Style");
        System.out.println("\t\t\t\t-------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Hardik Pandya           Right-handed batsman          Right-arm fast-medium");
        System.out.println("\t\t\t\t2. Krunal Pandya           Left-handed batsman           Left-arm orthodox");
        System.out.println("\t\t\t\t3. Kieron Pollard          Right-handed batsman          Right-arm medium-fast");
        System.out.println("\t\t\t\t4. James Neesham           Left-handed batsman           Right-arm medium-fast");
        System.out.println("\t\t\t\t5. Piyush Chawla           Left-handed batsman           Right-arm leg break");
        System.out.println("\t\t\t\t6. Arjun Tendulkar         Left-handed batsman           Left-arm medium-fast");
        System.out.println("\t\t\t\t7. Marco Jansen            Right-handed batsman          Left-arm fast");
        System.out.println("\t\t\t\t8. Anukul Roy              Left-handed batsman           Slow left-arm orthodox");
        System.out.println("\t\t\t\t*******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void CSK()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Support Staff");
        System.out.println("\t\t\t\t2. Wicket-Keepers");
        System.out.println("\t\t\t\t3. Batsmen");
        System.out.println("\t\t\t\t4. Bowlers");
        System.out.println("\t\t\t\t5. All-Rounders");
        System.out.println("\t\t\t\t6. Close Application"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 to 6 : "+ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : CSKstaff(); SubMenu();
                break;
            case 2 : CSKwk(); SubMenu();
                break;
            case 3 : CSKbat(); SubMenu();
                break;
            case 4 : CSKbowl(); SubMenu();
                break;
            case 5 : CSKall(); SubMenu();
                break;
            case 6: System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default : System.out.println("Invalid Choice!! Please enter a valid choice...");
        }
    }
    static void CSKstaff()
    {
        System.out.println(ANSI_Black+"\t\t\t\tName                                                     Role");
        System.out.println("\t\t\t\t------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1.  N. Srinivasan (India Cements)                        Owner");
        System.out.println("\t\t\t\t2.  Kasinath Viswanathan                                 CEO");
        System.out.println("\t\t\t\t3.  Russell Radhakrishnan                                Team manager");
        System.out.println("\t\t\t\t4.  Sundar Raman                                         Consultant");
        System.out.println("\t\t\t\t5.  Mahendra Singh Dhoni                                 Captain");
        System.out.println("\t\t\t\t6.  Stephen Fleming                                      Head coach");
        System.out.println("\t\t\t\t7.  Michael Hussey                                       Batting coach");
        System.out.println("\t\t\t\t8.  Lakshmipathy Balaji                                  Bowling coach");
        System.out.println("\t\t\t\t9.  Eric Simons                                          Bowling consultant");
        System.out.println("\t\t\t\t10. Rajiv Kumar                                          Fielding coach");
        System.out.println("\t\t\t\t11. Narasimhan V                                         Throwdown specialist");
        System.out.println("\t\t\t\t12. Kondappa Raj                                         Throwdown specialist");
        System.out.println("\t\t\t\t13. Tommy Simsek                                         Physiotherapist");
        System.out.println("\t\t\t\t14. Greg King                                            Physical trainer");
        System.out.println("\t\t\t\t15. Lakshmi Narayanan                                    Analyst");
        System.out.println("\t\t\t\t16. Khalil Khan                                          Massuer");
        System.out.println("\t\t\t\t17. Dr Madhu Thottappillil                               Team doctor");
        System.out.println("\t\t\t\t18. Sanjay Natarajan                                     Logistics manager");
        System.out.println("\t\t\t\t******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void CSKwk()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. MS Dhoni                                Right-handed batsman");
        System.out.println("\t\t\t\t2. Robin Uthappa                           Right-handed batsman");
        System.out.println("\t\t\t\t3. Narayan Jagadeesan                      Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void CSKbat()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Faf du Plessis                          Right-handed batsman");
        System.out.println("\t\t\t\t2. Suresh Raina                            Left-handed batsman");
        System.out.println("\t\t\t\t3. Ambati Rayudu                           Right-handed batsman");
        System.out.println("\t\t\t\t4. Ruturaj Gaikwad                         Right-handed batsman");
        System.out.println("\t\t\t\t5. Cheteshwar Pujara                       Right-handed batsman");
        System.out.println("\t\t\t\t6. C Hari Nishanth                         Left-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void CSKbowl()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Bowling Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Deepak Chahar                           Right-arm fast");
        System.out.println("\t\t\t\t2. Shardul Thakur                          Right-arm medium-fast");
        System.out.println("\t\t\t\t3. Lungi Ngidi                             Right-arm fast");
        System.out.println("\t\t\t\t4. Josh Hazlewood                          Right-arm fast-medium");
        System.out.println("\t\t\t\t5. KM Asif                                 Right-arm medium");
        System.out.println("\t\t\t\t6. Imran Tahir                             Right-arm leg break");
        System.out.println("\t\t\t\t7. Karn Sharma                             Right-arm leg break");
        System.out.println("\t\t\t\t8. Ravisrinivasan Sai Kishore              Slow left-arm orthodox");
        System.out.println("\t\t\t\t9. Harishankar Reddy                       Right-arm medium");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void CSKall()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                Batting Style                 Bowling Style");
        System.out.println("\t\t\t\t-------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Ravindra Jadeja         Left-handed batsman           Slow left-arm orthodox");
        System.out.println("\t\t\t\t2. Moeen Ali               Left-handed batsman           Right-arm off break");
        System.out.println("\t\t\t\t3. Sam Curran              Left-handed batsman           Left-arm medium-fast");
        System.out.println("\t\t\t\t4. Dwayne Bravo            Right-handed batsman          Right-arm fast-medium");
        System.out.println("\t\t\t\t5. Mitchell Santner        Left-handed batsman           Left-arm Orthodox");
        System.out.println("\t\t\t\t6. Krishnappa Gowtham      Right-handed batsman          Right-arm off break");
        System.out.println("\t\t\t\t7. Kanumuri Bhagath Varma  Right-handed batsman          Right arm off break");
        System.out.println("\t\t\t\t*******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void RCB()
    {
        System.out.println("\n\t\t\t\t1. Support Staff");
        System.out.println("\t\t\t\t2. Wicket-Keepers");
        System.out.println("\t\t\t\t3. Batsmen");
        System.out.println("\t\t\t\t4. Bowlers");
        System.out.println("\t\t\t\t5. All-Rounders");
        System.out.println("\t\t\t\t6. Close Application");
        System.out.print("\nEnter any choice between 1 to 6 : ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : RCBstaff(); SubMenu();
                break;
            case 2 : RCBwk(); SubMenu();
                break;
            case 3 : RCBbat(); SubMenu();
                break;
            case 4 : RCBbowl(); SubMenu();
                break;
            case 5 : RCBall(); SubMenu();
                break;
            case 6: System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default : System.out.println("Invalid Choice!! Please enter a valid choice...");
        }
    }
    static void RCBstaff()
    {
        System.out.println(ANSI_Black+"Name                                      Role");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1.  United Spirits Limited                Owner");
        System.out.println("\t\t\t\t2.  Anand Kripalu                         Chairman");
        System.out.println("\t\t\t\t3.  Soumyadeep Pyne                       Team manager");
        System.out.println("\t\t\t\t4.  Mike Hesson                           Director of Cricket Operations");
        System.out.println("\t\t\t\t5.  Virat Kohli                           Captain");
        System.out.println("\t\t\t\t6.  Simon Katich                          Head coach");
        System.out.println("\t\t\t\t7.  Sanjay Bangar                         Batting consultant");
        System.out.println("\t\t\t\t8.  Sridharan Sriram                      Batting and spin bowling coach");
        System.out.println("\t\t\t\t9.  Adam Griffith                         Bowling coach");
        System.out.println("\t\t\t\t10. Malolan Rangarajan                    Head of scouting and fielding coach");
        System.out.println("\t\t\t\t11. Dinesh Puttepu                        Right arm flicker");
        System.out.println("\t\t\t\t12. Gabriel Ben Kurian                    Left arm flicker");
        System.out.println("\t\t\t\t13. Evan Speechly                         Head physiotherapist");
        System.out.println("\t\t\t\t14. Sabyasachi Sahoo                      Asst. physiotherapist");
        System.out.println("\t\t\t\t15. Basu Shanker                          Strength and conditioning coach");
        System.out.println("\t\t\t\t16. Shubham Raheja                        Asst. trainer");
        System.out.println("\t\t\t\t17. Sandeep Raju                          Analyst");
        System.out.println("\t\t\t\t18. Ramesh Mane                           Sports massage therapist");
        System.out.println("\t\t\t\t29. Navnita Gautam                        Sports massage therapist");
        System.out.println("\t\t\t\t20. Dr. Charles Minz                      Team doctor");
        System.out.println("\t\t\t\t21. Dr. Chaitanya Sridhar                 Psychologist");
        System.out.println("\t\t\t\t******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void RCBwk()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. AB de Villiers                          Right-handed batsman");
        System.out.println("\t\t\t\t2. Josh Philippe                           Right-handed batsman");
        System.out.println("\t\t\t\t3. Srikar Bharat                           Right-handed batsman");
        System.out.println("\t\t\t\t4. Mohammed Azharuddeen                    Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void RCBbat()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Virat Kohli                             Right-handed batsman");
        System.out.println("\t\t\t\t2. Devdutt Padikkal                        Left-handed batsman");
        System.out.println("\t\t\t\t3. Rajat Patidar                           Right-handed batsman");
        System.out.println("\t\t\t\t4. Sachin Baby                             Left-handed batsman");
        System.out.println("\t\t\t\t5. Suyash Prabhudessai                     Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void RCBbowl()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Bowling Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Harshal Patel                           Right-arm medium");
        System.out.println("\t\t\t\t2. Mohammed Siraj                          Right-arm medium-fast");
        System.out.println("\t\t\t\t3. Navdeep Saini                           Right-arm fast");
        System.out.println("\t\t\t\t4. Yuzvendra Chahal                        Right-arm leg break");
        System.out.println("\t\t\t\t5. Kyle Jamieson                           Right-arm fast-medium");
        System.out.println("\t\t\t\t6. Kane Richardson                         Right-arm fast-medium");
        System.out.println("\t\t\t\t7. Adam Zampa                              Right-arm leg break");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void RCBall()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                Batting Style                 Bowling Style");
        System.out.println("\t\t\t\t-------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Glenn Maxwell           Right-handed batsman          Right-arm off break");
        System.out.println("\t\t\t\t2. Shahbaz Ahmed           Left-handed batsman           Left-arm orthodox");
        System.out.println("\t\t\t\t3. Washington Sundar       Left-handed batsman           Right-arm off break");
        System.out.println("\t\t\t\t4. Daniel Christian        Right-handed batsman          Right-arm fast-medium");
        System.out.println("\t\t\t\t5. Daniel Sams             Right-handed batsman          Left-arm fast-medium");
        System.out.println("\t\t\t\t6. Pavan Deshpande         Left-handed batsman           Right-arm off break");
        System.out.println("\t\t\t\t*******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void DC()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Support Staff");
        System.out.println("\t\t\t\t2. Wicket-Keepers");
        System.out.println("\t\t\t\t3. Batsmen");
        System.out.println("\t\t\t\t4. Bowlers");
        System.out.println("\t\t\t\t5. All-Rounders");
        System.out.println("\t\t\t\t6. Close Application"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 to 6 : "+ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : DCstaff(); SubMenu();
                break;
            case 2 : DCwk(); SubMenu();
                break;
            case 3 : DCbat(); SubMenu();
                break;
            case 4 : DCbowl(); SubMenu();
                break;
            case 5 : DCall(); SubMenu();
                break;
            case 6: System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default : System.out.println("Invalid Choice!! Please enter a valid choice...");
        }
    }
    static void DCstaff()
    {
        System.out.println(ANSI_Black+"\t\t\t\tName                                          Role");
        System.out.println("\t\t\t\t------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1.  Kiran Kumar Grandhi (GMR Group)           Owner");
        System.out.println("\t\t\t\t2.  Parth Jindal (JSW Group)                  Owner");
        System.out.println("\t\t\t\t3.  Vinod Bisht                               CEO");
        System.out.println("\t\t\t\t4.  Siddharth Bhasin                          Team manager");
        System.out.println("\t\t\t\t5.  Shreyas Iyer                              Captain");
        System.out.println("\t\t\t\t6.  Ricky Ponting                             Head coach");
        System.out.println("\t\t\t\t7.  Pravin Amre                               Batting coach");
        System.out.println("\t\t\t\t8.  James Hopes                               Fast bowling coach");
        System.out.println("\t\t\t\t9.  Mohammad Kaif                             Fielding coach");
        System.out.println("\t\t\t\t10. Ajay Ratra                                Wicket-keeping coach");
        System.out.println("\t\t\t\t11. Patrick Farhart                           Physiotherapist");
        System.out.println("\t\t\t\t12. Rajinikanth Sivagnanam                    Strength and conditioning coach");
        System.out.println("\t\t\t\t13. Sriram Somayajula                         Analyst");
        System.out.println("\t\t\t\t14. Dr. Rizwan Khan                           Team doctor");
        System.out.println("\t\t\t\t******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void DCwk()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Rishabh Pant                            Left-handed batsman");
        System.out.println("\t\t\t\t2. Sam Billings                            Right-handed batsman");
        System.out.println("\t\t\t\t3. Vishnu Vinod                            Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void DCbat()
    {
        System.out.println("\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Shreyas Iyer                            Right-handed batsman");
        System.out.println("\t\t\t\t2. Shikhar Dhawan                          Left-handed batsman");
        System.out.println("\t\t\t\t3. Prithvi Shaw                            Right-handed batsman");
        System.out.println("\t\t\t\t4. Ajinkya Rahane                          Right-handed batsman");
        System.out.println("\t\t\t\t5. Steven Smith                            Right-handed batsman");
        System.out.println("\t\t\t\t6. Shimron Hetmyer                         Left-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }
    static void DCbowl()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Bowling Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Kagiso Rabada                           Right-arm fast");
        System.out.println("\t\t\t\t2. Anrich Nortje                           Right-arm fast");
        System.out.println("\t\t\t\t3. Avesh Khan                              Right-arm fast");
        System.out.println("\t\t\t\t4. Ishant Sharma                           Right-arm fast-medium");
        System.out.println("\t\t\t\t5. Umesh Yadav                             Right-Arm Fast");
        System.out.println("\t\t\t\t6. Amit Mishra                             Right-arm leg break");
        System.out.println("\t\t\t\t7. Praveen Dubey                           Right-arm leg break");
        System.out.println("\t\t\t\t8. Lukman Meriwala                         Left-arm fast-medium");
        System.out.println("\t\t\t\t9. Manimaran Siddharth                     Left-arm orthodox");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void DCall()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                Batting Style                Bowling Style");
        System.out.println("\t\t\t\t-------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Axar Patel              Left-handed batsman          Slow left-arm orthodox");
        System.out.println("\t\t\t\t2. Ravichandran Ashwin     Right-handed batsman         Right-arm off break");
        System.out.println("\t\t\t\t3. Lalit Yadav             Right-handed batsman         Right-arm off break");
        System.out.println("\t\t\t\t4. Marcus Stoinis          Right-handed batsman         Right-arm medium");
        System.out.println("\t\t\t\t5. Chris Woakes            Right-handed batsman         Right-arm fast-medium");
        System.out.println("\t\t\t\t6. Tom Curran              Right-handed batsman         Right-arm fast-medium");
        System.out.println("\t\t\t\t7. Ripal Patel             Right-handed batsman         Right-arm medium fast");
        System.out.println("\t\t\t\t*******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void PBKS()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Support Staff");
        System.out.println("\t\t\t\t2. Wicket-Keepers");
        System.out.println("\t\t\t\t3. Batsmen");
        System.out.println("\t\t\t\t4. Bowlers");
        System.out.println("\t\t\t\t5. All-Rounders");
        System.out.println("\t\t\t\t6. Close Application"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 to 6 : "+ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : PBKSstaff(); SubMenu();
                break;
            case 2 : PBKSwk(); SubMenu();
                break;
            case 3 : PBKSbat(); SubMenu();
                break;
            case 4 : PBKSbowl(); SubMenu();
                break;
            case 5 : PBKSall(); SubMenu();
                break;
            case 6: System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default : System.out.println("Invalid Choice!! Please enter a valid choice...");
        }
    }
    static void PBKSstaff()
    {
        System.out.println(ANSI_Black+"\t\t\t\tName                                          Role");
        System.out.println("\t\t\t\t------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1.  Mohit Burman                              Owner");
        System.out.println("\t\t\t\t2.  Ness Wadia                                Owner");
        System.out.println("\t\t\t\t3.  Preity Zinta                              Owner");
        System.out.println("\t\t\t\t4.  Karan Paul                                Owner");
        System.out.println("\t\t\t\t5.  Satish Menon                              CEO");
        System.out.println("\t\t\t\t6.  Avinash Vaidya                            Team manager");
        System.out.println("\t\t\t\t7.  Priety Zinta                              Brand ambassador");
        System.out.println("\t\t\t\t8.  Anil Kumble                               Director of cricket operations");
        System.out.println("\t\t\t\t9.  KL Rahul                                  Captain");
        System.out.println("\t\t\t\t10. Anil Kumble                               Head coach");
        System.out.println("\t\t\t\t11. Andy Flower                               Asst. coach");
        System.out.println("\t\t\t\t12. Chris Gayle                               Mentor");
        System.out.println("\t\t\t\t13. Wasim Jaffer                              Batting coach");
        System.out.println("\t\t\t\t14. Damien Wright                             Bowling coach");
        System.out.println("\t\t\t\t15. Jonty Rhodes                              Fielding coach");
        System.out.println("\t\t\t\t16. Andrew Leipus                             Physiotherapist");
        System.out.println("\t\t\t\t******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void PBKSwk()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. KL Rahul                                Right-handed batsman");
        System.out.println("\t\t\t\t2. Nicholas Pooran                         Left-handed batsman");
        System.out.println("\t\t\t\t3. Prabhsimran Singh                       Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void PBKSbat()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Mayank Agarwal                          Right-handed batsman");
        System.out.println("\t\t\t\t2. Chris Gayle                             Left-handed batsman");
        System.out.println("\t\t\t\t3. Dawid Malan                             Left-handed batsman");
        System.out.println("\t\t\t\t4. Mandeep Singh                           Right-handed batsman");
        System.out.println("\t\t\t\t5. Sarfaraz Khan                           Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_RESET);
    }
    static void PBKSbowl()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Bowling Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Mohammed Shami                          Right-arm fast");
        System.out.println("\t\t\t\t2. Arshdeep Singh                          Left-arm medium-fast");
        System.out.println("\t\t\t\t3. Chris Jordan                            Right-arm fast-medium");
        System.out.println("\t\t\t\t4. Ravi Bishnoi                            Right-arm leg break");
        System.out.println("\t\t\t\t5. Murugan Ashwin                          Right-arm leg break");
        System.out.println("\t\t\t\t6. Riley Meredith                          Right-arm fast");
        System.out.println("\t\t\t\t7. Ishan Porel                             Right-arm fast-medium");
        System.out.println("\t\t\t\t8. Darshan Nalkande                        Right-arm fast-medium");
        System.out.println("\t\t\t\t9. Utkarsh Singh                           Right-arm off break");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void PBKSall()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                Batting Style                Bowling Style");
        System.out.println("\t\t\t\t-------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Deepak Hooda            Right-handed batsman         Right-arm off break");
        System.out.println("\t\t\t\t2. Harpreet Brar           Left-handed batsman          Slow left-arm orthodox");
        System.out.println("\t\t\t\t3. Shahrukh Khan           Right-handed batsman         Right-arm off break");
        System.out.println("\t\t\t\t4. Jhye Richardson         Right-handed batsman         Right-arm fast");
        System.out.println("\t\t\t\t5. Moises Henriques        Right-handed batsman         Right-arm fast-medium");
        System.out.println("\t\t\t\t6. Fabian Allen            Right-handed batsman         Slow left-arm orthodox");
        System.out.println("\t\t\t\t7. Jalaj Saxena            Right-handed batsman         Right arm off break");
        System.out.println("\t\t\t\t8. Saurabh Kumar           Left-handed batsman          Slow left-arm orthodox");
        System.out.println("\t\t\t\ts*******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void RR()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Support Staff");
        System.out.println("\t\t\t\t2. Wicket-Keepers");
        System.out.println("\t\t\t\t3. Batsmen");
        System.out.println("\t\t\t\t4. Bowlers");
        System.out.println("\t\t\t\t5. All-Rounders");
        System.out.println("\t\t\t\t6. Close Application"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 to 6 : "+ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : RRstaff(); SubMenu();
                break;
            case 2 : RRwk(); SubMenu();
                break;
            case 3 : RRbat(); SubMenu();
                break;
            case 4 : RRbowl(); SubMenu();
                break;
            case 5 : RRall(); SubMenu();
                break;
            case 6: System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default : System.out.println("Invalid Choice!! Please enter a valid choice...");
        }
    }
    static void RRstaff()
    {
        System.out.println(ANSI_Black+"\t\t\t\tName                                   Role");
        System.out.println("\t\t\t\t------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1.  L Bhavesh KV Thakkolam             Owner");
        System.out.println("\t\t\t\t2.  Amisha Hathiramani                 Owner");
        System.out.println("\t\t\t\t3.  Lachlan Murdoch                    Owner");
        System.out.println("\t\t\t\t4.  Raj Kundra                         Owner");
        System.out.println("\t\t\t\t5.  Mike Fordham                       CEO");
        System.out.println("\t\t\t\t6.  Jake Lush McCrum                   COO");
        System.out.println("\t\t\t\t7.  Romi Bhinder                       Team manager");
        System.out.println("\t\t\t\t8.  Shane Warne                        Brand ambassador");
        System.out.println("\t\t\t\t9.  Kumar Sangakkara                   Director of cricket operations");
        System.out.println("\t\t\t\t10. Sanju Samson                       Captain");
        System.out.println("\t\t\t\t11. Zubin Bharucha                     Development and performance director");
        System.out.println("\t\t\t\t12. Trevor Penney                      Asst. coach");
        System.out.println("\t\t\t\t13. Shane Warne                        Mentor");
        System.out.println("\t\t\t\t14. Amol Mazumdar                      Batting coach");
        System.out.println("\t\t\t\t15. Sairaj Bahutule                    Spin bowling coach");
        System.out.println("\t\t\t\t16. Ish Sodhi                          Team Liaison and spin bowling consultant");
        System.out.println("\t\t\t\t17. Rob Cassell                        Fast bowling coach");
        System.out.println("\t\t\t\t18. Steffan Jones                      Fast bowling development coach");
        System.out.println("\t\t\t\t19. Dishant Yagnik                     Fielding coach");
        System.out.println("\t\t\t\t20. John Gloster                       Physiotherapist");
        System.out.println("\t\t\t\t******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void RRwk()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Sanju Samson                            Right-handed batsman");
        System.out.println("\t\t\t\t2. Jos Buttler                             Right-handed batsman");
        System.out.println("\t\t\t\t3. Anuj Rawat                              Left-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void RRbat()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Yashasvi Jaiswal                        Left-handed batsman");
        System.out.println("\t\t\t\t2. David Miller                            Left-handed batsman");
        System.out.println("\t\t\t\t3. Riyan Parag                             Right-handed batsman");
        System.out.println("\t\t\t\t4. Manan Vohra                             Right-handed batsman");
        System.out.println("\t\t\t\t5. Liam Livingstone                        Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void RRbowl()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                 Bowling Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1.  Jofra Archer                            Right-arm fast");
        System.out.println("\t\t\t\t2.  Jaydev Unadkat                          Left-arm medium");
        System.out.println("\t\t\t\t3.  Chetan Sakariya                         Left-arm medium-fast");
        System.out.println("\t\t\t\t4.  Mustafizur Rahman                       Left-arm fast-medium");
        System.out.println("\t\t\t\t5.  Andrew Tye                              Right-arm medium-fast");
        System.out.println("\t\t\t\t6.  Mayank Markande                         Right-arm leg break");
        System.out.println("\t\t\t\t7.  Kartik Tyagi                            Right-arm fast");
        System.out.println("\t\t\t\t8.  KC Cariappa                             Right-arm legbreak");
        System.out.println("\t\t\t\t9.  Akash Singh                             Left-arm medium-fast");
        System.out.println("\t\t\t\t10. Kuldip Yadav                            Left-arm medium-fast");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void RRall()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                Batting Style                Bowling Style");
        System.out.println("\t\t\t\t-------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Ben Stokes              Left-handed batsman          Right-arm fast-medium");
        System.out.println("\t\t\t\t2. Chris Morris            Right-handed batsman         Right arm fast-medium");
        System.out.println("\t\t\t\t3. Rahul Tewatia           Left-handed batsman          Right Arm Leg break");
        System.out.println("\t\t\t\t4. Shivam Dube             Left-handed batsman          Right-arm medium-fast");
        System.out.println("\t\t\t\t5. Shreyas Gopal           Right-handed batsman         Right-arm legbreak");
        System.out.println("\t\t\t\t6. Mahipal Lomror          Left-handed batsman          Slow left-arm orthodox");
        System.out.println("\t\t\t\t*******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }

    static void SRH()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Support Staff");
        System.out.println("\t\t\t\t2. Wicket-Keepers");
        System.out.println("\t\t\t\t3. Batsmen");
        System.out.println("\t\t\t\t4. Bowlers");
        System.out.println("\t\t\t\t5. All-Rounders");
        System.out.println("\t\t\t\t6. Close Application"+ANSI_RESET);
        System.out.print("\nEnter any choice between 1 to 6 : ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : SRHstaff(); SubMenu();
                break;
            case 2 : SRHwk(); SubMenu();
                break;
            case 3 : SRHbat(); SubMenu();
                break;
            case 4 : SRHbowl(); SubMenu();
                break;
            case 5 : SRHall(); SubMenu();
                break;
            case 6: System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default : System.out.println("Invalid Choice!! Please enter a valid choice...");
        }
    }
    static void SRHstaff()
    {
        System.out.println(ANSI_Black+"\t\t\t\tName                                   Role");
        System.out.println("\t\t\t\t------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1.  Kalanithi Maran                    Owner");
        System.out.println("\t\t\t\t2.  Kaviya Maran                       CEO");
        System.out.println("\t\t\t\t3.  Srinath Bhashyam                   General Manager and Auction strategist");
        System.out.println("\t\t\t\t4.  Tom Moody                          Director of cricket operations");
        System.out.println("\t\t\t\t5.  David Warner                       Captain");
        System.out.println("\t\t\t\t6.  Trevor Bayliss                     Head coach");
        System.out.println("\t\t\t\t7.  Brad Haddin                        Asst. coach");
        System.out.println("\t\t\t\t8.  V. V. S. Laxman                    Batting coach");
        System.out.println("\t\t\t\t9.  Muttiah Muralitharan               Bowling coach");
        System.out.println("\t\t\t\t10. Biju George                        Fielding coach");
        System.out.println("\t\t\t\t11. Theo Kapakoulakis                  Physiotherapist");
        System.out.println("\t\t\t\t12. Mario Villavarayan                 Physical trainer");
        System.out.println("\t\t\t\t13. Shrinivas Chandrasekaran           Performance and Video Analyst");
        System.out.println("\t\t\t\t******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void SRHwk()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Jonny Bairstow                          Right-handed batsman");
        System.out.println("\t\t\t\t2. Wriddhiman Saha                         Right-handed batsman");
        System.out.println("\t\t\t\t3. Shreevats Goswami                       Left-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void SRHbat()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. David Warner                            Left-handed batsman");
        System.out.println("\t\t\t\t2. Kane Williamson                         Right-handed batsman");
        System.out.println("\t\t\t\t3. Manish Pandey                           Right-handed batsman");
        System.out.println("\t\t\t\t4. Abdul Samad                             Right-handed batsman");
        System.out.println("\t\t\t\t5. Priyam Garg                             Right-handed batsman");
        System.out.println("\t\t\t\t6. Virat Singh                             Left-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void SRHbowl()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                 Bowling Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1.  Bhuvneshwar Kumar                       Right-arm fast-medium");
        System.out.println("\t\t\t\t2.  Thangarasu Natarajan                    Left-arm medium");
        System.out.println("\t\t\t\t3.  Rashid Khan                             Right-arm legbreak");
        System.out.println("\t\t\t\t4.  Khaleel Ahmed                           Left-arm fast-medium");
        System.out.println("\t\t\t\t5.  Siddarth Kaul                           Right-arm fast-medium");
        System.out.println("\t\t\t\t6.  Sandeep Sharma                          Right-arm fast-medium");
        System.out.println("\t\t\t\t7.  Basil Thampi                            Right-arm fast-medium");
        System.out.println("\t\t\t\t8.  Jagadeesha Suchith                      Left-arm orthodox");
        System.out.println("\t\t\t\t9.  Shahbaz Nadeem                          Left-arm orthodox");
        System.out.println("\t\t\t\t10. Mujeeb Ur Rahman                        Right-arm off break");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void SRHall()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                Batting Style                Bowling Style");
        System.out.println("\t\t\t\t-------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Vijay Shankar           Right-handed batsman         Right-arm medium");
        System.out.println("\t\t\t\t2. Jason Holder            Right-handed batsman         Right arm fast-medium");
        System.out.println("\t\t\t\t3. Mitchell Marsh          Right-handed batsman         Right arm fast-medium");
        System.out.println("\t\t\t\t4. Mohammad Nabi           Right-handed batsman         Right-arm off break");
        System.out.println("\t\t\t\t5. Kedar Jadhav            Right-handed batsman         Right-arm off break");
        System.out.println("\t\t\t\t6. Abhishek Sharma         Left-handed batsman          Left-arm orthodox");
        System.out.println("\t\t\t\t*******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void KKR()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Support Staff");
        System.out.println("\t\t\t\t2. Wicket-Keepers");
        System.out.println("\t\t\t\t3. Batsmen");
        System.out.println("\t\t\t\t4. Bowlers");
        System.out.println("\t\t\t\t5. All-Rounders");
        System.out.println("\t\t\t\t6. Close Application"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 to 6 : "+ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : KKRstaff(); SubMenu();
                break;
            case 2 : KKRwk(); SubMenu();
                break;
            case 3 : KKRbat(); SubMenu();
                break;
            case 4 : KKRbowl(); SubMenu();
                break;
            case 5 : KKRall(); SubMenu();
                break;
            case 6: System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default : System.out.println("Invalid Choice!! Please enter a valid choice...");
        }
    }
    static void KKRstaff()
    {
        System.out.println(ANSI_Black+"Name                                          Role");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1.  Shah Rukh Khan (Red Chillies Entmt.)      Owner");
        System.out.println("\t\t\t\t2.  Jay Mehta (Mehta Group)                   Owner");
        System.out.println("\t\t\t\t3.  Juhi Chawla (Mehta Group)                 Owner");
        System.out.println("\t\t\t\t4.  Venky Mysore                              CEO and Managing Director");
        System.out.println("\t\t\t\t5.  Wayne Bentley                             Team manager");
        System.out.println("\t\t\t\t6.  Eoin Morgan                               Captain");
        System.out.println("\t\t\t\t7.  Brendon McCullum                          Head coach");
        System.out.println("\t\t\t\t8.  Abhishek Nayar                            Asst. coach");
        System.out.println("\t\t\t\t9.  David Hussey                              Mentor");
        System.out.println("\t\t\t\t10. Kyle Mills                                Bowling coach");
        System.out.println("\t\t\t\t11. Omkar Salvi                               Asst. bowling coach");
        System.out.println("\t\t\t\t12. James Foster                              Fielding coach");
        System.out.println("\t\t\t\t13. Kamlesh Jain                              Physiotherapist");
        System.out.println("\t\t\t\t14. Chris Donaldson                           Strength and Conditioning coach");
        System.out.println("\t\t\t\t15. AR Srikanth                               Performance Analyst");
        System.out.println("\t\t\t\t16. Nathan Leamon                             Strategic consultant");
        System.out.println("\t\t\t\t******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void KKRwk()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Dinesh Karthik                          Right-handed batsman");
        System.out.println("\t\t\t\t2. Tim Seifert                             Right-handed batsman");
        System.out.println("\t\t\t\t3. Sheldon Jackson                         Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void KKRbat()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Battting Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Eoin Morgan                             Left-handed batsman");
        System.out.println("\t\t\t\t2. Shubman Gill                            Right-handed batsman");
        System.out.println("\t\t\t\t3. Rahul Tripathi                          Right-handed batsman");
        System.out.println("\t\t\t\t4. Nitish Rana                             Left-handed batsman");
        System.out.println("\t\t\t\t5. Rinku Singh                             Left-handed batsman");
        System.out.println("\t\t\t\t6. Karun Nair                              Right-handed batsman");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void KKRbowl()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                                Bowling Style");
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Pat Cummins                             Right-arm fast");
        System.out.println("\t\t\t\t2. Lockie Ferguson                         Right-arm fast");
        System.out.println("\t\t\t\t3. Prasidh Krishna                         Right-arm medium");
        System.out.println("\t\t\t\t4. Kamlesh Nagarkoti                       Right-arm fast");
        System.out.println("\t\t\t\t5. Kuldeep Yadav                           Left-arm chinaman");
        System.out.println("\t\t\t\t6. Sandeep Warrier                         Right-arm medium");
        System.out.println("\t\t\t\t7. Varun Chakravarthy                      Right-arm legbreak");
        System.out.println("\t\t\t\t8. Harbhajan Singh                         Right-arm off break");
        System.out.println("\t\t\t\t9. Vaibhav Arora                           Right arm medium-fast");
        System.out.println("\t\t\t\t**********************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void KKRall()
    {
        System.out.println(ANSI_Black+"\t\t\t\tPlayer Name                Batting Style                Bowling Style");
        System.out.println("\t\t\t\t-------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t1. Andre Russell           Right-handed batsman         Right-arm fast");
        System.out.println("\t\t\t\t2. Sunil Narine            Left-handed batsman          Right-arm offbreak");
        System.out.println("\t\t\t\t3. Shakib Al Hasan         Left-handed batsman          Left-arm orthodox");
        System.out.println("\t\t\t\t4. Ben Cutting             Right-handed batsman         Right-arm fast-medium");
        System.out.println("\t\t\t\t5. Pawan Negi              Left-handed batsman          Slow left-arm orthodox");
        System.out.println("\t\t\t\t6. Shivam Mavi             Right-handed batsman         Right-arm fast-medium");
        System.out.println("\t\t\t\t7. Venkatesh Iyer          Left-handed batsman          Right-arm medium");
        System.out.println("\t\t\t\t*******************************************************************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ANSI_reset);
    }
    static void MainMenu()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Mumbai Indians(MI)");
        System.out.println("\t\t\t\t2. Chennai Super Kings(CSK)");
        System.out.println("\t\t\t\t3. Royal Challengers Banglore(RCB)");
        System.out.println("\t\t\t\t4. Delhi Capitals(DC)");
        System.out.println("\t\t\t\t5. Punjab Kings(PBKS)");
        System.out.println("\t\t\t\t6. Rajasthan Royals(RR)");
        System.out.println("\t\t\t\t7. Sunrisers Hyderabad(SRH)");
        System.out.println("\t\t\t\t8. Kolkata Knight Riders(KKR)");
        System.out.println("\t\t\t\t9. Root Menu");
        System.out.println("\t\t\t\t0. Close Application"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 0 to 9 : "+ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1 : while(true)
            {
                MI();
            }
            case 2 : while(true)
            {
                CSK();
            }
            case 3 : while(true)
            {
                RCB();
            }
            case 4 : while(true)
            {
                DC();
            }
            case 5 : while(true)
            {
                PBKS();
            }
            case 6 : while(true)
            {
                RR();
            }
            case 7 : while(true)
            {
                SRH();
            }
            case 8 : while(true)
            {
                KKR();
            }
            case 9 : while(true)
            {
                ROOT_MANU();
            }
            case 0: System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default : System.out.println("Invalid Choice!! Please enter a valid choice..."); MainMenu();
        }
    }
    // Tejasya CODE


    public static void std_mn()
    {
        System.out.println(ANSI_PURPLE +"\t\t\t\tStadium Name                          "+ ANSI_RESET);
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println(ANSI_BLUE +"\t\t\t\t1. IS Bindra Stadium (Kings XI Punjab)                                ");
        System.out.println("\t\t\t\t2. Eden Gardens (Kolkata Knight Riders)                               ");
        System.out.println("\t\t\t\t3. Wankhede Stadium (Mumbai Indians)                                  ");
        System.out.println("\t\t\t\t4. Sawai Mansingh Stadium (Rajasthan Royals)                          ");
        System.out.println("\t\t\t\t5. M. Chinnaswamy Stadium (Royal Challengers Bangalore)               ");
        System.out.println("\t\t\t\t6. Feroz Shah Kotla (Delhi Capitals)                                  ");
        System.out.println("\t\t\t\t7. Rajiv Gandhi International Cricket Stadium (Sunrisers Hyderabad)s  ");
        System.out.println("\t\t\t\t8. M. A. Chidambaram Stadium (Chennai Super Kings)                     "+ANSI_RESET);
        System.out.println(ANSI_RED+"\t\t\t\t   Press 9 To go to Root Menu"+ANSI_RESET);
        System.out.println(ANSI_RED+"\t\t\t\t   Press 0 To Exit The Program"+ANSI_RESET);
        System.out.println("\t\t\t\t************************");
        System.out.print(ANSI_YELLOW +"\nEnter any choice between 0 to 9 : "+ANSI_RESET);
        Scanner all = new Scanner(System.in);
        int all_std = all.nextInt();
        switch (all_std)
        {
            case 1 : while(true)
            {
                pbks_std();
            }
            case 2 : while(true)
            {
                kkr_std();
            }
            case 3 : while(true)
            {
                mi_std();
            }
            case 4 : while(true)
            {
                rr_std();
            }
            case 5 : while(true)
            {
                rcb_std();
            }
            case 6 : while(true)
            {
                dc_std();
            }
            case 7 : while(true)
            {
                srh_std();
            }
            case 8 : while(true)
            {
                csk_std();
            }
            case 9 : ROOT_MANU();
            break;
            case 0 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
        }

    }


    static void mi_std() {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Home Team");
        System.out.println("\t\t\t\t2. Matches");
        System.out.println("\t\t\t\t3. About Stadium");
        System.out.println("\t\t\t\t4. Root Menu");
        System.out.println("\t\t\t\t5. Change Stadium");
        System.out.println("\t\t\t\t0. Exit"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 0 to 5 : "+ANSI_RESET);
        Scanner mi = new Scanner(System.in);
        int mum = mi.nextInt();
        switch (mum) {
            case 1:
                MIteam();
                System.out.println(ANSI_BLUE+"\n1. Team Details");
                System.out.println("2. Return Home"+ANSI_RESET);
                System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 & 2 : "+ANSI_RESET);

                Scanner td = new Scanner(System.in);
                int td_mi = td.nextInt();
                switch (td_mi) {
                    // Kevla nu link karvanu che

                    case 1:
                        MI();
                        break;
                    case 2:
                        mi_std();
                        break;
                    default: System.out.println("Invalid Choice!! Please enter a valid choice...");

                }
                break;
            case 2:
                MI_matches();
                break;
            case 3:
                MI_std();
                break;
            case 4:
                ROOT_MANU();
                break;
            case 5:
                std_mn();
                break;
            case 0 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default: System.out.println("Invalid Choice!! Please enter a valid choice..."); mi_std();
        }

    }

    static void MIteam() {
        System.out.println(ANSI_Black+"\n1. Mumbai Indians is one of the ten teams which plays in the Indian Premier League. The team was found in 2008 and is owned by Reliance Industries. Rohit Sharma is the current captain of the team while Robin Singh is the head coach. Assisting Robin in coaching are Jonty Rodhes (Fielding Coach) and Shaun Pollock (Bowling Coach)." +
                "Reliance Industries purchased the rights of MI (Abbreviation of Mumbai Indians) for a total of Rupees 441 Cr ($ 112.9 m) during the auction on 24 January 2008. As the name suggests, the franchise represents the city of Mumbai." +
                "2008 Season\n" +
                "MI lost their Team Captain & Icon Player, Sachin Tendulkar due to a Hamstring Injury. Harbhajan Singh replaced him as the captain of the side. Due to some issues, Shaun Pollock had to takeover which bought some stability into the side for the first time in the season. The Mumbai Indians finished with a total of 7 wins and 7 losses and thus missed out on a playoff spot by a few points.\n" +
                "\n" +
                "2009 Season\n" +
                "Due to issues in India, the second edition of IPL ha to be held in South Africa. The second season also proved to be a setback for the team as they finished with a total of 5 Wins, 8 Loses and 1 No Result (Match got cancelled due to rain); and thus not making it to the playoffs again.\n" +
                "\n" +
                "2010 Season\n" +
                "During the auction held for the 2010 IPL Season, Mumbai Indians purchased Kieron Pollard for $750,000. This proved to be a great boost for the team. After the group stages, Mumbai Indians won 10 out of their 14 matches thus qualifying them for the playoffs. In the semifinals against Royal Challengers Bangalore, Mumbai Indians emerged victorious by 35 runs.\n" +
                "\n" +
                "The Indians then faced Chennai Super Kings in the final of the 2010 Season; the match was held in Navi Mumbai. MI lost the match by 22 runs thus finishing as the runner-ups.\n" +
                "\n" +
                "They completed the season with a total of 11 Wins and 5 loses and also got a spot in the Airtel Champions League T20. Captain Sachin Tendulkar scored 681 runs in the 2010 season.\n" +
                "\n" +
                "2016 Season\n" +
                "Mumbai Indians introduce two new players to their squad, Aiden Blizzard and James Franklin. Both these players perform well for the team in their debut season. Team Captain Sachin Tendulkar put up an impressive performance by scoring 613 runs in 10 matches and at the same time, team's senior bowler, Lasith Malinga took 28 wickets out of the 15 games. Impressive performance by MI in the group stages got them a place in the playoffs. Due to the addition of 2 more teams from this edition of Indian Premier League, the playoffs were a bit different.\n" +
                "\n" +
                "Mumbai Indians beat Kolkata Knight Riders in their eliminator by 4 wickets. MI went on to face Royal Challengers Bangalore in the Qualifier 2. Mumbai Indians lost to Royal Challengers Bangalore by 43 runs which ended the journey of Mumbai Indians in the 2011 Season. Defending Champions Chennai beat Bangalore in the finals thus getting the first spot. Royal Challengers Bangalore finished second while MI finished third.\n" +
                "\n" +
                "Tendulkar scored an unbeaten ton against Kochi Tuskers Kerala of just 59 balls and was the only centurion from Mumbai Indians that season."+ANSI_reset);

    }

    static void MI_matches() {
        System.out.println(ANSI_CYAN+"MI_vs_CSK");
        System.out.println("MI_vs_DC");
        System.out.println("MI_vs_PBKS");
        System.out.println("MI_vs_KKR ");
        System.out.println("MI_vs_RR");
        System.out.println("MI_vs_RCB");
        System.out.println("MI_vs_SRH"+ANSI_RESET);
    }

    static void MI_std() {
        System.out.println(ANSI_Black+"The Wankhede Stadium (Marathi: वानखेडे स्टेडियम) is an international cricket stadium in Mumbai, India. The stadium now has a capacity of 33,108, following renovations for the 2011 Cricket World Cup. Before the upgrade, the capacity was approximately 45,000.[2]\n" +
                "\n" +
                "The stadium has been host to numerous high-profile cricket matches in the past, most notably the 2011 Cricket World Cup Final, in which India defeated Sri Lanka and became the first country to win the cricket world cup on home soil. The stadium played host to the last match of Sachin Tendulkar's international career. Additionally, it hosted many matches during the 1996 and 2011 Cricket World Cups. The stadium also played host to the match in which Ravi Shastri hit six sixes in an over. As of 14 January 2020, it has hosted 25 Tests, 21 ODIs and 7 T20Is." +
                "The Wankhede Stadium was built in 1975 and the first Test match played was between India and West Indies from 23 to 28 January 1975. The Stadium was built at a time when only Test Matches were played and with the advent of One Day Cricket and Twenty 20 Cricket, the demands of a Stadium from a spectator's point of view have totally changed.\n" +
                "\n" +
                "Since ICC World Cup Cricket 2011 was to be hosted by India, Bangladesh and Sri Lanka, and Mumbai was selected to host the final, it was decided to redevelop the Wankhede Stadium to suit the modern facilities and comfort of spectators.\n" +
                "\n" +
                "The Managing Committee invited presentations from reputed Architects and shortlisted M/s. P.K. Das & Associates and M/s. Shashi Prabhu & Associates to jointly draw up a project for the redevelopment of the Wankhede Stadium. While redeveloping the Stadium, major changes were at the North end and the South end with better facilities to the spectators in terms of bucket seating, a large number of toilets and food courts.\n" +
                "\n" +
                "While MCA undertook the redevelopment of Wankhede Stadium, the ground was not available for domestic and international cricket till February 2011. In order to ensure that MCA did not miss out on the turn of Test and ODI matches and also to develop a healthy working relationship with the Cricket Club of India.\n" +
                "\n" +
                "One of the highlights of the stadium is the suspended cantilever roofs. The Teflon fabric roof is lighter in weight and heat resistant. There is no beam support for the roof to ensure that the spectators will have a better view. On the roof, there are exhaust fans which suck the hot air from the stands and allow the breeze from the West to flow in. The stadium has 20 elevators for North and South stands." +
                "Ground facts and figures\n" +
                "Capacity: 33,108\n" +
                "Floodlights: Yes\n" +
                "The WS is the home ground of Mumbai Indians team in Indian Premier League, as well as Mumbai's Ranji Trophy team.\n" +
                "The ground is situated near Marine Lines in Mumbai."+ANSI_reset);
    }

    static void CSKteam() {
        System.out.println("The Chennai Super Kings (abbreviated as CSK) is a franchise cricket team standing for Chennai, Tamil Nadu (India), playing in the Indian Premier League (IPL).[1] Founded in 2008, the team played its home matches at the M. A. Chidambaram Stadium in Chennai. On 14 July 2015, the Supreme Court appointed RM Lodha committee suspended the Super Kings from the IPL for a period of two years for the alleged involvement of their owners in the 2013 Indian Premier League betting case.Prior to the suspension, the team was captained by Mahendra Singh Dhoni and coached by Stephen Fleming.It has most fans in instagram around 6.4million follwers\n" +
                "\n" +
                "The Super Kings had won the title thrice in succession (2010, 2011and 2018).In 2010, they won the Champions League Twenty20 for the first time and repeated the feat in 2014. The leading run-scorer of the team is Suresh Raina, while the leading wicket-taker is Ravichandran Ashwin.CSK has most records of appearance in playoffs (10) and finals(8) The team has one of the strongest fan base in india" +
                "Franchise History\n" +
                "In September 2007, the Board of Control for Cricket in India (BCCI) announced the establishment of the Indian Premier League, a Twenty20 competition to be started in 2008.In January 2008, the BCCI unveiled the owners of eight city-based franchises. The Chennai franchise was sold to the India Cements for $91 million, making it the fourth most expensive team in the league behind Mumbai, Bangalore and Hyderabad.India Cements acquired the rights to the franchise for 10 years." +
                "IPL Winner 2018: Chennai Super Kings\n" +
                "Chennai Super Kings become the second team to win more than two trophies of IPL. Veterans Ambati Rayadu and Shane Watson were the backbones of the batting unit. Dhoni, as usual, provided best finishes in most of the games. CSK’s bowling unit was lucky to get inputs from MS Dhoni, the captain and Dwanye Bravo, who led the bowling attack for CSK." +
                "IPL Winner 2011: Chennai Super Kings\n" +
                "Channai Super Kings become the first team of IPL to win back to back finals in the history. The defending champions held the title against the batting titans of the tournament RCB. CSK’s batting unit was lit up by the presence of Mr Cricket, Michael Hussey, who played some important innings throughout the tournament. Hussey and Murali Vijay’s 159 run opening partnership against the Royal Challengers Bangalore was the main reason for CSK defending the title.\n" +
                "\n" +
                "IPL Winner 2010: Chennai Super Kings\n" +
                "MS Dhoni finally lifted the trophy after missing it in the inaugural edition. With the likes of Suresh Raina, Mathew Hayden, Albie Morkel, Muralitharan and Dhoni himself, army were the strong contenders for the title right from the start of the tournament. Suresh Raina was absolutely brilliant with the bat throughout the tournament serving as the backbone of the team’s batting line up. It was his knock of 57 not out from 35 that lit up CSK’s road to glory in its final against Sachin Tendulkar led Mumbai Indians." +
                "");
    }

    static void CSK_matches()
    {
        System.out.println(ANSI_CYAN+"CSK vs MI ");
        System.out.println("CSK vs DC ");
        System.out.println("CSK vs RCB ");
        System.out.println("CSK vs RR ");
        System.out.println("CSK vs KKR ");
        System.out.println("CSK vs PBKS ");
        System.out.println("CSK vs SRH "+ANSI_RESET);
    }

    static void CSK_std() {
        System.out.println(ANSI_Black+"M. A. Chidambaram Stadium is a cricket stadium in Chennai, Tamil Nadu, India.[3] Established in 1916, it is the second oldest cricket stadium in the country after Eden Gardens in Kolkata. Formerly known as Madras Cricket Club Ground, the stadium is named after M. A. Chidambaram Chettiar, former President of BCCI & Head of TNCA. It is also nicknamed as Chepauk Stadium. It is the home ground of the Tamil Nadu cricket team and the Indian Premier League team Chennai Super Kings. Chepauk hosted its first Test match on 10 February 1934, the first Ranji Trophy match in 1936 and the Indian cricket team's first test victory in 1952 against England. The 1986 India-Australia match held at Chepauk was only the second ever Tied Test in the history of the game." +
                "History\n" +
                "In 1859, Madras Presidency acquired Chepauk palace in an auction for Rs 589,000.[6][7] In 1865, the government gave permission to build a pavilion at the palace grounds to Madras Cricket Club. The pavilion was finished in 1866. The pavilion was reconstructed in 1892[8] and was utilized till 1982 when it was demolished as part of the stadium renovation.[7]\n" +
                "\n" +
                "Chepauk Stadium was established in 1916 and has been the home venue of the Tamil Nadu cricket team ever since.[9] It is the second oldest cricket stadium in the country after Eden Gardens in Kolkata, still holding all international cricket matches. Bombay Gymkhana being the first is not in use for international cricket.\n" +
                "\n" +
                "From 1960 to 1988, Chennai hosted a test match in second week of January and was termed the Pongal Test as the match coincided with the Pongal harvest festival" +
                "Crowd\n" +
                "The Chepauk crowd is known to be amongst the most appreciative in the country.[12] The crowd gave a standing ovation to Saeed Anwar after scoring the highest ever ODI score of 194 against India in 1997. The crowd was again appreciative when Pakistan won a Test match in 1999 and the Pakistani team made a lap of honour in appreciation of the spectators' sporting behaviour." +
                "Renovation\n" +
                "\n" +
                "Newly renovated stands with fabric tensile roofs\n" +
                "In June 2009, reconstruction work of the stadium was taken up at the cost of ₹175 crore (US$25 million).[13][14] The plan consisted of constructing three new reinforced concrete stands designated I, J, and K accommodating 12,000 spectators and 24 hospitality boxes under translucent PTFE membrane roofs.[15] Hopkins Architects, London and Nataraj & Venkat Architects, Chennai were contracted by the Tamil Nadu Cricket Association. "+ANSI_reset);
    }

    static void csk_std() {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Home Team");
        System.out.println("\t\t\t\t2. Matches");
        System.out.println("\t\t\t\t3. About Stadium");
        System.out.println("\t\t\t\t4. Root Menu");
        System.out.println("\t\t\t\t5. Change Stadium");
        System.out.println("\t\t\t\t0. Exit"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 0 to 5 : "+ANSI_RESET);
        Scanner csk = new Scanner(System.in);
        int che = csk.nextInt();
        switch (che) {
            case 1:
                CSKteam();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Team Details");
                System.out.println("\t\t\t\t2. Return To CSK MENU"+ANSI_RESET);
                System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 & 2 : "+ANSI_RESET);

                Scanner td2 = new Scanner(System.in);
                int td_csk = td2.nextInt();
                switch (td_csk) {
                    // Kevla nu link karvanu che

                    case 1:
                        CSK();
                        break;
                    case 2:
                        csk_std();
                        break;
                    default: System.out.println("Invalid Choice!! Please enter a valid choice...");

                }
                break;
            case 2:
                CSK_matches();
                break;
            case 3:
                CSK_std();
                break;
            case 4:
                ROOT_MANU();
                break;
            case 5:
                std_mn();
                break;
            case 0 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default: System.out.println("Invalid Choice!! Please enter a valid choice..."); csk_std();
        }

    }

    static void RCBteam() {
        System.out.println(ANSI_Black+"The Royal Challengers Bangalore (often abbreviated as RCB) are a franchise cricket team based in Bangalore, Karnataka, that plays in the Indian Premier League (IPL). It was founded in 2008 by United Spirits and named after the company's liquor brand Royal Challenge. Since its inception, the team has played its home matches at the M. Chinnaswamy Stadium.\n" +
                "\n" +
                "The Royal Challengers have never won the IPL but finished runners-up on three occasions between 2009 and 2016. Their lack of success over the years despite the presence of various notable players has earned them the tag of \"underachievers\".[2][3] The team holds the records of both the highest and the lowest totals in the IPL – 263/5 and 49 respectively." +
                "Franchise history\n" +
                "In September 2007, the Board of Control for Cricket in India (BCCI) announced the establishment of the Indian Premier League, a Twenty20 competition to be started in 2008.[4] The teams for the competition, representing 8 different cities of India, including Bangalore, were put up on auction in Mumbai on 20 February 2008. The Bangalore franchise was purchased by Vijay Mallya, who paid US$111.6 million for it. This was the second highest bid for a team, next only to Reliance Industries' bid of US$111.9 million for the Mumbai Indians.\n" +
                "\n" +
                "The brand value of Royal Challengers Bangalore was estimated to be ₹595 crore (US$83 million) in 2019, according to a survey conducted by Duff & Phelps" +
                "2013\n" +
                "RCB have another uneventful season as they finish in fifth place second consecutive time.\n" +
                "2014\n" +
                "In 2014 the team bought Albie Morkel, Mitchell Starc, Ravi Rampaul, Parthiv Patel, Ashok Dinda, Muttiah Muralitharan, Nic Maddinson, Harshal Patel, Varun Aaron, Vijay Zol and Yuvraj Singh.\n" +
                "The seventh IPL season saw RCB finishing in seventh place.\n" +
                "2015\n" +
                "In IPL 2015, RCB again had to face disappointment after playing so well as they finished 3rd.\n" +
                "2016\n" +
                "The 2016 edition was perhaps the most heartbreaking one for RCB.\n" +
                "RCB's captain, Virat Kohli has a dream IPL with four centuries in the season.\n" +
                "But yet again, the RCB squad and it's fans had to face despair as they finished runner-up.\n" +
                "2017\n" +
                "RCB finishes last at the 8th position.\n" +
                "2018\n" +
                "Another disappointing year as RCB finishes the season at the 6th place.\n" +
                "2019\n" +
                "RCB finished the season at the bottom of the table at 8th place.\n" +
                "2020\n" +
                "RCB qualified for the Playoffs as they finished 4th in the league stage. However, they were knocked out in the Eliminator by Sunrisers Hyderabad.\n" +
                "2021\n" +
                "RCB have added veteran superstars like Glenn Maxwell, Dan Christian and the young Kyle Jamieson from New Zealand to their squad for IPL 2021."+ANSI_reset);
    }

    static void RCB_matches() {
        System.out.println(ANSI_CYAN+"RCB vs MI ");
        System.out.println("RCB vs CSK ");
        System.out.println("RCB vs SRH ");
        System.out.println("RCB vs DC ");
        System.out.println("RCB vs KKR ");
        System.out.println("RCB vs PBKS ");
        System.out.println("RCB vs RR "+ANSI_RESET);
    }

    static void RCB_std() {
        System.out.println(ANSI_Black+"The M. Chinnaswamy Stadium ( formerly known as the Karnataka State Cricket Association Stadium) is a cricket stadium located in Bangalore, Karnataka. Flanked by the picturesque Cubbon Park, Queen's Road, Cubbon and uptown MG Road, this five-decade-old stadium is situated in the heart of the city of Bangalore It has a seating capacity of 40,000,[1] and regularly hosts Test cricket, One Day Internationals (ODI), Twenty20 Internationals (T20i) and other First-class cricket matches, as well as musical and cultural events. The stadium is the home ground of the Karnataka state cricket team and the Indian Premier League franchise Royal Challengers Bangalore. It is owned by the Government of Karnataka and has been leased out to the Karnataka State Cricket Association (KSCA) for a period of 100 years.\n" +
                "\n" +
                "Formerly known as the Karnataka State Cricket Association Stadium, it was later rechristened in tribute to Mangalam Chinnaswamy, who donated land for stadium and served the KSCA for four decades and was also president of the Board of Control for Cricket in India (BCCI) from 1977–1980.\n" +
                "\n" +
                "It is the first cricket stadium in the world to use solar panels to generate a bulk of the electricity needed to run the stadium.[2] This has been procured as by the \"Go Green\" initiative of the KSCA.[3][4] As of 13 January 2020 it has hosted 22 Tests, 24 ODIs and 7 T20Is." +
                "With generous patronage from the Government of Karnataka, the foundation stone of this stadium was laid in 1969 and construction work commenced in 1970. The stadium was first used for First-class cricket matches during the 1972–73 season. It earned test status during the 1974–75 season when the West Indies toured India.[5][6]\n" +
                "\n" +
                "The Karnataka State Cricket Association (KSCA) stadium, as it was known was later renamed as a tribute to M. Chinnaswamy, who was the BCCI President from 1977 to 1980 and had served the KSCA.[5][6]\n" +
                "\n" +
                "The first Test played at this stadium was on 22–29 November 1974.[6] Incidentally, this was the debut Test match for the West Indian batting giants Viv Richards and Gordon Greenidge. The West Indians led by Clive Lloyd crushed M. A. K. Pataudi's Indian team by a massive margin of 256 runs. India registered their first Test win on this ground against the touring English team led by Tony Greig in 1976–77. The first ODI match at this venue was played on 6 September 1982. India defeated Sri Lanka by six wickets in that match"+ANSI_reset);
    }

    static void rcb_std() {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Home Team");
        System.out.println("\t\t\t\t2. Matches");
        System.out.println("\t\t\t\t3. About Stadium");
        System.out.println("\t\t\t\t4. Root Menu");
        System.out.println("\t\t\t\t5. Change Stadium");
        System.out.println("\t\t\t\t0. Exit"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 0 to 5 : "+ANSI_RESET);

        Scanner rcb = new Scanner(System.in);
        int bang = rcb.nextInt();
        switch (bang) {
            case 1:
                RCBteam();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Team Details");
                System.out.println("\t\t\t\t2. Return Home"+ANSI_RESET);
                System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 & 2 : "+ANSI_RESET);

                Scanner td3 = new Scanner(System.in);
                int td_rcb = td3.nextInt();
                switch (td_rcb) {
                    // Kevla nu link karvanu che
                    case 1:
                        RCB();
                        break;
                    case 2:
                        rcb_std();
                        break;
                    default: System.out.println("Invalid Choice!! Please enter a valid choice...");
                }
                break;
            case 2:
                RCB_matches();
                break;
            case 3:
                RCB_std();
                break;
            case 4:
                ROOT_MANU();
                break;
            case 5:
                std_mn();
                break;
            case 0 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default: System.out.println("Invalid Choice!! Please enter a valid choice..."); rcb_std();
        }

    }

    static void SRHteam() {
        System.out.println(ANSI_Black+"The Sunrisers Hyderabad (stylised as SunRisers Hyderabad, abbr. SRH) are a franchise cricket team based in Hyderabad, Telangana, India, that plays in the Indian Premier League (IPL).[3] The franchise is owned by Kalanithi Maran of the SUN Group and was founded in 2012 after the Hyderabad-based Deccan Chargers were terminated by the IPL.[4] The team is currently captained by Kane Williamson and coached by Trevor Bayliss.[5] Their primary home ground is the Rajiv Gandhi International Cricket Stadium, Hyderabad, which has capacity of 55,000.[6]\n" +
                "\n" +
                "The team made their first IPL appearance in 2013, where they reached the playoffs, eventually finishing in fourth place. The Sunrisers won their maiden IPL title in the 2016 season, defeating the Royal Challengers Bangalore by 8 runs in the final. The team has qualified for the play-off stage of the tournament in every season since 2016. In 2018, the team reached the finals of the Indian Premier League, but lost to Chennai Super Kings. The team is considered one of the best bowling sides, often admired for its ability to defend low totals. David Warner is the leading run scorer for the side, having won the Orange Cap 3 times, in 2015, 2017, and 2019.[7] Bhuvneshwar Kumar is the leading wicket-taker.[8][9] The COVID-19 pandemic impacted the brand value of the Sunrisers Hyderabad which saw a decline of 4 percent to US$57.4 million in 2020 as the overall brand value of the IPL decreased to US$4.4 billion, according to Brand Finance." +
                "Franchise history\n" +
                "Sunrisers Hyderabad replaced the Deccan Chargers in 2012 and debuted in 2013. The franchise was taken over by Sun TV Network after the Deccan Chronicle went bankrupt. The squad was announced in Chennai on 18 December 2012. The team is owned by Sun TV Network who won the bid with ₹85.05 crore (US$12 million) per year for a five-year deal, a week after the Chargers were terminated due to prolonged financial issues. Sun TV Network Limited, which is headquartered in Chennai, is one of India's biggest television networks with 32 TV channels and 45 FM radio stations, making it India's largest media and entertainment company." +
                "IPL Winner 2016: Sunrisers Hyderabad\n" +
                "The Sunrisers Hyderabad team managed to win the final against Royal Challengers Bangalore by just 8 runs. David Warner masterfully crafted the team journey through the season as a captain. But the season was more about the Virat Kohli - Ab de Villiers partnership in almost all the RCB matches. Virat scored 4 centuries and 7 half-centuries in 16 innings he played! There should be no doubt on who was the orange cap winner for the season."+ANSI_reset);
    }

    static void SRH_matches() {
        System.out.println(ANSI_CYAN+"SRH vs MI ");
        System.out.println("SRH vs CSK ");
        System.out.println("SRH vs RCB ");
        System.out.println("SRH vs DC ");
        System.out.println("SRH vs KKR ");
        System.out.println("SRH vs PBKS ");
        System.out.println("SRH vs RR "+ANSI_RESET);
    }

    static void SRH_std() {
        System.out.println(ANSI_Black+"The Rajiv Gandhi International Cricket Stadium is a cricket stadium in Hyderabad, Telangana, India. Located in the eastern suburb of Uppal, it has a capacity of 55,000 and extends across 16 acres (65,000 m2) of land. It serves as the home ground for the Hyderabad Cricket Association and the Indian Premier League team Sunrisers Hyderabad. As of 3 March 2019, it has hosted 5 Tests, 6 ODIs and 2 T20Is. This stadium hosted the opener and final of 2017 Indian Premier League, and also the final of 2019 Indian Premier League" +
                "Ground capacity & factors\n" +
                "The stadium extends across 16 acres and has a seating capacity of 55,000 spectators. The ends are Pavilion End and North End (V.V.S. Laxman end).\n" +
                "A stand was named after Newly appointed Hyderabad Cricket Association President Mohammad Azharuddin and opened on 6 December 2019.\n" +
                "Floodlights are mounted on six towers to illuminate the stadium during day-night matches having been commissioned in April 2007.\n" +
                "The wicket here is considered as a flat track, with a reputation of being a batsman-friendly and high-scoring pitch" +
                "In 2003, the proposal for a new stadium was submitted by HCA to the government of erstwhile Andhra Pradesh, then headed by N. Chandrababu Naidu. The proposal was quickly cleared and HCA was allocated a budget for the same. The government also identified a large piece of land suitable for the project at Uppal.\n" +
                "\n" +
                "Most of the funding for the project came after an open auction of the stadium's title was held. Visaka Industries Limited won the auction with a bid price of ₹65,00,00,000. A sum of ₹43,00,00,000 was paid in advance and the stadium was named as Visakha International Cricket Stadium in 2004."+ANSI_reset);
    }

    static void srh_std() {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Home Team");
        System.out.println("\t\t\t\t2. Matches");
        System.out.println("\t\t\t\t3. About Stadium");
        System.out.println("\t\t\t\t4. Root Menu");
        System.out.println("\t\t\t\t5. Change Stadium");
        System.out.println("\t\t\t\t0. Exit"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 0 to 5 : "+ANSI_RESET);
        Scanner srh = new Scanner(System.in);
        int hydra = srh.nextInt();
        switch (hydra) {
            case 1:
                SRHteam();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Team Details");
                System.out.println("\t\t\t\t2. Return Home"+ANSI_RESET);
                System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 & 2 : "+ANSI_RESET);

                Scanner td4 = new Scanner(System.in);
                int td_srh = td4.nextInt();
                switch (td_srh) {
                    // Kevla nu link karvanu che
                    case 1:
                        SRH();
                        break;
                    case 2:
                        srh_std();
                        break;
                    default: System.out.println("Invalid Choice!! Please enter a valid choice...");
                }
                break;
            case 2:
                SRH_matches();
                break;
            case 3:
                SRH_std();
                break;
            case 4:
                ROOT_MANU();
                break;
            case 5:
                std_mn();
                break;
            case 0 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default: System.out.println("Invalid Choice!! Please enter a valid choice..."); srh_std();
        }

    }

    static void PBKSteam() {
        System.out.println(ANSI_Black+"he Punjab Kings (PBKS) are a franchise cricket team based in Mohali, Punjab that plays in the Indian Premier League (IPL). Established in 2008 as the Kings XI Punjab (KXIP), the franchise is jointly owned by Mohit Burman, Ness Wadia, Preity Zinta and Karan Paul. The team plays its home matches at the PCA Stadium, Mohali. Since 2010, they also have been playing some of their home games at either Dharamsala or Indore. Apart from the 2014 season when they topped the league table and finished runners-up, the team has made only one other playoff appearance in 13 seasons.\n" +
                "\n" +
                "The Punjab Kings played in the now-defunct Champions League Twenty20 once, in 2014 as the Kings XI Punjab and finished as semi-finalists. The team name was changed from Kings XI Punjab to Punjab Kings in February 2021." +
                "Name change\n" +
                "On 17 February 2021, Kings XI Punjab was renamed to Punjab Kings, ahead of the 2021 Indian Premier League.[7][8][9] Ness Wadia explained the reason for changing the franchise name was to \"relook at things\" and rebrand after 13 seasons of IPL. He expressed his disappointment over the franchise for \"not being able to win a title\" and expected them to \"start afresh\" after a name change. He added that the name change had been planned two years ago and COVID-19 had just delayed the announcement." +
                "Franchise history\n" +
                "In 2007, the Board of Control for Cricket in India (BCCI) created the cricket tournament the Indian Premier League, based on the Twenty20 format of the game. Franchises for eight cities were made available in an auction held in Mumbai on 20 February 2008. The team representing Punjab was bought by the Dabur group's Mohit Burman (46%), the Wadia group's Ness Wadia (23%), Preity Zinta (23%), and Saptarshi Dey of the Dey & Dey Group (minor stake). The group paid a total of $76 million to acquire the franchise.\n" +
                "\n" +
                "As the Kings XI Punjab, the franchise's catchment areas were the regions of Kashmir, Jammu, Himachal Pradesh, Punjab and Haryana—evident from the letter sequence \"K J H P H\" in the banner of the team's logo."+ANSI_reset);
    }

    static void PBKS_matches() {
        System.out.println(ANSI_CYAN+"PBKS vs MI ");
        System.out.println("PBKS vs CSK ");
        System.out.println("PBKS vs SRH ");
        System.out.println("PBKS vs DC ");
        System.out.println("PBKS vs KKR ");
        System.out.println("PBKS vs RCB ");
        System.out.println("PBKS vs RR "+ANSI_RESET);
    }

    static void PBKS_std() {
        System.out.println(ANSI_Black+"The Punjab Cricket Association Inderjit Singh Bindra Stadium (Punjabi: ਪੰਜਾਬ ਕ੍ਰਿਕੇਟ ਐਸੋਸੀਏਸ਼ਨ ਆਈਐਸ ਬਿੰਦਰਾ ਸਟੇਡੀਅਮ) is a cricket ground located in Mohali, Punjab. It is popularly referred to as the Mohali Stadium. The stadium was built by Geetanshu Kalra from Ambala City and is home to the Punjab team. The construction of the stadium took around ₹ 25 crore and 3 years to complete.[1] The stadium has an official capacity of 26,950[2] spectators. The stadium was designed by Ar. Khizir and Associates, and constructed by R.S. Construction Company based in Chandigarh.[3] PCA stadium is home of Punjab cricket team and Kings XI Punjab (IPL franchisee).\n" +
                "\n" +
                "The floodlights here are unconventional compared to other cricket stadiums, in that the light pillars are very low in height. This is to avoid aircraft from the nearby Chandigarh airport colliding with the light pillars. That is the reason behind the stadium having 16 floodlights. As of December 2019, it has hosted 13 Tests, 25 ODIs and 5 T20Is." +
                "History\n" +
                "The stadium is the 19th Test cricket venue in India. The pitch has a reputation for being lively and supporting pace bowlers, however it had slowed down and assists spin bowling as well. It was inaugurated with a One Day International match between India and South Africa during the Hero Cup on 22 November 1993.\n" +
                "\n" +
                "The first Test match here was held the following season, between India and West Indies on 10 December 1994. One of the most famous one-day matches on this ground was a thrilling Cricket World Cup semi-final encounter between Australia and West Indies in February 1996. PCA stadium hosted 3 matches of 2011 world cup including the nail biting second Semi-final match between India and Pakistan on 30 March 2011 which was eventually won by India. The match was attended by the Prime Ministers Manmohan Singh of India and Yousaf Raza Gillani of Pakistan, owing to its crucial nature, and as a measure of cricket diplomacy for normalizing relations. The match was won by India." +
                "Pitch\n" +
                "The current pitch curator for the PCA Stadium is Daljit Singh[4] This pitch is the one of the greenest pitches of India and as the outfield is lush green, the ball keeps its shine for a long time and allows the fast bowlers to exploit the conditions at the most. The Mohali pitch is also known to slow down later on and become batting paradise."+ANSI_reset);
    }

    static void pbks_std() {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Home Team");
        System.out.println("\t\t\t\t2. Matches");
        System.out.println("\t\t\t\t3. About Stadium");
        System.out.println("\t\t\t\t4. Root Menu");
        System.out.println("\t\t\t\t5. Change Stadium");
        System.out.println("\t\t\t\t0. Exit"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 0 to 5 : "+ANSI_RESET);
        Scanner pbks = new Scanner(System.in);
        int moha = pbks.nextInt();
        switch (moha) {
            case 1:
                PBKSteam();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Team Details");
                System.out.println("\t\t\t\t2. Return Home");
                System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 & 2 : "+ANSI_RESET);
                Scanner td5 = new Scanner(System.in);
                int td_pbks = td5.nextInt();
                switch (td_pbks) {
                    // Kevla nu link karvanu che
                    case 1:
                        PBKS();
                        break;
                    case 2:
                        pbks_std();
                        break;
                    default: System.out.println("Invalid Choice!! Please enter a valid choice...");
                }
                break;
            case 2:
                PBKS_matches();
                break;
            case 3:
                PBKS_std();
                break;
            case 4:
                ROOT_MANU();
                break;
            case 5:
                std_mn();
                break;
            case 0 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default: System.out.println("Invalid Choice!! Please enter a valid choice..."); pbks_std();
        }

    }

    static void DCteam() {
        System.out.println(ANSI_Black+"The Delhi Capitals are a franchise cricket team based out of Delhi in the Indian Premier League (IPL). Founded in 2008 as the Delhi Daredevils, the franchise is jointly owned by the GMR Group and the JSW Group. The team's home ground is Arun Jaitley Stadium, located in New Delhi. The Capitals appeared in their first IPL final in 2020." +
                "Franchise history\n" +
                "The IPL is a cricket league organised by the Board of Control for Cricket in India (BCCI) and backed by the International Cricket Council (ICC). The inaugural tournament was held in April–June 2008, in which BCCI finalised a list of eight teams who participated in the tournament. The teams represented eight different cities in India, including Delhi. The teams were put up for auction in Mumbai on 20 February 2008, and the Delhi team was bought by the property development company GMR Group for US$84 million.[5]\n" +
                "\n" +
                "In March 2018, GMR sold a 50% stake in the Delhi Daredevils to JSW Sports for ₹550 crore (US$77 million)." +
                "In December 2018, the team changed its name from the Delhi Daredevils to the Delhi Capitals.[7] Speaking to the rationale behind changing the team's name, co-owner and chairman Parth Jindal said, \"Delhi is the power centre of the country, it is the capital, therefore the name Delhi Capitals.\"[8] Co-owner Kiran Kumar Grandhi said, \"The new name symbolizes Delhi’s identity and just like the city, we are aiming to be the centre of all action going forward.\"" +
                "Team anthems\n" +
                "Bollywood playback singer Kailash Kher was the artist for the team's anthem[when?]—\"Khelo Front Foot Pe\" (\"Play on the front foot\") or \"play aggressively\".\n" +
                "\n" +
                "The Delhi Daredevils launched their new anthem \"Munday Dilli Ke\" (\"The Lads from Delhi\") on 5 March 2012 on YouTube."+ANSI_reset);
    }

    static void DC_matches() {
        System.out.println(ANSI_CYAN+"DC vs MI ");
        System.out.println("DC vs CSK ");
        System.out.println("DC vs RCB ");
        System.out.println("DC vs RR ");
        System.out.println("DC vs KKR ");
        System.out.println("DC vs PBKS ");
        System.out.println("DC vs SRH "+ANSI_RESET);
    }

    static void DC_std() {
        System.out.println(ANSI_Black+"Arun Jaitley Stadium is a cricket stadium located at Bahadur Shah Zafar Marg, New Delhi.[2][3] Established in 1883 as the Feroz Shah Kotla Stadium, being near the Kotla fort, it is the second oldest international cricket stadium still functional in India, after the Eden Gardens in Kolkata. As a matter of felicitation, the DDCA named four stands of the stadium after former India captain Bishan Singh Bedi, former India all-rounder Mohinder Amarnath, former India opener and Delhi Ranji player Gautam Gambhir and current captain Virat Kohli. It was also decided to name the home team's dressing room after Raman Lamba and the opposition's dressing room after Prakash Bhandari." +
                "Formerly Sunil Gavaskar hit his 29th test ton in this ground to equal Don Bradman's then record tally of 29 centuries. The ground is also known for Anil Kumble's 10 wickets in an innings against Pakistan[6] and Sachin Tendulkar's 35th test ton to overcome Gavaskar to become the batsman with the most international Test centuries.[7] As of 25 October 2019 it has hosted 34 Tests, 25 ODIs and 6 T20I." +
                "History\n" +
                "The first Test match at this venue was played on 10 November 1948 when India took on the West Indies. It is owned and operated by the DDCA (Delhi District Cricket Association)." +
                "Special achievements\n" +
                "In 1983–84, Sunil Gavaskar scored his 29th century to equal Don Bradman's long standing record for the highest number of hundreds in Test cricket. In 1999–2000, in a match against Pakistan, Anil Kumble took 10 for 74 in fourth inning of a Test Match and became the second person to take 10 wickets in an innings after Jim Laker. In 2005–06, at the same ground, Sachin Tendulkar broke Gavaskar's record of most centuries with his 35th Test century." +
                "Indian Premier League\n" +
                "Since 2008 the stadium has been the home venue of the Delhi Capitals (formerly Delhi Daredevils) of the Indian Premier League."+ANSI_reset);
    }

    static void dc_std()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Home Team");
        System.out.println("\t\t\t\t2. Matches");
        System.out.println("\t\t\t\t3. About Stadium");
        System.out.println("\t\t\t\t4. Root Menu");
        System.out.println("\t\t\t\t5. Change Stadium");
        System.out.println("\t\t\t\t0. Exit"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 0 to 5 : "+ANSI_RESET);
        Scanner dc = new Scanner(System.in);
        int feroz = dc.nextInt();
        switch (feroz)
        {
            case 1:
                DCteam();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Team Details");
                System.out.println("\t\t\t\t2. Return Home");
                System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 & 2 : "+ANSI_RESET);

                Scanner td6 = new Scanner(System.in);
                int td_dc = td6.nextInt();
                switch (td_dc)
                {
                    // Kevla nu link karvanu che
                    case 1:
                        DC();
                        break;
                    case 2:
                        dc_std();
                        break;
                    default: System.out.println("Invalid Choice!! Please enter a valid choice...");
                }
                break;
            case 2:
                DC_matches();
                break;
            case 3:
                DC_std();
                break;
            case 4:
                ROOT_MANU();
                break;
            case 5:
                std_mn();
                break;
            case 0 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default: System.out.println("Invalid Choice!! Please enter a valid choice..."); dc_std();
        }

    }

    static void RRteam() {
        System.out.println(ANSI_Black+"The Rajasthan Royals (often abbreviated as RR) are a franchise cricket team based in Jaipur, Rajasthan, that plays in the Indian Premier League (IPL).[1] Founded in 2008 as one of the initial eight IPL franchises, the team is based at the Sawai Mansingh Stadium in Jaipur.[2][3] The Royals are known to unearth obscure, high potential talent,[4][5][6] as well as for their involvement in a number of controversies and scandals.[7][8][9][10]\n" +
                "\n" +
                "The team won the inaugural edition of the IPL under the captaincy of Shane Warne, despite being written off as a title contender by the media and fans. The Royals were also the runners-up of the 2013 Champions League Twenty20 under Rahul Dravid's captaincy.[6][11]\n" +
                "\n" +
                "On 14 July 2015, the verdict reached by a panel appointed by the Supreme Court of India suspended Rajasthan Royals and Chennai Super Kings for two years over a 2013 betting scandal, meaning they could not participate in both the 2016 and 2017 IPL tournaments. They returned to the competition for the 2018 season.\n" +
                "\n" +
                "The team's record run-scorer is Ajinkya Rahane with 3098 runs,[12] while the leading wicket-taker is Shane Watson, with 67." +
                "Franchise history\n" +
                "The Board of Control for Cricket in India (BCCI) announced the establishment of the Indian Premier League (IPL) in September 2007, a Twenty20 competition to be started in 2008.[14] The Rajasthan Royals were one of the original eight teams in the inaugural season of the IPL in 2008. The team was sold to the Emerging Media for $67 million, making it the least expensive team in the league.[1]\n" +
                "\n" +
                "The franchise is currently owned and chaired by Manoj Badale. Other investors include Lachlan Murdoch, Aditya S Chellaram, and Suresh Chellaram. The Group acquired the franchise for $67 million.[15] There have been past controversies regarding the ownership of the franchise, leading to their expulsion from the league in 2010.[7] Incidentally, this was the least expensive franchise in the Indian Premier League and probably the least fancied team in the league at the beginning of the tournament.[16] It made a pre-tax profit of $7.5 million in 2009." +
                "IPL Winner 2008: Rajasthan Royals\n" +
                "The Shane Warne led Rajasthan Royals won the first edition of the Indian Premier League. A thoroughly well balanced team with experienced batsmen like Shane Watson and Graeme Smith, an explosive batsman like Yusuf Pathan in the middle order, and deceptive bowler like Sohail Tanvir were the backbone of the Rajasthan Royals in the first edition. But in the final against the Chennai Super Kings, Yusuf Pathan played a match of his life with contributions in both bowling and the batting department. Yusuf first took 3 crucial wickets with run-rate less than a bowl and scored a quickfire 56 from 39."+ANSI_reset);
    }

    static void RR_matches() {
        System.out.println(ANSI_CYAN+"RR vs MI ");
        System.out.println("RR vs CSK ");
        System.out.println("RR vs RCB ");
        System.out.println("RR vs DC ");
        System.out.println("RR vs KKR ");
        System.out.println("RR vs PBKS ");
        System.out.println("RR vs SRH "+ANSI_RESET);
    }

    static void RR_std() {
        System.out.println(ANSI_Black+"The Sawai Mansingh Stadium is a cricket stadium in Jaipur, Rajasthan, India. It was named after Sawai Man Singh II, the erstwhile ruler of the princely state of Jaipur. It is situated at one corner of the PKMB. The stadium seats 30,000. As of July 2013, the stadium and grounds could be toured using Google Street View. As of 19 Aug 2017 it has hosted 1 Test and 19 ODIs." +
                "History\n" +
                "The Sawai Mansingh Stadium has hosted a solitary Test match, between India and Pakistan, starting in February 1987, when Pakistan President General Zia-ul-Haq crossed the border to watch the second day's play as part of his \"Cricket for Peace\" initiative.\n" +
                "\n" +
                "The Test was notable for Younis Ahmed's return to the Test fray after an absence of over 17 years and also for Sunil Gavaskar's dismissal to the first ball of the Test match, for the third time in an otherwise illustrious career.to collect\n" +
                "\n" +
                "The game sputtered to a draw after the third day's play was abandoned following heavy rain and a controversy over the alleged deposition of sawdust on the wicket which Pakistan objected to.\n" +
                "\n" +
                "The stadium's ODI debut had kicked off with a contest between the same two sides on 2 October 1983. Fresh from their World Cup triumph, the Indians comfortably won by four wickets, sporting the same XI that won the World Cup final." +
                "Re-development\n" +
                "In 2006, the stadium underwent a major renovation at a cost of Rs 400 crore.[2] A world-class cricket academy was built for Rs 7 crore, which has 28 appointed rooms, a gym, a restaurant, 2 conference halls and a swimming pool.[3]\n" +
                "\n" +
                "New facilities:\n" +
                "\n" +
                "Media rooms\n" +
                "Galleries\n" +
                "2 new blocks\n" +
                "Capacity" +
                "Ground records\n" +
                "The highest ODI total at this ground is 362-1 by India against Australia in 2013–14.\n" +
                "The lowest ODI total at this ground is 125 by England against India.\n" +
                "The highest individual score by any batsman on this ground in ODI is 183 not out by Mahendra Singh Dhoni on 31 October 2005.\n" +
                "The Sawai Mansingh Stadium, Jaipur is situated in the picturesque state of Rajasthan, India. The stadium has hosted only one Test between India and Pakistan and it has hosted a number of ODIs.\n" +
                "This is also the ground where Sourav Ganguly and Sachin Tendulkar most successful opening pair for India in ODIs opened the innings for the first time."+ANSI_reset);
    }

    static void rr_std()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Home Team");
        System.out.println("\t\t\t\t2. Matches");
        System.out.println("\t\t\t\t3. About Stadium");
        System.out.println("\t\t\t\t4. Root Menu");
        System.out.println("\t\t\t\t5. Change Stadium");
        System.out.println("\t\t\t\t0. Exit"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 0 to 5 : "+ANSI_RESET);
        Scanner rr = new Scanner(System.in);
        int savay = rr.nextInt();
        switch (savay)
        {
            case 1:
                RRteam();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Team Details");
                System.out.println("\t\t\t\t2. Return Home");
                System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 & 2: "+ANSI_RESET);

                Scanner td7 = new Scanner(System.in);
                int td_rr = td7.nextInt();
                switch (td_rr)
                {
                    // Kevla nu link karvanu che
                    case 1:
                        RR();
                        break;
                    case 2:
                        rr_std();
                        break;
                    default: System.out.println("Invalid Choice!! Please enter a valid choice...");
                }
                break;
            case 2:
                RR_matches();
                break;
            case 3:
                RR_std();
                break;
            case 4:
                ROOT_MANU();
                break;
            case 5:
                std_mn();
                break;
            case 0 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default: System.out.println("Invalid Choice!! Please enter a valid choice..."); rr_std();
        }

    }

    static void KKRteam() {
        System.out.println(ANSI_Black+"The Kolkata Knight Riders (KKR) are a franchise cricket team representing the city of Kolkata in the Indian Premier League. The franchise is owned by Bollywood actor Shah Rukh Khan, actress Juhi Chawla and her spouse Jay Mehta. The Knight Riders play at the iconic Eden Gardens stadium.[5]\n" +
                "\n" +
                "The franchise, which has gained immense popularity due to its association with celebrity owners, qualified for the IPL playoffs for the first time in 2011. They became the IPL champions in 2012, by defeating Chennai Super Kings in the final. They repeated the feat in 2014, defeating Kings XI Punjab.[6] The Knight Riders hold the record for the longest winning streak by any Indian team in T20s (14).[7]\n" +
                "\n" +
                "The side's all-time leading run-scorer is Gautam Gambhir,[8] while their leading wicket-taker is Sunil Narine.[9] The official theme of the team is Korbo, Lorbo, Jeetbo Re (we will perform, fight, and win!) and the official colours are purple and gold. The brand value of the Knight Riders was estimated at $104 million in 2018, second highest among IPL franchises.[10] In 2019, their value was estimated at ₹629 crore (US$88 million)." +
                "Franchise history\n" +
                "\n" +
                "Sourav Ganguly with the symbol of the Kolkata Knight Riders, flanked by Shah Rukh Khan on the left and Gauri Khan on the right.\n" +
                "In 2007, the Board of Control for Cricket in India (BCCI) created the cricket tournament Indian Premier League, based on the Twenty20 format of the game.[12] Eight teams participated in the inaugural tournament held in April – June 2008. The teams representing the eight different cities of India were put up on auction in Mumbai on 20 February 2008. The team representing Kolkata was eventually bought by Bollywood superstar Shah Rukh Khan's company Red Chillies Entertainment in partnership with actress Juhi Chawla and her husband Jay Mehta for a price of $75.09 million, equal to approximately ₹2.98 billion at that time.[13] Sourav Ganguly, former captain of the Indian national team, a native of West Bengal and the current President of BCCI, was named the Icon player for the team. The name of the team is a reference to the popular 1980s American television series Knight Rider" +
                "Livery\n" +
                "Initially, when the Kolkata Knight Riders were first introduced in 2008, the logo of the team consisted of a blazing golden Viking helmet against a black background with the name of the team written in gold next to it. However, the black background was changed to purple in the third season. It was in 2012 that the current logo, which has a blazing purple Corinthian helmet trimmed with gold, with Kolkata Knight Riders written within a shield was introduced." +
                "IPL Winner 2014: Kolkata Knight Riders\n" +
                "Kolkata Knight Riders become the second team to won the IPL trophy more than once. If Manvinder Bisla was the hero in the final of the 2012 edition, this time it was Manish Pandey’s heroics that led KKR to chase a huge total of 199. Pandey scored a brilliant 94 from 50. Robin Uthappa from KKR won the orange cap for scoring 660 runs in 16 innings." +
                "IPL Winner 2012: Kolkata Knight Riders\n" +
                "Kolkata Knight Riders defeated the defending champions Chennai Super Kings in the final. With KKR batsman left with the daunting task of chasing 190 in the final, Bisla took the onus of chase on himself and replied with a swashbuckling inning of 89 from 48 balls. CSK’s run feast led by Suresh Raina’s 73 from 38 wasn’t enough to stop the Knights from snatching the title from them."+ANSI_reset);
    }

    static void KKR_matches() {
        System.out.println(ANSI_CYAN+"KKR vs MI ");
        System.out.println("KKR vs CSK ");
        System.out.println("KKR vs SRH ");
        System.out.println("KKR vs DC ");
        System.out.println("KKR vs PBKS ");
        System.out.println("KKR vs RCB ");
        System.out.println("KKR vs RR "+ANSI_RESET);
    }

    static void KKR_std() {
        System.out.println(ANSI_Black+"Eden Gardens is a cricket ground in Kolkata, India. Established in 1864, it is the oldest[3][4][5] and second-largest cricket stadium in India after the newly built Narendra Modi Stadium and third-largest in the world after Narendra Modi Stadium is Melbourne Cricket Ground. The stadium currently has a capacity of 80,000.[3] On 22 November 2019, the venue hosted the first ever day/night Test match in India during the second Test between India and Bangladesh.[6]\n" +
                "\n" +
                "Eden Gardens is often referred to as home of Indian cricket. It has the fastest outfield of all the cricket stadiums in India, and is regarded as a \"batsman's paradise\". The ground has been referred to as \"cricket's answer to the Colosseum\".[7] Eden Gardens is called the “Mecca of Indian cricket”, due to it being the first officially built ground for the game of cricket in India.[8][9] Eden Gardens has hosted matches in major international competitions including the World Cup, World Twenty20 and Asia Cup. In 1987, Eden Gardens became the second stadium to host a World Cup final. The 2016 ICC World Twenty20 final was held at the stadium, with the West Indies beat England in a closely fought encounter." +
                "The stadium was established in 1864. It takes its name from the Eden Gardens, one of the oldest parks in Kolkata, adjacent to the stadium, designed in 1841 and named after the Eden sisters of Lord Auckland, the then Governor-General of India.[10] Initially it was named 'Auckland Circus Gardens' but later changed to 'Eden Gardens' by its makers inspired by Garden of Eden in the Bible.[11] According to popular culture, Babu Rajchandra Das, the then zamindar (landlord) of Kolkata, had gifted one of his biggest gardens besides river Hooghly, to Viceroy Lord Auckland Eden and his sister Emily Eden after they helped him by saving his 3rd daughter from a fatal disease. From then onwards the garden's name was changed from Mar Bagan to Eden Gardens. The cricket grounds were built between Babughat and Fort William.[12] The stadium is in the B. B. D. Bagh area of the city, near the State Secretariat and opposite to the Calcutta High Court." +
                "Stands\n" +
                "Eden Gardens stands have been named after prominent local cricketers and soldiers. On 22 January 2017, 2 stands were named after Indian cricketers - Sourav Ganguly and Pankaj Roy while 2 more were after cricket administrators - BN Dutt (BCCI President 1988-1990) and Jagmohan Dalmiya (BCCI President 2001–04, 2013 - interim, 2015).[22] Dalmiya served as ICC President from 1997 to 2000.\n" +
                "\n" +
                "On 27 April 2017, 4 stands were named after Indian soldiers[23] - Colonel Neelakantan Jayachandran Nair, Havildar Hangpan Dada, Lieutenant Colonel Dhan Singh Thapa and Subedar Joginder Singh Sahnan. LC Thapa and Subedar Singh are Param Vir Chakra awardees - the highest wartime military decoration in India while Col Nair and Havildar Dada are Ashok Chakra - the highest peacetime military decoration." +
                "Cricket World Cup matches\n" +
                "\n" +
                "The Bell at the Eden Gardens\n" +
                "Eden Gardens has hosted 15 Cricket World Cup matches hosted in India across formats and men's and women's cricket. Eden Gardens has hosted 6 Cricket World Cup matches in 1987 (2), 1996 (1), 2011 (3). The stadium hosted 5 T20I matches during 2016 ICC World Twenty20. The stadium hosted 2 Women's Cricket World Cup matches - one each in 1978 and 1997 and one Women T20I match during the 2016 ICC Women's World Twenty20 tournament.\n" +
                "\n" +
                "Eden Gardens has hosted 4 finals (1987 ODI CWC, 2016 T20I, 1997 Women's CWC and 2016 Women's T20I) and 1 semifinal (1996 ODI CWC)."+ANSI_reset);
    }

    static void kkr_std()
    {
        System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Home Team");
        System.out.println("\t\t\t\t2. Matches");
        System.out.println("\t\t\t\t3. About Stadium");
        System.out.println("\t\t\t\t4. Root Menu");
        System.out.println("\t\t\t\t5. Change Stadium");
        System.out.println("\t\t\t\t0. Exit"+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"\nEnter any choice between 0 to 5 : "+ANSI_RESET);

        Scanner kkr = new Scanner(System.in);
        int eden = kkr.nextInt();
        switch (eden)
        {
            case 1:
                KKRteam();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t1. Team Details");
                System.out.println("\t\t\t\t2. Return Home"+ANSI_RESET);
                System.out.print(ANSI_YELLOW+"\nEnter any choice between 1 & 2: "+ANSI_RESET);

                Scanner td8 = new Scanner(System.in);
                int td_kkr = td8.nextInt();
                switch (td_kkr)
                {
                    // Kevla nu link karvanu che
                    case 1:
                        KKR();
                        break;
                    case 2:
                        kkr_std();
                        break;
                    default: System.out.println("Invalid Choice!! Please enter a valid choice...");
                }
                break;
            case 2:
                KKR_matches();
                break;
            case 3:
                KKR_std();
                break;
            case 4:
                ROOT_MANU();
                break;
            case 5:
                std_mn();
                break;
            case 0 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default: System.out.println("Invalid Choice!! Please enter a valid choice..."); kkr_std();
        }

    }
    // Jeel CODE
    static void Ticket1()
    {

        Scanner sc123=new Scanner(System.in);
        Random rand = new Random();

        System.out.print(ANSI_YELLOW+"Enter the Tickets for Conformation:"+ANSI_RESET);
        int max = sc123.nextInt();
        System.out.println();
        for(int loop=1; loop<=max; loop++)
        {

            int int_random = rand.nextInt(1000);

            System.out.println(ANSI_BLUE+"Your Sit Number"+ loop+ " : "+rand.nextInt(int_random)+ANSI_RESET);
        }


        int gate =16;
        int gate2 = rand.nextInt(gate);
        System.out.print(ANSI_GREEN+"\n\t\t\t\tYour Gate Number is This :"+gate2+ANSI_RESET+"\n");



    }

    static void Recipt()
    {
        System.out.println(ANSI_PURPLE + ANSI_Black+ "\t\t\t\tYour Log in Details\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ ANSI_RESET+ANSI_reset);
        System.out.print(ANSI_YELLOW+"\t\t\t\tUsername:"+ANSI_RESET);
        System.out.print(ANSI_GREEN+Username+ANSI_GREEN+"\n");
        System.out.print(ANSI_YELLOW+"\t\t\t\tPhone Number:"+ANSI_RESET);
        System.out.print(ANSI_GREEN+Phone_number+ANSI_GREEN+"\n");
        System.out.print(ANSI_YELLOW+"\t\t\t\tEmail:"+ANSI_RESET);
        System.out.print(ANSI_GREEN+Email+ANSI_GREEN+"\n");
        System.out.print(ANSI_YELLOW+"\t\t\t\tAddress"+ANSI_RESET);
        System.out.print(ANSI_GREEN+Address+ANSI_GREEN+"\n");
        System.out.println();
        System.out.println(ANSI_PURPLE+"\t\t\t\tSelect Any One Package:"+ANSI_RESET);
        System.out.println("\t\t\t\t----------------------------------------------------");
        System.out.println(ANSI_BLUE+"\t\t\t\t1.Bronze=500");
        System.out.println("\t\t\t\t2.Silver=1000");
        System.out.println("\t\t\t\t3.Gold=1500");
        System.out.println("\t\t\t\t4.Platinum=2000");
        System.out.println("\t\t\t\t5.VIP_BOX=2500"+ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_RED+"\t\t\t\tPress 6 to GOTO MAINMENU"+ANSI_RESET);
        System.out.println(ANSI_RED+"\t\t\t\tPress 7 to GOTO ROOT MENU"+ANSI_RESET);
        System.out.println(ANSI_RED+"\t\t\t\tPress 8 to Exit The Program"+ANSI_RESET);

        System.out.println("\t\t\t\t**********************************************************************");
        System.out.print(ANSI_YELLOW +"Enter any choice between 1 to 5 : "+ANSI_RESET);
        Scanner sc1 = new Scanner(System.in);
        int ch10 = sc1.nextInt();
        switch (ch10)
        {
            case 1:
                Scanner sc10 = new Scanner(System.in);
                System.out.println(ANSI_GREEN+"\t\t\t\tYour Choice Is Selected !!!"+ANSI_RESET);
                int tk;
                System.out.print(ANSI_YELLOW+"Enter Total Number of Tickets:"+ANSI_RESET);
                tk=sc10.nextInt();
                Ticket1();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t"+ANSI_Black+"Total Amount To pay :"+tk * 500+ANSI_reset+ANSI_RESET);
                break;

            case 2:
                Scanner sc11 = new Scanner(System.in);
                System.out.println(ANSI_GREEN+"\t\t\t\tYour Choice Is Selected !!!"+ANSI_RESET);
                int tk1;
                System.out.print(ANSI_YELLOW+"Enter Total Number of Tickets:"+ANSI_RESET);
                tk1=sc11.nextInt();
                Ticket1();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t"+ANSI_Black+"Total Amount To pay :"+tk1 * 1000+ANSI_reset+ANSI_RESET);
                break;
            case 3:
                Scanner sc12 = new Scanner(System.in);
                System.out.println(ANSI_GREEN+"\t\t\t\tYour Choice Is Selected !!!"+ANSI_RESET);
                int tk2;
                System.out.print(ANSI_YELLOW+"Enter Total Number of Tickets:"+ANSI_RESET);
                tk2=sc12.nextInt();
                Ticket1();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t"+ANSI_Black+"Total Amount To pay :"+tk2 * 1500+ANSI_reset+ANSI_RESET);
                break;

            case 4:
                Scanner sc13 = new Scanner(System.in);
                System.out.println(ANSI_GREEN+"\t\t\t\tYour Choice Is Selected !!!"+ANSI_RESET);
                int tk3;
                System.out.print(ANSI_YELLOW+"Enter Total Number of Tickets:"+ANSI_RESET);
                tk3=sc13.nextInt();
                Ticket1();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t"+ANSI_Black+"Total Amount To pay :"+tk3 * 2000+ANSI_reset+ANSI_RESET);
                break;
            case 5:
                Scanner sc14 = new Scanner(System.in);
                System.out.println(ANSI_GREEN+"\t\t\t\tYour Choice Is Selected !!!"+ANSI_RESET);
                int tk4;
                System.out.print(ANSI_YELLOW+"Enter Total Number of Tickets:"+ANSI_RESET);
                tk4=sc14.nextInt();
                Ticket1();
                System.out.println(ANSI_BLUE+"\n\t\t\t\t"+ANSI_Black+"Total Amount To pay :"+tk4 * 2500+ANSI_reset+ANSI_RESET);
                break;

            case 6:
                Mainmanu2();
                break;
            case 7:
                ROOT_MANU();
                break;
            case 8 :System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;
            default : System.out.println(ANSI_RED+"\t\t\t\tInvalid Choice!! Please enter a valid choice..."+ANSI_RESET);

        }


    }

    // IS Bindra Stadium (Kings XI Punjab)
    static void PBKS_vs_CSK()
    {
        Recipt();
    }
    static void PBKS_vs_DC()
    {
        Recipt();
    }
    static void PBKS_vs_KKR()
    {
        Recipt();
    }
    static void PBKS_vs_MI()
    {
        Recipt();

    }
    static void PBKS_vs_RR()
    {
        Recipt();

    }
    static void PBKS_vs_RCB()
    {
        Recipt();

    }
    static void PBKS_vs_SRH()
    {
        Recipt();

    }

    // Eden Gardens (Kolkata Knight Riders)
    static void KKR_vs_CSK()
    {
        Recipt();

    }
    static void KKR_vs_DC()
    {
        Recipt();

    }
    static void KKR_vs_PBKS()
    {
        Recipt();

    }
    static void KKR_vs_MI ()
    {
        Recipt();

    }
    static void KKR_vs_RR()
    {
        Recipt();

    }
    static void KKR_vs_RCB()
    {
        Recipt();

    }
    static void KKR_vs_SRH()
    {
        Recipt();

    }
    // Wankhede Stadium (Mumbai Indians
    static void MI_vs_CSK()
    {
        Recipt();

    }
    static void MI_vs_DC()
    {
        Recipt();

    }
    static void MI_vs_PBKS()
    {
        Recipt();

    }
    static void MI_vs_KKR ()
    {
        Recipt();

    }
    static void MI_vs_RR()
    {
        Recipt();

    }
    static void MI_vs_RCB()
    {
        Recipt();


    }
    static void MI_vs_SRH()
    {
        Recipt();

    }


    // Sawai Mansingh Stadium (Rajasthan Royals)
    static void RR_vs_CSK()
    {
        Recipt();

    }
    static void RR_vs_DC()
    {
        Recipt();

    }
    static void RR_vs_PBKS()
    {
        Recipt();

    }
    static void RR_vs_MI ()
    {
        Recipt();

    }
    static void RR_vs_KKR()
    {
        Recipt();

    }
    static void RR_vs_RCB()
    {
        Recipt();

    }
    static void RR_vs_SRH()
    {
        Recipt();

    }

    // M. Chinnaswamy Stadium (Royal Challengers Bangalore)
    static void RCB_vs_CSK()
    {
        Recipt();

    }
    static void RCB_vs_DC()
    {
        Recipt();

    }
    static void RCB_vs_PBKS()
    {
        Recipt();

    }
    static void RCB_vs_MI ()
    {
        Recipt();

    }
    static void RCB_vs_RR()
    {
        Recipt();

    }
    static void RCB_vs_KKR()
    {
        Recipt();

    }
    static void RCB_vs_SRH()
    {
        Recipt();

    }

    // Feroz Shah Kotla (Delhi Capitals)
    static void DC_vs_CSK()
    {
        Recipt();

    }
    static void DC_vs_KKR()
    {
        Recipt();

    }
    static void DC_vs_PBKS()
    {
        Recipt();

    }
    static void DC_vs_MI ()
    {
        Recipt();

    }
    static void DC_vs_RR()
    {
        Recipt();

    }
    static void DC_vs_RCB()
    {
        Recipt();

    }
    static void DC_vs_SRH()
    {
        Recipt();

    }

    // Rajiv Gandhi International Cricket Stadium (Sunrisers Hyderabad)
    static void SRH_vs_CSK()
    {
        Recipt();

    }
    static void SRH_vs_DC()
    {
        Recipt();

    }
    static void SRH_vs_PBKS()
    {
        Recipt();

    }
    static void SRH_vs_MI ()
    {
        Recipt();

    }
    static void SRH_vs_RR()
    {
        Recipt();

    }
    static void SRH_vs_RCB()
    {
        Recipt();

    }
    static void SRH_vs_KKR()
    {
        Recipt();

    }

    // M. A. Chidambaram Stadium (Chennai Super Kings)
    static void CSK_vs_KKR()
    {
        Recipt();

    }
    static void CSK_vs_DC()
    {
        Recipt();

    }
    static void CSK_vs_PBKS()
    {
        Recipt();

    }
    static void CSK_vs_MI ()
    {
        Recipt();

    }
    static void CSK_vs_RR()
    {
        Recipt();

    }
    static void CSK_vs_RCB()
    {
        Recipt();

    }
    static void CSK_vs_SRH()
    {
        Recipt();

    }
    public static void GOTO_MAINMANU()
    {
        Mainmanu2();
    }


    public static void Mainmanu2()
    {
        System.out.println(ANSI_PURPLE +"\t\t\t\tStadium Name                          "+ ANSI_RESET);
        System.out.println("\t\t\t\t----------------------------------------------------------------------");
        System.out.println(ANSI_BLUE +"\t\t\t\t1. IS Bindra Stadium (Kings XI Punjab)                                ");
        System.out.println("\t\t\t\t2. Eden Gardens (Kolkata Knight Riders)                               ");
        System.out.println("\t\t\t\t3. Wankhede Stadium (Mumbai Indians)                                  ");
        System.out.println("\t\t\t\t4. Sawai Mansingh Stadium (Rajasthan Royals)                          ");
        System.out.println("\t\t\t\t5. M. Chinnaswamy Stadium (Royal Challengers Bangalore)               ");
        System.out.println("\t\t\t\t6. Feroz Shah Kotla (Delhi Capitals)                                  ");
        System.out.println("\t\t\t\t7. Rajiv Gandhi International Cricket Stadium (Sunrisers Hyderabad)s  ");
        System.out.println("\t\t\t\t8. M. A. Chidambaram Stadium (Chennai Super Kings)                     "+ANSI_RESET);
        System.out.println(ANSI_RED+"\t\t\t\t   Press 9 To Exit The Program"+ANSI_RESET);
        System.out.println(ANSI_RED+"\t\t\t\t   Press 10 To GOTO The Program MAINMANU"+ANSI_RESET);
        System.out.println(ANSI_RED+"\t\t\t\t   Press 11 To GOTO The Program ROOT"+ANSI_RESET);
        System.out.println("\t\t\t\t**********************************************************************");
        System.out.print(ANSI_YELLOW +"Enter any choice between 1 to 11 : "+ANSI_RESET);
        Scanner sc1 = new Scanner(System.in);
        int ch1 = sc1.nextInt();
        switch(ch1) {
            case 1:
                System.out.println(ANSI_PURPLE +"\t\t\t\tSelect Respective Match"+ANSI_RESET);
                System.out.println("\t\t\t\t----------------------------------------------------------------------");
                System.out.println(ANSI_BLUE+"\t\t\t\t1.PBKS_vs_CSK");
                System.out.println("\t\t\t\t2.PBKS_vs_DC");
                System.out.println("\t\t\t\t3.PBKS_vs_KKR");
                System.out.println("\t\t\t\t4.PBKS_vs_MI");
                System.out.println("\t\t\t\t5.PBKS_vs_RR");
                System.out.println("\t\t\t\t6.PBKS_vs_RCB");
                System.out.println("\t\t\t\t7.PBKS_vs_SRH"+ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_RED+"\t\t\t\t   Press 8 for Exit The Program :"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 9 To GOTO The Program MAINMANU"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 10 To GOTO The Program ROOT"+ANSI_RESET);
                System.out.println("\t\t\t\t**********************************************************************");
                System.out.print(ANSI_YELLOW + "Enter any choice between 1 to 10 : " + ANSI_RESET);
                Scanner sc2 = new Scanner(System.in);
                int ch2 = sc2.nextInt();
                switch (ch2) {
                    case 1:
                        PBKS_vs_CSK();
                        break;

                    case 2:
                        PBKS_vs_DC();
                        break;

                    case 3:
                        PBKS_vs_KKR();
                        break;

                    case 4:
                        PBKS_vs_MI();
                        break;

                    case 5:
                        PBKS_vs_RR();
                        break;

                    case 6:
                        PBKS_vs_RCB();
                        break;

                    case 7:
                        PBKS_vs_SRH();
                        break;

                    case 8:
                        System.exit(0);
                        break;
                    case 9:
                        GOTO_MAINMANU();
                        break;

                    case 10:
                        ROOT_MANU();
                        break;

                    default:
                        System.out.println("");
                }


                break;

            case 2:
                System.out.println(ANSI_PURPLE +"\t\t\t\tSelect Respective Match"+ANSI_RESET);
                System.out.println("\t\t\t\t----------------------------------------------------------------------");
                System.out.println(ANSI_BLUE+"\t\t\t\t1.KKR_vs_CSK");
                System.out.println("\t\t\t\t2.KKR_vs_DC");
                System.out.println("\t\t\t\t3.KKR_vs_PBKS");
                System.out.println("\t\t\t\t4.KKR_vs_MI");
                System.out.println("\t\t\t\t5.KKR_vs_RR");
                System.out.println("\t\t\t\t6.KKR_vs_RCB");
                System.out.println("\t\t\t\t7.KKR_vs_SRH"+ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_RED+"\t\t\t\tPress 8 for Exit The Program :"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 9 To GOTO The Program MAINMANU"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 10 To GOTO The Program ROOT"+ANSI_RESET);
                System.out.println("\t\t\t\t**********************************************************************");
                System.out.print(ANSI_YELLOW + "Enter any choice between 1 to 10 : " + ANSI_RESET);
                Scanner sc3 = new Scanner(System.in);
                int ch3 = sc3.nextInt();
                switch (ch3) {
                    case 1:
                        KKR_vs_CSK();

                        break;
                    case 2:
                        KKR_vs_DC();
                        break;
                    case 3:
                        KKR_vs_PBKS();
                    case 4:
                        KKR_vs_MI();
                        break;
                    case 5:
                        KKR_vs_RR();
                        break;
                    case 6:
                        KKR_vs_RCB();
                        break;
                    case 7:
                        KKR_vs_SRH();
                        break;

                    case 8:
                        System.exit(0);
                        break;

                    case 9:
                        GOTO_MAINMANU();
                        break;
                    case 10:
                        ROOT_MANU();
                        break;

                    default:
                        System.out.println(ANSI_RED+"\t\t\t\tInvalid Choice!! Please enter a valid choice..."+ANSI_RESET);
                        break;
                }


            case 3:
                System.out.println(ANSI_PURPLE +"\t\t\t\tSelect Respective Match"+ANSI_RESET);
                System.out.println("\t\t\t\t----------------------------------------------------------------------");
                System.out.println(ANSI_BLUE+"\t\t\t\t1.MI_vs_CSK");
                System.out.println("\t\t\t\t2.MI_vs_DC");
                System.out.println("\t\t\t\t3.MI_vs_PBKS");
                System.out.println("\t\t\t\t4.MI_vs_KKR");
                System.out.println("\t\t\t\t5.MI_vs_RR");
                System.out.println("\t\t\t\t6.MI_vs_RCB");
                System.out.println("\t\t\t\t7.MI_vs_SRH"+ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_RED+"\t\t\t\tPress 8 for Exit The Program :"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 9 To GOTO The Program MAINMANU"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 10 To GOTO The Program ROOT"+ANSI_RESET);
                System.out.println("\t\t\t\t**********************************************************************");
                System.out.print(ANSI_YELLOW + "Enter any choice between 1 to 10 : " + ANSI_RESET);
                Scanner sc4 = new Scanner(System.in);
                int ch4 = sc4.nextInt();
                switch (ch4) {
                    case 1:
                        MI_vs_CSK();
                        break;

                    case 2:
                        MI_vs_DC();
                        break;

                    case 3:
                        MI_vs_PBKS();
                        break;

                    case 4:
                        MI_vs_KKR();
                        break;

                    case 5:
                        MI_vs_RR();
                        break;

                    case 6:
                        MI_vs_RCB();
                        break;

                    case 7:
                        MI_vs_SRH();
                        break;

                    case 8:
                        System.exit(0);
                        break;

                    case 9:
                        GOTO_MAINMANU();
                        break;
                    case 10:
                        ROOT_MANU();
                        break;

                    default:
                        System.out.println(ANSI_RED+"\t\t\t\tInvalid Choice!! Please enter a valid choice..."+ANSI_RESET);
                        break;
                }

            case 4:
                System.out.println(ANSI_PURPLE +"\t\t\t\tSelect Respective Match"+ANSI_RESET);
                System.out.println("\t\t\t\t----------------------------------------------------------------------");
                System.out.println(ANSI_BLUE+"\t\t\t\t1.RR_vs_CSK");
                System.out.println("\t\t\t\t2.RR_vs_DC");
                System.out.println("\t\t\t\t3.RR_vs_KKR");
                System.out.println("\t\t\t\t4.RR_vs_MI");
                System.out.println("\t\t\t\t5.RR_vs_PBKS");
                System.out.println("\t\t\t\t6.RR_vs_RCB");
                System.out.println("\t\t\t\t7.RR_vs_SRH"+ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_RED+"\t\t\t\tPress 8 for Exit The Program :"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 9 To GOTO The Program MAINMANU"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 10 To GOTO The Program ROOT"+ANSI_RESET);
                System.out.println("\t\t\t\t**********************************************************************");
                System.out.print(ANSI_YELLOW + "Enter any choice between 1 to 10 : " + ANSI_RESET);
                Scanner sc5 = new Scanner(System.in);
                int ch5 = sc5.nextInt();
                switch (ch5) {
                    case 1: RR_vs_CSK();break;
                    case 2: RR_vs_DC();break;
                    case 3: RR_vs_KKR();break;
                    case 4:RR_vs_MI ();break;
                    case 5: RR_vs_PBKS();break;
                    case 6:RR_vs_RCB();break;
                    case 7:RR_vs_SRH();break;

                    case 8:
                        System.exit(0);
                        break;

                    case 9:
                        GOTO_MAINMANU();
                        break;
                    case 10:
                        ROOT_MANU();
                        break;

                    default:
                        System.out.println(ANSI_RED+"\t\t\t\tInvalid Choice!! Please enter a valid choice..."+ANSI_RESET);
                        break;
                }

            case 5:
                System.out.println(ANSI_PURPLE +"\t\t\t\tSelect Respective Match"+ANSI_RESET);
                System.out.println("\t\t\t\t----------------------------------------------------------------------");
                System.out.println(ANSI_BLUE+"\t\t\t\t1.RCB_vs_CSK");
                System.out.println("\t\t\t\t2.RCB_vs_DC");
                System.out.println("\t\t\t\t3.RCB_vs_PBKS");
                System.out.println("\t\t\t\t4.RCB_vs_MI");
                System.out.println("\t\t\t\t5.RCB_vs_RR");
                System.out.println("\t\t\t\t6.RCB_vs_KKR");
                System.out.println("\t\t\t\t7.RCB_vs_SRH"+ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_RED+"\t\t\t\tPress 8 for Exit The Program :"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 9 To GOTO The Program MAINMANU"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 10 To GOTO The Program ROOT"+ANSI_RESET);
                System.out.println("\t\t\t\t**********************************************************************");
                System.out.print(ANSI_YELLOW + "Enter any choice between 1 to 10 : " + ANSI_RESET);
                Scanner sc6 = new Scanner(System.in);
                int ch6 = sc6.nextInt();
                switch (ch6) {
                    case 1:RCB_vs_CSK();;break;
                    case 2: RCB_vs_DC();;break;
                    case 3:RCB_vs_PBKS();break;
                    case 4:RCB_vs_MI();break;
                    case 5:RCB_vs_RR();break;
                    case 6:RCB_vs_KKR();;break;
                    case 7:RCB_vs_SRH();;break;

                    case 8:
                        System.exit(0);
                        break;

                    case 9:
                        GOTO_MAINMANU();
                        break;
                    case 10:
                        ROOT_MANU();
                        break;
                    default:
                        System.out.println(ANSI_RED+"\t\t\t\tInvalid Choice!! Please enter a valid choice..."+ANSI_RESET);
                        break;
                }

            case 6:
                System.out.println(ANSI_PURPLE +"\t\t\t\tSelect Respective Match"+ANSI_RESET);
                System.out.println("\t\t\t\t----------------------------------------------------------------------");
                System.out.println(ANSI_BLUE+"\t\t\t\t1.DC_vs_CSK");
                System.out.println("\t\t\t\t2.DC_vs_KKR");
                System.out.println("\t\t\t\t3.DC_vs_PBKS");
                System.out.println("\t\t\t\t4.DC_vs_MI");
                System.out.println("\t\t\t\t5.DC_vs_RR");
                System.out.println("\t\t\t\t6.DC_vs_RCB");
                System.out.println("\t\t\t\t7.DC_vs_SRH"+ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_RED+"\t\t\t\tPress 8 for Exit The Program :"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 9 To GOTO The Program MAINMANU"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 10 To GOTO The Program ROOT"+ANSI_RESET);
                System.out.println("\t\t\t\t**********************************************************************");
                System.out.print(ANSI_YELLOW +"Enter any choice between 1 to 10 : "+ANSI_RESET);
                Scanner sc7 = new Scanner(System.in);
                int ch7 = sc7.nextInt();
                switch(ch7) {
                    case 1:DC_vs_CSK();;break;
                    case 2:DC_vs_KKR();;break;
                    case 3:DC_vs_PBKS();break;
                    case 4:DC_vs_MI();break;
                    case 5:DC_vs_RR();break;
                    case 6:DC_vs_RCB();;break;
                    case 7:DC_vs_SRH();;break;
                    case 8:
                        System.exit(0);
                        break;

                    default:
                        System.out.println(ANSI_RED+"\t\t\t\tInvalid Choice!! Please enter a valid choice..."+ANSI_RESET);
                        break;

                    case 9:
                        GOTO_MAINMANU();
                        break;
                    case 10:
                        ROOT_MANU();
                        break;
                }

            case 7:
                System.out.println(ANSI_PURPLE +"\t\t\t\tSelect Respective Match"+ANSI_RESET);
                System.out.println("\t\t\t\t----------------------------------------------------------------------");
                System.out.println(ANSI_BLUE+"\t\t\t\t1.SRH_vs_CSK");
                System.out.println("\t\t\t\t2.SRH_vs_DC");
                System.out.println("\t\t\t\t3.SRH_vs_PBKS");
                System.out.println("\t\t\t\t4.SRH_vs_MI");
                System.out.println("\t\t\t\t5.SRH_vs_RR");
                System.out.println("\t\t\t\t6.SRH_vs_RCB");
                System.out.println("\t\t\t\t7.SRH_vs_KKR"+ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_RED+"\t\t\t\tPress 8 for Exit The Program :"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 9 To GOTO The Program MAINMANU"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 10 To GOTO The Program ROOT"+ANSI_RESET);
                System.out.println("\t\t\t\t**********************************************************************");
                System.out.print(ANSI_YELLOW +"Enter any choice between 1 to 10 : "+ANSI_RESET);
                Scanner sc8 = new Scanner(System.in);
                int ch8 = sc8.nextInt();
                switch(ch8) {
                    case 1: SRH_vs_CSK();;break;
                    case 2:SRH_vs_DC();break;
                    case 3:SRH_vs_PBKS();break;
                    case 4: SRH_vs_MI();break;
                    case 5: SRH_vs_RR();;break;
                    case 6:SRH_vs_RCB();break;
                    case 7:SRH_vs_KKR();break;


                    case 8:
                        System.exit(0);
                        break;

                    case 9:
                        GOTO_MAINMANU();
                        break;
                    case 10:
                        ROOT_MANU();
                        break;

                    default:
                        System.out.println(ANSI_RED+"\t\t\t\tInvalid Choice!! Please enter a valid choice..."+ANSI_RESET);
                        break;

                }

            case 8:
                System.out.println(ANSI_PURPLE +"\t\t\t\tSelect Respective Match"+ANSI_RESET);
                System.out.println("\t\t\t\t----------------------------------------------------------------------");
                System.out.println(ANSI_BLUE+"\t\t\t\t1.CSK_vs_KKR");
                System.out.println("\t\t\t\t2.CSK_vs_DC");
                System.out.println("\t\t\t\t3.CSK_vs_KKR");
                System.out.println("\t\t\t\t4.CSK_vs_MI");
                System.out.println("\t\t\t\t5.CSK_vs_RR");
                System.out.println("\t\t\t\t6.CSK_vs_RCB");
                System.out.println("\t\t\t\t7.CSK_vs_SRH"+ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_RED+"\t\t\t\tPress 9 for Exit The Program :"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 9 To GOTO The Program MAINMANU"+ANSI_RESET);
                System.out.println(ANSI_RED+"\t\t\t\t   Press 10 To GOTO The Program ROOT"+ANSI_RESET);
                System.out.println("\t\t\t\t**********************************************************************");
                System.out.print(ANSI_YELLOW +"Enter any choice between 1 to 10 : "+ANSI_RESET);
                Scanner sc9 = new Scanner(System.in);
                int ch9 = sc9.nextInt();
                switch(ch9) {
                    case 1:CSK_vs_KKR();break;
                    case 2: CSK_vs_DC();break;
                    case 3:CSK_vs_PBKS();break;
                    case 4:CSK_vs_MI();break;
                    case 5:CSK_vs_RR();break;
                    case 6: CSK_vs_RCB();break;
                    case 7: CSK_vs_SRH();break;


                    case 8:
                        System.exit(0);
                        break;

                    case 9:
                        GOTO_MAINMANU();
                        break;
                    case 10:
                        ROOT_MANU();
                        break;

                    default:
                        System.out.println(ANSI_RED+"\t\t\t\tInvalid Choice!! Please enter a valid choice..."+ANSI_RESET);
                        break;
                }

            case 9:
                System.exit(0);
                break;

            case 10:
                Mainmanu2();
                break;
            case 11:
                ROOT_MANU();
                break;

            default:
                System.out.println(ANSI_RED+"\t\t\t\tInvalid Choice!! Please enter a valid choice..."+ANSI_RESET);
                break;
        }
    }

    public static void ROOT_MANU()
    {
        System.out.println(ANSI_BLUE + "\n\n\n\t\t\t\t:-----------------Menu--------------:" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "\t\t\t\t|\t\t\t1. Team\t\t\t\t\t| \n  \t\t\t\t|\t\t\t2. Stadium\t\t\t\t|  \n   \t\t\t\t|\t\t\t3. Ticket Booking\t\t|    \n   \t\t\t\t|\t\t\t4. About Us\t\t\t\t|  \n   \t\t\t\t|\t\t\t0. Exit\t\t\t\t\t|" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "\t\t\t\t:-----------------------------------:\n" + ANSI_RESET);
        System.out.print(ANSI_YELLOW +"Enter any choice between 0 to 4 : "+ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 :
                // Keval Code
                MainMenu();
                break;
            case 2 :
                // Tejasya Code
                std_mn();
                break;
            case 3 :
                // Jeel Code
                Mainmanu2();

            case 4 :
                // Priyanshi Code
                ABout_us(); ROOT_MANU();
                break;
            case 0 : System.out.println("\t\t\t\t"+ANSI_Black+ANSI_CYAN+"Thanks for using our App. Visit again"+ANSI_reset+ANSI_RESET);
                System.exit(0);
                break;

            default : System.out.println(ANSI_RED+"\t\t\t\tInvalid Choice!! Please enter a valid choice..."+ANSI_RESET); ROOT_MANU();
        }
    }
    public static void main(String[]args)
    {

        Scanner Scanf = new Scanner(System.in);
        Ascii_art();
        System.out.println("");


        /**/
        System.out.print(ANSI_Black + ANSI_CYAN + "\t\t\t\t\t\t  Signup \t\t\t\t\t\n"+ ANSI_reset + ANSI_RESET);

        int count = 3;
        while (count != 0)
        {

            // Username
            System.out.print(ANSI_YELLOW + "Please Enter Username : " + ANSI_RESET);
            Username=Scanf.next();

            // Phone Number
            System.out.print(ANSI_YELLOW + "Please Enter Phone Number : " + ANSI_RESET);
            Phone_number=Scanf.next();

            // Email
            System.out.print(ANSI_YELLOW + "Please Enter Email : " + ANSI_RESET);
            Email=Scanf.next();

            // Address
            System.out.print(ANSI_YELLOW + "Please Enter Address : " + ANSI_RESET);
            Address=Scanf.next();

            // Password
            System.out.print(ANSI_YELLOW + "Please Enter Password : " + ANSI_RESET);
            Password=Scanf.next();

            // Confirm Password
            System.out.print(ANSI_YELLOW + "Please Enter Conform Password : "+ ANSI_RESET);
            Confirm_Password=Scanf.next();



            // This is For Password Matching


            if (Password.equals(Confirm_Password) && is_Valid_Password(Password))
            {
                Line();
                System.out.println(ANSI_CYAN + "Signup correctly!" + ANSI_RESET);
                Line();

                int count2=3;
                while (count2 != 0)
                {
                    System.out.print(ANSI_Black + ANSI_CYAN + "\t\t\t\t\t\t  Login \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n"+ ANSI_reset + ANSI_RESET);

                    System.out.print(ANSI_YELLOW+"Enter The Username or Email : "+ANSI_RESET);
                    String Login_Username=Scanf.next();
                    System.out.print(ANSI_YELLOW+"Enter The Password : "+ANSI_RESET);
                    String Login_Password=Scanf.next();

                    if (Login_Username.equals(Username) && Login_Password.equals(Password) || Login_Username.equals(Email) && Login_Password.equals(Password))
                    {
                        Line();
                        System.out.println(ANSI_CYAN + "Login Successfully !!!" + ANSI_RESET);
                        Line();
                        System.out.println();
                        System.out.println();

                        // The First Switch Case :-------


                        ROOT_MANU();
                        break;

                    }
                    else
                    {
                        Line();
                        System.out.println(ANSI_RED+"You Aren't Successfully Log in !!"+ANSI_RESET);
                        Line();
                        count2--;
                    }
                }


                break;

            }
            else
            {
                Line();
                System.out.println(ANSI_RED + "Password rules:\n" +
                        "Password Must Be same.\n"+
                        "A password must have at least two Special Symbols\n"+
                        "A password must have at least 8 characters.\n" +
                        "A password consists of only letters Symbols,and digits.\n" +
                        "A password must contain at least two digits" + ANSI_RESET);
                Line();
                count--;
            }


        }
    }
}