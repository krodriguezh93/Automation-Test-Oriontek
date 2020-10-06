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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.maximizeWindow()

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir Producto por Barra de Busqueda/input_Barra_Busqueda'), 
    GlobalVariable.timeOut)) {
    WebUI.setText(findTestObject('Añadir Producto al Carrito/Añadir Producto por Barra de Busqueda/input_Barra_Busqueda'), 
        'Calcetines Touched by Nature de algodón orgánico')
} else {
    println('No se encontro el objeto input_Barra_Busqueda')
}

WebUI.sendKeys(findTestObject('Añadir Producto al Carrito/Añadir Producto por Barra de Busqueda/input_Barra_Busqueda'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/click_Calcetines_Algodon'), 
    GlobalVariable.timeOut)) {
    WebUI.click(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/click_Calcetines_Algodon'))
} else {
    println('No se encontro el objeto click_Calcetines_Algodon ')
}

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/click_Select_Opcion_Size'), 
    GlobalVariable.timeOut)) {
    WebUI.click(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/click_Select_Opcion_Size'))
} else {
    println('No se encontro el objeto click_Select_Opcion_Size ')
}

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/click_Calcetines_Size'), 
    GlobalVariable.timeOut)) {
    WebUI.click(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/click_Calcetines_Size'))
} else {
    println('No se encontro el objeto click_Calcetines_Size ')
}

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/btn_Color_Calcetines'), 
    GlobalVariable.timeOut)) {
    WebUI.click(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/btn_Color_Calcetines'))
} else {
    println('No se encontro el objeto btn_Color_Calcetines')
}

String colorSeleccionado = WebUI.getText(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/label_Color_Seleccionado'))

println(colorSeleccionado)

if (colorSeleccionado == colorMediaRosado) {
    println('Color correcto!')
} else {
    throw Exception('Color incorrecto')
}

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/btn_Añadir_Carrito'), 
    GlobalVariable.timeOut)) {
    WebUI.click(findTestObject('Object Repository/Añadir Producto al Carrito/Añadir producto por Categoria/btn_Añadir_Carrito'))
} else {
    println('No se encontro el objeto btn_Añadir_Carrito ')

    
}

WebUI.closeBrowser()