package transliteration;

/**
 * @author Alexander Diachenko.
 */
public class TransliteratorImpl implements Transliterator {

    @Override
    public String ukrainianToLatin(final String string) {
        final StringBuilder builder = new StringBuilder();
        final char[] chars = string.toCharArray();
        for (int index = 0; index < chars.length; index++) {
            char c = chars[index];
            try {
                final Ukrainian ukrainian = Ukrainian.valueOf(Character.toString(c));
                transliterate(builder, chars, index, ukrainian);
            } catch (IllegalArgumentException exception) {
                if(!isApostrophe(c)) {
                    builder.append(c);
                }
            }
        }
        return builder.toString();
    }

    private boolean isApostrophe(final char c) {
        return c == '\'';
    }

    private void transliterate(final StringBuilder builder, final char[] chars, final int index, final Ukrainian ukrainian) {
        if (isFirstLetter(chars, index)) {
            builder.append(ukrainian.getFirstLetter());
        } else {
            if (exception(chars, index)) {
                builder.append("gh");
                return;
            }
            builder.append(ukrainian.getOtherLetter());
        }
    }

    private boolean exception(final char[] chars, final int index) {
        return String.valueOf(chars[index]).equalsIgnoreCase("г") && String.valueOf(chars[index - 1]).equalsIgnoreCase("з");
    }

    private boolean isFirstLetter(final char[] chars, final int i) {
        if(i == 0) {
            return true;
        }
        return !Character.isLetter(chars[i - 1]) && !isApostrophe(chars[i - 1]);
    }
}
