package com.pluralsight;

import java.util.ArrayList;

public class AssetApp {

    public static void main(String[] args) {
        ArrayList<Asset> assetList=new ArrayList<>();

        Asset house1=new House("atlanta",2500,300,
                "description1", "29-10-2025",400000);

        Asset house2= new House("chi",3500,350,
                "description2","11-1-2025",500000);

        Asset vehicle1= new Vehicle("honda/elentra",2012,100000,
                "description3","12-20-2025",25000);

        Asset vehicle2= new Vehicle("volvo/s60",2018,120000,
                "description4","12-20-2025",25000);

        assetList.add(house1);
        assetList.add(house2);
        assetList.add(vehicle1);
        assetList.add(vehicle2);



        for(Asset a:assetList){

            System.out.printf("""
                    Description: %s
                    Date you acquired it: %s
                    Paid: %.2f
                    Cost: %.2f
                    """,a.getDescription(),a.getDateAcquired(),a.getOriginalCost(),a.getValue());

            if(a instanceof House){
                System.out.printf("""
                        Address: %s
                        """,((House) a).getAddress());
            }
            else if(a instanceof Vehicle){
                System.out.printf(" year: %s\n make/model: %s\n",
                        ((Vehicle) a).getYear(),
                        ((Vehicle) a).getMakeModel());
            }


        }


    }




}
