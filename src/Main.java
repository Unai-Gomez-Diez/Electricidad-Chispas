import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Autonomo autonomo = new Autonomo();
        autonomo.setId(1);
        autonomo.setName("Unai");
        autonomo.setSurname("Gomez Diez");
        autonomo.setNumidentidad("70845257j");
        autonomo.setDireccion_postal("Agustin Rodriguez Sahagun");
        autonomo.setPoblacion("Avila");
        autonomo.setProvincia("Avila");
        autonomo.setEmail("Unaigomez080@gmail.com");
        autonomo.setTelefono("602244020");

        System.out.println("ID-" + autonomo.getId());
        System.out.println("NOMBRE-" + autonomo.getName() + " " + autonomo.getSurname());
        System.out.println("DNI-" + autonomo.getNumidentidad());
        System.out.println("DIRECCION POSTAL-" + autonomo.getDireccion_postal());
        System.out.println("POBLACION-" + autonomo.getPoblacion());
        System.out.println("PROVINCIA-" + autonomo.getProvincia());
        System.out.println("EMAIL-" + autonomo.getEmail());
        System.out.println("TELEFONO-" + autonomo.getTelefono());


        Sociedad sociedad = new Sociedad();
        sociedad.setId(1);
        sociedad.setName("Locos");
        sociedad.setNumidentidad("80758542J");
        sociedad.setDireccion_postal("jesus herrero");
        sociedad.setPoblacion("Avila");
        sociedad.setProvincia("Avila");
        System.out.println("Email:");
        sociedad.setEmail("empresainventada@gmail.com");
        sociedad.setTelefono("659898728");

        System.out.println("ID-" + sociedad.getId());
        System.out.println("NOMBRE-" + sociedad.getName());
        System.out.println("CIF-" + sociedad.getNumidentidad());
        System.out.println("DIRECCION POSTAL-" + sociedad.getDireccion_postal());
        System.out.println("POBLACION-" + sociedad.getPoblacion());
        System.out.println("PROVINCIA-" + sociedad.getProvincia());
        System.out.println("EMAIL-" + sociedad.getEmail());
        System.out.println("TELEFONO-" + sociedad.getTelefono());


        Producto producto1 = new Producto();
        producto1.setId(1);
        producto1.setName("llavero");
        producto1.setMarca("Inventada.S.L.");
        producto1.setModel("A385");
        producto1.setPrecio(5);
        producto1.setIva(21);

        Producto producto2 = new Producto();
        producto2.setId(2);
        producto2.setName("Coche");
        producto2.setMarca("Seat");
        producto2.setModel("Ibiza");
        producto2.setPrecio(1000);
        producto2.setIva(21);

        System.out.println("Producto-" + producto1.getId());
        System.out.println("NOMBRE-" + producto1.getName());
        System.out.println("MARCA-" + producto1.getMarca());
        System.out.println("MODELO-" + producto1.getModel());
        System.out.println("PRECIO-" + producto1.getPrecio());
        System.out.println("TIPO IVA-" + producto1.getIva());
        System.out.println("-------------------");
        System.out.println("Producto-" + producto2.getId());
        System.out.println("NOMBRE-" + producto2.getName());
        System.out.println("MARCA-" + producto2.getMarca());
        System.out.println("MODELO-" + producto2.getModel());
        System.out.println("PRECIO-" + producto2.getPrecio());
        System.out.println("TIPO IVA-" + producto2.getIva());


        Servicio servicio1 = new Servicio();
        servicio1.setId(1);
        servicio1.setName("Reparacion");
        servicio1.setPrecio(20);
        servicio1.setIva(5);

        Servicio servicio2 = new Servicio();
        servicio2.setId(2);
        servicio2.setName("mantenimiento");
        servicio2.setPrecio(25);
        servicio2.setIva(21);

        System.out.println("Servicio-" + servicio1.getId());
        System.out.println("NOMBRE-" + servicio1.getName());
        System.out.println("PRECIO-" + servicio1.getPrecio());
        System.out.println("TIPO IVA-" + servicio1.getIva());
        System.out.println("Servicio-" + servicio2.getId());
        System.out.println("NOMBRE-" + servicio2.getName());
        System.out.println("PRECIO-" + servicio2.getPrecio());
        System.out.println("TIPO IVA-" + servicio2.getIva());


        Factura factura1 = new Factura();
        factura1.setId(1);
        factura1.setFecha("20/2/22");
        factura1.setCliente(autonomo);
        factura1.setProducto(producto1);
        factura1.setServicio(servicio1);
        factura1.setBaseImponible(producto1.getPrecio() + servicio1.getPrecio());
        factura1.setTotal((int) (producto1.getPrecio()*1.21 + servicio1.getPrecio()*1.21));

        Factura factura2 = new Factura();
        factura2.setId(2);
        factura2.setFecha("20/2/22");
        factura2.setCliente(sociedad);
        factura2.setProducto(producto2);
        factura2.setServicio(servicio2);
        factura2.setBaseImponible(producto2.getPrecio() + servicio2.getPrecio());
        factura2.setTotal((int) (producto2.getPrecio()*1.21 + servicio2.getPrecio()*1.21));



        ImpresionFacturas.print1(factura1);

        ImpresionFacturas.print2(factura2);
    }
}