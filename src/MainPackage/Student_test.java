package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@SuppressWarnings("deprecation")
	public void test() {
		/** Person tom = new Person();
		tom.setName("tommy");
		tom.setAddress("123 Main Street");
		tom.setPhone_number("20321321");
		tom.setEmail_address("tkananen@hotmail.com");
		*/ 
		

		Student myStudent = new Student("tommy", "MainStree","20312312","tkananen@hotmail.com",myStudent.getClass) ;
		
		System.out.print(myStudent);
		
		
		
		

	}

}
