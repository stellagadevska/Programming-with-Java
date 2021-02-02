package com.company;

    //  Всички електроуреди имат производител, цена и даден минимален период на гаранция, определен в брой месеци
    //  (например 12 месеца).

public class ElectricalAppliance {
    private Producer producer;

    public ElectricalAppliance(String name) {
        producer = new Producer(name);
    }

    public Producer getProducer() {
        return producer;
    }

    public int extendGuaranteePeriod(){
        return 12;
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" +
                "producer=" + producer +
                '}';
    }
}
