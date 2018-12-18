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
WebUI.delay(8)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/Candidate'))
WebUI.delay(15)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/Fullname'))
WebUI.delay(8)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/Star'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/Star'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/BI'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/CloseCallout'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/BI'))
WebUI.delay(3)


WebUI.uploadFile(findTestObject('Object Repository/HeliumEdgeLCandidate/Image'), GlobalVariable.ContactFile)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/DImage'))
WebUI.delay(3)
WebUI.uploadFile(findTestObject('Object Repository/HeliumEdgeLCandidate/Image'), GlobalVariable.ContactFile1)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/RemoveResume'))
WebUI.delay(2)
WebUI.uploadFile(findTestObject('Object Repository/HeliumEdgeLCandidate/Resume'), GlobalVariable.Event1)
WebUI.delay(2)


WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/FirstName'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/FirstName'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/FirstName'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/FirstName'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/FirstName'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/FirstName'),'Akash')
WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/MiddleName'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/MiddleName'),'N')
WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/LastName'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/LastName'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/LastName'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/LastName'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/LastName'),'Shah')
WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateTitle'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateTitle'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateTitle'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateTitle'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateTitle'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateTitle'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateTitle'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateTitle'),'SC Head')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateSource'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateSourceS'))
WebUI.delay(1)


WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwner'),'Bharat')
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/CandidateOwnerS'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/Address'),'Wash')
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/AddressS'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/Email'),'akash.is.shah@gmail.com')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/Phone'),'1234567890')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/Ext'),'12345')
WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/Fax'),'115544778899662')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/Wp'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/WpS'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/Twe'),'15')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/TweM'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/TweMS'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/El'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/ElS'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/Availability'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/AvailabilityS'))
WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/Linkedin'),'https://linkedin.com/Akash')
WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/Facebook'),'https://facebook.com/Akash')
WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Skype'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Skype'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Skype'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Skype'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Skype'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Skype'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Skype'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Object Repository/HeliumEdgeLCandidate/Skype'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/Skype'),'Akash002')
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/HeliumEdgeLCandidate/Website'),'www.schead.com')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeLCandidate/UpdateandClose'))
WebUI.delay(1)
























