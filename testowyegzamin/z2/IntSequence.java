package pl.edu.uwm.gkrych.testowyegzamin.z2;

import java.util.Arrays;
import java.util.stream.Stream;

public interface IntSequence {
    static Stream<Integer> of(int... nums){
        return Stream.concat(Arrays.stream(nums).boxed(), Stream.generate(() -> 1));
    }

    static Stream<Integer> squares(int n){
        int[] tab = {n-1};
        return Stream.generate(() -> {
            ++tab[0];
            return tab[0] * tab[0];
        });
    }

}
