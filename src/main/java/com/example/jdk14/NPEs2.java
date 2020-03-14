package com.example.jdk14;

/**
 * Second simple "helpful NPEs" example that uses method access. It uses the A, B, and C classes defined in {@link NPEs}.
 * <p>
 * Example usage:
 * <p>
 * java -XX:+ShowCodeDetailsInExceptionMessages --enable-preview -classpath target/classes com.example.jdk14.NPEs2
 */
@SuppressWarnings("squid:S106")
public class NPEs2 {

    public static void main(String[] args) {
        var a = new A();
        var str = a.getB().getC().getStr();
        System.out.println(str);
    }

}

