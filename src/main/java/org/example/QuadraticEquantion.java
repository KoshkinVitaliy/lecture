package org.example;

public class QuadraticEquantion {
    public int coeffA;
    public int coeffB;
    public int coeffC;
    public double discriminant;

    public void countDiscriminant() {
        discriminant = Math.pow(coeffB, 2) - (4 * coeffA * coeffC);
    }

    public void countRoots() {
        double x1, x2;
        if (discriminant < 0) {
            System.out.println("Нет корней");
        }
        else if (discriminant == 0) {
            x1 = (-coeffB) / (2 * coeffA);
            System.out.println("Один корень - " + x1);
        }
        else {
            x1 = (-coeffB + Math.sqrt(discriminant)) / (2 * coeffA);
            x2 = (-coeffB - Math.sqrt(discriminant)) / (2 * coeffA);
            System.out.println("Два корня - х1 = " + x1 + ", х2 = " + x2);
        }
    }

}
