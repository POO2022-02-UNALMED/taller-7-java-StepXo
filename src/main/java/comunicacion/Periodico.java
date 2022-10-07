package comunicacion;

public class Periodico extends  Escrito{
    private String fecha;

    String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;

        this. interpretacion = interpretacion;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return this.getPaginas()*10*palabrasPagina;
    }

    @Override
    public String interpretacion() {
        return getInterpretacion();
    }

    @Override
    public String toString() {
        return  super.getOrigen()+"\n"+
                super.getTitulo()+"\n"+
                super.getAutor()+"\n"+
                super.getPaginas()+"\n"+
                getFecha()+"\n"+
                getPrimicia();
    }

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}

    public String getPrimicia() {return primicia;}
    public void setPrimicia(String primicia) {this.primicia = primicia;}

    public String getInterpretacion() {return interpretacion;}
    public void setInterpretacion(String interpretacion) {this.interpretacion = interpretacion;}
}
