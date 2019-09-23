package com.example.thuchanhandroid;

public class SinhVien {
    private String HoTen;
    private String DiaChi;
    private int NamSinh;

    public SinhVien(String hoTen, String diaChi, int namSinh) {
        HoTen = hoTen;
        DiaChi = diaChi;
        NamSinh = namSinh;
    }


    public void setNamSinh(int ns){
        NamSinh = ns;
    }

    public  int getNamSinh(){
        return NamSinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
}
