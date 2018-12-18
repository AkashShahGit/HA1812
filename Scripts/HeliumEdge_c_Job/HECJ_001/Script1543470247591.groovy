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
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/Job'))
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/Title'),'ReactNative Developers')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/HiringCompany'),'Mala')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/HiringCompanySelect'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/JobStatus'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/JobStatusSelect'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/JobLocation'),'Wash')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/JobLocationSelect'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/NoofOpening'),'20')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/TravelRequirement'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/TravelRequirementSelect'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/Industry'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/IndustrySelect'))
WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/EmployementType'))
//WebUI.delay(3)
//WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/EmployementTypeSelect'))
//WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/ExperienceLevel'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/ExperienceLevelSelect'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/SalaryFrom'),'25000')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/SalaryTo'),'65000')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/Department'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/DepartmentSelect'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/PlacementFee'),' ')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/PlacementFee'),'3250')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/StartDate'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/StartDateSelect'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/Duration'),'20')
WebUI.delay(1)
WebUI.scrollToPosition(0, 2500)
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/Description'),'This is a Job Description Area....!')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/HeliumEdgeCJob/JobRequirement'),'This is a Job Requirement Area....!')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HeliumEdgeCJob/SaveandClose'))
WebUI.delay(2)












