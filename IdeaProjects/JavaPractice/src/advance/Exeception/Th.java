package advance.Exeception;

public static char caracterEn(String cadena, int posicion) {
    if (posicion < 0 || posicion >= cadena.length()) {
        return '\u0000';
    }
    return cadena.charAt(posición);
}
