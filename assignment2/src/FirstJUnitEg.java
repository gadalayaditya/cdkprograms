/**
 * Created by ADMIN on 7/2/17.
 */
//import javafx.scene.shape.Circle;

import org.junit.*;

public class FirstJUnitEg {


    static CircleTe c;

    //execute before class
    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");

        c = new CircleTe(20);
    }

    //execute after class
    @AfterClass
    public static void  afterClass() {
        System.out.println("in after class");
    }

    //execute before test
    @Before
    public void before() {
        System.out.println("in before");

    }

    //execute after test
    @After
    public void after() {
        System.out.println("in after");
    }

    //test case

    @Test
    public void test1() {
        Assert.assertEquals(c.area(), 1257);
        System.out.println("in test1");
    }
    @Test
    public void test2() {
        Assert.assertEquals(c.circumference(), 125);
        System.out.println("in test2");
    }
    //test case ignore and will not execute
    @Ignore
    public void ignoreTest() {
        System.out.println("in ignore test");
    }
}