import connection.ConnectionUtil;
import getContent.GetContent;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

public class TextConnection {
    @Test
    public void textConnection(){
        Document document = ConnectionUtil.Connect("https://www.baidu.com/s?ie=utf-8&f=3&rsv_bp=1&tn=baidu&wd=%E5%A7%9A%E6%9C%9F%E6%99%BA%20%E6%B8%85%E5%8D%8E%E5%A4%A7%E5%AD%A6%E4%BA%A4%E5%8F%89%E4%BF%A1%E6%81%AF%E7%A0%94%E7%A9%B6%E9%99%A2&oq=%25E5%25A7%259A%25E6%259C%259F%25E6%2599%25BA%2520%25E6%25B8%2585%25E5%258D%258E%25E5%25A4%25A7%25E5%25AD%25A6%25E4%25BA%25A4%25E5%258F%2589%25E4%25BF%25A1%25E6%2581%25AF%25E7%25A0%2594%25E7%25A9%25B6%25E9%2599%25A2%2520%25E7%2599%25BE%25E5%25BA%25A6%25E7%2599%25BE%25E7%25A7%2591&rsv_pq=fc0fb43a0000e355&rsv_t=6c96n52z3vNArL3cXrdNzwjKe5y3ddE9J9rd1rLKBNxUUOsC9x7nBb%2Bczks&rqlang=cn&rsv_enter=0&inputT=1985&rsv_sug3=26&rsv_sug1=8&rsv_sug7=000&rsv_sug2=0&prefixsug=%25E5%25A7%259A%25E6%259C%259F%25E6%2599%25BA%2520%25E6%25B8%2585%25E5%258D%258E%25E5%25A4%25A7%25E5%25AD%25A6%25E4%25BA%25A4%25E5%258F%2589%25E4%25BF%25A1%25E6%2581%25AF%25E7%25A0%2594%25E7%25A9%25B6%25E9%2599%25A2&rsp=1&rsv_sug4=2727&rsv_sug=2");
        GetContent gc = new GetContent();
        gc.getContent(document);
    }

    @Test
    public void textB(){
        Document document = ConnectionUtil.Connect("https://baike.baidu.com/item/%E5%AD%99%E5%AE%9D%E5%9B%BD/3440781?fr=aladdin");
        Elements elements = document.select("[class=\"basic-info cmn-clearfix\"]");
        System.out.println(elements.get(0).text());
    }


}
