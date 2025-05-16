#language: es
  Característica: seleccionar un producto de la categoria cumpleaños, agregarlo al carrito y eliminarlo

    Escenario: agregar y eliminar producto del carrio exitoso
      Dado que el usuario se encuentre en la sitio web floristeria mundo flor
      Cuando el usurio seleccione dos productos de la categoria cumpleaños y los agregue al carrito
      Y el usuario elimine el producto
      Entonces Validar que los productos se hayan eliminado correctamente