package nl.jts.fysioadc.application;


import nl.jts.fysioadc.domain.LocatieMetPraktijk;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class SiteReader {

    public static Elements getLinksFromSomePart(String site, String part) throws IOException {
        return Jsoup
                .connect(site)
                .get()
                .getElementById(part)
                .select("a[href]");
    }

    public static LocatieMetPraktijk transform(Element referentie){
        return LocatieMetPraktijk.objectFactory(referentie.text(), referentie.attr("href"));
    }

    public static Collection<LocatieMetPraktijk> createLocatiesMetPraktijk(Elements links) {
        return links.stream()
                .map(SiteReader::transform)
                .collect(Collectors.toList());
    }

}
