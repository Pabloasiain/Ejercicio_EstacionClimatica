import java.util.Scanner;

public class EstacionClimatica
{

/**
 * definimos las variables de la clase
 */
    private String nombre;
    private int a�o;
    private TempHumDia mediciones[];  // Tabla de mediciones
    private int nummediciones;      // N�mero de mediciones almacenadas

    /**
     * Constructor for objects of class EstacionClimatica
     */
    public EstacionClimatica()
    {
         this.nombre = "";
         this.a�o = 2000;  
         mediciones = new TempHumDia[366];  // Por si el a�o es bisiesto.  
         nummediciones = 0;
    }
    /**
     * 
     * @param nombre 
     * @param a�o definimos el a�o al que pertenece
     */
    public EstacionClimatica( String nombre, int a�o)

    {
         this(); // Llamo al constructor por defecto
         this.nombre = nombre;
         this.a�o = a�o;
         
    }
/**
 * 
 * @param media media de las temperaturas
 * @return true si se completa la opercaion
 */
    public boolean addDia ( TempHumDia media){
    	if(this.a�o == media.getA�o()) {
    		mediciones[nummediciones]=media;
    		nummediciones++;
    	}
        return true; // COMPLETAR
    }
    /**
     * 
     * @param media
     * @return borra los datos si el dia seleccionado esta completo
     */
    public boolean delDia ( TempHumDia media){
        if (this.a�o !=media.a�o) {
        	System.out.println("error");
        	return false;
        }
        for (int i = 0; i < this.mediciones.length; i++) {
        	if(mediciones[i]==media) {
        		mediciones[i]=null;
        		nummediciones--;
        	}
        }
    	return true;  // COMPLETAR
    }
    /**
     * lista los dias y los datos que han sido introducidos
     */
    public void listarDias(){
     for(int i = 0; i<this.mediciones.length;i++) {
    	 if (this.mediciones[i] !=null) {
    		 System.out.println(this.mediciones[i].toString());
    	 }
     }
    }
    
    /**
     * M�todo auxiliar que me indica si una fecha es correcta
     * @param dia
     * @param mes
     * @param a�o
     * @return
     */
    static boolean fechaOK ( int dia, int mes, int a�o){
        return dia>0 && dia<31 && mes>0 && mes<12 && a�o>1999 && a�o<2018;  
    }
    
    /**
     * 
     * @return
     */
    static TempHumDia leerMedida () {

         Scanner leer = new Scanner(System.in);
         int dia,mes,a�o, tempmax, tempmin, hummax, hummin;
         TempHumDia  medicion = null;
         
        boolean error = true;
        do {
        System.out.println("D�a:"); dia = leer.nextInt();
        System.out.println("Mes:");  mes = leer.nextInt();
        System.out.println("A�o:");  a�o = leer.nextInt();
  
        if ( fechaOK( dia,mes,a�o) ) {
             System.out.println ( " T� M�xima:"); tempmax = leer.nextInt();
             System.out.println ( " T� M�nima:"); tempmin = leer.nextInt();
             System.out.println ( " H� M�xima:"); hummax = leer.nextInt();
             System.out.println ( " H� M�nima:"); hummin = leer.nextInt();
             medicion = new TempHumDia ( dia,mes,a�o, tempmax, tempmin, hummax, hummin);
             error = false;
            }
        else
        {
            System.out.println(" Fecha �rronea");
        }
    
    } while (  error);
    
    
    return medicion;
}
}
