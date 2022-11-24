import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Producto implements Vender{
    private Integer id;
    private String name;
    private String marca;
    private String model;
    private Integer precio;
    private Integer iva;


    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }

    @Override
    public Integer getIva() {
        return iva;
    }
}
