package Java8;

import java.util.function.*;

public class PrimitiveFunction {
    public static void main(String[] args) {

        // 1. Primitive to Object
        IntFunction<String> f1 = n -> "Int: " + n;
        LongFunction<String> f2 = n -> "Long: " + n;
        DoubleFunction<String> f3 = n -> "Double: " + n;

        // 2. Object to Primitive
        ToIntFunction<String> f4 = s -> s.length();
        ToLongFunction<String> f5 = s -> (long) s.length();
        ToDoubleFunction<String> f6 = s -> Double.parseDouble(s);

        // 3. Primitive to Primitive
        IntToLongFunction f7 = n -> (long) n * n;
        IntToDoubleFunction f8 = n -> n / 2.0;
        LongToIntFunction f9 = n -> (int) n;
        LongToDoubleFunction f10 = n -> n / 2.0;
        DoubleToIntFunction f11 = n -> (int) n;
        DoubleToLongFunction f12 = n -> (long) n;

        // 4. Unary Operators: One input, same output type
        IntUnaryOperator f13 = n -> n * n;
        LongUnaryOperator f14 = n -> n + 10L;
        DoubleUnaryOperator f15 = n -> n * 2;

        // 5. Binary Operators: Two inputs, same output type
        IntBinaryOperator f16 = (a, b) -> a + b;
        LongBinaryOperator f17 = (a, b) -> a * b;
        DoubleBinaryOperator f18 = (a, b) -> a / b;

        System.out.println(f1.apply(10));
        System.out.println(f2.apply(100L));
        System.out.println(f3.apply(5.5));

        System.out.println(f4.applyAsInt("Java"));
        System.out.println(f5.applyAsLong("Hello"));
        System.out.println(f6.applyAsDouble("12.5"));

        System.out.println(f7.applyAsLong(5));
        System.out.println(f8.applyAsDouble(5));
        System.out.println(f9.applyAsInt(100L));
        System.out.println(f10.applyAsDouble(10L));
        System.out.println(f11.applyAsInt(9.8));
        System.out.println(f12.applyAsLong(9.8));

        System.out.println(f13.applyAsInt(5));
        System.out.println(f14.applyAsLong(20L));
        System.out.println(f15.applyAsDouble(2.5));

        System.out.println(f16.applyAsInt(10, 20));
        System.out.println(f17.applyAsLong(5L, 4L));
        System.out.println(f18.applyAsDouble(10.0, 2.0));
    }
}
