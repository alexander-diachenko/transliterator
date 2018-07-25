package transliteration;

/**
 * @author Alexander Diachenko.
 */
public class RussianTransliterator implements Transliterator {

    @Override
    public String transliterateToLatin(final String string) {
        final StringBuilder builder = new StringBuilder();
        final char[] chars = string.toCharArray();
        for (char c : chars) {
            try {
                final Russian russian = Russian.valueOf(Character.toString(c));
                builder.append(russian.getLatin());
            } catch (IllegalArgumentException exception) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

}
