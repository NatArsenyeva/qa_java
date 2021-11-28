package FelineTests;

import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

   @Test
    public void eatMeatPredatorReturnListForPredator() throws Exception {
       List<String> actual = feline.eatMeat();
       assertEquals(List.of("Животные", "Птицы", "Рыба"),actual);
   }

    @Test
    public void getFamilyReturnExpectedValue() {
        String actual = feline.getFamily();
        assertEquals("Кошачьи",actual);
    }

    @Test
    public void getKittensWithoutParametersReturnExpectedCountKittens(){
        int actual = feline.getKittens();
        assertEquals(1,actual);
    }

    @Test
    public void getKittensWithParametersReturnExpectedCountKittens(){
        int actual = feline.getKittens(2);
        assertEquals(2,actual);
    }


}
