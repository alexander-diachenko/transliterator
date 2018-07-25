package transliteration;

/**
 * @author Alexander Diachenko.
 */
public class TransliteratorImpl implements Transliterator {

    @Override
    public String ukrainianToLatin(final String string) {
        final StringBuilder builder = new StringBuilder();
        final Ukrainian[] ukrainians = Ukrainian.values();
        final String[] words = string.split(" ");
        for (final String word : words) {
            final char[] chars = word.toCharArray();
            for (int index = 0; index < chars.length; index++) {
                char c = chars[index];
                for (Ukrainian ukrainian : ukrainians) {
                    if (ukrainian.name().equals(Character.toString(c))) {
                        if (isFirstLetter(index)) {
                            builder.append(ukrainian.getFirstLetter());
                            break;
                        } else {
                            builder.append(ukrainian.getOtherLetter());
                            break;
                        }
                    }
                }
            }
            builder.append(" ");
        }
        builder.setLength(builder.length() - 1);
        return builder.toString();
    }

    private boolean isFirstLetter(final int i) {
        return i == 0;
    }
}
