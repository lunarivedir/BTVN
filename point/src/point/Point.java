/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author Administrator
 */
public class Point {
    String ten;
    float tungdo;
    float hoanhdo;
    float caodo;
    
    public Point(){
        ten = "goc";
        hoanhdo = 0;
        tungdo = 0;
        caodo = 0;
    }
    public Point(String ten, float td, float hd, float cd){
        this.ten = ten;
        tungdo = td;
        hoanhdo = hd;
        caodo = cd;
        
    }
    
    public void hienthi(){
        System.out.println(ten +"("+ tungdo + ", " + hoanhdo + ", " + caodo +" )");
    }
}
