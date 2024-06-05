package org.example;

public class Main {
    public static void main(String[] args) {
     /*   EnumOd s = EnumOd.S;
        String sum = " ";


        EnumOd[] mass = EnumOd.values();
        int min = Integer.parseInt(mass[1].getDescription());
        for (int i = 0; i < mass.length; i++) {
           // sum = Integer.parseInt(mass[i].getDescription());
            if (Integer.parseInt(mass[i].getDescription()) < min) {
                min = Integer.parseInt(mass[i].getDescription());
               sum = mass[i].name();
            }
        }
        System.out.println(min+" "+sum);
      //  System.out.println(mass[sum].getDescription() + " " + mass[sum].name());
    }*/
        EnumOd[] mass = EnumOd.values();
        EnumOd enumOd = EnumOd.S;
        for (int i = 0; i < mass.length; i++) {
        switch (mass[i]) {
            case L -> System.out.println("L");
            case M -> System.out.println("M");
            case S -> System.out.println(enumOd.getDescription()+" "+ enumOd.name());
            case XL -> System.out.println(enumOd.getDescription()+" "+ enumOd.name());
            case XS -> System.out.println("XS");
            default -> System.out.println("нету");

        }
        }

    }
}