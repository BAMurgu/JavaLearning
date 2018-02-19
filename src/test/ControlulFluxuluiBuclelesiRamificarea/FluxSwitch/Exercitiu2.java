package test.ControlulFluxuluiBuclelesiRamificarea.FluxSwitch;

/*Avem următoarele date de intrare pentru un automobil:
String carMake = "Ford";
int doors = 4;
Trebuie să se facă o structură condițională care va verifica dacă
producătorul automobilului este Ford și, dacă este, în funcție de
numărul de uși, să afișeze mesajul adecvat.*/

public class Exercitiu2 {

    public static void main (String[]args){

        String carMake = "Ford";
        int doors = 4;

        switch(carMake){
            case "Ford":
            switch (doors) {
                case (3):
                System.out.printf("Masina este Ford si are %d usi",doors);
                break;
                case (4):
                    System.out.printf("Masina este Ford si are %d usi",doors);
                    break;
                case (5):
                    System.out.printf("Masina este Ford si are %d usi",doors);
                    break;
            }
            break;
            default:
                System.out.println("Masina nu este Ford");
                break;
        }
    }
}
