package com.agrilin.generic;

public interface IAutoConst {

	String PROJECT_DERECTORY=System.getProperty("user.dir");
	String CHROME_KEY="webdriver.chrome.driver";
	String CHROME_VALUE="D:\\Eclipse\\eclipse-workspace\\utility\\driver\\chromedriver.exe";
	String FIREFOX_KEY="webdriver.gecko.driver";
	String FIREFOX_VALUE="D:\\Eclipse\\eclipse-workspace\\utility\\driver\\geckodriver.exe";
	//String SETTINGS_PATH="D:\\Eclipse\\eclipse-workspace\\utility\\settings.properties";
	String SETTINGS_PATH="D:\\Agrilin-Staging\\utility\\settings.properties";
	String OR_SETTINGS_PATH="D:\\Eclipse\\eclipse-workspace\\agrilin\\src\\test\\resources\\properties\\ObjectRepository.properties";
	String SCREENSHOTS_FOLDER_PATH = "D:\\Agrilin-Staging\\agrilin\\screenshots";
	String EXCEL_SHEET_PATH=PROJECT_DERECTORY+"\\excel\\AgrilinWorkBook.xlsx";
	//String EXTENT_REPORT_CREDENTIALS_SETTINGS_PATH="D:\\Eclipse\\eclipse-workspace\\utility\\extentreportcredentials.properties";
	String EXTENT_REPORT_CREDENTIALS_SETTINGS_PATH="D:\\Agrilin-Staging\\utility\\extentreportcredentials.properties";
}
