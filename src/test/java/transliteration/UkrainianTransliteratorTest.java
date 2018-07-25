package transliteration;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alexander Diachenko.
 */
public class UkrainianTransliteratorTest {

    private Transliterator transliterator = new TransliteratorImpl();

    @Test
    public void A_A() {
        final String latin = this.transliterator.ukrainianToLatin("А");
        assertEquals("A", latin);
    }

    @Test
    public void a_a() {
        final String latin = this.transliterator.ukrainianToLatin("а");
        assertEquals("a", latin);
    }

    @Test
    public void Aа_Aa() {
        final String latin = this.transliterator.ukrainianToLatin("Аа");
        assertEquals("Aa", latin);
    }
}
