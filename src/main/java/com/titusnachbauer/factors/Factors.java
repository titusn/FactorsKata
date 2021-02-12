package com.titusnachbauer.factors;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    Factors() {

    }

    public List factor(int i) {
        List factors = new ArrayList<Integer>();
        for (int divisor = 2; divisor <= i; divisor++) {
            for (;i % divisor == 0;i /= divisor) {
                factors.add(divisor);
            }
        }
        return factors;
    }
}
