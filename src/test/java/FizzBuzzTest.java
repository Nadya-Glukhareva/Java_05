import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    // Проверяем каждое условие сверху вниз. Сначала на валидные значениия, потом на невалидные.
    // Условия и return указываем перед тестом в коментах. Берем их из синей папки с кодом (пока так).
    // 1. Positive testing Happy path
    // if (start <= end)
    // return array;

    // start < end;
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




// start == end;
    @Test
    public void testStartEqualsEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1; // задаем значения
        int end = 1;
        String[] expectedResult = {"1"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // создаем новый объект "собственного класса", от которого мы вызываем метод через точку.

        //assert
        Assert.assertEquals(actualResult, expectedResult);

    }

// 2. Negative testing
// if (start > end)
// return new String[0];

    @Test
    public void testStartGreaterThanEnd_Negative() { //В названии указываем, что этот тест негативный.
        //AAA
        //arrange
        int start = 20; // задаем значения
        int end = 1;
        String[] expectedResult = {};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // создаем новый объект "собственного класса", от которого мы вызываем метод через точку.

        //assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
