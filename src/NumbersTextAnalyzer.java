public class NumbersTextAnalyzer extends AbstractTextAnalyzer{
    @Override
    public int getNumbers(String str) {
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                a++;
            }
        }
        return a;
    }


}
