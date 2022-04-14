import java.util.ArrayList;

public class main {

    public static ArrayList<Partido> greedyPactometer(ArrayList<Partido> partidos, int mayoriaAbs, float umbralPacto){

        ArrayList<Partido> solucion = new ArrayList<>();
        Partido partidoPrincipal;
        Partido candidato;
        int diputados=0;

        partidoPrincipal=seleccionarMayor(partidos);
        partidos.remove(partidoPrincipal);
        diputados += partidoPrincipal.diputados;

        for(int i=0;i<solucion.size();i++){
            diputados += solucion.get(i).getDiputados();
        }

        while(!partidos.isEmpty() && (diputados < mayoriaAbs)){

            candidato = seleccionarCandidato(partidos,partidoPrincipal);
            partidos.remove(candidato);

            if(candidato.Perjuicio(partidoPrincipal)< umbralPacto){
                solucion.add(candidato);
            }
        }
        if(diputados > mayoriaAbs)
            return solucion;
        else
            return null;
    }

    public static Partido seleccionarMayor(ArrayList<Partido> partidos){

        Partido mayor= partidos.get(0);

        for (int i=1;i<partidos.size();i++){
            if(partidos.get(i).diputados > mayor.diputados)
                mayor =  partidos.get(i);
        }
        return mayor;
    }

    public static Partido seleccionarCandidato(ArrayList<Partido> partidos,Partido partidoPrincipal){

        Partido mejor = partidos.get(0);

        for (int i=1;i<partidos.size();i++){
            if(partidos.get(i).Perjuicio(partidoPrincipal) < mejor.Perjuicio(partidoPrincipal))
                mejor=partidos.get(i);
        }
        return mejor;
    }
}
