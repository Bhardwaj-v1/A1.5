import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;
/** ***************************************************
 *  Name:           Varish
 *  Class:          CS30S
 * 
 *  Assignment:     A1.5 Q1
 * 
 *  Description:    generate 1000 numbers 1-50 digits
 * 
 *************************************************************/

public class Assignment1point5Q1 {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
        final int MAX = 1000;
    // ***** variables *****
        
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        int randomInt = 0;
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
        Random rnd = new Random();          // random number generator
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
        
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Varish" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1.5 Q1" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
    for(int i = 0; i < MAX; i++){
    
        randomInt = (rnd.nextInt(50) +1); //generates random numbers
        //printing random numbers
        System.out.println(randomInt);
        fout.print(randomInt);
    
    }
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        fout.close();
    } // end main 
    
} // end FormatTemplate
