package Practice.Methods;

import java.util.Random;

public class Constructorex {
  private String nombre = "Nadie";
  private int edad;
  private String dni = "000000";
  private char sexo = 'H';
  private float peso;
  private  float altura;

  public Constructorex() {

  }

  public Constructorex(String nombre, int edad, String dni, char sexo, float peso, float altura){
      this.nombre = nombre;
      this.edad = edad;
      this.sexo = sexo;
      this.peso = peso;
      this.altura = altura;
  }
  public Constructorex(String patatanombre, int edad, char sexo) {
      this.nombre = patatanombre;
      this.edad = edad;
      this.sexo = sexo;


  }


    public String getNombre(String nombre) {
        return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public int getEdad(){
      return edad;
    }

    public void setEdad(){
      this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(){
      this.dni = dni;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(){
      this.peso = peso;
    }

    public float setAltura(){
      return altura;
    }

    public void getAltura(){
      this.altura = altura;
    }

    public int calcularIMC() {
        float imc = peso / (altura * altura);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private void comprobarSexo(char sexo) {
      char ret = 'H';
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            //throw new IllegalArgumentException("Error");
        }
    }
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "DNI: " + dni + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + " kg\n" +
                "Altura: " + altura + " m";
    }

    public int[] generaDNI() {
        int longitud = 8;

        Random random = new Random();

        int[] numerosAleatorios = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }
        return numerosAleatorios;
    }






    public static void main(String[] args) {
        Constructorex persona1 = new Constructorex("tomatejuan", 30, "123456", 'H', 70.5f, 1.75f);
        int resultadoIMC = persona1.calcularIMC();

        if (resultadoIMC == -1) {
            System.out.println("La persona esta por debajo de su peso ideal.");
        } else if (resultadoIMC == 0) {
            System.out.println("La persona esta en su peso ideal.");
        } else {
            System.out.println("la persona tiene sobrepeso.");
        }

        if ( persona1.esMayorDeEdad()){
            System.out.println(persona1.esMayorDeEdad());
        }

        System.out.println("Sexo : " + persona1.sexo);
        System.out.println(persona1.toString());
        System.out.println(persona1.generaDNI());

        /*if (persona1.esMayorDeEdad() == true){

            System.out.println("la persona es mayor de edad");
        }else{
            System.out.println("la persona no es mayor de edad");
        }*/

    }
}
