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

Mobile.startExistingApplication('com.traveloka.android', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SetupLogin/DropDownBahasa'), 0)

Mobile.tap(findTestObject('SetupLogin/BahasaIndonesia'), 0)

Mobile.tap(findTestObject('SetupLogin/DropDownNegara'), 0)

Mobile.tap(findTestObject('SetupLogin/BahasaIndonesia'), 0)

Mobile.tap(findTestObject('SetupLogin/Lanjutkan'), 0)

Mobile.tap(findTestObject('SetupLogin/GabungkeTraveloka'), 0)

Mobile.tap(findTestObject('SetupLogin/Google'), 0)

Mobile.tap(findTestObject('Login/Projecttraveloka20'), 0)

Mobile.tap(findTestObject('Login/Next'), 0)

Mobile.tap(findTestObject('Login/Profile'), 0)

Mobile.tap(findTestObject('Login/Lanjut'), 0)

Mobile.tap(findTestObject('Login/OK, Siap'), 0)

Mobile.verifyElementVisible(findTestObject('Login/View My Profile'), 0)

Mobile.verifyElementText(findTestObject('Login/View My Profile'), 'View My Profile')


