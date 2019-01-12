

    Home
    Testing
    SAP
    Web
    Must Learn!
    Big Data
    Live Projects
    AI
    Blog

JUnit Annotations Tutorial with Example

What is JUnit Annotations?

Annotation is a special form of syntactic meta-data that can be added to Java source code for better code readability and structure. Variables, parameters, packages, methods and classes can be annotated.

Some of the JUnit annotations which can be useful are

    Before
    After
    BeforeClass
    AfterClass
    Ignore
    RunWith
    Test

Before learn Junit Annotations in detail see below classes which are very useful while writing a test case:

    org.junit.Assert
    org.junit.TestCase
    org.junit.TestResult
    org.junit.TestSuite

In this tutorial, you will learn-

    JUnit Assert Class

    JUnit Test Cases Class

    JUnit TestResult Class

    JUnit Test Suite Class

    JUnit Annotations

    JUnit Annotations Example 

JUnit Assert Class

This class provides a bunch of assertion methods useful in writing a test case. If all assert statements are passed, test results are successful. If any assert statement fails, test results are failed.

As you seen earlier, below table describes important Assert methods and description:
S.No. 	Method 	Description
1. 	void assertEquals(boolean expected, boolean actual) 	It checks whether two values are equals similar to equals method of Object class
2. 	void assertFalse(boolean condition) 	functionality is to check that a condition is false.
3. 	void assertNotNull(Object object) 	"assertNotNull" functionality is to check that an object is not null.
4. 	void assertNull(Object object) 	"assertNull" functionality is to check that an object is null.
5. 	void assertTrue(boolean condition) 	"assertTrue" functionality is to check that a condition is true.
6. 	void fail() 	If you want to throw any assertion error, you have fail() that always results in a fail verdict.
7. 	void assertSame([String message] 	"assertSame" functionality is to check that the two objects refer to the same object.
8. 	void assertNotSame([String message] 	"assertNotSame" functionality is to check that the two objects do not refer to the same object.
JUnit Test Cases Class

To run multiple test, TestCase class is available in org.junit.TestCase packages. Annotation @Test tells JUnit that this public void method (Test Case here) to which it is attached can be run as a test case.

Below table shows some important methods available in org.junit.TestCase class:
S.No. 	Method 	Description
1. 	int countTestCases() 	This method is used to count how many number of test cases executed by run(TestResult tr) method.
2. 	TestResult createResult() 	This method is used to create a TestResult object.
3. 	String getName() 	This method returns a string which is nothing but a TestCase.
4. 	TestResult run() 	This method is used to execute a test which returns a TestResult object
5. 	void run(TestResult result) 	This method is used to execute a test having a TestResult object which doesn't returns anything.
6. 	void setName(String name) 	This method is used to set a name of a TestCase.
7. 	void setUp() 	This method is used to write resource association code. e.g. Create a database connection.
8. 	void tearDown() 	This method is used to write resource release code. e.g. Release database connection after performing transaction operation.
JUnit TestResult Class
When you execute a test, it returns a result (in the form of TestResult object). This TestResult object can be used to analyse the resultant object. This test result can be either failure or successful. See below table for important methods used in org.junit.TestResult class:
S.No. 	Method 	Description
1. 	void addError(Test test, Throwable t) 	This method is used if you require add an error to the test.
2. 	void addFailure(Test test, AssertionFailedError t) 	This method is used if you require add a failure to the list of failures.
3. 	void endTest(Test test) 	This method is used to notify that a test is performed(completed)
4. 	int errorCount() 	This method is used to get the error detected during test execution.
5. 	Enumeration<TestFailure> errors() 	This method simply returns a collection (Enumeration here) of errors.
6. 	int failureCount() 	This method is used to get the count of errors detected during test execution.
7. 	void run(TestCase test) 	This method is used to execute a test case.
8. 	int runCount() 	This method simply counts the executed test.
9. 	void startTest(Test test) 	This method is used to notify that a test is started.
10. 	void stop() 	This method is used to test run to be stopped.
JUnit Test Suite Class

If you want to execute multiple tests in a specified order, it can be done by combining all the tests in one place. This place is called as the test suites.

See below table for important methods used in org.junit.TestSuite class:
S.No. 	Method 	Description
1. 	void addTest(Test test) 	This method is used if you want to add a test to the suite.
2. 	void addTestSuite(Class<? extends TestCase> testClass) 	This method is used if you want to specify the class while adding a test to the suite.
3. 	int countTestCases() 	This method is used if you want to count the number of test cases.
4. 	String getName() 	This method is used to get the name of the test suite.
5. 	void run(TestResult result) 	This method is used to execute a test and collect test result in TestResult object.
6. 	void setName(String name) 	This method is used to set the name of TestSuite.
7. 	Test testAt(int index) 	This method is used if you want to return the test at given index.
8. 	int testCount() 	This method is used if you want to return a number of tests in the Suite.
9. 	static Test warning(String message) 	This method returns a test which will fail and log a warning message.
JUnit Annotations

Annotations were introduced in Junit4, which makes Java code more readable and simple. This is the big difference between Junit3 and Junit4 that Junit4 is annotation based.

With the knowledge of annotations in Junit4, one can easily learn and implement a JUnit test.

Below is the list of important and frequently used annotations:

    @Before
    @BeforeClass
    @After
    @AfterClass
    @Test
    @Ignore
    @Test(timeout=500)
    @Test(expected=IllegalArgumentException.class)

see below table to understand more on annotation :
S.No. 	Annotations 	Description
1. 	@Test 	This annotation is a replacement of org.junit.TestCase which indicates that public void method to which it is attached can be executed as a test Case.
2. 	@Before 	This annotation is used if you want to execute some statement such as preconditions before each test case.
3. 	@BeforeClass 	This annotation is used if you want to execute some statements before all the test cases for e.g. test connection must be executed before all the test cases.
4. 	@After 	This annotation can be used if you want to execute some statements after each Test Case for e.g resetting variables, deleting temporary files ,variables, etc.
5. 	@AfterClass 	This annotation can be used if you want to execute some statements after all test cases for e.g. Releasing resources after executing all test cases.
6. 	@Ignores 	This annotation can be used if you want to ignore some statements during test execution for e.g. disabling some test cases during test execution.
7. 	@Test(timeout=500) 	This annotation can be used if you want to set some timeout during test execution for e.g. if you are working under some SLA (Service level agreement), and tests need to be completed within some specified time.
8. 	@Test(expected=IllegalArgumentException.class) 	This annotation can be used if you want to handle some exception during test execution. For, e.g., if you want to check whether a particular method is throwing specified exception or not.

Let's discuss on this with an example:
JUnit Annotations Example

Let's create a class covering important JUnit annotations with simple print statements and execute it with a test runner class:

Step 1)Consider below java class having various methods which are attached to above-listed annotations:

JunitAnnotationsExample.java

package guru99.junit;		

import static org.junit.Assert.assertEquals;				
import static org.junit.Assert.assertFalse;				

import java.util.ArrayList;		

import org.junit.After;		
import org.junit.AfterClass;		
import org.junit.Before;		
import org.junit.BeforeClass;		
import org.junit.Ignore;		
import org.junit.Test;		

public class JunitAnnotationsExample {				

    private ArrayList<String> list;					

    @BeforeClass		
    public static void m1() {							
        System.out.println("Using @BeforeClass , executed before all test cases ");					
    }		

    @Before		
    public void m2() {					
        list = new ArrayList<String>();					
        System.out.println("Using @Before annotations ,executed before each test cases ");					
    }		

    @AfterClass		
    public static void m3() {							
        System.out.println("Using @AfterClass ,executed after all test cases");					
    }		

    @After		
    public void m4() {					
        list.clear();			
        System.out.println("Using @After ,executed after each test cases");					
    }		

    @Test		
    public void m5() {					
        list.add("test");					
        assertFalse(list.isEmpty());			
        assertEquals(1, list.size());			
    }		

    @Ignore		
    public void m6() {					
        System.out.println("Using @Ignore , this execution is ignored");					
    }		

    @Test(timeout = 10)			
    public void m7() {					
        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");					
    }		

    @Test(expected = NoSuchMethodException.class)					
    public void m8() {					
        System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");					

    }		

}		

Step 2) let's create a test runner class to execute above test:

