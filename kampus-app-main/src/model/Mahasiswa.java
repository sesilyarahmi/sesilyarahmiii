package model;

public class Mahasiswa {
    private String nim;
    public String getNim() {
        return nim;
    }

    private String nama;
    public String getNama() {
        return nama;
    }

    public String id;
    public String getId() {
        return id;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(String nim, String nama, String id) {
        this.nim = nim;
        this.nama = nama;
        this.id = id;
    }
}
