package Complex;

public class Complex {
    
    int phanthuc;
    int phanao;

    public Complex() {
        
        phanthuc = 1;
        phanao = 1;
    }
    public Complex(int a){
        this.phanthuc = a;
    }

    public Complex(int x, int y) {
        this.phanthuc = x;
        this.phanao = y;
    }

    Complex cong(Complex sophuc) {
        Complex tong = new Complex();
        tong.phanthuc = this.phanthuc + sophuc.phanthuc;
        tong.phanao = this.phanao + sophuc.phanao;
        return tong;
    }

    Complex tru(Complex sophuc) {
        Complex hieu = new Complex();
        hieu.phanthuc = this.phanthuc + sophuc.phanthuc;
        hieu.phanao = this.phanao + sophuc.phanao;
        return hieu;
    }

    Complex nhan(Complex sophuc) {
        Complex tich = new Complex();
        tich.phanthuc = this.phanthuc * sophuc.phanthuc - this.phanao * sophuc.phanthuc;
        tich.phanao = this.phanthuc * sophuc.phanao + this.phanao * sophuc.phanthuc;
        return tich;
    }

    Complex chia(Complex sophuc) {
        Complex thuong = new Complex();
        thuong.phanthuc = (sophuc.phanthuc * this.phanthuc + this.phanao * sophuc.phanao) / (this.phanthuc ^ 2 + this.phanao ^ 2);
        thuong.phanao = (this.phanthuc * sophuc.phanao - sophuc.phanthuc * this.phanao) / (this.phanthuc ^ 2 + this.phanao ^ 2);
        return thuong;
    }

    void ketqua() {
        System.out.println(this.phanthuc + " + " + this.phanao + "i");
    }

}
