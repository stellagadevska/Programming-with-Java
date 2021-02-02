package com.company;

    // Готварските печки могат да са газови или електрически. Гаранционният период на газовите печки е с 12 месеца
    // по-дълъг от този на електрическите. Това означава, че ако минималният гаранционен период е 12 месеца, от
    // производителя се предоставя удължена гаранция и печката е газова, нейният гаранционен период в 36 меца (12 от
    // минималната гаранция + 12 от удължения период от производителя + 12 от факта, че е газова).

public class Oven extends ElectricalAppliance {
    public Oven(String name, double price, int guaranteePeriod) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
