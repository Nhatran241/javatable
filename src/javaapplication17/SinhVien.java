/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author User
 */
public class SinhVien {
    private String Ten;
    private String Mssv;
    private String HoLot;
    private String Diachi;
    private String Sdt;
    private String Ngaysinh;

    public SinhVien(String Ten, String Mssv, String HoLot, String Diachi, String Sdt, String Ngaysinh) {
        this.Ten = Ten;
        this.Mssv = Mssv;
        this.HoLot = HoLot;
        this.Diachi = Diachi;
        this.Sdt = Sdt;
        this.Ngaysinh = Ngaysinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getMssv() {
        return Mssv;
    }

    public void setMssv(String Mssv) {
        this.Mssv = Mssv;
    }

    public String getHoLot() {
        return HoLot;
    }

    public void setHoLot(String HoLot) {
        this.HoLot = HoLot;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }
    
    
}
