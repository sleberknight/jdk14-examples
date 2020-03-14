package com.example.jdk14;

/*
  Example usage:
  java -XX:+ShowCodeDetailsInExceptionMessages \
       --enable-preview \
       -classpath target/classes \
       com.example.jdk14.HelpfulNPEs field 2

  java -XX:+ShowCodeDetailsInExceptionMessages \
       --enable-preview \
       -classpath target/classes \
       com.example.jdk14.HelpfulNPEs method 3
 */
@SuppressWarnings({"ConstantConditions", "squid:S106"})
public class HelpfulNPEs {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java HelpfulNPEs <accessType> <depth>");
            System.exit(1);
        }

        var accessType = args[0];
        var depth = Integer.parseInt(args[1]);

        var person = switch (depth) {
            case 1 -> nullPerson();
            case 2 -> noHomeAddressPerson();
            case 3 -> noZipPerson();
            default -> throw new IllegalArgumentException("Valid depths: 1, 2, 3");
        };

        switch (accessType) {
            case "field" -> System.out.println(getPlus4UsingFieldAccess(person));
            case "method" -> System.out.println(getPlus4UsingMethodAccess(person));
            default -> throw new IllegalArgumentException("Valid access types: field, method");
        }
    }

    private static String getPlus4UsingFieldAccess(Person person) {
        return person.homeAddress.zip.plus4;
    }

    private static String getPlus4UsingMethodAccess(Person person) {
        return person.getHomeAddress().getZip().getPlus4();
    }

    private static Person nullPerson() {
        return null;
    }

    private static Person noHomeAddressPerson() {
        return Person.builder().build();
    }

    private static Person noZipPerson() {
        return Person.builder()
                .homeAddress(Address.builder().build())
                .build();
    }
}
