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
import com.kms.katalon.core.exception.StepFailedException

try {
	WebUI.openBrowser('')

	WebUI.navigateToUrl(GlobalVariable.URL)

	WebUI.maximizeWindow()

	if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/hamburger_Nav_Menu'), GlobalVariable.timeOut)) {
		WebUI.click(findTestObject('Añadir Producto al Carrito/Añadir producto por Categoria/hamburger_Nav_Menu'))
	}
	if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/link_Categoria_Bebe'), GlobalVariable.timeOut)) {
		WebUI.click(findTestObject('Añadir Producto al Carrito/Añadir producto por Categoria/link_Categoria_Bebe'))
	}
	if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/link_Categoria_Accesorios'), GlobalVariable.timeOut)) {
		WebUI.click(findTestObject('Añadir Producto al Carrito/Añadir producto por Categoria/link_Categoria_Accesorios'))
	}
	if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/link_Calcetines_Algodon'), GlobalVariable.timeOut)) {
		WebUI.click(findTestObject('Añadir Producto al Carrito/Añadir producto por Categoria/link_Calcetines_Algodon'))
	}
	if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/dropdown_Opcion_Size'), GlobalVariable.timeOut)) {
		WebUI.click(findTestObject('Añadir Producto al Carrito/Añadir producto por Categoria/dropdown_Opcion_Size'))
	}
	if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/dropdown_Calcetines_Size'), GlobalVariable.timeOut)) {
		WebUI.click(findTestObject('Añadir Producto al Carrito/Añadir producto por Categoria/dropdown_Calcetines_Size'))
	}
	String Meses = WebUI.getText(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/label_dropdown_Size'))
	println(Meses)
	if (Meses == SizeMeses) {
		println('Size correcto')
	} else {
		throw Exception('Size incorrecto')
	}
	if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/btn_Color_Calcetines'), GlobalVariable.timeOut)) {
		WebUI.click(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/btn_Color_Calcetines'))
	}


	String colorSeleccionado = WebUI.getText(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/label_Color_Seleccionado'))

	println(colorSeleccionado)

	if (colorSeleccionado == colorMediaRosado) {
		println('Color correcto!')
	} else {
		throw Exception('Color incorrecto')
	}

	WebUI.click(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/btn_Añadir_Carrito'))

	String productoAgregado = WebUI.getText(findTestObject('Añadir Producto al Carrito/Añadir producto por Categoria/label_Agregado_Carrito'))

	println(productoAgregado)

	if (productoAgregado == confirmacionProducto) {
		println('Producto agregado correctamente!')
	} else {
		throw Exception('Producto no agregado al carrito')
	}
	WebUI.closeBrowser()

} catch (StepFailedException error) {
	println("No se encontró el objeto: " + error)
}
catch (Exception error) {
	println("Ha ocurrido un error: " + error)
}