package com.pluralsight;

import java.util.ArrayList;
import java.util.Comparator;

public class Portfolio implements Valuable{

    private String name;
    private String owner;
    private ArrayList<Valuable> assets=new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset){

        assets.add(asset);

    }


    @Override
    public double getValue() {
        double value=0;
        for(Valuable v:assets){
            value+=v.getValue();
        }
        return value;
    }

    public Valuable getMostValuable(){
        return assets.stream()
                .max(Comparator.comparing(Valuable::getValue))
                .orElse(null);
    }

    public Valuable getLeastValuable(){
        return assets.stream()
                .max(Comparator.comparing(Valuable::getValue))
                .orElse(null);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Valuable> getAssets() {
        return assets;
    }

    public void setAssets(ArrayList<Valuable> assets) {
        this.assets = assets;
    }
}
