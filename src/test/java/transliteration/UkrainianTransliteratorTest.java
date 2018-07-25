package transliteration;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alexander Diachenko.
 */
public class UkrainianTransliteratorTest {

    private Transliterator transliterator = new UkrainianTransliterator();

    @Test
    public void А___A() {
        final String latin = this.transliterator.transliterateToLatin("А");
        assertEquals("A", latin);
    }

    @Test
    public void а___a() {
        final String latin = this.transliterator.transliterateToLatin("а");
        assertEquals("a", latin);
    }

    @Test
    public void Aа___Aa() {
        final String latin = this.transliterator.transliterateToLatin("Аа");
        assertEquals("Aa", latin);
    }

    @Test
    public void Я___Ya() {
        final String latin = this.transliterator.transliterateToLatin("Я");
        assertEquals("Ya", latin);
    }

    @Test
    public void Ая___Aia() {
        final String latin = this.transliterator.transliterateToLatin("Ая");
        assertEquals("Aia", latin);
    }

    @Test
    public void Алушта___Alushta() {
        final String latin = this.transliterator.transliterateToLatin("Алушта");
        assertEquals("Alushta", latin);
    }

    @Test
    public void Їжакевич_Кадиївка_Марїне___Yizhakevych_Kadyivka_Marine() {
        final String latin = this.transliterator.transliterateToLatin("Їжакевич Кадиївка Марїне");
        assertEquals("Yizhakevych Kadyivka Marine", latin);
    }

    @Test
    public void Згорани___Zghorany() {
        final String latin = this.transliterator.transliterateToLatin("Згорани");
        assertEquals("Zghorany", latin);
    }

    @Test
    public void Юрій_Корюківка___Yurii_Koriukivka() {
        final String latin = this.transliterator.transliterateToLatin("Юрій Корюківка");
        assertEquals("Yurii Koriukivka", latin);
    }

    @Test
    public void Яготин_Костянтин_Знамянка___Yahotyn_Kostiantyn_Znamianka() {
        final String latin = this.transliterator.transliterateToLatin("Яготин Костянтин Знамянка");
        assertEquals("Yahotyn Kostiantyn Znamianka", latin);
    }

    @Test
    public void Йосипівка_Стрий_Олексій___Yosypivka_Stryi_Oleksii() {
        final String latin = this.transliterator.transliterateToLatin("Йосипівка Стрий Олексій");
        assertEquals("Yosypivka Stryi Oleksii", latin);
    }

    @Test
    public void Єнакієве_Гаєвич_Коропє___Yenakiieve_Haievych_Koropie() {
        final String latin = this.transliterator.transliterateToLatin("Єнакієве Гаєвич Короп'є");
        assertEquals("Yenakiieve Haievych Koropie", latin);
    }

    @Test
    public void Розгон_Rozghon() {
        final String latin = this.transliterator.transliterateToLatin("Розгон");
        assertEquals("Rozghon", latin);
    }

    @Test
    public void Пє_Pie() {
        final String latin = this.transliterator.transliterateToLatin("П'є");
        assertEquals("Pie", latin);
    }

    @Test
    public void Я1_Ya1() {
        final String latin = this.transliterator.transliterateToLatin("Я1");
        assertEquals("Ya1", latin);
    }

    @Test
    public void latin___latin() {
        final String latin = this.transliterator.transliterateToLatin("latin");
        assertEquals("latin", latin);
    }

    @Test
    public void Корюківка_Юрій____Koriukivka_Yurii() {
        final String latin = this.transliterator.transliterateToLatin("Корюківка Юрій");
        assertEquals("Koriukivka Yurii", latin);
    }

    @Test
    public void _1я____1ia() {
        final String latin = this.transliterator.transliterateToLatin("1я");
        assertEquals("1ia", latin);
    }
}
