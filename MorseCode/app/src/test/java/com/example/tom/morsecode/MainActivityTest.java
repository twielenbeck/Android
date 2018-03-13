package com.example.tom.morsecode;

import android.content.Context;
import static junit.framework.TestCase.assertNotNull;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Tom Wielenbeck
 * Created by Tom on 2/28/2018.
 */

public class MainActivityTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = null;

        assertEquals("com.example.tom.morsecode", appContext.getPackageName());
        assertNotNull("Should not be null", MainActivity.alphanumericArray.length);
        assertNotNull("Should not be null", MainActivity.morseArray.length);
    }
}
