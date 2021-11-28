package CatTests;

import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import com.sun.jdi.connect.Connector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.mockito.junit.MockitoJUnitRunner;

import javax.naming.ldap.PagedResultsControl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Mock
    Predator predator;

    @Test
    public void getFoodReturnExpectedListOfString() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("value_1", "value_2"));
        List<String> actual = cat.getFood();
        assertEquals(List.of("value_1", "value_2"),actual);
    }

    @Test
    public void getSoundReturnExpectedValue(){
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals("Мяу", actual);
    }


}
