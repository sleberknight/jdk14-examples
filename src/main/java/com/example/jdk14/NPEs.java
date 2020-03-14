package com.example.jdk14;

/**
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
    B b;
}

class B {
    C c;
}

class C {
    String str;
}
