public class ImpresionFacturas {
    public void print(Factura factura1) {
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
        System.out.println("Total: " + (factura1.getVender().getPrecio()*(1+factura1.getVender().getIva())));
        System.out.println("--------------");
        System.out.println("codigo: " + factura1.getVender().getId());
        System.out.println("nombre: " + factura1.getVender().getName());
        System.out.println("precio: " + factura1.getVender().getPrecio());
        System.out.println("tipo IVA: " + factura1.getVender().getIva());
        System.out.println("Total: " + (factura1.getVender().getPrecio()*(1+factura1.getVender().getIva())));
        System.out.println("TOTAL:");
        System.out.println("Total: " + (factura1.getVender().getPrecio()+factura1.getVender().getPrecio()));
        System.out.println("-------------------");
    }
}