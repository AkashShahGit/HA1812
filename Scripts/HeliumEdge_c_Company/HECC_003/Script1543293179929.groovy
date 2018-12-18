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
WebUI.setText(findTestObject('HeliumEdgeCCompany/CompanyName'), 'Malabar Fashion')
WebUI.setText(findTestObject('HeliumEdgeCCompany/Email'), 'Herry@gmail.com')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/AddnewEmail'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/EmailNext'), 'Larry@gmail.com')
WebUI.delay(1)

WebUI.setText(findTestObject('HeliumEdgeCCompany/Address'),'Block Island, Rhode Island, Washington- 2807')
WebUI.delay(4)
WebUI.click(findTestObject('HeliumEdgeCCompany/AddressSelector'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/AddnewAddress'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/AddressNext'),'Auburn, Maine, Androscoggin- 4210')

WebUI.doubleClick(findTestObject('HeliumEdgeCCompany/Phone'))
WebUI.setText(findTestObject('HeliumEdgeCCompany/Phone'), '1234567890')
WebUI.delay(1)

WebUI.setText(findTestObject('HeliumEdgeCCompany/Website'), 'www.john.com')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/AddnewWebsite'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/WebsiteNext'), 'www.amz.com')
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/DeleteWebsite'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/DeleteAddress'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/DeleteEmail'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/Priority'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/CloseCallout'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/CancelButton'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/CloseCallout'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/ConfirmButton'))
WebUI.delay(1)



//---Stuck Code----
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/DeletePhone'))
//WebUI.delay(1)

//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/AddressSelectorofNext'))
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/AddnewAddress'))
//WebUI.delay(2)
//WebUI.setText(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/AddressNexttoNext'),'Barnstead, New Hampshire, Belknap- 3218')
//WebUI.delay(4)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/AddressSelectorofNexttoNext'))
//WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/AddnewPhone'))
//WebUI.delay(2)
//WebUI.setText(findTestObject('Object Repository/HeliumEdgeCCompanyAddfuncationality/PhoneNext'), '1122334455')
//WebUI.delay(2)
