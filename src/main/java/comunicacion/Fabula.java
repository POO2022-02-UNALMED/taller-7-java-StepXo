package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;


    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza,String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return this.getPaginas()*palabrasPagina;
    }

    @Override
    public String interpretacion() {
        return getInterpretacion();
    }

    @Override
    public String toString(){
        return  super.getOrigen()+"\n"+
                super.getTitulo()+"\n"+
                super.getAutor()+"\n"+
                super.getPaginas()+"\n"+
                getEnsenanza();
    }

    //getters y setters
    public String getInterpretacion() {return interpretacion;}
    public void setInterpretacion(String interpretacion) {this.interpretacion = interpretacion;}

    public String getEnsenanza(){return ensenanza;}
    public void setEnsenanza(String ensenanza) {this.ensenanza = ensenanza;}
}
