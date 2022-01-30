package pl.edu.uwm.gkrych.testowyegzamin.z1;

import java.math.BigInteger;
import java.time.LocalDate;

public class ArrayUtilTest {
    public static void main(String[] args) {
        BigInteger[] bigIntegers = {BigInteger.ZERO, BigInteger.ONE, BigInteger.TWO, BigInteger.TEN};
        String[] strings = {"Ala", "Maja", "Kasia", "Grazyna"};
        LocalDate[] dates = {LocalDate.EPOCH, LocalDate.of(2001,11,24), LocalDate.now()};

        ArrayUtil.isSorted(bigIntegers);
        ArrayUtil.isSorted(strings);
        ArrayUtil.isSorted(dates);

        System.out.println(ArrayUtil.isSorted(bigIntegers));
        System.out.println(ArrayUtil.isSorted(strings));
        System.out.println(ArrayUtil.isSorted(dates));

    }
}
