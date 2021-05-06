

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany m;
	Property p1, p2, p3, p4, p5, p6;

	@Before
	public void setUp() throws Exception {
		//set up
		m = new ManagementCompany("asdasd", "1231", 15);
		Property p1 = new Property("sdas", "city 1", 5000, "Dime", 1, 2, 2, 2);
		Property p2 = new Property("Kojd", "city 2", 4300, "Dime", 3, 2, 2, 2);
		Property p3 = new Property("This place", "city 3", 3900, "Dime", 4, 4, 2, 2);

		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null
		m = null;
		p1 = p2 = p3 = p4 = p5 = p6 = null;

	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		p4 = new Property("Day sds", "City 2", 3443, "sitys");
		assertEquals(m.addProperty(p4), 3, 0);
		
		//student should add property with 8 args
		p5 = new Property("asdasd", "asdas", 4500, "sdsd", 4, 6, 2, 2);
		assertEquals(m.addProperty(p5), 4, 0);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		p6 = new Property("Not added", "Does not exist City", 50505, "sdasd", 9, 9, 1, 1);
		assertEquals(m.addProperty(p6), -1, 0);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m.maxRentProp(), 5000, 0);
		
	}

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		assertEquals(m.totalRent(), 13200, 0);
	}

 }