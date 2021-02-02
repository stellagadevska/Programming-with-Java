package com.company;


public class Main {

    public static void main(String[] args) {

        Director Johnathan = new Director("Jonathan", 27);
        MusicalCompany dreamCompany = new MusicalCompany("Dream Company", Johnathan);

        Director Rebeca = new Director("Rebeca", 23);
        MusicalCompany paradiseCompany = new MusicalCompany("Paradise Company", Rebeca);

        System.out.println(Johnathan);
        System.out.println(dreamCompany);

        dreamCompany.setWorkingHours(8);
        dreamCompany.setRentPricePerHour(40);


        System.out.println("____________________________________________________________________________________________");
        System.out.println("1. Възможност за наемане на звукозаписното студио от клиенти, които си плащат за използването му.");
        dreamCompany.rentStudio(8);


        System.out.println("____________________________________________________________________________________________");
        System.out.println("2. Възможност за промяна на цената на час за наемане на студиото.");
        dreamCompany.changeRentPricePerHour(65);
        dreamCompany.rentStudio(3);


        System.out.println("____________________________________________________________________________________________");
        System.out.println("3. Възможност за проверяване на оборота за деня (колко са приходите от наем на студиото)");
//        System.out.println("Daily profit: " + dreamCompany.profitPerDay() + " lv.");


        System.out.println("____________________________________________________________________________________________");
        System.out.println("4. Възможност за проверяване на оборота за деня в евро и долари.");


        System.out.println("____________________________________________________________________________________________");
        System.out.println("5. Възможност за сравняване на две Музикални компании по цената, която клиентите трябва\n " +
                "да плащат за 1 час наем на звукозаписното студио.");


        System.out.println("____________________________________________________________________________________________");
        System.out.println("6. Възможност за намаляване с % на цената за наем за 1 час на звукозаписното студио,\n" +
                " но не трябва да се получава цена, която е по-малка от минималната цена.");


        System.out.println("____________________________________________________________________________________________");
        System.out.println("7. Сравнение на две музикални компании на база на възрастта на директорите.");
        dreamCompany.compareByDirectorAge(dreamCompany, paradiseCompany);
        System.out.println("____________________________________________________________________________________________");
    }
}
