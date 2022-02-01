package EGZ_162441_E01.Z1;

import java.time.LocalTime;

public class ArrayUtilTest {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,2,1};
        Integer[] integers1 = {1,1,2,5,6,4};
        LocalTime[] localTimes = {LocalTime.MIN, LocalTime.NOON, LocalTime.MIN};
        LocalTime[] localTimes1 = {LocalTime.NOON, LocalTime.NOON, LocalTime.now()};

        System.out.println(ArrayUtil.jestPalindromem(integers));
        System.out.println(ArrayUtil.jestPalindromem(integers1));
        System.out.println(ArrayUtil.jestPalindromem(localTimes));
        System.out.println(ArrayUtil.jestPalindromem(localTimes1));

    }
}
