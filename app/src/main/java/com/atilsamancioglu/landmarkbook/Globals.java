package com.atilsamancioglu.landmarkbook;

import android.graphics.Bitmap;

/**
 * Created by atilsamancioglu on 25/05/2017.
 */

public class Globals {

    private static Globals instance;

    private Bitmap chosenImage;

    private Globals() {

    }

    public void setData(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }

    public Bitmap getData() {
        return this.chosenImage;
    }


    public static Globals getInstance() {
        if (instance == null) {
            instance = new Globals();
        }

        return instance;
    }

}
