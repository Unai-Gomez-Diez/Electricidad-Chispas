public class Sociedades implements Clientes {

    private Integer id;
    private String name;
    private String surname;
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
        return id;
    }


    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
    @Override
    public String getCode() {
        return code;
    }
    public void setDireccion_postal(String direccion_postal) {
        this.direccion_postal = direccion_postal;
    }
    @Override
    public String getDireccion_postal() {
        return direccion_postal;
    }
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    @Override
    public String getPoblacion() {
        return poblacion;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    @Override
    public String getProvincia() {
        return provincia;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getEmail() {
        return email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String getTelefono() {
        return telefono;
    }
}
