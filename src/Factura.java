public class Factura {
    private Integer id;
    private String fecha;
    private Clientes cliente;
    private Vender vender;
    private Integer baseImponible;
    private Integer total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vender getVender() {
        return vender;
    }

    public void setVender(Vender vender) {
        this.vender = vender;
    }

    public Integer getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(Integer baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}

