package utility;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Junit 5 class")
public class JunitExampleTest {
    /**
     * *setup and teardown methods
     * *in class you can have four step and teardown methods thta must fullfill below conditions:-
     * 1.these method must not return anything.return typ eof these methods must be void
     * 2.setup and teardown methods can not be private
     *
     * setUp and teardown methods are described as following:--
     * 1. The method that is annotated with the @BeforeAll annotation must be static and it runs only once before any test method is run.
     * 2. The method that is annotated with the @BeforeEach annotation is invoked before each test method.
     * 3. The method that is annotated with the @AfterEach annotation is invoked after each test method.
     * 3. The method that is annotated with the @AfterAll annotation must be static , and it runs once after only test method have been run.
     */
//    @BeforeAll
//    public static void beforeAll(){
//        System.out.println("Before all test method is executed");
//    }
//    @AfterAll
//    public static void afterAll(){
//        System.out.println("After all test method is executed");
//    }
//    @BeforeEach
//    public void beforeEach(){
//        System.out.println("Before each all test method is executed");
//    }
//    @AfterEach
//    public void afterEach(){
//        System.out.println("After each all test method is executed");
//    }

    @Test
    @DisplayName("First test method")
    public void testFirstMethod(){
        System.out.println("First test method ");
    }
    @Test
    @DisplayName("Second test method")
    public void testSecondMethod(){
        System.out.println("Second test method ");
    }

    @Test
    public void test_firstMethodForNullValues(){
        //assertNull(null);
        JunitExample junitExample = new JunitExample();
        //assertNull(junit5Example.firstMethod(),"null value");
        assertNotEquals(null,junitExample.firstMethod(),"Not Null value is returnedd");
        assertNotNull(junitExample.firstMethod(),"Message is returned");
    }
    @Test
    public void test_firstMethodForNotNullValues(){
        //assertNull(null);
        JunitExample junit5Example = new JunitExample();
        assertEquals("Hello",junit5Example.firstMethod(),"Message is returned");
    }

    @Test
    public void test_SecondMethod(){
        //assertNull(null);
        JunitExample junit5Example = new JunitExample();
        /*assertEquals(,,"tested second method");
        assertNull();
        assertThrows();
        assertTrue();
        assertNotEquals();
        assertNotSame();*/
        //assertEquals(,junit5Example.secondMethod(),"Nothing to be displayed");
        junit5Example.secondMethod("Hello");
        assertEquals(1,junit5Example.list.size(),"list is update");
        assertNotEquals(0,junit5Example.list.size(),"list is update");
        assertEquals(0,junit5Example.list.size(),"list is update");

    }
}

