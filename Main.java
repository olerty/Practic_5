package com.company;

public class Main {

    public static void main(String[] args) {
	MovableCircle movableCircle = new MovableCircle(5,6,23,12);
	MovablePoint movablePoint = new MovablePoint(3, 3,4,1);
	System.out.println(movableCircle.toString());
	System.out.println(movablePoint.toString());
    }
}
