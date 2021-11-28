package LionTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeUnknownSexReturnException()  {
        try {
            Lion lion = new Lion(feline,"Не определен") ;
            lion.doesHaveMane();
        } catch (Exception e){
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}
