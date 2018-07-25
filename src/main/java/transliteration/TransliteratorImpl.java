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
        for (int index = 0, wordsLength = words.length; index < wordsLength; index++) {
            final String word = words[index];
            final char[] chars = word.toCharArray();
            for (Ukrainian ukrainian : ukrainians) {
                for (char c : chars) {
                    if (ukrainian.name().equals(Character.toString(c))) {
                        if(isFirstLetter(index)) {
                            builder.append(ukrainian.getFirstLetter());
                        } else {
                            builder.append(ukrainian.getOtherLetter());
                        }
                    }
                }
            }
        }
        return builder.toString();
    }

    private boolean isFirstLetter(final int i) {
        return i == 0;
    }
}
