public class Autonomos implements Clientes {
    private Integer id;
    private String name;
    private String code;
    private String direccion_postal;
    private String poblacion;
    private String provincia;
    private String email;
    private String telefono;


    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public Integer getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return null;
    }
    public void setDireccion_postal(String direccion_postal) {
        this.direccion_postal = direccion_postal;
    }
    @Override
    public String getDireccion_postal() {
        return null;
    }
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    @Override
    public String getPoblacion() {
        return null;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    @Override
    public String getProvincia() {
        return null;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getEmail() {
        return null;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String getTelefono() {
        return null;
    }
}
