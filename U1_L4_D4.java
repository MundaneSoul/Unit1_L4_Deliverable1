/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1_lesson4_deliverables;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author bitstudent
 */
public class U1_L4_D4 {
       public static void main(String[] args) {
           BigInteger wisconsinPop = new BigInteger("5726398");
           BigInteger californiaPop = new BigInteger("38041430");
           BigInteger texasPop = new BigInteger("26059203");
           //part1
           BigInteger prod = wisconsinPop.multiply(californiaPop);
           System.out.println("You would send " + prod + " letters from every person in "
                   + "Wisconsin to every person in California\n");
           //part 2
           BigInteger prod2 = prod.multiply(texasPop);
           System.out.println("If every letter was copied and sent to every Texan, "
                   + "there'd be" + prod2 + "letters sent.\n");
           //part 3
           BigDecimal price = new BigDecimal(prod2.floatValue() * 3.23);
           System.out.println("You woud pay $" + price +"\n for each copy at $3.23 each");
    }
}
