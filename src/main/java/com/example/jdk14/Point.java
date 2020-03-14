package com.example.jdk14;

/*
  Print class outline including private parts:
  javap -p -classpath target/classes com.example.jdk14.Point

  Print a lot more details:
  javap -p -v -classpath target/classes com.example.jdk14.Point
 */
public record Point(int x, int y) {}
