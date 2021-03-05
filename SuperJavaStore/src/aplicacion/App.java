package aplicacion;
//Ferreteria llamada SuperJavaStore
import util.Cliente;
import util.Carro_Compras;
import util.Historial;
import util.Vendedor;

public class App {
    public static void main ( String[] arg){
        System.out.println("************* Bienvenid@ a SuperJavaStore *************");
        System.out.println("*******************************************************\n");
        Cliente cliente= new Cliente();
        Carro_Compras carrito= new Carro_Compras();
        Vendedor vendedor=new Vendedor();
        Historial hist= new Historial();

        System.out.println("Cliente: "+cliente.nombre);
        System.out.println("No. Identidad: "+cliente.id);
        System.out.println("Tipo de membresia: "+cliente.tipo+"\n");
        System.out.println("                    Carro de compra ");
        System.out.println(carrito.art1+"\n"+carrito.des1+"\n"+carrito.can1+"\n"+carrito.prec1+"\n"+carrito.art2+"\n"+carrito.des2+"\n"+carrito.can2+"\n"
                            +carrito.prec2+"\n"+carrito.art3+"\n"+carrito.des3+"\n"+carrito.can3+"\n"+carrito.prec3+"\n");
        System.out.println(".......................................................\n");
        System.out.println("                  Historial de compra ");
        System.out.println(hist.f1+"\n"+hist.p1+"\n"+hist.c1+"\n"+hist.f2+"\n"+hist.p2+"\n"+hist.c2+"\n"+hist.f3+"\n"
                            +hist.p3+"\n"+hist.c3+"\n");

        System.out.println(".......................................................\n");
        System.out.println("*********************** FACTURA ***********************\n");
        System.out.println("SuperJavaStore");
        System.out.println("Tegucigalpa, Francisco Morazan");
        System.out.println("tel: 9574-3320");
        System.out.println("Vendedor: "+vendedor.nom);
        System.out.println("No. de venta: No."+vendedor.num_venta);
        System.out.println("       __________________________________________\n");
        System.out.println("Taladro______________________________(L. 4,000.00)");
        System.out.println("Martillo_______________________________(L. 850.00)");
        System.out.println("Cepillo________________________________(L. 500.00)");
        System.out.println("Descuento VIP(0.2)___________________(L. 1,070.00)");
        System.out.println("                                   _______________");
        System.out.println("Total________________________________(L. 4,280.00)");
        System.out.println("Impuesto (0.15)________________________(L. 642.00)");
        System.out.println("                                   _______________");
        System.out.println("                               TOTAL   L. 4,922.00");
        System.out.println(".......................................................\n");
    }
}
