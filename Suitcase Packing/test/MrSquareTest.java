import static org.junit.Assert.*;

import org.junit.Test;

public class MrSquareTest {
	@Test
    public void fixed_test() {
        assertEquals(true, MrSquare.fit_in(1,2,3,2)); // a+b <= m && n <= 2 TRUE
        assertEquals(true, MrSquare.fit_in(2,1,3,2)); // a+b <= m && n <= 2 TRUE
        assertEquals(false, MrSquare.fit_in(1,2,2,1)); // a+b > m && n <= 2 FALSE (AB > M)
        assertEquals(false, MrSquare.fit_in(3,2,3,2)); // a+b > m && n <= 2 FALSE (AB > M)
        assertEquals(false, MrSquare.fit_in(1,2,1,2)); // a+b > m && n <= 2 FALSE (AB > M)
        assertEquals(false, MrSquare.fit_in(1,2,1,2)); // a+b > m && n <= 2 FALSE (AB > M)
        assertEquals(false, MrSquare.fit_in(6,5,8,7)); // a+b > m && n <= 2 FALSE (AB > M && N > 2)
        assertEquals(true, MrSquare.fit_in(6, 5, 13, 2)); // a+b <= m && n <= 2 TRUE
        assertEquals(true, MrSquare.fit_in(1, 2, 4, 2));
    }
}
