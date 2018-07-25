package transliteration;

/**
 * @author Alexander Diachenko.
 */
public enum Russian {

    А("A"),       а("a"),
    Б("B"),       б("b"),
    В("V"),       в("v"),
    Г("G"),       г("g"),
    Д("D"),       д("d"),
    Е("E"),       е("e"),
    Ё("Yo"),      ё("yo"),
    Ж("Zh"),      ж("zh"),
    З("Z"),       з("z"),
    И("I"),       и("i"),
    Й("J"),       й("j"),
    К("K"),       к("k"),
    Л("L"),       л("l"),
    М("M"),       м("m"),
    Н("N"),       н("n"),
    О("O"),       о("o"),
    П("P"),       п("p"),
    Р("R"),       р("r"),
    С("S"),       с("s"),
    Т("T"),       т("t"),
    У("U"),       у("u"),
    Ф("F"),       ф("f"),
    Х("X"),       х("x"),
    Ц("Cz"),      ц("cz"),
    Ч("Ch"),      ч("ch"),
    Ш("Sh"),      ш("sh"),
    Щ("Shh"),     щ("shh"),
    Ъ("''"),      ъ("''"),
    Ы("Y'"),      ы("y'"),
    Ь("'"),       ь("'"),
    Э("E'"),      э("e'"),
    Ю("Yu"),      ю("yu"),
    Я("Ya"),      я("ya");

    private String latin;

    Russian(final String latin) {
        this.latin = latin;
    }

    public String getLatin() {
        return this.latin;
    }
}
