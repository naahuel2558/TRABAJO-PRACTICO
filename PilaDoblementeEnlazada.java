public class PilaDoblementeEnlazada<T> implements Pila<T> {

    private NodoPila<T> inicio;
    private NodoPila<T> fin;

    PilaDoblementeEnlazada() {
        this.inicio = null;
        this.fin = null;
    }

    @Override
    public boolean esVacia() {
        return this.inicio == null && this.fin == null;
    }

    @Override
    public T tope() throws IllegalStateException {
        if(esVacia()){
            throw new IllegalStateException("La pila esta vacia");
        }

        T elem = fin.getItem();
        
        return elem;
        
    }

    @Override
    public void apilar(T elem) throws IllegalStateException {
        // TODO Implementar este método y eliminar la línea siguiente
        throw new UnsupportedOperationException("Unimplemented method 'apilar'");
    }

    @Override
    public T desapilar() throws IllegalStateException {
        // TODO Implementar este método y eliminar la línea siguiente
        throw new UnsupportedOperationException("Unimplemented method 'desapilar'");
    }

    @Override
    public void imprimir() {
        if(esVacia()){
            System.out.println("No se pueden mostrar los elementos de la lista ya que es vacia");
        }else{
            NodoPila<T> nodoActual = fin;

            while (nodoActual != null) {
                System.out.println(nodoActual.getItem());
                nodoActual = nodoActual.getPrev();
            }
        }
    }
}