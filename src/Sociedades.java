public class Sociedades implements Clientes{

        private String id;
        private String age;

    public void setId(String id){
        this.id=id;

    @Override
    public String getId() {
        return id;
    }


    @Override
    public String getDni() {
        return null;
    }

    @Override
    public String getDireccionPostal() {
        return null;
    }

    @Override
    public String getPoblacion() {
        return null;
    }

    @Override
    public String getProvincia() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getTelefono() {
        return null;
    }
}
