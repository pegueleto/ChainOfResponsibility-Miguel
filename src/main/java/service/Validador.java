package service;

abstract class Validador {

    protected Validador siguiente;

    public void setSiguiente( Validador siguiente ) {
        this.siguiente = siguiente;
    }

    public abstract boolean procesar( String texto );

    // Método auxiliar para avanzar al siguiente eslabón
    protected boolean verificarSiguiente( String texto ) {
        if( null == siguiente )
            return true; // Llegamos al final de la cadena con éxito

        return siguiente.procesar( texto );
    }
}
