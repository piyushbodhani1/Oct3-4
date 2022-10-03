package testQ4;
/**
 * @author PiyushBodhani
 *
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import subjectQ4.Amazon;
import subjectQ4.Facebook;
import subjectQ4.Google;
import subjectQ4.Microsoft;

public class OrganizationTest {
	@Test
	public void answer() {
		// for microsoft
		Microsoft m = new Microsoft();
		String s1 = m.nameOfOrganization();
		String str1 = m.nameOfitsParentOrganization();
		int no1 = m.NoOfSectorsitDealswith();
		int marketCap1 = m.MarketCap();
		assertEquals("Microsoft", s1);
		assertEquals("AuraSoft", str1);
		assertEquals(5, no1);
		assertEquals(100000, marketCap1);
		System.out.println("Name Of the Organization:-"+s1);
		System.out.println("Name Of the Parent Organization:-"+str1);
		System.out.println("No Of Sector Organization Deal with"+no1);
		System.out.println("Market Cap Of Organization:-"+marketCap1);
        System.out.println();
		// for amazon
		Amazon a = new Amazon();
		String s2 = a.nameOfOrganization();
		String str2 = a.nameOfitsParentOrganization();
		int no2 = a.NoOfSectorsitDealswith();
		int marketCap2 = a.MarketCap();
		assertEquals("Amazon", s2);
		assertEquals("AWS", str2);
		assertEquals(4, no2);
		assertEquals(200000, marketCap2);
		System.out.println("Name Of the Organization:-"+s2);
		System.out.println("Name Of the Parent Organization:-"+str2);
		System.out.println("No Of Sector Organization Deal with"+no2);
		System.out.println("Market Cap Of Organization:-"+marketCap2);
		System.out.println();
		// for Google
		Google g = new Google();
		String s3 = g.nameOfOrganization();
		String str3 = g.nameOfitsParentOrganization();
		int no3 = g.NoOfSectorsitDealswith();
		int marketCap3 = g.MarketCap();
		assertEquals("Google", s3);
		assertEquals("Alphabet", str3);
		assertEquals(5, no3);
		assertEquals(100000000, marketCap3);
		System.out.println("Name Of the Organization:-"+s3);
		System.out.println("Name Of the Parent Organization:-"+str3);
		System.out.println("No Of Sector Organization Deal with"+no3);
		System.out.println("Market Cap Of Organization:-"+marketCap3);
		System.out.println();
		// for Facebook
		Facebook f = new Facebook();
		String s4 = f.nameOfOrganization();
		String str4 = f.nameOfitsParentOrganization();
		int no4 = f.NoOfSectorsitDealswith();
		int marketCap4 = f.MarketCap();
		assertEquals("Facebook", s4);
		assertEquals("Meta", str4);
		assertEquals(4, no4);
		assertEquals(2469999, marketCap4);
		System.out.println("Name Of the Organization:-"+s4);
		System.out.println("Name Of the Parent Organization:-"+str4);
		System.out.println("No Of Sector Organization Deal with"+no4);
		System.out.println("Market Cap Of Organization:-"+marketCap4);

	}
}
