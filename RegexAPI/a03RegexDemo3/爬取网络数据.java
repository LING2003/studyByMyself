package study.byMyself.RegexAPI.a03RegexDemo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 爬取网络数据 {
    public static void main(String[] args) throws IOException {
        //创建一个URL对象
        try {
            URL url = new URL("https://www.sohu.com/xtopic/tag?key=%E6%B8%B8%E6%88%8F-%E7%8E%8B%E8%80%85%E8%8D%A3%E8%80%80&scm=1103.plate:554:0.0.2.0&spm=smpc.channel_230.block1_79_ahR02N_1_nav.2.1671951483683mJupzTF_744");
            //连上这个网址
            URLConnection conn = url.openConnection();
            //创建一个对象去读取网络中的数据
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            //获取正则表达式的对象 pattern
            String regex = "王者荣耀\\W+";
            //<img max-width=\"600\" src=\"\*+.png\">
            Pattern pattern = Pattern.compile(regex);//在读取的时候每次读一整行
            while ((line = br.readLine())!= null){
                //System.out.println(line);
                Matcher m = pattern.matcher(line);
                while (m.find()){
                    String s = m.group();
                    System.out.println(s);
                }


            }
            br.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
