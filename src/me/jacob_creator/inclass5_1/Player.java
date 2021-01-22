package me.jacob_creator.inclass5_1;

public class Player {

    private double x,y,z;
    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getLocation(){
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public void setLocation(double set1, double set2, double set3) {
        x = set1;
        y = set2;
        z = set3;

    }

    public String getName() {return name;}

    public double getX() {return x; }

    public double getY() {return y; }

    public double getZ() {return z; }

    public boolean nearby(double near1, double near2, double near3){
        return (Math.abs(near1-x) <= 5 && Math.abs(near2-y) <= 5 && Math.abs(near3-z) <= 5);

    }
}