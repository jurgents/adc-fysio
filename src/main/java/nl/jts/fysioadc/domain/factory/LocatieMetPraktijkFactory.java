package nl.jts.fysioadc.domain.factory;

import nl.jts.fysioadc.application.SiteReader;
import nl.jts.fysioadc.domain.LocatieMetPraktijk;
import nl.jts.fysioadc.domain.Praktijk;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class LocatieMetPraktijkFactory {

    public static Collection<LocatieMetPraktijk> createLocatieMetPraktijk() throws IOException {
        Elements links = SiteReader.getLinksFromSomePart("https://www.kenniscentrumduizeligheid.nl/kenniscentrum-duizeligheid/Fysiotherapeuten-en-oefentherapeuten",
                "sidenav");

        Collection<LocatieMetPraktijk> locaties = new ArrayList<>();

        links.stream().forEach((link) -> { locaties.add(
                LocatieMetPraktijk.objectFactory( (link.select("a").text()),
                                                   link.select("b").text()));});

        // gebruik map en collect en function om transformatie van plaats + link naar LocatieMetPraktijk te doen


        return locaties;

    }
}
