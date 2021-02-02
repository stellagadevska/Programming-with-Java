package shop;

import java.util.ArrayList;
import java.util.List;

public class Studio extends Thread{
    // Ателието има име, списък с шивачи и брой на дрехите, които трябва да се ушият.
    private String name;
    private List<Tailor> tailorsList;
    int numberOfClothesToSew;

    public Studio(String name, int numberOfClothesToSew) {
        this.name = name;
        this.tailorsList = new ArrayList<>();
        this.numberOfClothesToSew = 0;
    }

    public List<Tailor> getTailorsList() {
        return tailorsList;
    }

    public int getNumberOfClothesToSew() {
        return numberOfClothesToSew;
    }

    public void setNumberOfClothesToSew(int numberOfClothesToSew) {
        this.numberOfClothesToSew = numberOfClothesToSew;
    }

    public void add(Tailor tailor) {
        if (tailorsList.contains(tailor)) {
            System.out.println("Cannot add existing tailor.");
        } else {
            tailorsList.add(tailor);
        }
    }

    public void remove(Tailor tailor) {
        if (!tailorsList.contains(tailor)) {
            System.out.println("Cannot remove not existing tailor.");
        } else {
            tailorsList.remove(tailor);
        }
    }


    @Override
    public void run(Tailor tailor) {
        while (numberOfClothesToSew > 0) {
            System.out.println(Thread.currentThread().getName() + " " + tailor.getName() + " is tailoring. ");
        }
    }
}
