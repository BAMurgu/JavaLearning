package test.TipuriDeDateSiOperatori.Operatori;

/*Trebuie să creăm un program care calculează aria unui cerc.*/

public class OperatoriArie {

    static final double PI = 3.14;

    public static void main (String[]args){
        int raza = 5;

        double A = PI * raza * raza;
        System.out.printf("Aria cercului este %.2f",A);
    }
}
