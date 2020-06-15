package entityDB;

public class SinhVienDB extends EntityDB<SinhVien> {
    protected SinhVien findByID(int id) {
        for (SinhVien sv : list) {
            if(sv.getMaSV()== id)
                return sv;
        }
        return null;
    }

    protected int getKey(SinhVien t) {
        return t.getMaSV();
    }
}



