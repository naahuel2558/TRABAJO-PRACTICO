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
        NodoPila<T> nuevoNodo = new NodoPila<>(fin, elem, null);

        if(esVacia()){
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setNext(nuevoNodo);
            fin = nuevoNodo;
        }
    @Override
    public T desapilar() throws IllegalStateException {
        if (esVacia()) throw new IllegalStateException ("No puede estar vacia");

        T elem = fin.getItem();

        if (fin.getPrev() == null)
        {
            inicio = null;
            fin = null;
        } else {
            fin = fin.getPrev();
            fin.setNext(null);
        }

        return elem;

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
