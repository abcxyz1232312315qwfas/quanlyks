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
public class Account {
    private String tenTK;
    private String maNV;
    private String password;
    private String maQuyen;
    
    public Account() {
    }

    public Account(String tenTK, String maNV, String password, String maQuyen) {
        this.tenTK = tenTK;
        this.maNV = maNV;
        this.password = password;
        this.maQuyen = maQuyen;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    @Override
    public String toString() {
        return "Account{" + "tenTK=" + tenTK + ", maNV=" + maNV + ", password=" + password + ", maQuyen=" + maQuyen + '}';
    }
    
    
}