TestRunner.java

package guru99.junit;		

import org.junit.runner.JUnitCore;		
import org.junit.runner.Result;		
import org.junit.runner.notification.Failure;		

public class TestRunner {				
			public static void main(String[] args) {									
      Result result = JUnitCore.runClasses(JunitAnnotationsExample.class);					
			for (Failure failure : result.getFailures()) {							
         System.out.println(failure.toString());					
      }		
      System.out.println("Result=="+result.wasSuccessful());							
   }		
}      	

Expected Result

    All the test cases will be executed one by one, and all print statement can be seen on a console.
    As discussed in above table @Before, @BeforeClass [ method m1() and m2() ] will be executed before each and before all test cases respectively.
    In the same way @after,@afterClass (method m3() and m4()) will be executed after each and after all test cases respectively. @ignore (method m6())will be treated as ignoring the test.

Let's analyse test cases used in above java class in detail:

    Consider method m5() as given below : 

	@Test		
    public void m5() {					
        list.add("test");					
        assertFalse(list.isEmpty());			
        assertEquals(1, list.size());			
    }		

In above method as you are adding a string in the variable "list" so

    list.isEmpty() will return false.
    assertFalse(list.isEmpty()) must return true.
    As a result, the test case will pass.

As you have added only one string in the list, so the size is one.

    list.size() must return int value as "1" .
    So assertEquals(1, list.size()) must return true.
    As a result, the test case will pass. 

    Consider method m7() as given below : 

@Test(timeout = 10)		
    public void m7() {					
        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");					
    }		

As discussed above @Test(timeout = 10)annotation is used to enforce timeout in the test case.

    Consider method m8() as given below : 

@Test(expected = NoSuchMethodException.class)				
    public void m8() {					
        System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");					
    
    }		

As discussed above @Test(expected) will check for specified exception during its execution so method m8() will throw "No Such Method Exception." As a result, the test will be executed with an exception.

