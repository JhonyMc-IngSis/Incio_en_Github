package util;

public class Clientes {
    String cliente;
    String id;


    public Clientes(String cliente, String id){
        this.cliente=cliente;
        this.id=id; }

    public void Datos(){
        System.out.println("Cliente: "+cliente);
        System.out.println("Numero de identidad: "+id);
    }
}
