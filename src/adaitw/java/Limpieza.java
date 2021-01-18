package adaitw.java;

public class Limpieza {
    private String nombre;
    private Integer unidades;

    public Limpieza(String nombre, Integer unidades) {
        this.nombre = nombre;
        this.unidades = unidades;
    }

    //Genero Setter para unidades que puede ser modificado
    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }
    //Genero Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getUnidades() {
        return unidades;
    }

    @Override
    public String toString() {
        return "Limpieza{" +
                "nombre='" + nombre + '\'' +
                ", unidades=" + unidades +
                '}';
    }
}


