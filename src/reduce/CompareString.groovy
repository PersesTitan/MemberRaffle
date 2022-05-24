package reduce

import java.util.function.BinaryOperator

class CompareString implements BinaryOperator<String> {

    @Override
    String apply(String s, String s2) {
        if (s.getBytes().length >= s2.getBytes().length) return s
        else return s2
    }
}
