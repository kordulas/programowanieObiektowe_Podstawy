package com.company;

import java.util.Objects;

public class Punkt {
    int x;
    int y;
    public Punkt(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Punkt punkt = (Punkt) o;
        return this.x == punkt.x &&
                this.y == punkt.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Punkt {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
