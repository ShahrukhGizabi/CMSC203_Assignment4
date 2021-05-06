
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTest {
	Property p1 ,p2,p3,p4,p5,p6;
	ManagementCompany m ; 
	
	@Before
	public void setUp() throws Exception {
		//sET UP
		p1 = new Property ("Hevan", "Creamary", 4844.00, "Daniel Jayce",2,1,2,2);
		p2 = new Property ("Chuck", "Highland", 4114, "Tim",4,1,2,2);
		p3 = new Property ("Jimmy land", "Place", 4905, "two words",6,1,2,2);
		
		m= new ManagementCompany("Rat land", "555555555",6);
	 
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
	}

	@After
	public void tearDown() throws Exception {
		//tear down
		p1=p2=p3=p4=p5=p6=null;
		m=null;
	}
			
	@Test
	public void testGetMAX_PROPERTY() {
		//test1
		assertEquals(m.getMAX_PROPERTY(),5);
	}

	@Test
	public void testAddProperty() {
		//addproperty test
		p4 = new Property ("Wherelse", "Doney", 2613, "Wanger",2,5,2,2);
		p5 = new Property ("More things", "Lakepointe", 5327, "Kimmy JOhn",4,5,2,2);
		p6 = new Property ("My JOhn", "Wow bea", 1000, "Dont be",6,5,2,2);
		 
		assertEquals(m.addProperty(p4),3,0);
		assertEquals(m.addProperty(p5),4,0);
		assertEquals(m.addProperty(p6),-1,0);  
	}

	@Test
	public void testTotalRent() {
		//test total rent
		assertEquals(m.totalRent(),13863.0,0);
	}

	 
	@Test
	public void testMaxRentProperty() {
		//test max rent property
		assertEquals(m.maxRentProp(),4905.0,0);
	}
	

	

}