package transliteration;

import java.util.Arrays;
import java.util.List;

/**
 * @author Alexander Diachenko.
 */
public class RussianTransliterator implements Transliterator {

    @Override
    public String transliterateToLatin(final String string) {
        final StringBuilder builder = new StringBuilder();
        final char[] chars = string.toCharArray();
        for (int index = 0, charsLength = chars.length; index < charsLength; index++) {
            try {
                transliterate(builder, chars, index);
            } catch (IllegalArgumentException exception) {
                final char current = chars[index];
                builder.append(current);
            }
        }
        return builder.toString();
    }

    private void transliterate(final StringBuilder builder, final char[] chars, final int index) {
        final char current = chars[index];
        final Russian russian = Russian.valueOf(Character.toString(current));
        if (exception(chars, index)) {
            builder.append("C");
            return;
        }
        builder.append(russian.getLatin());
    }

    private boolean exception(final char[] chars, final int index) {
        if (chars.length > index + 1) {
            final char c = chars[index + 1];
            final List<String> nexts = Arrays.asList("И", "Е", "Э", "Ё", "Ы", "Ю", "Я", "Й");
            for (String next : nexts) {
                if (next.equalsIgnoreCase(Character.toString(c))) {
                    return true;
                }
            }
        }
        return false;
    }
}
