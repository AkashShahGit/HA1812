package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object HeliumURL
     
    /**
     * <p></p>
     */
    public static Object CredentialFile
     
    /**
     * <p></p>
     */
    public static Object PngFile
     
    /**
     * <p></p>
     */
    public static Object JpgFile
     
    /**
     * <p></p>
     */
    public static Object Event
     
    /**
     * <p></p>
     */
    public static Object Event1
     
    /**
     * <p></p>
     */
    public static Object ContactFile
     
    /**
     * <p></p>
     */
    public static Object ContactFile1
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['HeliumURL' : 'http://qa.heliumats.com/#/login', 'CredentialFile' : 'Credential/LoginCredential.xlsx', 'PngFile' : 'C:\\Users\\admin\\Katalon Studio\\HeliumAutomationProject\\Credential\\Image.png', 'JpgFile' : 'C:\\Users\\admin\\Katalon Studio\\HeliumAutomationProject\\Credential\\Image1.jpg', 'Event' : 'C:\\Users\\admin\\Katalon Studio\\HeliumAutomationProject\\Credential\\Event.docx', 'Event1' : 'C:\\Users\\admin\\Katalon Studio\\HeliumAutomationProject\\Credential\\TommorrowLand.docx', 'ContactFile' : 'C:\\Users\\admin\\Katalon Studio\\HeliumAutomationProject\\Credential\\alliabhatt.jpg', 'ContactFile1' : 'C:\\Users\\admin\\Katalon Studio\\HeliumAutomationProject\\Credential\\alliabhatt1.jpg'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        HeliumURL = selectedVariables['HeliumURL']
        CredentialFile = selectedVariables['CredentialFile']
        PngFile = selectedVariables['PngFile']
        JpgFile = selectedVariables['JpgFile']
        Event = selectedVariables['Event']
        Event1 = selectedVariables['Event1']
        ContactFile = selectedVariables['ContactFile']
        ContactFile1 = selectedVariables['ContactFile1']
        
    }
}
