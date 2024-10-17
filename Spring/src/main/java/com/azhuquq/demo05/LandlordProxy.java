package com.azhuquq.demo05;

public class LandlordProxy implements Rent {
    Landlord landlord;

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rent() {
        seeHouse();
        landlord.rent();
        signContract();
    }

    public void seeHouse() {
        System.out.println("中介带租客看房子");
    }

    public void signContract() {
        System.out.println("中介和租客一起签订合同");
    }
}
