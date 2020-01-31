package com.kodilla.colections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private int dimensions;
    private String stamped;
    public Stamp(String name, int dimensions, String stamped){
        this.name = name;
        this.dimensions=dimensions;
        this.stamped=stamped;
    }

    public String getName() {
        return name;
    }
    public int getDimensions(){
        return dimensions;
    }

    public String getStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stamped == stamp.stamped &&
                Objects.equals(name, stamp.name) &&
                Objects.equals(dimensions, stamp.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimensions, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", stamped=" + stamped +
                '}';
    }
}
