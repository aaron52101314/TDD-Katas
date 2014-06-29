package org.xander.katas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SpellOutANumberTest {
    SpellOutANumber spellOutANumber;

    @Before
    public void setUp() {
        spellOutANumber = new SpellOutANumber();
    }

    @Test
    public void basic() {
        assertNotNull(spellOutANumber);
    }

    @Test
    public void simpleOneDigitNumber8() {
        String result = spellOutANumber.spellOutOneDigitNumber(8);
        assertEquals("eight", result);
    }

    @Test
    public void simpleOneDigitNumber() {
        String result = spellOutANumber.spellOutOneDigitNumber(9);
        assertEquals("nine", result);
    }

    @Test
    public void twoDigitNumber() {
        String result = spellOutANumber.spellOutTwoDigitNumber(19);
        assertEquals("nineteen", result);
    }

    @Test
    public void anotherTwoDigitNumber() {
        String result = spellOutANumber.spellOutTwoDigitNumberAbove20(21);
        assertEquals("twenty one", result);
    }

    @Test
    public void anotherTwoDigitNumber11() {
        String result = spellOutANumber.spellOutTwoDigitNumber(11);
        assertEquals("eleven", result);
    }

    @Test
    public void anotherTwoDigitNumber13() {
        String result = spellOutANumber.spellOutTwoDigitNumber(13);
        assertEquals("thirteen", result);
    }

    @Test
    public void anotherTwoDigitNumber14() {
        String result = spellOutANumber.spellOutTwoDigitNumber(14);
        assertEquals("fourteen", result);
    }

    @Test
    public void anotherTwoDigitNumber16() {
        String result = spellOutANumber.spellOutTwoDigitNumber(16);
        assertEquals("sixteen", result);
    }

    @Test
    public void anotherTwoDigitNumber17() {
        String result = spellOutANumber.spellOutTwoDigitNumber(17);
        assertEquals("seventeen", result);
    }

    @Test
    public void anotherTwoDigitNumber18() {
        String result = spellOutANumber.spellOutTwoDigitNumber(18);
        assertEquals("eighteen", result);
    }

    @Test
    public void anotherTwoDigitNumber50() {
        String result = spellOutANumber.spellOutTwoDigitNumberAbove20(50);
        assertEquals("fifty ", result);
    }

    @Test
    public void anotherTwoDigitNumber80() {
        String result = spellOutANumber.spellOutTwoDigitNumberAbove20(80);
        assertEquals("eighty ", result);
    }

    @Test
    public void anotherTwoDigitNumber77() {
        String result = spellOutANumber.spellOutTwoDigitNumberAbove20(77);
        assertEquals("seventy seven", result);
    }

    @Test
    public void threeDigitNumber177() {
        String result = spellOutANumber.spellOutThreeDigitNumber(177);
        assertEquals("one hundred seventy seven", result);
    }

    @Test
    public void anotherThreeDigitNumber134() {
        String result = spellOutANumber.spellOutThreeDigitNumber(134);
        assertEquals("one hundred thirty four", result);
    }

    @Test
    public void anotherThreeDigitNumber100() {
        String result = spellOutANumber.spellOutThreeDigitNumber(SpellOutANumber.hundred);
        assertEquals("one hundred", result);
    }

    @Test
    public void anotherThreeDigitNumber101() {
        String result = spellOutANumber.spellOutThreeDigitNumber(101);
        assertEquals("one hundred one", result);
    }

    @Test
    public void anotherThreeDigitNumber110() {
        String result = spellOutANumber.spellOutThreeDigitNumber(110);
        assertEquals("one hundred ten", result);
    }

    @Test
    public void anotherThreeDigitNumber999() {
        String result = spellOutANumber.spellOutThreeDigitNumber(999);
        assertEquals("nine hundred ninety nine", result);
    }

    @Test
    public void anotherFourDigitNumber4529() {
        String result = spellOutANumber.spellOutFourDigitNumber(4529);
        assertEquals("four thousand five hundred twenty nine", result);
    }

    @Test
    public void anotherFourDigitNumber1000() {
        String result = spellOutANumber.spellOutFourDigitNumber(SpellOutANumber.thousand);
        assertEquals("one thousand", result);
    }

    @Test
    public void anotherFourDigitNumber9999() {
        String result = spellOutANumber.spellOutFourDigitNumber(9999);
        assertEquals("nine thousand nine hundred ninety nine", result);
    }

    @Test
    public void fiveDigitNumber19999() {
        String result = spellOutANumber.spellOutFiveDigitNumber(19999);
        assertEquals("nineteen thousand nine hundred ninety nine", result);
    }

    @Test
    public void sixDigitNumber719999() {
        String result = spellOutANumber.spellOutSixDigitNumber(719999);
        assertEquals("seven hundred nineteen thousand nine hundred ninety nine", result);
    }

    @Test
    public void sevenDigitNumber1719999() {
        String result = spellOutANumber.spellOutSevenDigitNumber(1_719_999);
        assertEquals("one million seven hundred nineteen thousand nine hundred ninety nine", result);
    }

    @Test
    public void eightDigitNumber43719999() {
        String result = spellOutANumber.spellOutEightDigitNumber(43_112_603);
        assertEquals("forty three million one hundred twelve thousand six hundred three", result);
    }

    @Test
    public void nineDigitNumber143719999() {
        String result = spellOutANumber.spellOutNineDigitNumber(143_112_603);
        assertEquals("one hundred forty three million one hundred twelve thousand six hundred three", result);
    }

    @Test
    public void tenDigitNumber143719999() {
        String result = spellOutANumber.spellOutTenDigitNumber(15_143_112_603L);
        assertEquals("fifteen billion one hundred forty three million one hundred twelve thousand six hundred three", result);
    }

    @Test
    public void anyNumberBelow100Billion() {
        String result = spellOutANumber.spellOutANumber(25_143_112_603L);
        assertEquals("twenty five billion one hundred forty three million one hundred twelve thousand six hundred three", result);
    }

    @Test
    public void anotherAnyNumberBelow100Billion() {
        String result = spellOutANumber.spellOutANumber((long) 25_131_263);
        assertEquals("twenty five million one hundred thirty one thousand two hundred sixty three", result);
    }
}
