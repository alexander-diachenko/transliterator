package transliteration;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alexander Diachenko.
 */
public class UkrainianTransliteratorTest {

    private Transliterator transliterator = new TransliteratorImpl();

    @Test
    public void А_A() {
        final String latin = this.transliterator.ukrainianToLatin("А");
        assertEquals("A", latin);
    }

    @Test
    public void а_a() {
        final String latin = this.transliterator.ukrainianToLatin("а");
        assertEquals("a", latin);
    }

    @Test
    public void Aа_Aa() {
        final String latin = this.transliterator.ukrainianToLatin("Аа");
        assertEquals("Aa", latin);
    }

    @Test
    public void Я_Ya() {
        final String latin = this.transliterator.ukrainianToLatin("Я");
        assertEquals("Ya", latin);
    }

    @Test
    public void Ая_Aia() {
        final String latin = this.transliterator.ukrainianToLatin("Ая");
        assertEquals("Aia", latin);
    }
}
