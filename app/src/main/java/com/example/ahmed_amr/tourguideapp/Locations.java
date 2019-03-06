package com.example.ahmed_amr.tourguideapp;

public class Locations {

    public Locations(String name , String address ,int picture)
    {
        location_name = name;
        location_address = address;
        location_picture = picture ;
    }

    public Locations(String name , String address , int picture , String phone)
    {
        location_name = name;
        location_address = address;
        location_picture = picture ;
        phone_number = phone;
    }

    private String location_name;
    private String location_address;
    private String phone_number = check_for_phone;
    private int location_picture;
    private static final String check_for_phone = "-1";


    public String getLocation_name() {
        return location_name;
    }

    public int getLocation_picture() {
        return location_picture;
    }

    public String getLocation_address() {
        return location_address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public boolean Check_for_Phone()
    {
        return phone_number == check_for_phone ;
    }

}
