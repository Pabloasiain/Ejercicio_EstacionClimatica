
/**
 * clase que define las temperaturas maximas y minimas de un dia
 * @author Pablo Asiain y Sergio Rueda
 *
 */
public class TempDia
 {
     protected String fecha;
     protected int a�o,mes,dia,tempmax,tempmin;
 /**
  *     
  * @param a�o 
  * @param mes
  * @param dia
  * @param tempmax
  * @param tempmin
  */
 public TempDia (int a�o, int mes, int dia, int tempmax, int tempmin){
    	this.dia=dia;
    	this.mes=mes;
    	this.a�o=a�o;
    	this.tempmax=0;
    	this.tempmin=0;
 
    }
/**
 * 
 * @return a�o escogido
 */
 
 public int getA�o() {
	return a�o; 
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
       String fecha= dia+"/"+mes+"/"+"a�o"+(media=(tempmax+tempmin)/2);
       return fecha;
    }
}
