package transliteration;

/**
 * @author Alexander Diachenko.
 */
public class UkrainianTransliterator implements Transliterator {

    @Override
    public String transliterateToLatin(final String string) {
        final StringBuilder builder = new StringBuilder();
        final char[] chars = string.toCharArray();
        for (int index = 0; index < chars.length; index++) {
            try {
                transliterate(builder, chars, index);
            } catch (IllegalArgumentException exception) {
                final char current = chars[index];
                if (!isApostrophe(current)) {
                    builder.append(current);
                }
            }
        }
        return builder.toString();
    }

    private void transliterate(final StringBuilder builder, final char[] chars, final int index) {
        final char current = chars[index];
        final Ukrainian ukrainian = Ukrainian.valueOf(Character.toString(current));
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
        return String.valueOf(chars[index]).equalsIgnoreCase("г")
                && String.valueOf(chars[index - 1]).equalsIgnoreCase("з");
    }

    private boolean isFirstLetter(final char[] chars, final int index) {
        if (index == 0) {
            return true;
        }
        final char c = chars[index - 1];
        return !Character.isLetterOrDigit(c) && !isApostrophe(c);
    }

    private boolean isApostrophe(final char c) {
        return c == '\'';
    }
}
