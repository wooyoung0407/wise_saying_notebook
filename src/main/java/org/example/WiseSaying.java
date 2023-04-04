package org.example;

public class WiseSaying {
    private int number;
    private String wise;
    private String name;

    WiseSaying(int number,String name,String wise){
        this.number = number;
        this.name = name;
        this.wise = wise;
    }

    public int getNumber(){ //getter 함수 불러오기위한 생성
        return this.number;
    }
    public String getWise(){
        return this.wise;
    }
    public String getName(){
        return this.name;
    }
}
