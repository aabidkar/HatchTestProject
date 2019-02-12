package extentReportGenerator;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	public static ExtentReports getInstance() {
		Date date = new Date();
		String fileNameType = date.toString().replace(" ", "_").replace(":", "_") + ".html";
		String reportFilePath = "reports//" + fileNameType;
		ExtentReports eRport = new ExtentReports(reportFilePath, true, DisplayOrder.NEWEST_FIRST);
		File reportConfigFile = new File("ReportsConfig.xml");
		eRport.loadConfig(reportConfigFile);
		eRport.addSystemInfo("TestNG Version", "7.0.0").addSystemInfo("Selenium WebDriver", "3.141.59")
				.addSystemInfo("Executed By: ", "Amit Bidkar");
		return eRport;
	}
}
