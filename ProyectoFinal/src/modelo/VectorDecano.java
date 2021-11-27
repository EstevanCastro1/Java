package modelo;

public class VectorDecano {
    private int idcc;
    private String name;
    private String LastName;
    private String phone;

    public VectorDecano() {
        this.idcc = 0;
        this.name = "";
        this.LastName = "";
        this.phone = "";
    }
    
    public int getIdcc() {
        return idcc;
    }

    public void setIdcc(int idcc) {
        this.idcc = idcc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}