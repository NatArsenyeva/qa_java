package FelineTests;

import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

   @Test
    public void eatMeat_predator_returnListForPredator() throws Exception {
       List<String> actual = feline.eatMeat();
       assertEquals(List.of("Животные", "Птицы", "Рыба"),actual);
   }

    @Test
    public void getFamily_returnExpectedValue() {
        String actual = feline.getFamily();
        assertEquals("Кошачьи",actual);
    }

    @Test
    public void getKittens_withoutParameters_return_1(){
        int actual = feline.getKittens();
        assertEquals(1,actual);
    }

    @Test
    public void getKittens_withCount_2_return_2(){
        int actual = feline.getKittens(2);
        assertEquals(2,actual);
    }


}
