package service;

// Eslabón 1: Verifica que no sea nulo
class ValidadorNoNulo extends Validador {
    @Override
    public boolean procesar( String texto ) {
        if( null == texto ) {
            System.out.println( "Fallo: El texto es nulo." );
            return false;
        }

        return verificarSiguiente( texto );
    }
}
