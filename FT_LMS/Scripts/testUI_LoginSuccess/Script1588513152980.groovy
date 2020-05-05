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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplicationWithTitle('E:\\New folder (3)\\New folder (2)\\2019-2010 SEASION II\\SEASION II\\specialized project\\QLTV_Update\\QLTV_GUI\\bin\\Debug\\QLTV_GUI.exe', 
    '')

Windows.setText(findWindowsObject('LoginAction/Txt_Username'), 'admin')

Windows.setText(findWindowsObject('LoginAction/Txt_Password'), 'admin')

Windows.click(findWindowsObject('LoginAction/Btn_Login'))

Windows.getText(findWindowsObject('AdminLoginSuccessfullyAction/Txt_FormName'))

Windows.getText(findWindowsObject('AdminLoginSuccessfullyAction/Tile_TaoTK'))

Windows.getText(findWindowsObject('AdminLoginSuccessfullyAction/Tile_BaoCaoTKTheoNXB'))

Windows.getText(findWindowsObject('AdminLoginSuccessfullyAction/Tile_BaoCaoTKSachTraTre'))

Windows.getText(findWindowsObject('AdminLoginSuccessfullyAction/Tile_BaoCaoDSDocGia'))

Windows.getText(findWindowsObject('AdminLoginSuccessfullyAction/Tile_QuyDinh'))

