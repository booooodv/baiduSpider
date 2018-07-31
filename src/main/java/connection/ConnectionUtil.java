package connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static java.lang.Thread.sleep;

public class ConnectionUtil {
    /**
     *
     * @param address   //传入地址
     * @return  StringBuffer类全页面内容
     */
    public static Document Connect(String address){
        try {
            Document document = Jsoup.connect(address).get();
            return document;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
