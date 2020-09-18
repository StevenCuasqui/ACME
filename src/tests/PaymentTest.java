package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import acme.employees.controllers.PersonnelController;

@RunWith(value = Parameterized.class)
public class PaymentTest {

	@Parameters
	public static Iterable<Object[]> getParam(){
		List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[] {"MO",0});
		obj.add(new Object[] {"TU",1});
		obj.add(new Object[] {"WE",2});
		obj.add(new Object[] {"TH",3});
		obj.add(new Object[] {"FR",4});
		obj.add(new Object[] {"SA",5});
		obj.add(new Object[] {"SU",6});
		return obj;
	}
	private String dayTest;
	private int res;
	
	PersonnelController personnelTest;
	
	//Construct to be filled with @Parameter iterable function
	public PaymentTest(String dayTest, int res) {
		this.dayTest = dayTest;
		this.res = res;
	}
	
	@Before
	public void instance() {
		personnelTest = new PersonnelController();
	}
	
	@Test
	public void dayTransformationTest() {
		int testValue = this.personnelTest.transformDay(dayTest);
		assertEquals(res,testValue);
	}
	
	@Test
	public void paymentByHourTest() {
		int testWorkDay = 5, testWorkStartHour = 8;
		double obj = 30;
		//Last Parameter of Assert is a delta (tolerance)
		assertEquals(obj,this.personnelTest.hourPayment( testWorkDay , testWorkStartHour),0);
	}
	

}
