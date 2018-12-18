import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.swing.DefaultRowSorter.Row

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.codehaus.groovy.ast.stmt.ContinueStatement
import org.sikuli.api.API
import org.sikuli.api.APILogger

import com.kms.katalon.core.logging.KeywordLogger



'Helium Edge login with various credentials'
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.HeliumURL)
WebUI.delay(3)

FileInputStream file = new FileInputStream (new File(GlobalVariable.CredentialFile))
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheetAt(0);
int Rowcount = sheet.getLastRowNum();

for(int row=1;row<=Rowcount;row++)
{
		
		String Username = sheet.getRow(row).getCell(0).getStringCellValue().trim();
		WebUI.setText(findTestObject('Object Repository/HeliumEdgeLogin/Email'),Username)
		WebUI.delay(3)
		
		String Password = sheet.getRow(row).getCell(1).getStringCellValue();
		WebUI.setText(findTestObject('Object Repository/HeliumEdgeLogin/Password'),Password)
		WebUI.delay(3)
		
		WebUI.click(findTestObject('Object Repository/HeliumEdgeLogin/LoginButton'))
		WebUI.delay(6)
		
		try
		{
			String ValidationMessage = WebUI.getText(findTestObject('Object Repository/HeliumEdgeLoginValidation/LoginFailed'))
			println ValidationMessage
		}
		catch(Exception e)
		{
			WebUI.takeScreenshot()
			WebUI.click(findTestObject('HeliumEdgeLogout/Userclick'))
			WebUI.delay(4)
			WebUI.click(findTestObject('HeliumEdgeLogout/LogoutButton'))
			WebUI.delay(4)
		}
	}
