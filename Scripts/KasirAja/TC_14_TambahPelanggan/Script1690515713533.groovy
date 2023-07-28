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

WebUI.navigateToUrl('https://kasirdemo.belajarqa.com')

WebUI.callTestCase(findTestCase('KasirAja/Login'), [('Username') : 'KasirAja_Test@Test.com', ('Password') : '123456'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('KasirAja/Pelanggan/btn_pelanggan'))

WebUI.click(findTestObject('KasirAja/Pelanggan/btn_tambah'))

WebUI.setText(findTestObject('KasirAja/Pelanggan/txt_nama'), 'Citra')

WebUI.setText(findTestObject('KasirAja/Pelanggan/txt_nohp'), '081234567890')

WebUI.clearText(findTestObject('KasirAja/Pelanggan/txt_nohp'),  FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KasirAja/Pelanggan/txt_alamat'), 'Jalan jalan')

WebUI.setText(findTestObject('KasirAja/Pelanggan/txt_keterangan'), 'Pembeli')

WebUI.click(findTestObject('KasirAja/Pelanggan/btn_simpan'))

WebUI.verifyElementPresent(findTestObject('KasirAja/Kategori/alert_success'), 0)

