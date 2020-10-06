# Automation-Test-Oriontek

Para el desarrollo de esta prueba se utilizó la herramienta **Katalon Studio** version 7.5.5 con el Sistema Operativo **Windows 10 Pro**.

En esta prueba se realizó la automatización del escenario de "Añadir un producto al carrito" de la página web [Amazon](https://amazon.com).

### Casos de prueba:

#### [Añadir un Producto mediante la Sección de Categorías.](https://github.com/krodriguezh93/Automation-Test-Oriontek/blob/main/Scripts/A%C3%B1adir%20Producto%20al%20Carrito/A%C3%B1adir%20Producto%20por%20Seccion%20Categorias/Script1601933416026.groovy)
- Paso 1: Se accede a la url [Amazon](https://amazon.com).
- Paso 2: Se hace click en el menú de categorías.
- Paso 3: Se hace click en la categoria "Bebé".
- Paso 4: Se hace click en la opción "Vestimenta y accesorios".
- Paso 5: Se hace click en el título del producto "Calcetines Touched by Nature de algodón orgánico, para bebé".
- Paso 6: Se hace click en el dropdown de "Tamaños".
- Paso 7: Se hace click en la opción "6-12 Months".
- Paso 8: Se valida que fue seleccionada la opción "6-12 Months".
- Paso 9: Se hace click en el color "Girl Stripes".
- Paso 10: Se valida que fue seleccionada el color "Girl Stripes".
- Paso 11: Se hace click en el botón 'Agregar al carrito'.
- Paso 12: Se valida que el producto fue agregado al carrito.

Resultado: De acuerdo a lo esperado.

#### [Añadir un Producto mediante la Barra de Búsqueda.](https://github.com/krodriguezh93/Automation-Test-Oriontek/blob/main/Scripts/A%C3%B1adir%20Producto%20al%20Carrito/A%C3%B1adir%20Producto%20por%20Barra%20de%20Busqueda/Script1601939278243.groovy)
- Paso 1: Se accede a la url [Amazon](https://amazon.com).
- Paso 2: Ingreso el nombre del producto 'Calcetines Touched by Nature de algodón orgánico'.
- Paso 3: Se presiona ENTER.
- Paso 4: Se hace en el menu de categorias.
- Paso 5: Se hace click en la categoria "Bebé".
- Paso 6: Se hace click en la opción "Vestimenta y accesorios".
- Paso 7: Se hace click en el título del producto "Calcetines Touched by Nature de algodón orgánico, para bebé".
- Paso 8: Se hace click en el dropdown de "Tamaños".
- Paso 9:  Se hace click en la opción "6-12 Months".
- Paso 10: Se valida que fue seleccionada la opción "6-12 Months".
- Paso 10: Se hace click en el color "Girl Stripes".
- Paso 11: Se valida que fue seleccionada el color "Girl Stripes".
- Paso 12: Se hace click en el botón 'Agregar al carrito'.
- Paso 13: Se valida que el productofue agregado al carrito.

Resultado: De acuerdo a lo esperado.

### [Objetos](https://github.com/krodriguezh93/Automation-Test-Oriontek/tree/main/Object%20Repository/A%C3%B1adir%20Producto%20al%20Carrito)


Se crearon los siguientes abjetos para la interacción de los elementos de la página:

- hamburger_Nav_Menu: Objeto que hace referencia a las categorias.
- link_Categoria_Bebe: Objeto que hace referencia a la categoria de bebes.
- link_Categoria_Accesorios: Objeto que hace referencia la opcion de Vestimenta y Accesorios de la categoria Bebe.
- link_Calcetines_Algodon: Objeto que hace referencia al producto deseado "Calcetines".
- dropdown_Opcion_Size: Objeto que hace referencia al dropdown para seleccionar el size del producto deseado "Calcetines".
- dropdown_Calcetines_Size: Objeto que hace referencia al size deseado.
- btn_Color_Calcetines: Objeto que hace referencia al color de calcetines  "Rosado".
- label_Color_Seleccionado: Objeto que hace referencia color seleccionado es el esperado.
- btn_Añadir_Carrito: Objeto que hace referencia al boton de añadir producto al carrito de compras.
- input_Barra_Busqueda: Objeto que hace  para ingresar texto en la barra de busqueda.
- label_Agregado_Carrito: Objeto que hace referencia para  validar que el producto ha sido agregado.