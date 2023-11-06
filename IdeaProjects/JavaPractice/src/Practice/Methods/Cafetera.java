package Practice.Methods;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;


    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        if (cantidadActual >= 0 && cantidadActual <= capacidadMaxima) {
            this.cantidadActual = cantidadActual;
        } else if (cantidadActual < 0) {
            this.cantidadActual = 0;
        } else {
            this.cantidadActual = capacidadMaxima;
        }
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int cantidadTaza) {
        if (cantidadActual >= cantidadTaza) {
            cantidadActual -= cantidadTaza;
            System.out.println("Se ha servido una taza de " + cantidadTaza + "  de cafe.");
        } else {
            System.out.println("no hay suficiente cafe");
            vaciarCafetera();
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera ha sido vaciada.");
    }

    public void agregarCafe(int cantidadAgregar) {
        if (cantidadActual + cantidadAgregar <= capacidadMaxima) {
            cantidadActual += cantidadAgregar;
            System.out.println("Se han agregado " + cantidadAgregar + " c.c. de cafe a la cafetera.");
        } else {
            System.out.println("No se puede agregar mas cafe. La cafetera esta llena.");
        }
    }

    public static void main(String[] args) {

        Cafetera cafetera1 = new Cafetera();
        Cafetera cafetera2 = new Cafetera(1500);
        Cafetera cafetera3 = new Cafetera(2000, 1800);

        cafetera1.servirTaza(200);
        cafetera2.llenarCafetera();
        cafetera3.agregarCafe(300);
    }
}
