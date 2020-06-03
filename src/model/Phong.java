/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Phong {
    private String maPhong;
    private String tenp;
    private String dvt;
    private String gia;
    private String anh;

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenp() {
        return tenp;
    }

    public void setTenp(String tenp) {
        this.tenp = tenp;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "Phong{" + "maPhong=" + maPhong + ", tenp=" + tenp + ", dvt=" + dvt + ", gia=" + gia + ", anh=" + anh + '}';
    }
    
}
