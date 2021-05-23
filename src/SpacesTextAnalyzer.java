public class SpacesTextAnalyzer extends AbstractTextAnalyzer{

    @Override
    public int getSpaces(String str) {
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                a++;
            }
        }
        return a;
    }
}
