package service;

// Eslabón 3: Verifica que no sean solo espacios en blanco
class ValidadorNoBlanco extends Validador {
    @Override
    public boolean procesar( String texto ) {
        if( texto.isBlank() ) {
            System.out.println("Fallo: El texto solo contiene espacios (isBlank).");
            return false;
        }

        return verificarSiguiente( texto );
    }
}
