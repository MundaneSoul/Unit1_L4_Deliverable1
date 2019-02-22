/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1_lesson4_deliverables;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author bitstudent
 */
public class U1_Lesson4_Deliverables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
            
            String formattedDate1 = "09/March/1987";
            String formattedDate2 = "10/October/1988";
            LocalDate date1= LocalDate.parse(formattedDate1, formatter);
            LocalDate date2 = LocalDate.parse(formattedDate2, formatter);
            
            //Test printing formatted dates & local time (now)
            //System.out.println(date1+ "\n" + date2 + "\n");
            //System.out.println(LocalDate.now());
            
            //Calculate how many days, months, years elapsed (part 1)
            Period period = Period.between(date1, LocalDate.now());
            Integer daysElasped = period.getDays();
            Integer monthsElasped = period.getMonths();
            Integer yearsElasped = period.getYears();
            //Output to console
           System.out.println("Months, days years elasped since U2 released \'The Joshua Tree\'");
            System.out.println("localDate: " + LocalDate.now() + " to " + date1 
                    + " in days: " + daysElasped );
            System.out.println("localDate: " + LocalDate.now() + " to " + date1 
                    + " in months: " + monthsElasped );
            System.out.println("localDate: " + LocalDate.now() + " to " + date1 
                    + " in years: " + yearsElasped );
            
            //Calculate how many days, months, years elspased (part 2)
            Period period2 = Period.between(date1, date2);
            Integer daysElasped2 = period2.getDays();
            Integer monthsElasped2 = period2.getMonths();
            Integer yearsElasped2 = period2.getYears(); 
            //Output to Console
           System.out.println("\nMonths, days years elasped between U2 releasing \'Rattle and Hum\' and \'The Joshua Tree\'");
            System.out.println("localDate: " + date1 + " to " + date2 
                    + " in days: " + daysElasped2 );
            System.out.println("localDate: " + date1 + " to " + date2 
                    + " in months: " + monthsElasped2 );
            System.out.println("localDate: " + date1 + " to " + date2 
                    + " in years: " + yearsElasped2 );
            
            //Calculate time difference and get date of potential third album
            LocalDate newAlbum = date2.plus(period2);
            System.out.println("\nIf another album was released in the same time period between the two albums, the date would be: " + newAlbum);
    }
    
}
