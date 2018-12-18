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

WebUI.callTestCase(findTestCase('HeliumEdge_Login/HEL_001'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)

WebUI.click(findTestObject('HeliumEdgeCCompany/Plus'))
WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCCompany/company'))
WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCCompany/Saveandclose'))
WebUI.delay(3)
String CompanyNameV = WebUI.getText(findTestObject('Object Repository/HeliumEdgeCCompanyValidations/M_Comapnyname'))
println CompanyNameV
WebUI.delay(1)
String EmailV = WebUI.getText(findTestObject('Object Repository/HeliumEdgeCCompanyValidations/M_Emailid'))
println EmailV
WebUI.delay(1)
String AddV = WebUI.getText(findTestObject('Object Repository/HeliumEdgeCCompanyValidations/M_Address'))
println AddV
WebUI.delay(1)
String PhoneV = WebUI.getText(findTestObject('Object Repository/HeliumEdgeCCompanyValidations/M_Phone'))
println PhoneV
WebUI.delay(1)
