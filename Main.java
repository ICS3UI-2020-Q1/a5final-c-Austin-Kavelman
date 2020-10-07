import java.util.Scanner;

/**
 *  For loop final test
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);
                                                          
    //make variable of start, end
    int start, end;

    //asks the user to enter a number to begin counting from
    System.out.println("What number do you want to begin counting from?");
    //inputs the starting interger
    start = input.nextInt();

    //asks the user to enter a number to end counting at
    System.out.println("What number do you want to end counting at?");
    //inputs the starting interger
    end = input.nextInt();

    //for loop that counts from beginning number to end number
    for(start = 1; start >= 0; start++){
      System.out.println(start);
    if(start==end)
      break;
    }
  }
}
