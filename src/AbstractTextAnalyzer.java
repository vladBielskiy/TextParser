public abstract class AbstractTextAnalyzer implements Function{
    @Override
    public int getBigLetters(String str) {
        return new BigLettersTextAnalyzer().getBigLetters(str);
    }

    @Override
    public int getNumbers(String str) {
        return new NumbersTextAnalyzer().getNumbers(str);
    }

    @Override
    public int getBigLettersAndNumbers(String str) {
        return new BigLettersAndNumbersTextAnalyzer().getBigLettersAndNumbers(str);
    }

    @Override
    public int getSpaces(String str) {
        return new SpacesTextAnalyzer().getSpaces(str);
    }

    @Override
    public String replace(String initial, String toReplace, String replaceString) {
        return new ReplaceTextAnalyzer().replace(initial,toReplace,replaceString);
    }

    @Override
    public String[] split(String str, char c) {
        return new SplitTextAnalyzer().split(str,c);
    }

    @Override
    public int[] find(String str, String toFind) {
        return new FindTextAnalyzer().find(str,toFind);
    }

}
