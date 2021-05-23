public interface Function {
    public int getBigLetters(String str);
    public int getNumbers(String str);
    public int getBigLettersAndNumbers(String str);
    public int getSpaces(String str);
    public String replace(String initial,String toReplace,String replaceString);
    public String[] split(String str,char c);
    public int[] find(String str,String toFind);
}
