package aplicacion;

import util.Cliente;
import util.Artista;
import util.Playlist;

public class App {
    public static void main ( String[] args){
        System.out.println("************* Bienvenid@ a JavaMusicPlay **************");
        System.out.println("*******************************************************\n");
        Cliente cliente= new Cliente();
        Artista artista= new Artista();
        Playlist list= new Playlist();

        System.out.println("Usuario: "+cliente.nombre);
        System.out.println("Tipo de cuenta: "+cliente.cuenta);
        System.out.println("       __________________________________________\n");

        System.out.println("Buscar artista: "+artista.nombre+"\n");
        System.out.println("Album: "+artista.album1);
        System.out.println("***Canciones***\n"+artista.c1+"\n"+artista.c2+"\n"+artista.c3+"\n");
        System.out.println("Album: "+artista.album2);
        System.out.println("***Canciones***\n"+artista.c4+"\n"+artista.c5+"\n"+artista.c6+"\n");
        System.out.println("Album: "+artista.album3);
        System.out.println("***Canciones***\n"+artista.c7+"\n"+artista.c8+"\n"+artista.c9+"\n");
        System.out.println("       __________________________________________\n");

        System.out.println("                Mejores Colaboraciones");
        System.out.println(artista.c10+"\n"+artista.c11+"\n"+artista.c12+"\n");
        System.out.println("                    Top 10 Marzo");
        System.out.println(artista.c13+"\n"+artista.c14+"\n"+artista.c15+"\n"+
                           artista.c16+"\n"+artista.c17+"\n"+artista.c18+"\n"+
                            artista.c19+"\n"+artista.c20+"\n"+artista.c21+"\n"+artista.c22+"\n");
        System.out.println(".......................................................\n\n");
        System.out.println("                  TUS PLAYLIST");
        System.out.println("**Playlis 1**\n"+list.can1+"\n"+list.can2+"\n"+list.can3
                            +"\n"+list.can4+"\n"+list.can5+"\n\n");
        System.out.println("**Playlis 2**\n"+list.can6+"\n"+list.can7+"\n"+list.can8
                +"\n"+list.can9+"\n"+list.can10+"\n");
        System.out.println(".......................................................\n\n");
    }
}
