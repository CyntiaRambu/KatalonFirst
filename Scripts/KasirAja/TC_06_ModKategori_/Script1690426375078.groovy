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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://kasirdemo.belajarqa.com')

WebUI.setText(findTestObject('KasirAja/Login/txt_email'), 'KasirAja_Test@Test.com')

WebUI.setText(findTestObject('KasirAja/Login/txt_password'), '123456')

WebUI.click(findTestObject('KasirAja/Login/btn_login'))

WebUI.verifyElementPresent(findTestObject('KasirAja/Login/verify_home'), 0)

WebUI.click(findTestObject('KasirAja/Kategori/btn_kategori'))

WebUI.verifyElementPresent(findTestObject('KasirAja/Kategori/Verify_kategori'), 3)

WebUI.click(findTestObject('KasirAja/Kategori/btn_titikmenu'))

WebUI.click(findTestObject('KasirAja/Kategori/btn_ubah'))

WebUI.clearText(findTestObject('KasirAja/Kategori/txt_namakategori'))

WebUI.clearText(findTestObject('KasirAja/Kategori/txt_deskripsikategori'))

WebUI.click(findTestObject('KasirAja/Kategori/btn_simpan'))

WebUI.verifyElementPresent(findTestObject('KasirAja/Kategori/alert_success'), 3)

