/**
 * Un videoclub dispone de una serie de películas que pueden estar en DVD (con capacidad en Gb.) 
 * o en VHS (una sola cinta por película y con cierto tipo de cinta magnetica). De las películas 
 * interesa guardar el título, el autor, el año de edición y el idioma (o los idiomas, en caso de DVD). 
 * El precio de alquiler de las películas varía en función del tipo de película. Las DVD siempre son 10% 
 * mas caras que las de VHS.

Note

Analice los tipos de relación de las siguientes posibles clases: Pelicula, Dvd, Vhs, Soporte, etc, y justifique su diseño.
Para probar el diseño jerarquico de clases, instancia en el clase de prueba Ejecutor (la-s clase-s respectiva-s), con datos aleatorios.
Los escenarios de prueba pueden darse para el alquiler de una o varias peliculas según la preferencia del usuario.

 * @author Daniel Irene
 */
import java.util.ArrayList;
public class Problema_2_Pelicula {
    public static void main(String[] args) {
        
    }
}

class SoportePelicula{
    public double precioAlq;}
class DVD extends SoportePelicula{
    public String idioma[];
    public ArrayList<Pelicula> pelicula;
    public void calcularPrecioAlq(){
        this.precioAlq += (this.precioAlq * 0.1);
    }}
class VHS extends SoportePelicula{
    public String idioma;
    public Pelicula pelicula;}
class Pelicula{}