As all test cases are passed, this results in a successful test execution.

Actual Result

As there are three test cases in above example, all test cases will be executed one by one. See output below:

JUnit Annotations & API

See below print statements which can be seen on console:

Using @BeforeClass , executed before all test cases

Using @Before annotations, executed before each test cases

Using @After, executed after each test cases

Using @Before annotations, executed before each test cases

Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case

Using @After, executed after each test cases

Using @Before annotations, executed before each test cases

Using @Test(expected) ,it will check for specified exception during its execution

Using @After, executed after each test cases

Using @AfterClass, executed after all test cases

Summary:

    JUnit provides a portable API, which provides all important classes and annotations useful in writing a unit test.
    Classes which are very useful while writing a test case
        org.junit.Assert
        org.junit.TestCase
        org.junit.TestResult
        org.junit.TestSuite
    list of important and frequently used annotations

    @Before

    @BeforeClass

    @After

    @AfterClass

    @Test

    @Ignore 

 

    Prev
    Report a Bug
    Next

YOU MIGHT LIKE:
JUnit
How to Download and Install JUnit in Eclipse

Installing Junit is a 6 part process. It is explained in detailed below- PART 1) Install Java...
Read more
JUnit
Create JUnit Test Suite with Example: @RunWith @SuiteClasses

In Junit, test suite allows us to aggregate all test cases from multiple classes in one place and...
Read more
JUnit
JUnit Tutorial for Beginners: Learn in 3 Days

What is Junit? JUnit is an open source Unit Testing Framework for JAVA. It is useful for Java...
Read more
JUnit
Junit Assert & AssertEquals with Example

What is Junit Assert? Assert is a method useful in determining Pass or Fail status of a test case,...
Read more
JUnit
JUnit ErrorCollector @Rule with Example

In a normal scenario, whenever you identify any error during test execution, you would stop the...
Read more
JUnit
JUnit Expected Exception Test: @Test(expected)

JUnit provides the facility to trace the exception and also to check whether the code is throwing...
Read more
JUnit Tutorial

    1) Introduction to JUnit
    2) Download & Installation JUnit
    3) JUnit Test framework
    4) JUnit Annotations & API
    5) Junit Assert
    6) Create JUnit Test Suite
    7) JUnit Ignore Test
    9) JUnit Exception Test
    10) JUnit ErrorCollector
    11) JUnit Parameterized Test
    12) JUnit Vs TestNG



Top Tutorials
About
About US
Advertise with Us
Write For Us
Contact US
Career Suggestion
SAP Career Suggestion Tool
Software Testing as a Career
Certificates

Selenium
Testing
Hacking
Interesting
Books to Read!
Suggest a Tutorial
Blog
Quiz
eBook


SAP
Java
Python
Execute online
Execute Java Online
Execute Javascript
Execute HTML
Execute Python
Jmeter
Informatica
JIRA
© Copyright - Guru99 2019         Privacy Policy

55

This Github search (@interface) gives you the list of all the annotations :

https://github.com/junit-team/junit/search?q=%22%40interface%22&type=Code
Basic Annotations

@Test @Before @After @AfterClass @BeforeClass @Ignore @Runwith
Parameterized Tests

For Parameterized tests use @Parameters and @RunWith(Parameterized.class)
https://github.com/junit-team/junit/wiki/Parameterized-tests
Category

@Category
Grouping tests into categories. e.g. Fast, Slow etc.

https://github.com/junit-team/junit/wiki/Categories

@IncludeCategory
Runs only the classes and methods that are annotated with either the category given with the @IncludeCategory annotation, or a subtype of that category.

@ExcludeCategory
Inverse of @IncludeCategory
Rules

@Rule
Rules allow very flexible addition or redefinition of the behavior of each test method in a test class. e.g. Creating a Temp Folder rule for creating a temp folder while running tests.

https://github.com/junit-team/junit/wiki/Rules
Theory and related annotations

@Theory
Theories give more flexible and expressive assertions

https://github.com/junit-team/junit/wiki/Theories

@DataPoint
Annotating an field or method with @DataPoint will cause the field value or the value returned by the method to be used as a potential parameter for theories in that class

@DataPoints

Extension of @Datapoint
Annotating an array or iterable-typed field or method with @DataPoints will cause the values in the array or iterable given to be used as potential parameters for theories in that class

@FromDataPoints

Annotating a parameter of a @Theory method with @FromDataPoints will limit the datapoints considered as potential values for that parameter to just the @DataPoints with the given name

@ParametersSuppliedBy
Annotating a @Theory method parameter with @ParametersSuppliedBy causes it to be supplied with values from the named ParameterSupplier when run as a theory

@TestedOn

The @TestedOn annotation takes an array of values to be used as data points for the annotated parameter.

e.g.

@Theory
public void multiplyIsInverseOfDivideWithInlineDataPoints(
        @TestedOn(ints = {0, 5, 10}) int amount,
        @TestedOn(ints = {0, 1, 2}) int m
) {
    assumeThat(m, not(0));
    assertThat(new Dollar(amount).times(m).divideBy(m).getAmount(), is(amount));
}

shareedit
