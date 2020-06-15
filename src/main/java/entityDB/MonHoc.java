package entityDB;

public class MonHoc {
    private int maMH;
    private String tenMH;
    private int soTC;

    public MonHoc(int maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public int getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    @Override
    public String toString() {
        return "Mã môn học: " + maMH + ", Tên môn học: " + tenMH + ", Tín chỉ: " + soTC;
    }
    
}
