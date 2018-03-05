/**
 * Clase que almacena la cantidad de humedad de un dia
 * @author Pablo Asiain y Sergio Rueda
 *
 */
public class TempHumDia extends TempDia
 {
     protected String Humedad;
     protected int hum_max, hum_min;
     public TempHumDia(int hum_max, int hum_min, int dia, int mes, int año, int tempmax, int tempmin){
       super(dia,mes,año,tempmax,tempmin);
       this.hum_max=hum_max;
       this.hum_min=hum_min;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
       * @return     the sum of x and y 
     */
    public String toString(int mediaHum)
    {
       String humedad= hum_max+"-"+hum_min+"-"+(mediaHum=(hum_max+hum_min)/2);
       return humedad;
    }
}
