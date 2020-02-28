package be.ehb.pizzaitaliano.model;

import java.util.Arrays;

public class Pizza {


    private String size;
    private String[] topings;

    public Pizza(String size, String[] topings) {
        this.size = size;
        this.topings = topings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String[] getTopings() {
        return topings;
    }

    public void setTopings(String[] topings) {
        this.topings = topings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", topings=" + Arrays.toString(topings) +
                '}';
    }
}
