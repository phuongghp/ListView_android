package com.example.listview;

public class HinhAnh {
    private String ten;
    private int hinh;

    public String getTen() {
        return ten;
    }

    public int getHinh() {
        return hinh;
    }

    public HinhAnh(String ten, int hinh) {
        this.ten = ten;
        this.hinh = hinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
