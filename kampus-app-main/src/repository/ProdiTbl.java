package repository;

import model.Prodi;

public class ProdiTbl {
    private Database db;
    public ProdiTbl(Database db) {
        this.db = db;
    }

    public void create(Prodi prodi) {
        db.tables.dataProdi.add(prodi);
        db.commit();
    }

    public Prodi getProdibyId(String id) {
        return db.getProdiById(id);
    }

}
