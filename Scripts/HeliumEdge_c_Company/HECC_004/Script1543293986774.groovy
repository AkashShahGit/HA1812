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
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory



WebUI.callTestCase(findTestCase('HeliumEdge_Login/HEL_001'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)

WebUI.click(findTestObject('HeliumEdgeCCompany/Plus'))
WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCCompany/company'))
WebUI.delay(3)
WebUI.uploadFile(findTestObject('HeliumEdgeCCompanyLogo/Anotherlogo'),GlobalVariable.PngFile)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyLogo/DeleteLogo'))
WebUI.delay(3)
WebUI.uploadFile(findTestObject('HeliumEdgeCCompanyLogo/Anotherlogo'),GlobalVariable.JpgFile)




//----Additonal Informative stuck handler code--------------
//WebUI.sendKeys(WebUI.click(findTestObject('null')), GlobalVariable.PngFile)
//WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeCCompanyLogo/Addlogo'), GlobalVariable.PngFile)
//Actions actions = new Actions(DriverFactory.getWebDriver());
//actions.moveToElement(WebUiCommonHelper.findWebElement(findTestObject('Object Repository/HeliumEdgeCCompanyLogo/Addlogo'), 30));
//actions.click();
////WebUI.uploadFile(WebUI.waitForElementClickable(findTestObject('Object Repository/HeliumEdgeCCompanyLogo/Addlogo'),30),'C:\\Users\\admin\\Katalon Studio\\HeliumAutomationProject\\Credential\\Image.png')
//actions.sendKeys('Akash Shah\\Image.png');
//actions.build().perform()
