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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Saucedemo/Login/txt_username'), 'standard_user')

WebUI.setText(findTestObject('Saucedemo/Login/txt_password'), 'secret_sauce')

WebUI.click(findTestObject('Saucedemo/Login/btn_login'))

WebUI.verifyElementPresent(findTestObject('Saucedemo/Login/Verify_Home'), 0)

WebUI.click(findTestObject('Saucedemo/Product/btn_Addtocart'))

WebUI.click(findTestObject('Saucedemo/Product/btn_cart'))

WebUI.verifyElementPresent(findTestObject('Saucedemo/Product/verify_yourcart'), 0)

WebUI.click(findTestObject('Saucedemo/Product/btn_checkout'))

WebUI.verifyElementPresent(findTestObject('Saucedemo/Product/verify_yourinformation'), 0)

WebUI.setText(findTestObject('Saucedemo/Product/txt_firstname'), 'Standard')

WebUI.clearText(findTestObject('Saucedemo/Product/txt_lastname'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Saucedemo/Product/txt_postalcode'), '13131')

WebUI.click(findTestObject('Saucedemo/Product/btn_continue'))

WebUI.verifyElementPresent(findTestObject('Saucedemo/Product/Error_checkout'), 0)

