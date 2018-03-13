package com.example.tom.morsecode;

/**
 * @author Tom Wielenbeck
 * Created by Tom on 2/28/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This app translates two morse code buttons into alphanumerical characters using parallel String
 * arrays between the alphanumericArray / morseArray and outputs them into a TextView (text_output).
 * The dot (btn_dot), dash (btn_dash), and break (btn_break) buttons onClick methods are passed
 * to the aptly named methods inside the Coder class where values are returned upon iterating
 * through the aforementioned arrays (See Coder.java for further details).
 */

public class MainActivity extends AppCompatActivity {
    /**
     * MainActivity: <br>
     *     @param output protected field used for accessing the text_output TextView.
     *     @param morseView protected field used for accessing the text_morseviewer TextView. It is then
     *                      instantiated in the onCreate() method and assigned the value of the TextView.
     *     @param alphanumericArray Array of strings that holds each letter and number of
     *                              the english alphabet.
     *     @param morseArray Array of strings that holds the morse equivalent value of each
     *                       letter & number(in parallel to the alphanumericArray).
     *     @param inputHolder static String used to hold temporary values of the morse inputs before
     *                        being used to search the alphanumericArray in the Coder.addBreak() method.
     *                        The value of this string is also displayed in text_morseviewer TextView,
     *                        and is added to the outputString String if the input is valid.
     *     @param outputString static String that holds what the text_output displays.
     */
    protected TextView output;
    protected TextView morseView;

    final static String[] alphanumericArray = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

    final static String[] morseArray = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----"};
    static String inputHolder = "";
    static String outputString = "";

    /**
     * onCreate(): <br>
     *      @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView)findViewById(R.id.text_output);
        morseView = (TextView)findViewById(R.id.text_morseviewer);
    }

    /**
     * dashClick(): <br>
     *     The onClick method for btn_dash. Executes the Color.addDash() method, and updates
     *     the text_morseviewer TextView with the current value of inputHolder upon each click.
     * @param v
     */
    public void dashClick (View v ) {
        Coder.addDash();
        morseView.setText(inputHolder);
    }

    /**
     * dotClick(): <br>
     *     The onClick method for btn_dot. Executes the Color.addDot() method, and updates
     *     the text_morseviewer TextView with the current value of inputHolder upon each click.
     * @param v
     */
    public void dotClick (View v ) {
        Coder.addDot();
        morseView.setText(inputHolder);
    }
    /**
     * breakClick(): <br>
     *     The onClick method for btn_break. Creates a new object for the coder class and uses it
     *     to access the Coder.addBreak() method.
     *
     *     Side note:
     *          An object is used in case static were to be removed from addBreak() method in case
     *          a toast were to be implemented upon an invalid entry of morse code.
     *
     *     After executing the Coder.addBreak() method, the text_morseviewer / text_output TextViews
     *     are updated with the current values of inputHolder / outputString upon each click.
     * @param v
     */
    public void breakClick (View v ) {
        Coder coder = new Coder();
        coder.addBreak();
        output.setText(outputString);
        morseView.setText(inputHolder);
    }

    /**
     * clearClick(): <br>
     *     The onClick method for btn_clear. Clears the values of outputString and inputHolder, and
     *     updates the TextViews to represent the empty Strings.
     * @param v
     */
    public void clearClick (View v) {
        outputString = "";
        inputHolder = "";
        output.setText(outputString);
        morseView.setText(inputHolder);
    }
}
