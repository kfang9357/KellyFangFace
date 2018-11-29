package com.company;

public class Runner {

    public static void main(String[] args) {
	String[][] face = new String [6][10];
	FaceDrawing face1 = new FaceDrawing(face);

	face1.fill("o");
	face1.edit();
    }
}
