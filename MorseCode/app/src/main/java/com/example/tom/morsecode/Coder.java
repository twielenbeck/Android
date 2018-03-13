package com.example.tom.morsecode;

import android.support.v7.app.AppCompatActivity;

/**
 * @author Tom Wielenbeck
 * Created by Tom on 2/28/2018.
 */

/**
 * The Coder class handles the String values of the inputHolder/outputString
 * which are temporarily used and reused to iterate through the alphanumericArray/morseArray inside
 * the addBreak() method.
 */

public class Coder extends AppCompatActivity {
     /**
      * Coder: <br>
      *     @param invalidMsg static String used to display error message to user in case there was
      *                       no valid value found in the morseArray String array. It is checked
      *                       for at the beginning of addDash(), addDot(), and addBreak() methods
      *                       so that the error message is cleared, and the value to be displayed
      *                       is what the user is entering in morse code instead.
      */
    static String invalidMsg = "Invalid Entry - do you even morse??";

    public static void addDash() {
        /**
         * addDash(): <br>
         *     Adds a "-" to inputHolder if btn_dash is clicked.
         */
        if (MainActivity.inputHolder == invalidMsg) {
            MainActivity.inputHolder = "";
        }
        MainActivity.inputHolder = MainActivity.inputHolder + "-";
    }

    public static void addDot() {
        /**
         * addDot(): <br>
         *     Adds a "." to inputHolder if btn_dot is clicked.
         */
        if (MainActivity.inputHolder == invalidMsg) {
            MainActivity.inputHolder = "";
        }
        MainActivity.inputHolder = MainActivity.inputHolder + ".";
    }


    public static void addBreak() {
        /**
         * addBreak(): <br>
         *     If btn_break is clicked while inputHolder String is empty: the result will end with
         *     outputString being passed a space. If it is not empty, inputHolder will be used to
         *     iterate through alphanumericArray for a match. If there is a match with inputHolder,
         *     outputString will be passed that matching value from alphanumericArray.
         *     @param match boolean used to find if a match was made between the parallel arrays
         *                  (alphanumericArray & morseArray). If there wasn't a match inputHolder
         *                  will be assigned the value of invalidMsg String.
         */
        if (MainActivity.inputHolder == invalidMsg) {
            MainActivity.inputHolder = "";
        }
        boolean match = false;
        if (MainActivity.inputHolder == "") {
            MainActivity.outputString = MainActivity.outputString + " ";
        } else {
            for (int i = 0; i < MainActivity.morseArray.length; i++) {
                if (MainActivity.inputHolder.equals(MainActivity.morseArray[i])) {
                    MainActivity.outputString = MainActivity.outputString + MainActivity.alphanumericArray[i];
                    match = true;
                    break;
                }
            }
            if (match == false) {
                MainActivity.inputHolder = invalidMsg;
            } else {
                MainActivity.inputHolder = "";
            }
        }
    }
}
