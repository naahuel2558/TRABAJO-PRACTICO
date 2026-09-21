public class CalculadoraRacional implements Racional{
    private int numerador;
    private int denominador;

   public CalculadoraRacional(int numerador, int denominador){
    this.denominador = denominador;
    this.numerador = numerador;
    }

    /**
     * Operacion para suma racionales
     * Suma a la instancia actual el racional r.
     */


    public void suma(Racional r){
        //a/b + c/d ---> (a*d + b*c) / (b*d)
        

        //
        int numeradorNuevo = (numerador * r.getDenominador()) + (denominador * r.getNumerador());
        int denominadorNuevo = denominador * r.getDenominador();
        

        int mcd = calcularMCD(numeradorNuevo, denominadorNuevo);
        numerador = numeradorNuevo / mcd;
        denominador = denominadorNuevo / mcd;
    }

    private int calcularMCD(int a, int b){
    int mcd = 0;

        while(b != 0){
            mcd = b;
            b = a % b; //Divide a entre b y guarda el resto en b, hasta que b sea 0.
            a = mcd;
        }
        return a;
    }

    /**
     * Operacion p
     * ara multiplicacion de racionales
     * Multiplica la instancia actual con el racional r.
     */
    public void mult(Racional r){
        // a * c / b * d

        int numeradorNuevo = numerador * r.getNumerador();
        int denominadorNuevo = denominador * r.getDenominador();

        numerador = numeradorNuevo;
        denominador = denominadorNuevo;
    }

    /**
     * Representa la resta unaria.
     * 
     * operacion para resta de racionales: A-B = A+B.neg()
     * 
     * Ej (2/4).neg() == -2/4
     * (-2/4).neg() == 2/4
     */
    public void neg(){

    }

    /**
     * Operacion para dividir racionales
     * Divide la instancia actual por el racional r
     * Ej: r1.div(r2) == r1/r2
     */
    public void div(Racional r){

    }

    /**
     * Invariante de representacion, chequea que el denominador sea diferente de 0
     */
    public boolean repOk(){
        return true;
    }

    /**
     * Retorna una representacion del racional de la forma 
     * "numerador/denominador"
     */
    public String toString(){
        return toString();
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }


}
