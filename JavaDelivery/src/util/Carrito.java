package util;

public class Carrito {
    Comercios comercios= new Comercios();
    Clientes cliente1=new Clientes("Ruben Padilla", "0801-2000-45687");
    Clientes cliente2=new Clientes("Karen Sanches", "0801-1987-12165");

    public Carrito(){
        System.out.println("**********************************************  FACTURA  ********++*************************************\n");

        cliente1.Datos();
        System.out.println("Negocio: "+ comercios.cr2+"\n");

        System.out.println("Cantidad   Combo                                                                                 Precio");
        System.out.println("2          "+comercios.op9+" _______________________________________________________________________ "+"L 120.00");
        System.out.println("1          "+comercios.op10+" _____________________________________________________________________ "+comercios.precio10);
        System.out.println("1          "+"Negocios seleccionados"+" ______________________________________________________________ "+"L 70.00");
        System.out.println("                                                                                          TOTAL  L 490.00\n");

        cliente2.Datos();
        System.out.println("Negocio: "+ comercios.pollo1+", "+comercios.bal1+"\n");

        System.out.println("Cantidad   Combo                                                                                 Precio");
        System.out.println("1          "+comercios.op1+" ________________________________________________________________________ "+comercios.precio1);
        System.out.println("1          "+comercios.op2+" ______________________________________________________________________________ "+comercios.precio2);
        System.out.println("2          "+comercios.op15+" ___________________________________________________________________________ "+"L 160.00");
        System.out.println("2          "+"Negocios seleccionados"+" ______________________________________________________________ "+"L 140.00");
        System.out.println("                                                                                          TOTAL  L 620.00");
        System.out.println(".........................................................................................................\n");

    }

}
