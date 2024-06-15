public class ConvertidorDeMoneda {
    private ProveedorDeTasas proveedorDeTasas;

    public ConvertidorDeMoneda(ProveedorDeTasas proveedorDeTasas) {
        this.proveedorDeTasas = proveedorDeTasas;
    }

    public double convertir(double cantidad, String deMoneda, String aMoneda) throws Exception {
        double tasa = proveedorDeTasas.obtenerTasa(deMoneda, aMoneda);
        return cantidad * tasa;
    }
}
