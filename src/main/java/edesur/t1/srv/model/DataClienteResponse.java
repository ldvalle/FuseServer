package edesur.t1.srv.model;

public class DataClienteResponse {

    private Integer estadoCliente;
    private Integer estadoFacturacion;

    public Integer getEstadoCliente() { return  this.estadoCliente; }
    public void setEstadoCliente( Integer estadoCliente ) {this.estadoCliente = estadoCliente; }

    public Integer getEstadoFacturacion() { return  this.estadoFacturacion; }
    public void setEstadoFacturacion( Integer estadoFacturacion ) {this.estadoFacturacion = estadoFacturacion; }

    @Override
    public String toString() {
        return "DataClienteResponse{" +
                "estadoCliente=" + estadoCliente +
                ", estadoFacturacion=" + estadoFacturacion +
                '}';
    }
}
