package com.pluralsight;

public class House extends  Asset{



    private String Address;
    private int condition;
    private int squareFoot;
    private int lotSize;


    public House(String Address, int squareFoot, int lotSize, String description, String dateAcquired, double originalCost) {

        super(description, dateAcquired,originalCost);

        this.Address = Address;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;

    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {

        double value= super.getOriginalCost();


        if(value/squareFoot >=180.0){
            this.condition=1;
        }
        else if(value/squareFoot >=130){
            this.condition=2;
        }
        else if(value/squareFoot >=90){
            this.condition=3;
        }
        else{
            this.condition=4;
        }


        return value+(0.25*squareFoot);
    }



}




