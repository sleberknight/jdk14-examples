package com.example.jdk14;

import lombok.Getter;

/**
 * "Helpful NPEs" example that uses field access.
 * <p>
 * Example usage:
 * <p>
 * java -XX:+ShowCodeDetailsInExceptionMessages --enable-preview -classpath target/classes com.example.jdk14.NPEs
 */
public class NPEs {

    @SuppressWarnings("squid:S106")
    public static void main(String[] args) {
        var a = new A();
        var str = a.b.c.str;
        System.out.println(str);
    }
}

class A {
    @Getter B b;
}

class B {
    @Getter C c;
}

class C {
    @Getter String str;
}
