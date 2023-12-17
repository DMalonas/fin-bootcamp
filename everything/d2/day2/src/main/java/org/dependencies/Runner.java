package org.dependencies;

public class Runner {
    public static void main(String[] args) {
        Knight knight = new Knight(new Horse());
        knight.getHorse().bringWater();
    }
}
