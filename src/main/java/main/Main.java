package main;

import connection.ConnectionUtil;
import file.Input;
import getContent.GetContent;

import java.util.List;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String filePath = "C:\\searchWords.txt";
        List<String> searchWords = Input.inputTxt(filePath);
        GetContent getContent = new GetContent();
        String url = "";
        for (String word:searchWords) {
            url = "https://www.baidu.com/s?wd=" + word ;
            getContent.getContent(ConnectionUtil.Connect(url));
            sleep(1000);
        }
    }
}
