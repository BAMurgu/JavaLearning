package test.TipuriDeDateSiOperatori.Siruri;

/*Trebuie să creat un program care va sorta şirul dat şi la ieşire va da
        şirul vechi şi cel nou:
        int[] array = {1, 5, 33, 563, 0, 2, 23, 9, 9, 11, 987, 23,
        934, 999, 43}; */

import java.util.Arrays;

public class Exercitiu2 {

    public static void main (String[]args){

        int[] array = {1, 5, 33, 563, 0, 2, 23, 9, 9, 11, 987, 23,
                934, 999, 43};
        System.out.print(Arrays.toString(array));

        Arrays.sort(array);

        System.out.print("\n"+Arrays.toString(array));

    }
}
