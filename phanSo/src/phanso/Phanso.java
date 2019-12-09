package phanso;

public class Phanso {

    int tuso;
    int mauso;

    public Phanso(int ts, int ms) {
        this.tuso = ts;
        this.mauso = ms;

    }

    public void cong(Phanso ps) {
        this.tuso = this.tuso * ps.mauso + ps.tuso * this.mauso;
        this.mauso = this.mauso * ps.mauso;
    }

    public void rutgon(Phanso ps) {
        int temp1 = tuso;
        int temp2 = mauso;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int ucln = temp1;
        this.tuso = ps.tuso / ucln;
        this.mauso = ps.mauso / ucln;
    }

    void ketqua() {

        System.out.println(tuso + "/" + mauso);
    }
}
