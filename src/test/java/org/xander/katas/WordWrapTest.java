package org.xander.katas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WordWrapTest {
    WordWrap wordWrap;

    @Before
    public void setUp() {
        wordWrap = new WordWrap();
    }

    @Test
    public void testBasic() {
        assertNotNull(wordWrap);
    }

    @Test
    public void testBasicBehaviour() {
        String testString = "test test test";
        int columnNumber = 9;

        String result = wordWrap.wrap(testString, columnNumber);

        assertEquals("test test\ntest", result);
    }

    @Test
    public void testBigWord() {
        String testString = "test something important or should it be even more";
        int columnNumber = 9;

        String result = wordWrap.wrap(testString, columnNumber);

        assertEquals("test\nsomething important or should it be even more", result);
    }

    @Test
    public void testNegative() {
        String testString = "testtest";
        int columnNumber = 3;

        String result = wordWrap.wrap(testString, columnNumber);

        assertEquals("testtest", result);
    }

    @Test
    public void testSmallWords() {
        String testString = "test cat dog bird parrot cow whale";
        int columnNumber = 8;

        String result = wordWrap.wrap(testString, columnNumber);

        assertEquals("test cat\ndog\nbird\nparrot\ncow\nwhale", result);
    }

    @Test
    public void testSmallWordsSmallColumnNumber() {
        String testString = "test cat dog bird parrot cow whale";
        int columnNumber = 5;

        String result = wordWrap.wrap(testString, columnNumber);

        assertEquals("test\ncat\ndog\nbird\nparrot cow whale", result);
    }

    @Test
    public void testWhiteSpacesWithWords() {
        String testString = "test     cat        dog        bird         parrot      cow     whale";
        int columnNumber = 8;

        String result = wordWrap.wrap(testString, columnNumber);

        assertEquals("test    \ncat    \n   dog \n     \nbird   \n    \nparrot \n    cow\n   \nwhale", result);
    }
}