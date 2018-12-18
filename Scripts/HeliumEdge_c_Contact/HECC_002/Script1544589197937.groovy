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
WebUI.delay(8)

WebUI.click(findTestObject('HeliumEdgeCCompany/Plus'))
WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCContact/Contact'))
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/ContactOwner'),'')
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/ContactOwner'),'Bharat')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/ContactOwnerS'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/Address'),'Wash')
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AddressS'))
WebUI.delay(2)
WebUI.click(findTestObject('HeliumEdgeCContactExtraOperations/AAddress'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AddAddress'),'Auburn')
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AddAddressS'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/Email'),'john@gmail.com')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AEmail'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AddEmail'),'merry@gmail.com')
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/Phone'),'9874654321')
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/Extention'),'74123')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/APhone'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AddPhone'),'7744558899')
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AddExtention'),'65432')
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/Website'),'www.john.com')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AWebsite'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AddWebsite'),'www.merry.com')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/DWebsite'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/DPhone'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/DAddress'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/DEmail'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/CloseCallout'))
WebUI.delay(2)


	








//WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AddPhoneType'))
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCContactExtraOperations/AddPhoneTypeS'))
//WebUI.delay(2)
