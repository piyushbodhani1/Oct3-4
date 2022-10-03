package testQ5;
/**
 * @author PiyushBodhani
 *
 */
import subjectQ5.Farm;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FarmTest {
	@Test
   public void checkk() {
	   Farm f = new Farm();
	   
	   // for chicken
	   String str = f.nameOfAnimal();
	   System.out.println("Name Of Animal:-"+str);
	   assertEquals("Chicken", str);
	   int n = f.weightOfChicken();
	   System.out.println("Weight Of the chicken:-"+n);
	   assertEquals(22, n);
	   int n1 = f.QuatityOfFoodConsumesByChicken();
	   System.out.println("Quantity Of food consumed by the chicken:-"+n1);
	   assertEquals(1, n1);
	   int n3 = f.profitEarnedByChicken();
	   System.out.println("Profit Earned:-"+n3);
	   assertEquals(30, n3);
	   System.out.println();
	   //for Goat
	   String st = f.nameOfSecondAnimal();
	   System.out.println("Name Of Second Animal:-"+st);
	   assertEquals("Goat",st );
	   int m = f.weightOfGoat();
	   System.out.println("Weight Of Goat"+m);
	   assertEquals(50, m);
	   int m1 = f.QuatityOfFoodConsumesByGoat();
	   System.out.println("Quantity of food consumed by the goat:-"+m1);
	   assertEquals(5, m1);
	   int m2 = f.profitEarnedByGoat();
	   System.out.println("Profit earned By the Goat:-"+m2);
	   assertEquals(60, m2);
	   
   }
}
