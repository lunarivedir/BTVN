
package phanso;

import java.util.Scanner;



public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Phanso sum = new Phanso(0, 1);
        while (true) {            
            System.out.println("Nhap phan so dang a/b");
            String input = sc.nextLine();
            if(input.equals("-1")){
                break;
            }
            String[] value = new String[2];
            value[0] = "";
            value[1] = "";
            int temp = 0;
            for(int i = 0; i<input.length(); i++){
                if(input.charAt(i) == '/'){
                    temp++;
                    continue;//bo qua vong lap if de set cac chatAt[temp] tiep theo
                }
                value[temp] += input.charAt(i);
                
            }
            int tuso = Integer.parseInt(value[0]);
            int mauso = Integer.parseInt(value[1]);
            Phanso ps = new Phanso(tuso, mauso);
            
            sum.cong(ps);
            
            
        }
        sum.ketqua();
    }
}
