import static org.junit.Assert.*;

import org.junit.Test;

public class RepeaterTest {
	
	@Test
    public void testSomething() {
        assertEquals("aaaaa",Repeater.repeat("a",5));
        assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa",Repeater.repeat("Na", 16));
        assertEquals("Wub Wub Wub Wub Wub Wub ",Repeater.repeat("Wub ", 6));
    }
	
//	@Test
//	public void myTest() {
//		assertEquals("bbb", Repeater.repeat("b", 3));
//		assertEquals("DubDubDubDubDub", Repeater.repeat("Dub ", 5));
//	}

}
