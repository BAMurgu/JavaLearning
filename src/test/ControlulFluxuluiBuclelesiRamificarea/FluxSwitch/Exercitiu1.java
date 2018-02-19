package test.ControlulFluxuluiBuclelesiRamificarea.FluxSwitch;

/*În program, intră următoarele date:
//input data
int x = 523134;
int y = 325423;

Trebuie să verificăm restul împărţirii dintre x şi y. Dacă nu există rest,
trebuie să se afişeze mesajul că restul nu există, în caz contrar, trebuie
să se verifice dacă restul este mai mare sau mai mic decât o mie şi să
se afişeze mesajul corespunzător.*/

public class Exercitiu1 {
    public static void main (String[]args){

        int x = 523134;
        int y = 325423;

        int r = x % y;

        switch (r){
            case (0):
                System.out.println("Nu exista rest");
                break;
            default:
                if (r > 1000)
                    System.out.printf("Rest mai mare decat 1000, Restul este %d",r);
                else  System.out.printf("Rest mai mic decat 1000, Restul este %d",r);
                break;
        }
    }
}
