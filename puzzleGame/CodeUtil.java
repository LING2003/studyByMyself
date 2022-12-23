package study.byMyself.puzzleGame;

import java.util.Random;

public class CodeUtil {
    public final static String generateCode(){
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i<26){
                arr[i]= (char) ('a'+i);
            }else {
                arr[i]=(char)('A'+i-26);
            }
        }
        Random r = new Random();
        int num = r.nextInt(10);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(arr.length);
            sb.append(arr[randomIndex]);
        }
        char[] c = sb.append(num).toString().toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            int index=r.nextInt(c.length);
            char temp;
            temp = c[i];
            c[i] = c[index];
            c[index] = temp;
        }
        String code = result.append(c).toString();
        return code;
    }


}
