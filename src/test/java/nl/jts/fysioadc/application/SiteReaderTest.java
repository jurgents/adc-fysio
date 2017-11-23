package nl.jts.fysioadc.application;

import nl.jts.fysioadc.domain.LocatieMetPraktijk;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SiteReaderTest {

	@Test
	public void testScrapSite() throws IOException {

		String websiteAdc = "https://www.kenniscentrumduizeligheid.nl/kenniscentrum-duizeligheid/Fysiotherapeuten-en-oefentherapeuten";
		Elements sidenav = SiteReader.getLinksFromSomePart(websiteAdc, "sidenav");
		System.out.println(sidenav);

		Collection<LocatieMetPraktijk> locaties = SiteReader.createLocatiesMetPraktijk(sidenav);

		locaties.stream()
				.forEach(locatie -> System.out.println(locatie.getWoonplaats() + "-" + locatie.getLink()));

	}

}
