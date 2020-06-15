package entityDB;

public class MonHocDB extends EntityDB<MonHoc>{
    protected MonHoc findByID(int id) {
        for (MonHoc mh : list) {
            if(mh.getMaMH()== id)
                return mh;
        }
        return null;
    }

    protected int getKey(MonHoc t) {
        return t.getMaMH();
    }
}