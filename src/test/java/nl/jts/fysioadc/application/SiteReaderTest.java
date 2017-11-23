package nl.jts.fysioadc.application;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SiteReaderTest {

	@Test
	public void testScrapSite() throws IOException {
		Document site = SiteReader.scrapSite("https://www.kenniscentrumduizeligheid.nl/kenniscentrum-duizeligheid/Fysiotherapeuten-en-oefentherapeuten");
		Element sideNav = site.getElementById("sidenav");
		System.out.println(sideNav.select("a[href]"));


	}

}
