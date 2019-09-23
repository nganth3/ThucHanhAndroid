package com.example.thuchanhandroid;

public class Girl {
    private int HinhAnh;
    private String HoTen;
    private String Mota;

    public Girl(int hinhAnh, String hoTen, String mota) {
        HinhAnh = hinhAnh;
        HoTen = hoTen;
        Mota = mota;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }
}
