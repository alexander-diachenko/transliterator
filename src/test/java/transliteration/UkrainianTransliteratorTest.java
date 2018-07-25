package transliteration;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alexander Diachenko.
 */
public class UkrainianTransliteratorTest {

    private Transliterator transliterator = new TransliteratorImpl();

    @Test
    public void А___A() {
        final String latin = this.transliterator.ukrainianToLatin("А");
        assertEquals("A", latin);
    }

    @Test
    public void а___a() {
        final String latin = this.transliterator.ukrainianToLatin("а");
        assertEquals("a", latin);
    }

    @Test
    public void Aа___Aa() {
        final String latin = this.transliterator.ukrainianToLatin("Аа");
        assertEquals("Aa", latin);
    }

    @Test
    public void Я___Ya() {
        final String latin = this.transliterator.ukrainianToLatin("Я");
        assertEquals("Ya", latin);
    }

    @Test
    public void Ая___Aia() {
        final String latin = this.transliterator.ukrainianToLatin("Ая");
        assertEquals("Aia", latin);
    }

    @Test
    public void Алушта___Alushta() {
        final String latin = this.transliterator.ukrainianToLatin("Алушта");
        assertEquals("Alushta", latin);
    }

    @Test
    public void Їжакевич_Кадиївка_Марїне___Yizhakevych_Kadyivka_Marine() {
        final String latin = this.transliterator.ukrainianToLatin("Їжакевич Кадиївка Марїне");
        assertEquals("Yizhakevych Kadyivka Marine", latin);
    }
}
