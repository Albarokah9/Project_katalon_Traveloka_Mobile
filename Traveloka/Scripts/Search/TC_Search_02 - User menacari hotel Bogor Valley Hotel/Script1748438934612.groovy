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

Mobile.waitForElementPresent(findTestObject('SetupLogin/DropDownBahasa'), 10)

Mobile.tap(findTestObject('SetupLogin/DropDownBahasa'), 0)

Mobile.waitForElementPresent(findTestObject('SetupLogin/BahasaIndonesia'), 10)

Mobile.tap(findTestObject('SetupLogin/BahasaIndonesia'), 0)

Mobile.waitForElementPresent(findTestObject('SetupLogin/DropDownNegara'), 10)

Mobile.tap(findTestObject('SetupLogin/DropDownNegara'), 0)

Mobile.waitForElementPresent(findTestObject('SetupLogin/BahasaIndonesia'), 10)

Mobile.tap(findTestObject('SetupLogin/BahasaIndonesia'), 0)

Mobile.waitForElementPresent(findTestObject('SetupLogin/Lanjutkan'), 10)

Mobile.tap(findTestObject('SetupLogin/Lanjutkan'), 0)

Mobile.waitForElementPresent(findTestObject('SetupLogin/GabungkeTraveloka'), 10)

Mobile.tap(findTestObject('SetupLogin/GabungkeTraveloka'), 0)

Mobile.waitForElementPresent(findTestObject('SetupLogin/Google'), 10)

Mobile.tap(findTestObject('SetupLogin/Google'), 0)

Mobile.waitForElementPresent(findTestObject('Login/Projecttraveloka20'), 10)

Mobile.tap(findTestObject('Login/Projecttraveloka20'), 0)

Mobile.waitForElementPresent(findTestObject('Login/Next'), 10)

Mobile.tap(findTestObject('Login/Next'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Hotel'), 10)

Mobile.tap(findTestObject('Search/Hotel'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Di sekitar saya'), 0)

Mobile.tap(findTestObject('Search/Di sekitar saya'), 0)

Mobile.waitForElementPresent(findTestObject('Search/SearchHotel'), 5)

Mobile.setText(findTestObject('Search/SearchHotel'), 'Bogor Valley Hotel', 0)

Mobile.waitForElementPresent(findTestObject('Search/BogorValleyHotel'), 5)

Mobile.tap(findTestObject('Search/BogorValleyHotel'), 0)

Mobile.tap(findTestObject('Search/1 Kamar, 2 Dewasa, 0 Anak'), 0)

Mobile.tap(findTestObject('Search/Button -tambah'), 0)

Mobile.tap(findTestObject('Search/Terapkan'), 0)

Mobile.tap(findTestObject('Search/Cari (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Selanjutnya_2'), 5)

Mobile.tap(findTestObject('Search/Selanjutnya_2'), 0)

Mobile.tap(findTestObject('Search/Mengerti'), 0)

Mobile.tap(findTestObject('Search/Bogorvalley_2'), 0)

Mobile.scrollToText('Termasuk sarapan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search/Pilih_2'), 0)

Mobile.waitForElementPresent(findTestObject('Search/IsiDataPemesan'), 5)

Mobile.tap(findTestObject('Search/IsiDataPemesan'), 0)

Mobile.setText(findTestObject('Search/NamaLengkap'), 'Project Traveloka', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Search/NoHandphone'), 0)

Mobile.setText(findTestObject('Search/NoHandphone'), '089611515526', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Search/Email'), 0)

Mobile.clearText(findTestObject('Search/Email'), 0)

Mobile.setText(findTestObject('Search/Email'), 'projecttraveloka20@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Search/Simpan_'), 0)

Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search/Lanjutkan_'), 0)

Mobile.scrollToText('Lanjut ke Pembayaran', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search/Lanjut ke Pembayaran'), 0)

Mobile.verifyElementVisible(findTestObject('Search/MetodePembayaran'), 0)

