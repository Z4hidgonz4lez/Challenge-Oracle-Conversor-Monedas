import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ClienteApi clienteApi = new ClienteApi();
        ProveedorDeTasas proveedorDeTasas = new ProveedorDeTasas(clienteApi);
        ConvertidorDeMoneda convertidor = new ConvertidorDeMoneda(proveedorDeTasas);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("************************************************\n");
            System.out.println("Bienvenido al conversor de monedas =]");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso Argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) Dólar =>> Peso mexicano");
            System.out.println("8) Peso Mexicano =>> Dólar");
            System.out.println("9) Dólar =>> Peso uruguayo");
            System.out.println("10) Peso Uruguayo =>> Dólar");
            System.out.println("11) Conversión manual");
            System.out.println("12) Salir");
            System.out.println("Elija una opción válida");
            System.out.println("\n************************************************");

            int opcion = scanner.nextInt();
            double cantidad;
            String deMoneda;
            String aMoneda;


// En esta parte hago todos y cada uno de los casos de monedas que quiero convertir, incluyendo la parte manual
//            En dado caso de que la moneda que quiera convertir el usuario no se encuentre


            switch (opcion) {
                case 1:
                    deMoneda = "USD";
                    aMoneda = "ARS";
                    System.out.println("Ingrese la cantidad en dólares:");
                    cantidad = scanner.nextDouble();
                    realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
                    break;
                case 2:
                    deMoneda = "ARS";
                    aMoneda = "USD";
                    System.out.println("Ingrese la cantidad en pesos argentinos:");
                    cantidad = scanner.nextDouble();
                    realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
                    break;
                case 3:
                    deMoneda = "USD";
                    aMoneda = "BRL";
                    System.out.println("Ingrese la cantidad en dólares:");
                    cantidad = scanner.nextDouble();
                    realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
                    break;
                case 4:
                    deMoneda = "BRL";
                    aMoneda = "USD";
                    System.out.println("Ingrese la cantidad en reales brasileños:");
                    cantidad = scanner.nextDouble();
                    realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
                    break;
                case 5:
                    deMoneda = "USD";
                    aMoneda = "COP";
                    System.out.println("Ingrese la cantidad en dólares:");
                    cantidad = scanner.nextDouble();
                    realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
                    break;
                case 6:
                    deMoneda = "COP";
                    aMoneda = "USD";
                    System.out.println("Ingrese la cantidad en pesos colombianos:");
                    cantidad = scanner.nextDouble();
                    realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
                    break;
                case 7:
                    deMoneda = "USD";
                    aMoneda = "MXN";
                    System.out.println("Ingrese la cantidad en dólares:");
                    cantidad = scanner.nextDouble();
                    realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
                    break;
                case 8:
                    deMoneda = "MXN";
                    aMoneda = "USD";
                    System.out.println("Ingrese la cantidad en pesos mexicanos:");
                    cantidad = scanner.nextDouble();
                    realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
                    break;
                case 9:
                    deMoneda = "USD";
                    aMoneda = "UYU";
                    System.out.println("Ingrese la cantidad en dólares:");
                    cantidad = scanner.nextDouble();
                    realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
                    break;
                case 10:
                    deMoneda = "UYU";
                    aMoneda = "USD";
                    System.out.println("Ingrese la cantidad en pesos uruguayos:");
                    cantidad = scanner.nextDouble();
                    realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
                    break;
                case 11:
                    realizarConversionManual(scanner, convertidor);
                    break;
                case 12:
                    continuar = false;
                    System.out.println("Gracias por usar el conversor de monedas.");
                    break;
                default:
                    System.out.println("Opción invalida. Por favor, elija una opción que se muestre en la consola.");
            }
        }

        scanner.close();
    }

    private static void realizarConversion(ConvertidorDeMoneda convertidor, double cantidad,
                                           String deMoneda, String aMoneda) {


        try {
            double cantidadConvertida = convertidor.convertir(cantidad, deMoneda, aMoneda);
            System.out.println(cantidad + " " + deMoneda + " es igual a " + cantidadConvertida + " " + aMoneda);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    private static void realizarConversionManual(Scanner scanner, ConvertidorDeMoneda convertidor) {
        System.out.println(" Ingrese la moneda de origen siguiendo como ejemplo lo siguinete: " +
                "(código ISO: USD, EUR):");

        String deMoneda = scanner.next().toUpperCase();
        System.out.println(" Ingrese la moneda de destino siguiendo como ejemplo lo siguiente: " +
                "(código ISO: USD, EUR):");

        String aMoneda = scanner.next().toUpperCase();
        System.out.println(" Ingrese la cantidad en " + deMoneda + ":");
        double cantidad = scanner.nextDouble();
        realizarConversion(convertidor, cantidad, deMoneda, aMoneda);
    }
}