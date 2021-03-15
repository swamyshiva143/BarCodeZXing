import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFReaderTest {
	
	@Test
	public void readPDFTest() throws IOException {
//		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
//		WebDriver driver =  new ChromeDriver();	//launch browser
//		
//		driver.get("https://www.axmag.com/download/UserGuide.pdf");
////		driver.get("file:///D:/Swamyshiva/swamyshiva/Ebooks/Eclipse.pdf");
//		
//		String currentUrl= driver.getCurrentUrl();
//		System.out.println(currentUrl);
		
		URL url= new URL("https://www.axmag.com/download/UserGuide.pdf");
		
		InputStream is= url.openStream();
		BufferedInputStream fileParse =new BufferedInputStream(is);
		
		PDDocument document = null;
		document = PDDocument.load(fileParse);
		String pdfContent = new PDFTextStripper().getText(document);
		
		System.out.println(pdfContent);
		
	//	Assert.assertTrue(pdfContent.contains("PDF to Flash Converter"));
				
	}

}
