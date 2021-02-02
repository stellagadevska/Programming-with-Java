package com.company;

   // Производителите на електроуреди се определят с името си и определят дали ще предоставят удължена гаранция.
   // Удължената гаранция увеличава минималния гаранционен период с още 12 месеца.

public class Producer {
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                '}';
    }
}
