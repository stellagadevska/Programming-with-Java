package com.company;

    // Задача 1. Създайте клас Музикална Компания, която се определя от име, има Директор (директорът има име и възраст)
    // и предлага на клиентите си да използват срещу заплащане звукозаписно студио. Клиентите могат да наемат студиото
    // за определен брой часове на ден. Трябва да се има предвиди, че студиото има капацитет за работа на ден, т.е. не
    // може да се наема ако е превишен максималният брой на часовете, които са определени за работни. Съществува договорка
    // между директорите на музикални компании цената за наемане на звукозаписно студио за 1 час да не е по-малка от
    // определена минимална цена, която е една и съща за всички звукозаписни компании.

    // Трябва да се създадат необходимите условия (класове, член-данни и методи), които да осигурят работата на Музикалната
    // компания:

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MusicalCompany {
    private String name;
    private Director director;
    private Studio studio;
    public double minRentPerHourBGN;

    public MusicalCompany(String name, Director director, Studio studio,
                        final double minRentPerHourBGN) {
        this.name = name;
        this.director = director;
        this.studio = studio;
        this.minRentPerHourBGN = minRentPerHourBGN;
    }

    public String getName() {
        return name;
    }

    public Director getDirector() {
        return director;
    }

    public Studio getStudio() {
        return studio;
    }

    public double getMinRentPerHourBGN() {
        return minRentPerHourBGN;
    }

    @Override
    public String toString() {
        return "MusicalCompany{" +
                "name='" + name + '\'' +
                ", director=" + director +
                '}';
    }

    // 1. Възможност за наемане на звукозаписното студио от клиенти, които си плащат за използването му.

    public void setRentPricePerHour(double rentPricePerHour) {
        if(this.rentPricePerHour < minimalPriceForAllStudios) {
            System.out.println("Minimal rent price is equal for all companies ( = "
                    + this.minimalPriceForAllStudios + ") and your rent price cannot be cheaper.");
            this.rentPricePerHour = this.minimalPriceForAllStudios;
        } else {
            this.rentPricePerHour = rentPricePerHour;
        }

    }

    public double getMinimalPriceForAllStudios() {
        return minimalPriceForAllStudios;
    }

    public int rentStudio(int rentHours) {
        double rentPrice = rentPricePerHour * rentHours;
        if (rentHours > this.workingHours) {
            System.out.println("You cannot rent the studio for so long! You can use it for maximum " + this.workingHours + " hours.");
            return this.workingHours;
        } else {
            System.out.println("You can now use the studio for " + rentHours + " hours and total price of "
                    + rentPrice + " lv. (" + rentPricePerHour + " lv./h.)");
            return rentHours;
        }
    }

    // 2. Възможност за промяна на цената на час за наемане на студиото.
    public void changeRentPricePerHour(int changePrice) {
        setRentPricePerHour(changePrice);
    }

    // 3. Възможност за проверяване на оборота за деня (колко са приходите от наем на студиото)
    // 4. Възможност за проверяване на оборота за деня в евро и долари.
    // 5. Възможност за сравняване на две Музикални компании по цената, която клиентите трябва да плащат за 1 час наем
    // на звукозаписното студио.
    // 6. Възможност за намаляване с % на цената за наем за 1 час на звукозаписното студио, но не трябва да се получава
    // цена, която е по-малка от минималната цена.

    // 7. Възможност за сравнение на две музикални компании на база на възрастта на директорите.
    public void compareByDirectorAge(MusicalCompany company1, MusicalCompany company2) {
        int age1 = company1.director.getAge();
        int age2 = company2.director.getAge();

        if (age1 > age2) {
            System.out.println("Company " + company1 + "'s director is older than company " + company2 + "'s director.");
        } else {
            System.out.println("Company " + company2 + "'s director is older than company " + company1 + "'s director.");
        }

    }
}
