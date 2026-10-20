package service;

// Eslabón 2: Verifica que no esté vacío (Longitud > 0)
class ValidadorNoVacio extends Validador {
    @Override
    public boolean procesar( String texto ) {
        if( texto.isEmpty() ) {
            System.out.println( "Fallo: El texto tiene longitud cero (isEmpty)." );
            return false;
        }

        return verificarSiguiente( texto );
    }
}
