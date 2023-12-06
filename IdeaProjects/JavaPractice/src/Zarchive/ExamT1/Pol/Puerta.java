package Practice.Hyperskill.Methods.JavaPractice.src.Zarchive.ExamT1.Pol;


interface Puerta {
    void abrir();
    void cerrar();
}


interface PuertaBloqueable extends Puerta {
    void bloquea();
    void desbloquea();
}


interface Alarma6 {
    boolean alarmaActivada();
    void activarAlarma();
    void desactivarAlarma();

}


class ComponenteDeCoche {
    protected String descripcion;
    protected double peso;
    protected double coste;

    public ComponenteDeCoche(String descripcion, double peso, double coste) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.coste = coste;
    }

    public void mostrarAtributos() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Coste: $" + coste);
    }
}


class PuertaCoche extends ComponenteDeCoche implements Alarma6, PuertaBloqueable {
    private boolean estaBloqueada;

    public PuertaCoche(String descripcion, double peso, double coste) {
        super(descripcion, peso, coste);
        this.estaBloqueada = false;
    }

    @Override
    public void abrir() {
        if (!estaBloqueada) {
            System.out.println("La puerta se abre.");
        } else {
            System.out.println("La puerta está bloqueada.");
        }
    }

    @Override
    public void cerrar() {
        System.out.println("La puerta se cierra.");
    }

    @Override
    public void bloquea() {
        estaBloqueada = true;
        System.out.println("La puerta se ha bloqueado.");
    }

    @Override
    public void desbloquea() {
        estaBloqueada = false;
        System.out.println("La puerta se ha desbloqueado.");
    }

    @Override
    public boolean alarmaActivada() {
        // Aquí se debería implementar la lógica para verificar si la alarma está activada.
        // Simulamos que la alarma está activada.
        return true;
    }

    @Override
    public void activarAlarma()
    {
        System.out.println("La alarma se ha activado.");
    }

    @Override
    public void desactivarAlarma()
    {
        System.out.println("La alarma se ha desactivado.");
    }
}



