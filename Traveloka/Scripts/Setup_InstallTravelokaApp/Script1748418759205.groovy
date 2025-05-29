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

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil

// Konfigurasi path
String adbPath = "C:\\Users\\albar\\AppData\\Local\\Android\\Sdk\\platform-tools\\adb.exe"
String deviceId = "10DD5800J100055"
String apkFolder = "C:\\Project Bootcamp\\Project_katalon_Traveloka_Mobile\\Traveloka\\Katalon_APKs\\"

KeywordUtil.logInfo("🚀 Memulai instalasi Traveloka Split APKs...")

// 1. Uninstall aplikasi lama
try {
	KeywordUtil.logInfo("🗑️ Menghapus aplikasi lama...")
	String uninstallCmd = "${adbPath} -s ${deviceId} uninstall com.traveloka.android"
	Process process = uninstallCmd.execute()
	process.waitFor()
	KeywordUtil.logInfo("✅ Aplikasi lama berhasil dihapus")
} catch (Exception e) {
	KeywordUtil.logInfo("ℹ️ Aplikasi belum terinstall sebelumnya")
}

// 2. Install split APKs
try {
	String baseApk = "\"${apkFolder}com.traveloka.android.apk\""
	String splitApks = "\"${apkFolder}config.arm64_v8a.apk\" \"${apkFolder}config.in.apk\" \"${apkFolder}config.xhdpi.apk\""
	
	String installCmd = "${adbPath} -s ${deviceId} install-multiple -r -g ${baseApk} ${splitApks}"
	
	KeywordUtil.logInfo("📱 Menginstall split APKs...")
	KeywordUtil.logInfo("Command: ${installCmd}")
	
	Process process = installCmd.execute()
	StringBuilder output = new StringBuilder()
	StringBuilder error = new StringBuilder()
	
	process.consumeProcessOutput(output, error)
	process.waitFor()
	
	if (process.exitValue() == 0) {
		KeywordUtil.logInfo("Split APKs berhasil diinstall!")
		KeywordUtil.logInfo("Output: ${output.toString()}")
	} else {
		String errorMsg = error.toString() ?: output.toString()
		KeywordUtil.logError("Gagal install split APKs: ${errorMsg}")
		throw new Exception("Install gagal: ${errorMsg}")
	}
	
} catch (Exception e) {
	KeywordUtil.logError("Error saat install: ${e.getMessage()}")
	throw e
}

// 3. Start aplikasi untuk memastikan berjalan
KeywordUtil.logInfo("Memulai aplikasi Traveloka...")
Mobile.delay(3)
Mobile.startApplication('com.traveloka.android', false)
Mobile.delay(5)

KeywordUtil.logInfo("Instalasi dan setup Traveloka selesai!")
