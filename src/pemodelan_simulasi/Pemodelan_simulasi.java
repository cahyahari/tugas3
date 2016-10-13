package pemodelan_simulasi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Random;
import java.sql.*;

import java.util.LinkedHashSet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Recky Davinci
 */
public class Pemodelan_simulasi {

    public static void main(String[] args) throws IOException {
        
        Document d = Jsoup.connect("http://localhost/pemodelansimulasi/uin.html").timeout(10000).get();
        Elements ele = d.select("div#isi-content");
int         no = 1 ;
        for (Element element : ele.select("div.event-ancor1")) {
            String img_url = element.select("div.event-ancor1 a").attr("href");
            String title = element.select("div.event-ancor1 h3").text();
            String insert = "INSERT INTO pengumuman VALUES('"   + title + "','" + img_url +"');";
            no++;
            System.out.println(insert);
        }

    }

}
