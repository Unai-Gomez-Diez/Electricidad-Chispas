public class ImpresionFacturas {
    public static void print1(Factura factura1) {
        System.out.println(" ");
        System.out.print("FACTURA-" + factura1.getId());
        System.out.println(" | " + factura1.getFecha());
        System.out.print("CLIENTE: ");
        System.out.print(factura1.getCliente().getNumidentidad());
        System.out.print(" | " + factura1.getCliente().getName());
        System.out.print(" | " + factura1.getCliente().getDireccion_postal());
        System.out.print(" | " + factura1.getCliente().getPoblacion());
        System.out.print(" | " + factura1.getCliente().getProvincia());
        System.out.println(" | " + factura1.getCliente().getEmail());
        System.out.print("Venta: ");
        System.out.print(factura1.getProducto().getId());
        System.out.print(" | " + factura1.getProducto().getName());
        System.out.print(" | " + factura1.getProducto().getPrecio());
        System.out.print(" | " + factura1.getProducto().getIva());
        System.out.print(" Total: " + (factura1.getProducto().getPrecio()*(1+factura1.getProducto().getIva())));
        System.out.println(" ");
        System.out.print("       " +factura1.getServicio().getId());
        System.out.print(" | " + factura1.getServicio().getName());
        System.out.print(" | " + factura1.getServicio().getPrecio());
        System.out.print(" | " + factura1.getServicio().getIva());
        System.out.println(" | Total: " + (factura1.getServicio().getPrecio()*(1+factura1.getServicio().getIva())));
        System.out.println("Total: " + (factura1.getProducto().getPrecio()+factura1.getServicio().getPrecio()));
        System.out.println(" ");
    }
    public static void print2(Factura factura2) {
        System.out.println(" ");
        System.out.print("FACTURA-" + factura2.getId());
        System.out.println(" | " + factura2.getFecha());
        System.out.print("CLIENTE: ");
        System.out.print(factura2.getCliente().getNumidentidad());
        System.out.print(" | " + factura2.getCliente().getName());
        System.out.print(" | " + factura2.getCliente().getDireccion_postal());
        System.out.print(" | " + factura2.getCliente().getPoblacion());
        System.out.print(" | " + factura2.getCliente().getProvincia());
        System.out.println(" | " + factura2.getCliente().getEmail());
        System.out.print("Venta: ");
        System.out.print(factura2.getProducto().getId());
        System.out.print(" | " + factura2.getProducto().getName());
        System.out.print(" | " + factura2.getProducto().getPrecio());
        System.out.print(" | " + factura2.getProducto().getIva());
        System.out.print(" Total: " + (factura2.getProducto().getPrecio()*(1+factura2.getProducto().getIva())));
        System.out.println(" ");
        System.out.print("       " +factura2.getServicio().getId());
        System.out.print(" | " + factura2.getServicio().getName());
        System.out.print(" | " + factura2.getServicio().getPrecio());
        System.out.print(" | " + factura2.getServicio().getIva());
        System.out.println(" | Total: " + (factura2.getServicio().getPrecio()*(1+factura2.getServicio().getIva())));
        System.out.println("Total: " + (factura2.getProducto().getPrecio()+factura2.getServicio().getPrecio()));
        System.out.println(" ");
    }
}