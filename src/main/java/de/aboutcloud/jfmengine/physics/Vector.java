package de.aboutcloud.jfmengine.physics;

public class Vector {
    public double x;
    public double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y);
    }

    public Vector subtract(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y);
    }

    public Vector scale(double s) {
        return new Vector(this.x * s, this.y * s);
    }

    public double dot(Vector v) {
        return this.x * v.x + this.y * v.y;
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector normalise() {
        double mag = magnitude();
        if (mag == 0) return new Vector(0, 0);
        return new Vector(x / mag, y / mag);
    }
}
