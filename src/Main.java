import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Set autonomo
        System.out.println("Rellena los datos del autonomo...");
        Autonomo autonomo = new Autonomo();
        autonomo.setId(1);
        System.out.println("Nombre:");
        autonomo.setName(entrada.next());
        System.out.println("Apellidos:");
        autonomo.setSurname(entrada.next());
        System.out.println("Dni:");
        autonomo.setNumidentidad(entrada.next());
        System.out.println("Direccion postal:");
        autonomo.setDireccion_postal(entrada.next());
        System.out.println("Poblacion:");
        autonomo.setPoblacion(entrada.next());
        System.out.println("Provincia:");
        autonomo.setProvincia(entrada.next());
        System.out.println("Email:");
        autonomo.setEmail(entrada.next());
        System.out.println("Telefono:");
        autonomo.setTelefono(entrada.next());

        //Muestra los datos del autonomo
        System.out.println("-------------------");
        System.out.println("DATOS DEL AUTONOMO:");
        System.out.println("ID: " + autonomo.getId());
        System.out.println("NOMBRE: " + autonomo.getName());
        System.out.println("APELLIDOS: " + autonomo.getSurname());
        System.out.println("DNI: " + autonomo.getNumidentidad());
        System.out.println("DIRECCION POSTAL: " + autonomo.getDireccion_postal());
        System.out.println("POBLACION: " + autonomo.getPoblacion());
        System.out.println("PROVINCIA: " + autonomo.getProvincia());
        System.out.println("EMAIL: " + autonomo.getEmail());
        System.out.println("TELEFONO: " + autonomo.getTelefono());
        System.out.println("-------------------");

        //Set sociedad
        System.out.println("Rellena los datos de la sociedad...");
        Sociedad sociedad = new Sociedad();
        sociedad.setId(1);
        System.out.println("Nombre:");
        sociedad.setName(entrada.next());
        System.out.println("Cif:");
        sociedad.setNumidentidad(entrada.next());
        System.out.println("Direccion postal:");
        sociedad.setDireccion_postal(entrada.next());
        System.out.println("Poblacion:");
        sociedad.setPoblacion(entrada.next());
        System.out.println("Provincia:");
        sociedad.setProvincia(entrada.next());
        System.out.println("Email:");
        sociedad.setEmail(entrada.next());
        System.out.println("Telefono:");
        sociedad.setTelefono(entrada.next());

        //Muestra los datos de la sociedad
        System.out.println("-------------------");
        System.out.println("DATOS DE LA SOCIEDAD:");
        System.out.println("ID: " + sociedad.getId());
        System.out.println("NOMBRE: " + sociedad.getName());
        System.out.println("CIF: " + sociedad.getNumidentidad());
        System.out.println("DIRECCION POSTAL: " + sociedad.getDireccion_postal());
        System.out.println("POBLACION: " + sociedad.getPoblacion());
        System.out.println("PROVINCIA: " + sociedad.getProvincia());
        System.out.println("EMAIL: " + sociedad.getEmail());
        System.out.println("TELEFONO: " + sociedad.getTelefono());
        System.out.println("-------------------");

        //Set producto 1
        System.out.println("Rellena los datos del producto 1...");
        Producto producto1 = new Producto();
        producto1.setId(1);
        System.out.println("Nombre:");
        producto1.setName(entrada.next());
        System.out.println("Marca:");
        producto1.setMarca(entrada.next());
        System.out.println("Modelo:");
        producto1.setModel(entrada.next());
        System.out.println("Precio:");
        producto1.setPrecio(entrada.nextInt());
        System.out.println("Tipo IVA:");
        producto1.setIva(entrada.nextInt());

        //Set producto 2
        System.out.println("Rellena los datos del producto 2...");
        Producto producto2 = new Producto();
        producto2.setId(2);
        System.out.println("Nombre:");
        producto2.setName(entrada.next());
        System.out.println("Marca:");
        producto2.setMarca(entrada.next());
        System.out.println("Modelo:");
        producto2.setModel(entrada.next());
        System.out.println("Precio:");
        producto2.setPrecio(entrada.nextInt());
        System.out.println("Tipo IVA:");
        producto2.setIva(entrada.nextInt());

        //Muestra los datos de los productos
        System.out.println("-------------------");
        System.out.println("DATOS DE LOS PRODUCTOS:");
        System.out.println("Producto-" + producto1.getId());
        System.out.println("NOMBRE: " + producto1.getName());
        System.out.println("MARCA: " + producto1.getMarca());
        System.out.println("MODELO: " + producto1.getModel());
        System.out.println("PRECIO: " + producto1.getPrecio());
        System.out.println("TIPO IVA: " + producto1.getIva());
        System.out.println("-------------------");
        System.out.println("Producto-" + producto2.getId());
        System.out.println("NOMBRE: " + producto2.getName());
        System.out.println("MARCA: " + producto2.getMarca());
        System.out.println("MODELO: " + producto2.getModel());
        System.out.println("PRECIO: " + producto2.getPrecio());
        System.out.println("TIPO IVA: " + producto2.getIva());
        System.out.println("-------------------");

        //Set servicio 1
        System.out.println("Rellena los datos del servicio 1...");
        Servicio servicio1 = new Servicio();
        servicio1.setId(1);
        System.out.println("Nombre:");
        servicio1.setName(entrada.next());
        System.out.println("Precio:");
        servicio1.setPrecio(entrada.nextInt());
        System.out.println("Tipo IVA:");
        servicio1.setIva(entrada.nextInt());

        //Set servicio 2
        System.out.println("Rellena los datos del servicio 2...");
        Servicio servicio2 = new Servicio();
        servicio2.setId(2);
        System.out.println("Nombre:");
        servicio2.setName(entrada.next());
        System.out.println("Precio:");
        servicio2.setPrecio(entrada.nextInt());
        System.out.println("Tipo IVA:");
        servicio2.setIva(entrada.nextInt());

        //Muestra los datos de los servicios
        System.out.println("-------------------");
        System.out.println("DATOS DE LOS SERVICIOS:");
        System.out.println("Servicio-" + servicio1.getId());
        System.out.println("NOMBRE: " + servicio1.getName());
        System.out.println("PRECIO: " + servicio1.getPrecio());
        System.out.println("TIPO IVA: " + servicio1.getIva());
        System.out.println("-------------------");
        System.out.println("Servicio-" + servicio2.getId());
        System.out.println("NOMBRE: " + servicio2.getName());
        System.out.println("PRECIO: " + servicio2.getPrecio());
        System.out.println("TIPO IVA: " + servicio2.getIva());
        System.out.println("-------------------");


        //Set factura autonomo
        System.out.println("Rellena los datos de la factura para un autonomo...");
        Factura factura1 = new Factura();
        factura1.setId(1);
        System.out.println("Fecha:");
        factura1.setFecha(entrada.next());
        factura1.setCliente(autonomo);
        factura1.setVender(producto1);
        factura1.setVender(servicio1);
        System.out.println("Base Imponible:");
        factura1.setBaseImponible(entrada.nextInt());
        System.out.println("Total:");
        factura1.setTotal(entrada.nextInt());

        //Set factura sociedad
        System.out.println("Rellena los datos de la factura para una sociedad...");
        Factura factura2 = new Factura();
        factura2.setId(2);
        System.out.println("Fecha:");
        factura2.setFecha(entrada.next());
        factura2.setCliente(sociedad);
        factura2.setVender(producto2);
        factura2.setVender(servicio2);
        System.out.println("Base Imponible:");
        factura2.setBaseImponible(entrada.nextInt());
        System.out.println("Total:");
        factura2.setTotal(entrada.nextInt());

        System.out.println("-------------------");
        System.out.println("FACTURA-" + factura1.getId());
        System.out.println("FECHA: " + factura1.getFecha());
        System.out.println("CLIENTE:");
        System.out.println("cif/nif: " + factura1.getCliente().getNumidentidad());
        System.out.println("nombre: " + factura1.getCliente().getName());
        System.out.println("direccion: " + factura1.getCliente().getDireccion_postal());
        System.out.println("poblacion: " + factura1.getCliente().getPoblacion());
        System.out.println("provincia: " + factura1.getCliente().getProvincia());
        System.out.println("email: " + factura1.getCliente().getEmail());
        System.out.println("VENTA:");
        System.out.println("codigo: " + factura1.getVender().getId());
        System.out.println("nombre: " + factura1.getVender().getName());
        System.out.println("precio: " + factura1.getVender().getPrecio());
        System.out.println("tipo IVA: " + factura1.getVender().getIva());
        System.out.println("--------------");
        System.out.println("codigo: " + factura1.getVender().getId());
        System.out.println("nombre: " + factura1.getVender().getName());
        System.out.println("precio: " + factura1.getVender().getPrecio());
        System.out.println("tipo IVA: " + factura1.getVender().getIva());
        System.out.println("TOTAL:");
        System.out.println("Total: " + (factura1.getVender().getPrecio())+factura1.getVender().getPrecio());
        System.out.println("-------------------");
    }
}