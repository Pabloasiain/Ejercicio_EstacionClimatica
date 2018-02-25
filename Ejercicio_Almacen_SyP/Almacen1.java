/**
 * Implementar un almacen de enteros mediante una tabla de huecos
 * se supone que no puede contener el valor 0 ya que indica posiciones libre.
 * @author Pablo Asiain
 */
public class Almacen1 {

    static private final int LIBRE = 0;
    /**
     * Array con los valores almacenados
     */
    private int tvalores[];
    private int valoresAlmacenados = 0;
    
    /**
     * Constructores sin parÃ¡metros creo una tabla de 10 elementos 
     */
    public Almacen1(){
    	/**
    	 * Llamo al constructor con parametros
    	 */
    	this(10);  
    }

    /**
     * Constructor donde se fija tamaño maximo del Almacen
     * @param tamaño
     */
    public Almacen1( int tamaño){
        tvalores = new int [tamaño];
        init();
    }
    
    /**
     * Pone todas las posiciones a LIBRES
     */
    public void init (){
        for (int i = 0; i < tvalores.length; i++) {
            tvalores[i] = Almacen1.LIBRE;
        }
        valoresAlmacenados = 0;
    }
    
    /**
     * Muestra una cadena con los valores de la tabla
     */
    public String toString (){
        return "tvalores[]";
    }
    
    /**
     * @return Devuelve el numeros de posiciones libres
     */
    public int numPosicionesLibres(){
         return this.tvalores.length-this.valoresAlmacenados;
    }

    /**
     * @return Devuelve el numero de posiones ocupadas
     */
    public int numPosicionesOcupadas(){
        return this.valoresAlmacenados;
    }
    
    /**
     * @param num
     * @return Devuelve verdadero o falso si está almacenado el valor en la tabla
     */
    public boolean estaValor (int num){
        for (int i = 0; i < tvalores.length; i++) {
            if (tvalores[i] == num) {
                return true;
            } else {
                break;
            }
        }
        return false;
    }
    
    /**
     * @param num
     * @return Devuelve verdadero o falso si esta bla, devuelve false sin no puede almacenarlo
     */
    public boolean ponValor (int num){
        for (int i = 0; i < this.tvalores.length;i++){
            if (this.tvalores[i]==LIBRE){
              this.tvalores[i]=num;
              this.valoresAlmacenados++;
              return true;
            }
        }
        return false;
      }
    
    
    /**
     * @param num
     * @return Elimina el elemento de la tabla, si no esta devuelve false
     */
    
    public boolean sacarValor (int num){  
        for (int i = 0; i < this.tvalores.length; i++){
            if (this.tvalores[i]==num){
                this.tvalores[i]=LIBRE;
                this.valoresAlmacenados--;
        }
       }
       return false;
     }
    
      /**
       * @return Indica si el almacen esta lleno
       */
    public boolean estaLleno (){
      for (int i = 0; i < this.tvalores.length; i++){
       if (this.tvalores[i]!=LIBRE){
         return true; 
       }
     }   
     return false;
    }
}

