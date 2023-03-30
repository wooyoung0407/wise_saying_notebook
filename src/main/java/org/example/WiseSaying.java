package org.example;

public class WiseSaying {
    private int number;
    private String name;
    private String wise;

    WiseSaying(int number, String name, String wise){
        this.name = name;
        this.number = number;
        this.wise = wise;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getWise() {
        return wise;
    }


}
