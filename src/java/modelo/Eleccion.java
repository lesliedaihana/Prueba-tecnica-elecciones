
package modelo;


public class Eleccion {
    private int idEleccion;
    private int Año;
    private int PartDemocrataVot;
    private int PartRepublicanoVot;
    private int OtrosVot;
    private String CodCondado;
    private int IdCoordinador;

    public Eleccion() {
    }

    public Eleccion(int idEleccion, int Año, int PartDemocrataVot, int PartRepublicanoVot, int OtrosVot, String CodCondado, int IdCoordinador) {
        this.idEleccion = idEleccion;
        this.Año = Año;
        this.PartDemocrataVot = PartDemocrataVot;
        this.PartRepublicanoVot = PartRepublicanoVot;
        this.OtrosVot = OtrosVot;
        this.CodCondado = CodCondado;
        this.IdCoordinador = IdCoordinador;
    }

    public Eleccion(int Año, int PartDemocrataVot, int PartRepublicanoVot, int OtrosVot, String CodCondado, int IdCoordinador) {
        this.Año = Año;
        this.PartDemocrataVot = PartDemocrataVot;
        this.PartRepublicanoVot = PartRepublicanoVot;
        this.OtrosVot = OtrosVot;
        this.CodCondado = CodCondado;
        this.IdCoordinador = IdCoordinador;
    }

    public int getIdEleccion() {
        return idEleccion;
    }

    public void setIdEleccion(int idEleccion) {
        this.idEleccion = idEleccion;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public int getPartDemocrataVot() {
        return PartDemocrataVot;
    }

    public void setPartDemocrataVot(int PartDemocrataVot) {
        this.PartDemocrataVot = PartDemocrataVot;
    }

    public int getPartRepublicanoVot() {
        return PartRepublicanoVot;
    }

    public void setPartRepublicanoVot(int PartRepublicanoVot) {
        this.PartRepublicanoVot = PartRepublicanoVot;
    }

    public int getOtrosVot() {
        return OtrosVot;
    }

    public void setOtrosVot(int OtrosVot) {
        this.OtrosVot = OtrosVot;
    }

    public String getCodCondado() {
        return CodCondado;
    }

    public void setCodCondado(String CodCondado) {
        this.CodCondado = CodCondado;
    }

    public int getIdCoordinador() {
        return IdCoordinador;
    }

    public void setIdCoordinador(int IdCoordinador) {
        this.IdCoordinador = IdCoordinador;
    }
    
}
