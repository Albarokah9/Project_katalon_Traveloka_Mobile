import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

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

Mobile.waitForElementPresent(findTestObject('Search/Tiket Pesawat'), 10)
Mobile.tap(findTestObject('Search/Tiket Pesawat'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Destination'), 10)
Mobile.tap(findTestObject('Search/Destination'), 0)

Mobile.waitForElementPresent(findTestObject('Search/SearchBandara'), 10)
Mobile.setText(findTestObject('Search/SearchBandara'), 'Ngurah Rai', 0)

Mobile.waitForElementPresent(findTestObject('Search/BandaraNgurahrai'), 10)
Mobile.tap(findTestObject('Search/BandaraNgurahrai'), 0)

Mobile.waitForElementPresent(findTestObject('Search/TanggalBerangkat'), 10)
Mobile.tap(findTestObject('Search/TanggalBerangkat'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Tgl31'), 10)
Mobile.tap(findTestObject('Search/Tgl31'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Cari'), 10)
Mobile.tap(findTestObject('Search/Cari'), 0)

Mobile.waitForElementPresent(findTestObject('Search/ButtonX'), 10)
Mobile.tap(findTestObject('Search/ButtonX'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Filter'), 10)
Mobile.tap(findTestObject('Search/Filter'), 0)

Mobile.waitForElementPresent(findTestObject('Search/CheckBoxaAirAsia'), 10)
Mobile.tap(findTestObject('Search/CheckBoxaAirAsia'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Simpan'), 10)
Mobile.tap(findTestObject('Search/Simpan'), 0)

Mobile.waitForElementPresent(findTestObject('Search/CardViewAirasia18_20'), 10)
Mobile.tap(findTestObject('Search/CardViewAirasia18_20'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Pilih jenis tiket Anda'), 10)
Mobile.verifyElementVisible(findTestObject('Search/Pilih jenis tiket Anda'), 0)
