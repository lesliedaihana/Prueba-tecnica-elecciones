package modelo;


public class Coordinador {
     private int IdCoordinador;
    private String NomCoor;
    private String DocCoor;
    private String EmailCoor;
    private String ContraCoor;

    public Coordinador(int IdCoordinador, String NomCoor, String DocCoor, String EmailCoor, String ContraCoor) {
        this.IdCoordinador = IdCoordinador;
        this.NomCoor = NomCoor;
        this.DocCoor = DocCoor;
        this.EmailCoor = EmailCoor;
        this.ContraCoor = ContraCoor;
    }
    public Coordinador( String EmailCoor, String ContraCoor) {
        
        this.EmailCoor = EmailCoor;
        this.ContraCoor = ContraCoor;
    }

    public Coordinador() {
    }

    public int getIdCoordinador() {
        return IdCoordinador;
    }

    public void setIdCoordinador(int IdCoordinador) {
        this.IdCoordinador = IdCoordinador;
    }

    public String getNomCoor() {
        return NomCoor;
    }

    public void setNomCoor(String NomCoor) {
        this.NomCoor = NomCoor;
    }

    public String getDocCoor() {
        return DocCoor;
    }

    public void setDocCoor(String DocCoor) {
        this.DocCoor = DocCoor;
    }

    public String getEmailCoor() {
        return EmailCoor;
    }

    public void setEmailCoor(String EmailCoor) {
        this.EmailCoor = EmailCoor;
    }

    public String getContraCoor() {
        return ContraCoor;
    }

    public void setContraCoor(String ContraCoor) {
        this.ContraCoor = ContraCoor;
    }
    
}
