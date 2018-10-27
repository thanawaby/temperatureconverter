package com.example.temperatureconverter.Mo;

public class converter {
    private double temp;
    public converter(double t1){
        temp=t1;
    }
    public double cf(){
        return (temp - 32)* 5/9;
    }
    public double fc(){
        return(1.8*temp) + 32;
    }
    public double getTemp(){
        return temp;
    }
    public void setTemp(double temp){
        this.temp=temp;

    }
}
