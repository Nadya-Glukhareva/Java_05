import org.testng.Assert;
import org.testng.annotations.Test;

public class NadyaTest {

    @Test
    public void testStartLessThanEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1; // задаем значения
        int end = 15;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                "14", "FizzBuzz"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // создаем новый объект "собственного класса", от которого мы вызываем метод через точку.

        //assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}