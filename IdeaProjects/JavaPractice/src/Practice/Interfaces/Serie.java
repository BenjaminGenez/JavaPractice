package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Interfaces;

public class Serie implements Entregable {
    private String titulo;
    private int numeroTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    public Serie() {}




    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }


    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }





    @Override
    public int compareTo(Object a) {
        if(a instanceof Serie) {
            return Integer.compare();
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {

    }
}
