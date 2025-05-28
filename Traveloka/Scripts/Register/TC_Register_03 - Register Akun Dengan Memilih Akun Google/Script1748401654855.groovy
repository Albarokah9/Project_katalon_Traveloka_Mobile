import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def defaultTimeout = 10

Mobile.startExistingApplication('com.traveloka.android', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('SetupLogin/DropDownBahasa'), defaultTimeout, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SetupLogin/DropDownBahasa'), defaultTimeout)

Mobile.waitForElementPresent(findTestObject('SetupLogin/BahasaIndonesia'), defaultTimeout, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SetupLogin/BahasaIndonesia'), defaultTimeout)

Mobile.waitForElementPresent(findTestObject('SetupLogin/DropDownNegara'), defaultTimeout, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SetupLogin/DropDownNegara'), defaultTimeout)

Mobile.waitForElementPresent(findTestObject('SetupLogin/BahasaIndonesia'), defaultTimeout, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SetupLogin/BahasaIndonesia'), defaultTimeout)

Mobile.waitForElementPresent(findTestObject('SetupLogin/Lanjutkan'), defaultTimeout, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SetupLogin/Lanjutkan'), defaultTimeout)

//Mobile.tap(findTestObject('Register/Button X'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SetupLogin/GabungkeTraveloka'), defaultTimeout)

Mobile.waitForElementPresent(findTestObject('SetupLogin/Google'), defaultTimeout, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('SetupLogin/Google'), 0)

Mobile.tap(findTestObject('SetupLogin/Google'), defaultTimeout)

Mobile.waitForElementPresent(findTestObject('Register/Projecttravelokamobile10'), defaultTimeout, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Register/Projecttravelokamobile10'), 0)

Mobile.tap(findTestObject('Register/Projecttravelokamobile10'), defaultTimeout)

