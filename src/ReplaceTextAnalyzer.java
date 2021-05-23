public class ReplaceTextAnalyzer extends AbstractTextAnalyzer{

    @Override
    public String replace(String initial, String toReplace, String replaceString) {
        return initial.replaceAll(toReplace,replaceString);
    }
}
