public class ProveedorDeTasas {

    private ClienteApi clienteApi;

    public ProveedorDeTasas(ClienteApi clienteApi) {
        this.clienteApi = clienteApi;
    }

    public double obtenerTasa(String deMoneda, String aMoneda) throws Exception {
        return clienteApi.obtenerTasa(deMoneda, aMoneda);
    }

}
