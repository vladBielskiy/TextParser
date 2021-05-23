public class TextProcessor extends AbstractTextAnalyzer{
    public static void main(String[] args) {
TextProcessor textProcessor = new TextProcessor();
        System.out.println(textProcessor.getBigLetters("ffffFD"));
        System.out.println(textProcessor.getNumbers("sdfsd24"));
        System.out.println(textProcessor.getBigLettersAndNumbers("asdDdsf2"));
        System.out.println(textProcessor.getSpaces("dsds sds "));
        int[] a = textProcessor.find("xxffxxffxx","fg");
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
}
