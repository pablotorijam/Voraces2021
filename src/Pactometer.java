import java.util.*;

public class Pactometer {

    int nDiputados = 145; //Ej. número diputados del parlamento
    int mayoriaABS = (nDiputados/2)+1;
    float umbralPacto = 0.5F;

    // lista de partidos políticos
    ArrayList<Partido> misPartidos = new ArrayList<Partido>();

     misPartidos.add(new Partido partido1 = new Partido("extIZQ",10,1));
     misPartidos.add(new Partido pertido2 = new Partido("muyIZQ",10,3))
     misPartidos.add(new Partido partido3 = new Partido("IZQ",50,4))
     misPartidos.add(new Partido partido4 = new Partido("Centro",5,5))
     misPartidos.add(new Partido partido5 = new Partido("Derecha",49,6))
     misPartidos.add(new Partido partido6 = new Partido("muyDerecha",10,7))
     misPartidos.add(new Partido partido7 = new Partido("extDerecha",10,10))

    ArrayList<Partido> solucion = main.greedyPactometer(misPartidos, mayoriaABS, umbralPacto);

    imprimeSolucion(solucion);


}
