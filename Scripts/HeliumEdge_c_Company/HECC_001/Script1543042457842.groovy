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
import com.kms.katalon.core.webui.common.WebUiCommonHelper

import org.junit.After
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('HeliumEdge_Login/HEL_001'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)

WebUI.click(findTestObject('HeliumEdgeCCompany/Plus'))
WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCCompany/company'))
WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/CompanyName'), 'Malabar Fashion')
//WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCCompany/Companytype'))
WebUI.delay(1)
WebUI.click(findTestObject('HeliumEdgeCCompany/CompanytypeSelector'))
WebUI.delay(1)
WebUI.click(findTestObject('HeliumEdgeCCompany/CompanytypeSelector'))
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/AccountOwner'), 'Bhara')
WebUI.delay(1)
WebUI.click(findTestObject('HeliumEdgeCCompany/AccountOwnerSelector'))
WebUI.delay(1)
WebUI.doubleClick(findTestObject('HeliumEdgeCCompany/AccountOwner'))
//WebUI.delay(3)
WebUI.uploadFile(findTestObject('HeliumEdgeCCompanyLogo/Anotherlogo'),GlobalVariable.JpgFile)
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/Email'), 'john@gmail.com')
//WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCCompany/Industry'))
//WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCCompany/Industry_Advertise'))
WebUI.delay(1)
WebUI.scrollToPosition(50,60)
WebUI.click(findTestObject('HeliumEdgeCCompany/PreferredEmployeeType'))
WebUI.doubleClick(findTestObject('HeliumEdgeCCompany/Address'))
WebUI.setText(findTestObject('HeliumEdgeCCompany/Address'),'Block Island, Rhode Island, Washington- 2807')
WebUI.delay(4)
WebUI.click(findTestObject('HeliumEdgeCCompany/AddressSelector'))
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/Phone'), '1234567890')
//WebUI.delay(4)
WebUI.setText(findTestObject('HeliumEdgeCCompany/PhoneExt'), '12345')
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/Fax'),'123456789012345')
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/Linkedin'), 'https://linkedin.com/john')
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/Facebook'), 'https://www.facebook.com/john')
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/Skype'), 'john001')
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/Website'), 'www.john.com')
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/Pfc'), '5000')
//WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCCompany/Paymentterms'))
WebUI.delay(1)
WebUI.click(findTestObject('HeliumEdgeCCompany/pmttermselect'))
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/contact'), 'j')
WebUI.delay(1)
WebUI.click(findTestObject('HeliumEdgeCCompany/contactselect'))
//WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/Role'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/RoleSelector'))
//WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCCompany/Description'))
//WebUI.delay(3)
WebUI.setText(findTestObject('HeliumEdgeCCompany/DescriptionEnter'), 'This is a Description...!')
//WebUI.delay(3)
WebUI.sendKeys(findTestObject('HeliumEdgeCCompany/Tag'), Keys.chord('microsoft',Keys.ENTER))
WebUI.click(findTestObject('HeliumEdgeCCompany/Saveandclose'))





//---------Stuck code for reusability------

//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/CompanyTypeName'))
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/Priority'))
//WebUI.delay(3)


//WebUI.clearText(findTestObject('Object Repository/HeliumEdgeCCompany/AccountOwner'))
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/AccountOwner'))
//WebUI.clearText(findTestObject('Object Repository/HeliumEdgeCCompany/AccountOwner'), FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Object Repository/HeliumEdgeCCompany/AccountOwner'), ' ')
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/AccountOwner'))
//WebElement name = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/HeliumEdgeCCompany/AccountOwner'),30)
//WebUI.executeJavaScript("arguments[0].value='jo'", WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/AccountOwner')))
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/AccountOwnerSelector'))
//WebUI.delay(3)


//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/Companytype'))
//WebUI.delay(3)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/CompanytypeSelector'))
//WebUI.delay(3)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/CompanytypeSelector'))
//WebUI.delay(3)


//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/PreferredEmployeeType'))
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/PrefferedEmployeeTypeSelector'))
//WebUI.delay(3)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCCompany/PrefferedEmployeeTypeSelector'))
//WebUI.delay(3)
