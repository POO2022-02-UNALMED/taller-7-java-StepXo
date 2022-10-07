package comunicacion;


public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen,String[] letras, String interpretacion) {
        super(origen);
        Alfabeto.letras =letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){

        return letras.length;
    }

    @Override
    public String interpretacion() {
        return getInterpretacion();
    }

    @Override
    public String toString() {
        String alpahbeto = null;
        for (int i=0;i < letras.length;i++){
            if (i < letras.length-1){
                alpahbeto += letras[i]+", ";
            }
            else {alpahbeto += letras[i];}
        }
        return alpahbeto;
    }

    //getters y setters
    public static String[] getLetras() {return letras;}
    public static void setLetras(String[] letras) {Alfabeto.letras = letras;}

    public String getInterpretacion() {return interpretacion;}
    public void setInterpretacion(String interpretacion) {this.interpretacion = interpretacion;}
}
