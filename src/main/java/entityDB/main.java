package entityDB;

import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        EntityDB svdb = new SinhVienDB();
        svdb.add(new SinhVien(59130151, "Trần Tiến Cao", new GregorianCalendar(1999, 8, 14), "Phú Yên"));
        svdb.add(new SinhVien(00000000, "Trần Dần", new GregorianCalendar(1945, 4, 30), "Nam Kỳ"));
        svdb.add(new SinhVien(00000001, "Hai Dụ", new GregorianCalendar(1945, 4, 30), "Bắc Kỳ"));
        System.out.println(svdb.toString());

        svdb.delete(new SinhVien(00000000, "Trần Dần", new GregorianCalendar(1945, 4, 30), "Nam Kỳ"));
        System.out.println(svdb.toString());

        svdb.deleteByKey(00000001);
        System.out.println(svdb.toString());

        svdb.update(new SinhVien(0000000, "Công Tằng Tôn Nữ", new GregorianCalendar(1999, 1, 1), "Thăng Long"));
        System.out.println(svdb.toString());

        EntityDB mhdb = new MonHocDB();
    }
}
