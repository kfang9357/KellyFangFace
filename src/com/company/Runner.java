package com.company;

public class Runner {

    public static void main(String[] args) {
	String[][] face = new String [5][10];
	FaceDrawing face1 = new FaceDrawing(face);

	face1.fill("+");
	face1.edit("|", 1,0);
	face1.edit("|", 2,0);
	face1.edit("|", 3,0);
	face1.edit("|", 1,9);
	face1.edit("|", 1,9);
	face1.edit("|", 2,9);
	face1.edit("|", 3,9);
	face1.edit("-", 0,0);
	face1.edit("-", 0,1);
	face1.edit("-", 0,2);
	face1.edit("-", 0,3);
	face1.edit("-", 0,4);
	face1.edit("-", 0,5);
	face1.edit("-", 0,6);
	face1.edit("-", 0,7);
	face1.edit("-", 0,8);
	face1.edit("-", 0,9);
	face1.edit("-", 4,0);
	face1.edit("-", 4,1);
	face1.edit("-", 4,2);
	face1.edit("-", 4,3);
	face1.edit("-", 4,4);
	face1.edit("-", 4,5);
	face1.edit("-", 4,6);
	face1.edit("-", 4,7);
	face1.edit("-", 4,8);
	face1.edit("-", 4,9);
	face1.edit("n", 3,3);
        face1.edit("n", 3,4);
        face1.edit("n", 3,5);
        face1.edit("n", 3,6);
        face1.edit("o", 1,3);
        face1.edit("o", 1,6);
        face1.edit("w", 2,4);
        face1.edit("w", 2,5);


	System.out.println(face1);
    }
}
