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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\MiMo.apk', true)

Mobile.tap(findTestObject('Object Repository/baru/android.view.View - EKSPLOR APLIKASI MITSUI (2)'), 0)

Mobile.tap(findTestObject('Object Repository/baru/android.widget.Image - MiMoTheme.IconAplikasi_inactive (1)'), 0)

Mobile.tap(findTestObject('Object Repository/baru/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/baru/android.widget.EditText (3)'), 'TAUFAN KATALON', 0)

Mobile.tap(findTestObject('Object Repository/baru/android.view.View - Pria (1)'), 0)

Mobile.tap(findTestObject('Object Repository/baru/android.view.View - KTP (1)'), 0)

Mobile.tap(findTestObject('Object Repository/baru/android.widget.EditText (4)'), 0)

Mobile.setText(findTestObject('Object Repository/baru/android.widget.EditText (5)'), '3544243232450002', 0)

Mobile.tap(findTestObject('Object Repository/baru/android.widget.EditText (6)'), 0)

Mobile.setText(findTestObject('Object Repository/baru/android.widget.EditText (7)'), 'JL. MARGONDA RAYA NO 78 DEPOK', 0)

Mobile.tap(findTestObject('Object Repository/baru/android.widget.EditText (8)'), 0)

Mobile.setText(findTestObject('Object Repository/baru/android.widget.EditText (9)'), '2187387555', 0)

Mobile.tap(findTestObject('Object Repository/baru/android.widget.EditText (10)'), 0)

Mobile.setText(findTestObject('Object Repository/baru/android.widget.EditText (11)'), '83578782767', 0)

Mobile.tap(findTestObject('Object Repository/baru/android.widget.EditText (12)'), 0)

Mobile.setText(findTestObject('Object Repository/baru/android.widget.EditText (13)'), 'gabrilrafanza@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/baru/android.widget.EditText (14)'), 0)

Mobile.setText(findTestObject('baru/android.widget.EditText (14)'), 'KARYAWAN SWASTA', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/baru/android.widget.Button - LANJUT'), 0)

Mobile.tap(findTestObject('Object Repository/baru/android.view.View - Baru'), 0)

Mobile.tap(findTestObject('Object Repository/baru/android.widget.EditText (15)'), 0)

Mobile.setText(findTestObject(''), 'Honda', 0)

Mobile.closeApplication()

