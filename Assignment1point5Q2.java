;import java.util.Scanner;
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

public class Assignment1point5Q2 {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
        final int MAX = 1000;
        final int NUMBERMAX = 50;       
        
    // ***** variables *****
        
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        BufferedReader fin = null;       // input bufferreader
        
        int count = 0;                   // increment counter
        int randomInt = 0;
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        //Variables 
        int[] List = new int[MAX];
        int[] FrequencyArray = new int[NUMBERMAX];
        
    
    // ***** objects *****
        Random rnd = new Random();          // random number generator
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
           try{
           fin = new BufferedReader(new FileReader("numbers.txt"));
        }// end try 
        catch(FileNotFoundException e){
           System.out.println("File not found"); 
          fin = null; 
        }// end catch
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
        
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Varish" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1.5 Q2" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    //part 1
    // for(int i = 0; i < MAX; i++){
    
        // randomInt = (rnd.nextInt(50) +1); //generates random numbers
        // //printing random numbers
        // System.out.println(randomInt);
        // fout.println(randomInt);
    
    // }
    
    //test to see if my strin is working
    // strin = fin.readLine();
    // while(strin != null){
    // System.out.println(strin);
    // }
    
    
    for(strin = fin.readLine();strin != null;strin = fin.readLine()) {
            
            //parsing strin into int to list
            List[count] = Integer.parseInt(strin);

            //Incrementing counter
            count++;
        }
    
    //finding the frequenecy 
    
    for(int i = 0; i < count; i++){
            FrequencyArray[List[i]-1]++;
        }//end of for loop
    //printing the array
    for(int i = 0; i < NUMBERMAX; i++){

            System.out.println(i+1+ "=="+FrequencyArray[i]);

        }//end of for loop
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
