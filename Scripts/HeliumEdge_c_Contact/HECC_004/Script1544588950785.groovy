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
import org.junit.After
import org.openqa.selenium.Keys as Keys


WebUI.callTestCase(findTestCase('HeliumEdge_Login/HEL_001'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(8)

WebUI.click(findTestObject('HeliumEdgeCCompany/Plus'))
WebUI.delay(3)
WebUI.click(findTestObject('HeliumEdgeCContact/Contact'))
WebUI.delay(3)
WebUI.uploadFile(findTestObject('Object Repository/HeliumEdgeCContact/UploadImage'),GlobalVariable.ContactFile )
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/CancelUploadFile'))
WebUI.delay(2)
WebUI.uploadFile(findTestObject('Object Repository/HeliumEdgeCContact/UploadImage'),GlobalVariable.ContactFile1 )
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/PrivateContact'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/PrivateContact'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/FirstName'),'Jenifer')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/MiddleName'),'desel')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/LastName'),'Winget')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/ContactCompany'),'Malabar Fashion')
//WebUI.delay(4)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/ContactCompanySelect'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/Department'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/DepartmentSelect'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/Role'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/RoleSelect'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/Description'),'This is a Description...!')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/ContactSource'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/ContactSourceSelect'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/ContactType'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/ContactTypeSelect'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/ContactTypeSelect'))
WebUI.delay(1)
WebUI.doubleClick(findTestObject('Object Repository/HeliumEdgeCContact/Address'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/Address'),'Wash')
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/AddressSelect'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/Email'),'john@gmail.com')
WebUI.delay(2)
WebUI.doubleClick(findTestObject('Object Repository/HeliumEdgeCContact/EmailType'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/EmailTypeSelect'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/Phone'),'9966332255')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/Extention'),'54321')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/Fax'),'789654789654789')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/Pmc'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/PmcSelect'))
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/PmcSelect'))
WebUI.delay(1)
WebUI.doubleClick(findTestObject('Object Repository/HeliumEdgeCContact/Linkedin'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/Ptch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/PtchS'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/Ptcm'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/PtcmS'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/AMPM'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/AMPMS'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/Linkedin'),'https://linkedin.com/Krizals')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/Facebook'),'https://www.facebook.com/Krizals')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/Skype'),'Krizals007')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCContact/Website'),'www.krizalsworld.com')
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeCContact/Tag'), Keys.chord('microsoft',Keys.ENTER))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCContact/Draft'))
WebUI.delay(1)










