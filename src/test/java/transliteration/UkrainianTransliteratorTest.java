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
}
