
import java.util.*;

/**
 * 
 * <p>This is Main class where user will enter two  integer  values
 *   and the  method  meanOfTwoNum() will give the mean of those two numbers .
 *  </p>
 * @author Akash Wakade
 * @version 1.0
 * 
 */


public class Main
{
	public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Mean mean = new Mean();
            
            
           System.out.print("Enter the first number\n");
             mean.num1= sc.nextInt();

            System.out.print("Enter the second number\n");
             mean.num2= sc.nextInt();

           int M = mean.meanOfTwoNum(mean.num1,mean.num2);
         System.out.printf(" the mean of %d  and %d is : %d",mean.num1,mean.num2,M);
	}
}
