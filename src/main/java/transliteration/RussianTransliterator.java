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
            char c = chars[index];
            try {
                final Russian russian = Russian.valueOf(Character.toString(c));
                if (exception(chars, index)) {
                    builder.append("C");
                    continue;
                }
                    builder.append(russian.getLatin());
            } catch (IllegalArgumentException exception) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    private boolean exception(final char[] chars, final int index) {
        if(chars.length > index + 1) {
            final char c = chars[index + 1];
            final List<String> nexts = Arrays.asList("И", "Е", "Э", "Ё", "Ы", "Ю", "Я", "Й");
            for (String next : nexts) {
                if(next.equalsIgnoreCase(Character.toString(c))) {
                    return true;
                }
            }
        }
        return false;
    }

}
