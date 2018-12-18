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
WebUI.uploadFile(findTestObject('Object Repository/HeliumEdgeCEventExtraOperations/UploadFile'),GlobalVariable.Event )
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCEventExtraOperations/UploadFileC'))
WebUI.uploadFile(findTestObject('Object Repository/HeliumEdgeCEventExtraOperations/UploadFile'),GlobalVariable.Event1 )
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCEvent/orgc'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCEvent/orginput'),'Bharat Patel')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCEventExtraOperations/OrgSelect'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCEvent/Attendes'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCEvent/AttendesI'),'Bharat Patel')
WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCEventExtraOperations/AttendiesSelector'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCEventExtraOperations/CloseCallOut'))




