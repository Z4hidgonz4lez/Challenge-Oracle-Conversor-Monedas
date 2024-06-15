
---

# Conversor de Monedas

Este es un conversor de monedas desarrollado en Java que utiliza la API de ExchangeRate-API para obtener las tasas de cambio actuales. Permite convertir entre varias monedas y ofrece una opción de conversión manual.

## Características

- Conversión de monedas entre Dólar, Peso Argentino, Real Brasileño, Peso Colombiano, Peso Mexicano y Peso Uruguayo.
- Opción de conversión manual para cualquier moneda soportada por la API.
- Interfaz de línea de comandos fácil de usar.

## Requisitos
Estos son algunos de los requisitos necesarios para la ejecución del código
- Java 8 o superior.
- IntelliJ IDEA.

## Instalación
1. Clonar el repositorio:

   ```bash
   git clone https://github.com/tuusuario/conversor-de-monedas.git
   ```

2. Navegar al directorio del proyecto:

   ```bash
   cd conversor-de-monedas
   ```

3. Abrir el proyecto en IntelliJ IDEA (o tu IDE favorito).

4. Agregar las dependencias necesarias en tu `pom.xml` si estás usando Maven, o asegurarte de tener las librerías necesarias en tu proyecto.

## Uso

1. Ejecutar la clase principal `Principal`.

2. En la consola, se mostrará un menú con las opciones disponibles y deberas elegir entre una de esas opciones
ya que de lo contrio se imprimira un mensaje de "Error", aquí muestro las opciones que mostrara la consola:

   ************************************************
   Bienvenido al conversor de monedas =]
   1) Dólar =>> Peso argentino
   2) Peso Argentino =>> Dólar
   3) Dólar =>> Real brasileño
   4) Real brasileño =>> Dólar
   5) Dólar =>> Peso Colombiano
   6) Peso Colombiano =>> Dólar
   7) Dólar =>> Peso mexicano
   8) Peso Mexicano =>> Dólar
   9) Dólar =>> Peso uruguayo
   10) Peso Uruguayo =>> Dólar
   11) Conversión manual
   12) Salir
   Elija una opción válida
   ************************************************

4. Seleccionar la opción deseada y seguir las instrucciones en pantalla para ingresar las cantidades y realizar la conversión.
5. En dado caso de querer la Opción numero 11, se debera de usar el código correspondiente de las monedas que se desean convertir, en la consola se mostrara el siguiente ejemplo de codigo
EUR para Euro 

## API

Este proyecto utiliza la [ExchangeRate-API](https://www.exchangerate-api.com) para obtener las tasas de cambio. Asegúrate de tener acceso a la API y de que tu clave de API esté configurada correctamente.

## Contribución

Si deseas contribuir a este proyecto, por favor abre un issue o envía un pull request.

## Licencia

Este proyecto está licenciado bajo la MIT License.
