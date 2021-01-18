package adaitw.java;

//Declaro los atributos (de los productos) del Almacen
public class Almacen {
    private String nombre;
    private Integer unidades;
    private Integer vencimientoMes;
    private Integer vencimientoAnio;

    //Genero constructor
    public Almacen(String nombre,  Integer unidades, Integer vencimientoMes, Integer vencimientoAnio ) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.vencimientoMes = vencimientoMes;
        this.vencimientoAnio = vencimientoAnio;
    }

    //Genero Setter para unidades que puede ser modificado
    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    //Genero los Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public Integer getVencimientoMes() {
        return vencimientoMes;
    }

    public Integer getVencimientoAnio() {
        return vencimientoMes;
    }

    public String stockTotal(){
        return nombre+" "+unidades+" "+vencimientoMes+" "+vencimientoAnio; }

    @Override
    public String toString() {
        return "Almacen{" +
                "nombre='" + nombre + '\'' +
                ", unidades=" + unidades +
                ", vencimientoMes=" + vencimientoMes +
                ", vencimientoAnio=" + vencimientoAnio +
                '}';
    }
}
