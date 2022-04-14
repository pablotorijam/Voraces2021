public class Partido {

    String nombre;
    int diputados;
    int orientacion;
    public Partido(String nombre, int diputados, int orientacion){
        this.nombre = nombre;
        this.diputados = diputados;
        this.orientacion = orientacion;
    }

    float Perjuicio(Partido p2) {
        return (Math.abs(this.getOrientacion() - p2.getOrientacion()) / 9);
    }

    public int getDiputados() {
        return diputados;
    }

    public int getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(int orientacion) {
        this.orientacion = orientacion;
    }

    public void setDiputados(int escanyos) {
        this.diputados = escanyos;
    }
}
