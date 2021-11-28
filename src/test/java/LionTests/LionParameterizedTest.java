package LionTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private String sex;
    private boolean expected;

    public LionParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSexAndManeData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false}
        };
    }

    @Mock
    Feline feline;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doesHaveManeBySexReturnDataAboutMane() throws Exception {
        Lion lion = new Lion(feline,sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected,actual);
    }
}
