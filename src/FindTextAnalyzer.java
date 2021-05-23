import java.util.ArrayList;
import java.util.Collections;

public class FindTextAnalyzer extends AbstractTextAnalyzer{
    @Override
    public int[] find(String str, String toFind) {
        int[] temp = new int[str.length()];
        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(toFind,i) == -1){
                break;
            }
            if(str.indexOf(toFind,i) != str.indexOf(toFind,i + 1)){
                temp[i] = str.indexOf(toFind,i);
                a++;
            }

        }
        int[] result = new int[a];
if(str.startsWith(toFind)){
    for (int i = 1; i < temp.length; i++) {
        if(temp[i] == 0){
            temp[i] = -1;
        }
    }
}else {
    for (int i = 0; i < temp.length; i++) {
        if(temp[i] == 0){
            temp[i] = -1;
        }
    }
}


        for (int i = 0; i < temp.length; i++) {
            if(i == temp.length - 1){
                break;
            }
            if(temp[i] > temp[i + 1]){
                result[b] = temp[i];
                b++;
            }
        }




        return result;
    }
}
