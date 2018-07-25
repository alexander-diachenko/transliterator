package transliteration;

/**
 * @author Alexander Diachenko.
 */
public class TransliteratorImpl implements Transliterator {

    @Override
    public String ukrainianToLatin(final String string) {
        StringBuilder builder = new StringBuilder();
        final Ukrainian[] ukrainians = Ukrainian.values();
        final String[] words = string.split(" ");
        for (String word : words) {
            final char[] chars = word.toCharArray();
            for (Ukrainian ukrainian : ukrainians) {
                for (char c : chars) {
                    if (ukrainian.name().equals(Character.toString(c))) {
                        builder.append(ukrainian.getFirstLetter());
                    }
                }
            }
        }
        return builder.toString();
    }
}
