package com.company;

public class FaceDrawing {

    private String[][]faceFeatures={{}};

    public FaceDrawing(String[][]faceFeatures){
        this.faceFeatures = faceFeatures;
    }


    public void fill(String str) {
        for (int i = 0; i < faceFeatures.length; i++) {
            for (int j = 0; j < faceFeatures[i].length; j++) {
                faceFeatures[i][j] = str;
            }
        }
    }

    public void edit(String replace, int row, int column)
    {
        faceFeatures[row][column] = replace;
    }


    public String toString() {
        String line = "";

        for (int i = 0; i < faceFeatures.length; i++) {
            String row = "";
            for (int j = 0; j < faceFeatures[i].length; j++) {
                row += faceFeatures[i][j];
            }
            line += row + "\n";
        }

        return line;
    }

}
