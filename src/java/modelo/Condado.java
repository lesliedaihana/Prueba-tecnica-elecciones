
package modelo;


public class Condado {
   private String CodEstado;
    private String CodCondado;
    private String NomCondado;
    private String Poblacion;
    private String Area;

    public Condado(String CodEstado, String CodCondado, String NomCondado, String Poblacion, String Area) {
        this.CodEstado = CodEstado;
        this.CodCondado = CodCondado;
        this.NomCondado = NomCondado;
        this.Poblacion = Poblacion;
        this.Area = Area;
    }

    public Condado() {
    }

    public String getCodEstado() {
        return CodEstado;
    }

    public void setCodEstado(String CodEstado) {
        this.CodEstado = CodEstado;
    }

    public String getCodCondado() {
        return CodCondado;
    }

    public void setCodCondado(String CodCondado) {
        this.CodCondado = CodCondado;
    }

    public String getNomCondado() {
        return NomCondado;
    }

    public void setNomCondado(String NomCondado) {
        this.NomCondado = NomCondado;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
   
    
    
}
