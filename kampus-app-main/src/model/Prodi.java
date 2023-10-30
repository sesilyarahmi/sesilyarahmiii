package model;

public class Prodi{
    public String id;
    public String getId() {
        return id;
    }

    private String Nama;
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Prodi (String id, String Nama){
        this.id = id;
        this.Nama = Nama;
    }

}