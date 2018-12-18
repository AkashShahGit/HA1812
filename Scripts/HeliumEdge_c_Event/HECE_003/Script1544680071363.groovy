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
WebUI.click(findTestObject('Object Repository/HeliumEdgeCEvent/Event'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCEvent/SaveandClose'))
WebUI.delay(1)

String EventTitleV = WebUI.getText(findTestObject('Object Repository/HeliumEdgeCEventValidations/EventTitle'))
println EventTitleV
WebUI.delay(1)
String StartDTV = WebUI.getText(findTestObject('Object Repository/HeliumEdgeCEventValidations/StartDateandTime'))
println StartDTV
WebUI.delay(1)
String EDT = WebUI.getText(findTestObject('Object Repository/HeliumEdgeCEventValidations/EDT'))
println EDT
WebUI.delay(1)
String TZ = WebUI.getText(findTestObject('Object Repository/HeliumEdgeCEventValidations/TZ'))
println TZ
WebUI.delay(1)
String Location = WebUI.getText(findTestObject('Object Repository/HeliumEdgeCEventValidations/Location'))
println Location
WebUI.delay(1)

