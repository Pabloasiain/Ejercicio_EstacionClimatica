
/**
 * clase que define las temperaturas maximas y minimas de un dia
 * @author Pablo Asiain y Sergio Rueda
 *
 */
public class TempDia
 {
     protected String fecha;
     protected int año,mes,dia,tempmax,tempmin;
 /**
  *     
  * @param año 
  * @param mes
  * @param dia
  * @param tempmax
  * @param tempmin
  */
 public TempDia (int año, int mes, int dia, int tempmax, int tempmin){
    	this.dia=dia;
    	this.mes=mes;
    	this.año=año;
    	this.tempmax=0;
    	this.tempmin=0;
 
    }
/**
 * 
 * @return año escogido
 */
 
 public int getAño() {
	return año; 
 }
 /**
  * 
  * @return escogido
  */
 public int getDia() {
	 return dia;
 }
 /**
  * 
  * @param media
  * @return string que contiene la fecha y la media de ambas temperaturas
  */
    public String toString(int media)
    {
       String fecha= dia+"/"+mes+"/"+"año"+(media=(tempmax+tempmin)/2);
       return fecha;
    }
}
