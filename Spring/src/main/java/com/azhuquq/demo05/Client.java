package com.azhuquq.demo05;

public class Client {
    public static void main(String[] args) {
        Landlord landload = new Landlord();
        LandlordProxy landlordProxy = new LandlordProxy();
        landlordProxy.setLandlord(landload);
        landlordProxy.rent();

//        landload.rent();
//        landload.seeHouse();
//        landload.signContract();
    }
}
