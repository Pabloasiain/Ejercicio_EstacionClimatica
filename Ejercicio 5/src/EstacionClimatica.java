import java.util.Scanner;

public class EstacionClimatica
{

/**
 * definimos las variables de la clase
 */
    private String nombre;
    private int año;
    private TempHumDia mediciones[];  // Tabla de mediciones
    private int nummediciones;      // Número de mediciones almacenadas

    /**
     * Constructor for objects of class EstacionClimatica
     */
    public EstacionClimatica()
    {
         this.nombre = "";
         this.año = 2000;  
         mediciones = new TempHumDia[366];  // Por si el año es bisiesto.  
         nummediciones = 0;
    }
    /**
     * 
     * @param nombre 
     * @param año definimos el año al que pertenece
     */
    public EstacionClimatica( String nombre, int año)

    {
         this(); // Llamo al constructor por defecto
         this.nombre = nombre;
         this.año = año;
         
    }
/**
 * 
 * @param media media de las temperaturas
 * @return true si se completa la opercaion
 */
    public boolean addDia ( TempHumDia media){
    	if(this.año == media.getAño()) {
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
        if (this.año !=media.año) {
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
     * Método auxiliar que me indica si una fecha es correcta
     * @param dia
     * @param mes
     * @param año
     * @return
     */
    static boolean fechaOK ( int dia, int mes, int año){
        return dia>0 && dia<31 && mes>0 && mes<12 && año>1999 && año<2018;  
    }
    
    /**
     * 
     * @return
     */
    static TempHumDia leerMedida () {

         Scanner leer = new Scanner(System.in);
         int dia,mes,año, tempmax, tempmin, hummax, hummin;
         TempHumDia  medicion = null;
         
        boolean error = true;
        do {
        System.out.println("Día:"); dia = leer.nextInt();
        System.out.println("Mes:");  mes = leer.nextInt();
        System.out.println("Año:");  año = leer.nextInt();
  
        if ( fechaOK( dia,mes,año) ) {
             System.out.println ( " Tº Máxima:"); tempmax = leer.nextInt();
             System.out.println ( " Tº Mínima:"); tempmin = leer.nextInt();
             System.out.println ( " Hº Máxima:"); hummax = leer.nextInt();
             System.out.println ( " Hº Mínima:"); hummin = leer.nextInt();
             medicion = new TempHumDia ( dia,mes,año, tempmax, tempmin, hummax, hummin);
             error = false;
            }
        else
        {
            System.out.println(" Fecha érronea");
        }
    
    } while (  error);
    
    
    return medicion;
}
}
