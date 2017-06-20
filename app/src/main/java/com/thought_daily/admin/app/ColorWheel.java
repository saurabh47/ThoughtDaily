package com.thought_daily.admin.app;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Admin on 3/24/2017.
 */

public class ColorWheel {
        private String[] mColors = {
        "#39add1", // light blue
        "#3079ab", // dark blue
        "#c25975", // mauve
        "#e15258", // red
        "#f9845b", // orange
        "#838cc7", // lavender
        "#7d669e", // purple
        "#53bbb4", // aqua
        "#51b46d", // green
        "#e0ab18", // mustard
        "#637a91", // dark gray
        "#f092b0", // pink
        };
        public int getColor() {

            String color ;
            Random randomGenarator = new Random();
            int randomNumber = randomGenarator.nextInt(mColors.length);
            color = mColors[randomNumber];
            int colorAsInt= Color.parseColor(color);
            return colorAsInt;
        }
}