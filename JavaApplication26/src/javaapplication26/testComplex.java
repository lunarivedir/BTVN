/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author Administrator
 */
public class testComplex {

    public static void main(String[] args) {
        Complex sp0 = new Complex();
        sp0.ketqua();
        Complex sp1 = new Complex(3);
        sp1.ketqua();
        Complex sp2 = new Complex(0, 4);
        sp2.ketqua();
        Complex sp3 = new Complex(2, 5);
        sp3.ketqua();
        Complex tong = sp1.tong(sp2);
        tong.ketqua();
        Complex hieu = sp2.hieu(sp3);
        hieu.ketqua();
        Complex tich = sp3.nhan(sp3);
        tich.ketqua();
        Complex thuong = sp3.chia(sp1);
        thuong.ketqua();
    }
}
