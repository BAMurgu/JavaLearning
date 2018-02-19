package test.ControlulFluxuluiBuclelesiRamificarea.FluxWhile;

/*Exerciţiul 1
Este dat următorul şir de numere:
int[] arr = {1,2,3,4,5,6,7,8,9,10};
Trebuie să listăm şirul dat folosind bucla while.*/

public class Exercitiu1 {
    public static void main (String[]args){

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int i = 0;

        while (i < arr.length){
            System.out.println(arr[i]);
            i ++;
        }
    }
}
