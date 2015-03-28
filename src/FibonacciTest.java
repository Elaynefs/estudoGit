import sun.jvm.hotspot.utilities.Assert;

import static org.junit.Assert.*;

public class FibonacciTest {

    @org.junit.Test
    public void testPrintFibonacci() throws Exception {

        Assert.that(new Fibonacci().printFibonacci().equalsIgnoreCase("1,1,2,3,5,8,13,21,34"),"A sequencia está incorreta");

    }
}