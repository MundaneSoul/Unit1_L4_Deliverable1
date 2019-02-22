
package u1_lesson4_deliverables;

import java.util.Scanner;

/**
 *
 * @author bitstudent
 */
public class U1_L4_D3 {
             public static void main(String[] args) {
                 System.out.println("Enter how many bits: ");
                 Scanner input = new Scanner(System.in);
                 long data = input.nextLong();
                 String dataType = "";
                 
                 if (data <= 127 && data >= -128){
                     dataType = "byte";
                 }
                 else if(data <=32767 && data>= -32768){
                     dataType = "short";
                 }
                 else if(data <=2147483647 && data>= -2147483648){
                     dataType = "integer";
                 }
                 
                 else if(data <=9223372036854775807 && data>= -9223372036854775808){
                     dataType = "long";
                 }
                 
                 else{
                     System.out.println("Please Enter Valid Number of Bits");;
                 }
                 
                 
                 System.out.println("The smallest data type that many bits can be stored in is an "
                 + dataType);
             }
    
}
