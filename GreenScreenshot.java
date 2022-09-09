package org.screen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot tk= (TakesScreenshot)dr;
		File src=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File des=new File("D:\\rahul.png");
		FileUtils.copyFile(src, des);
		
		System.out.println("Done");

	}

}
