package transliteration;

/**
 * @author Alexander Diachenko.
 */
public enum Ukrainian {

    А("A", "A"),       а("a", "a"),
    Б("B", "B"),       б("b", "b"),
    В("V", "V"),       в("v", "v"),
    Г("H", "H"),       г("h", "h"),
    Ґ("G", "G"),       ґ("g", "g"),
    Д("D", "D"),       д("d", "d"),
    Е("E", "E"),       е("e", "e"),
    Є("Ye", "Ie"),     є("ye", "ie"),
    Ж("Zh", "Zh"),     ж("zh", "zh"),
    З("Z", "Z"),       з("z", "z"),
    И("Y", "Y"),       и("y", "y"),
    І("I", "I"),       і("i", "i"),
    Ї("Yi", "I"),      ї("yi", "i"),
    Й("Y", "I"),       й("y", "i"),
    К("K", "K"),       к("k", "k"),
    Л("L", "L"),       л("l", "l"),
    М("M", "M"),       м("m", "m"),
    Н("N", "N"),       н("n", "n"),
    О("O", "O"),       о("o", "o"),
    П("P", "P"),       п("p", "p"),
    Р("R", "R"),       р("r", "r"),
    С("S", "S"),       с("s", "s"),
    Т("T", "T"),       т("t", "t"),
    У("U", "U"),       у("u", "u"),
    Ф("F", "F"),       ф("f", "f"),
    Х("Kh", "Kh"),     х("kh", "kh"),
    Ц("Ts", "Ts"),     ц("ts", "ts"),
    Ч("Ch", "Ch"),     ч("ch", "ch"),
    Ш("Sh", "Sh"),     ш("sh", "sh"),
    Щ("Shch", "Shch"), щ("shch", "shch"),
    Ю("Yu", "Iu"),     ю("yu", "iu"),
    Я("Ya", "Ia"),     я("ya", "ia");

    private String firstLetter;
    private String otherLetter;

    Ukrainian(String firstLetter, String otherLetter) {
        this.firstLetter = firstLetter;
        this.otherLetter = otherLetter;
    }

    public String getFirstLetter() {
        return this.firstLetter;
    }

    public String getOtherLetter() {
        return this.otherLetter;
    }
}
