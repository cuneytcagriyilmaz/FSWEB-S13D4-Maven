package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
    }

    public double distance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

    public double distance(int a, int b) {
        return Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
    }

}
