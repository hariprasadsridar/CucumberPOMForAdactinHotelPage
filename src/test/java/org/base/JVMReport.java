package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

		public static void generateReport(String jsonFile) {
			Configuration c=new Configuration(new File(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports"), "HotelPOM");
			c.addClassifications("PROJECT NAME", "ADACTIN HOTEL APPLICATION");
			c.addClassifications("BROWSER", "CHROME");
			c.addClassifications("OS", "WINDOWS");
			c.addClassifications("SPRINT", "11");
			List<String> l=new ArrayList<String>();
			l.add(jsonFile);
			ReportBuilder builder=new ReportBuilder(l, c);
			builder.generateReports();
			
			
		}

	}



