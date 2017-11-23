package nl.jts.fysioadc.application;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SiteReader {

    public static Document scrapSite(String site) throws IOException {
        return Jsoup.connect(site).get();
    }

    public static Elements getLinksFromSomePart(String site, String part) throws IOException {
        return Jsoup
                .connect(site)
                .get()
                .getElementById(part)
                .select("a[href");


    }


}
