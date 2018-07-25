package transliteration;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alexander Diachenko.
 */
public class RussianTransliteratorTest {

    private Transliterator transliterator = new RussianTransliterator();

    @Test
    public void А___A() {
        final String latin = this.transliterator.transliterateToLatin("А");
        assertEquals("A", latin);
    }

    @Test
    public void apostrophe___apostrophe() {
        final String latin = this.transliterator.transliterateToLatin("'");
        assertEquals("'", latin);
    }

    @Test
    public void Алушта___Alushta() {
        final String latin = this.transliterator.transliterateToLatin("Алушта");
        assertEquals("Alushta", latin);
    }

    @Test
    public void Это___Eto() {
        final String latin = this.transliterator.transliterateToLatin("Это");
        assertEquals("E'to", latin);
    }
}
