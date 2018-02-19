package test.ControlulFluxuluiBuclelesiRamificarea.FluxIF;

/* Este necesara urmatoarea constructie logica: daca x primeste o valoare mai amre decat zero, se intra in blocul de cod si x este egal cu 3.*/

public class ControlulFluxuluiIf {

    public static void main (String[]args){

        int x = 2;

        if (x > 0){
            x = 3;
            System.out.printf("%d este mai mare decat 0",x);
        }
    }
}
