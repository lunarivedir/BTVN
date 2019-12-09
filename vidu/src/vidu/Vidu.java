
package vidu;

public class Vidu {

    public static void main(String[] args) {
        String ten = new String("NguyenBaDuc");
        System.out.println(ten);
        String ten2 = "Nguyen Ba Duc 2";
        System.out.println(ten2);
        System.out.println(ten2.length());
        
        System.out.println(ten2.charAt(1));
        String vidu = ten2.substring(3);
        System.out.println(vidu);
        boolean vidu2 = ten2.contains("Ba"+" "+"Duc");
        System.out.println(vidu2);
        System.out.println(ten2.replace("Nguyen", "Duc"));
    }
    
}
