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

    @Test
    public void Згорани___Zghorany() {
        final String latin = this.transliterator.ukrainianToLatin("Згорани");
        assertEquals("Zghorany", latin);
    }

    @Test
    public void Юрій_Корюківка___Yurii_Koriukivka() {
        final String latin = this.transliterator.ukrainianToLatin("Юрій Корюківка");
        assertEquals("Yurii Koriukivka", latin);
    }

    @Test
    public void Яготин_Костянтин_Знамянка___Yahotyn_Kostiantyn_Znamianka() {
        final String latin = this.transliterator.ukrainianToLatin("Яготин Костянтин Знамянка");
        assertEquals("Yahotyn Kostiantyn Znamianka", latin);
    }

    @Test
    public void Йосипівка_Стрий_Олексій___Yosypivka_Stryi_Oleksii() {
        final String latin = this.transliterator.ukrainianToLatin("Йосипівка Стрий Олексій");
        assertEquals("Yosypivka Stryi Oleksii", latin);
    }

    @Test
    public void Єнакієве_Гаєвич_Коропє___Yenakiieve_Haievych_Koropie() {
        final String latin = this.transliterator.ukrainianToLatin("Єнакієве Гаєвич Короп'є");
        assertEquals("Yenakiieve Haievych Koropie", latin);
    }

    @Test
    public void Розгон_Rozghon() {
        final String latin = this.transliterator.ukrainianToLatin("Розгон");
        assertEquals("Rozghon", latin);
    }
}
