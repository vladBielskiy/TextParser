public class BigLettersAndNumbersTextAnalyzer extends AbstractTextAnalyzer{
    @Override
    public int getBigLettersAndNumbers(String str) {
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 60 && str.charAt(i) <= 90 || str.charAt(i) >= 48 && str.charAt(i) <= 57){
                a++;
            }
        }
        return a;
    }

}
