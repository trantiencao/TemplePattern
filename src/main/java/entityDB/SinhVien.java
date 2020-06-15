package entityDB;

import java.util.Calendar;

public class SinhVien {
    private int maSV;
    private String tenSV;
    private Calendar ngaySinh;
    private String queQuan;

    public SinhVien(int maSV, String tenSV, Calendar ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public Calendar getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + maSV + ", Tên sinh viên: " + tenSV + ", Ngày sinh: " + ngaySinh.get(Calendar.DAY_OF_MONTH)
                + "/" + ngaySinh.get(Calendar.MONTH) + "/" +ngaySinh.get(Calendar.YEAR) + ", Quê quán: " + queQuan;
    }
  
    
    
}
