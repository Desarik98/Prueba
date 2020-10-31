package Dominio;

public class IEMOISExcepcion extends Exception {
    public static String SIN_NOMBRE = "No se le puso el nombre al curso";
    public static String YA_EXISTE = "El curso ya existe";
    public static String NO_EXISTE_PALABRA = "No existe la palabra";
    public IEMOISExcepcion(String message) {
        super(message);
    }
}
