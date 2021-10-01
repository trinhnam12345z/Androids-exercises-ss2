package com.trinhnam12345z.bt2;

public class TraiCay {
    public String Ten;
    public String Mota;
    public int HinhAnh;

    public TraiCay(String ten, String mota, int hinhAnh) {
        Ten = ten;
        Mota = mota;
        HinhAnh = hinhAnh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }
}
