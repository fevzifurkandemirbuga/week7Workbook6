package com.pluralsight;

public class Gold extends FixedAsset{

    private double weight;

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return super.getMarketValue()*weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
