package advance.Exeception;

public class caracterEn2 {

    public static void main(String[] args) {
        try {
            String cadena = "Hola, patata";
            int posicion = 7;
            char resultado = caracterEn(cadena, posicion);
            System.out.println("l caracter en la posición " + posicion + " es: " + resultado);
        } catch (Exception e) {
            System.out.println("excepcion: " + e.getMessage());
        }
    }

    public static char caracterEn(String cadena, int posicion) throws Exception {
        int longitud = cadena.length();

        if (posicion >= 0 && posicion < longitud) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("La posición debe estar entre 0 y " + (longitud));
        }
    }
}
