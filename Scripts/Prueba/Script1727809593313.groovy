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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import org.openqa.selenium.Keys as Keys

for (int i = 0; i <= 10; i++ ) {	
	
	'ABRIR EL EXPLORADOR Y NAVEGAR AL NETBANKING'
	WebUI.openBrowser('https://bscenlinea.com.do/onlinebanking')
	
	'Delete all cookies after browser is opened'
	WebUI.deleteAllCookies()
	
	WebUI.navigateToUrl('https://bscenlinea.com.do/onlinebanking')
	
	WebUI.maximizeWindow()
	
	'VALIDAR SI LA PAGINA CARGO LOS ELEMENTOS NECESARIOS PARA INICIAR SESION'
	WebUI.verifyElementVisible(findTestObject('Page_Banco Santa Cruz - Banca en Linea/AD-BOTON PERSONAL'))
	
	'VALIDAR SI LA PAGINA CARGO LOS ELEMENTOS NECESARIOS PARA INICIAR SESION'
	WebUI.verifyElementVisible(findTestObject('Page_Banco Santa Cruz - Banca en Linea/AD-CAMPO USUARIO'))
	
	'VALIDAR SI LA PAGINA CARGO LOS ELEMENTOS NECESARIOS PARA INICIAR SESION'
	WebUI.verifyElementVisible(findTestObject('Page_Banco Santa Cruz - Banca en Linea/AD-CAMPO CONTRASEA'))
	
	'VALIDAR SI LA PAGINA CARGO LOS ELEMENTOS NECESARIOS PARA INICIAR SESION'
	WebUI.verifyElementVisible(findTestObject('Page_Banco Santa Cruz - Banca en Linea/AD-BOTON INICIAR SESION'))
	
	'EL ROBOT INGRESA LA INFORMACION DE USUARIO'
	WebUI.setText(findTestObject('Page_Banco Santa Cruz - Banca en Linea/AD-CAMPO USUARIO'), 'Ant25')
	
	'EL ROBOT INGRESA LA INFORMACION DE CONTRASEÑA'
	WebUI.setEncryptedText(findTestObject('Page_Banco Santa Cruz - Banca en Linea/AD-CAMPO CONTRASEA'), '1Zr9PsWXvgdIzAmuc3H4cg==')
	
	'EL ROBOT INICIA SESION\r\n'
	WebUI.click(findTestObject('Page_Banco Santa Cruz - Banca en Linea/AD-BOTON INICIAR SESION'))
	
	WebUI.delay(35)
	
	'EL ROBOT CAPTURA PRINTSCREENFULL'
	WebUI.takeFullPageScreenshot()
	
	'Verificar el Menu de la Derecha'
	WebUI.verifyElementPresent(findTestObject('Page_Banco Santa Cruz - Banca en Linea/Opcion_Menu_Salir'), 0)
	
	'Clickear la Opcion de la Derecha del MENU'
	WebUI.click(findTestObject('Page_Banco Santa Cruz - Banca en Linea/Opcion_Menu_Salir'))
	
	'Verificar el Menu de la Derecha, para Clickear y Salir'
	WebUI.verifyElementPresent(findTestObject('Page_Banco Santa Cruz - Banca en Linea/span_CerrarSesin'), 0)
	
	'Clickear la Opcion del Menu de la Derecha y Salir'
	WebUI.click(findTestObject('Page_Banco Santa Cruz - Banca en Linea/span_CerrarSesin'), FailureHandling.CONTINUE_ON_FAILURE)
		
}



