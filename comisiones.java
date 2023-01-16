import java.util.Scanner;

public class comisiones{

    public static void main(String[] args){

        Scanner lector=new Scanner(System.in);

        int A=24;
        int B=33;
        int C=38;
        int cantA, cantB, cantC, comision;

        System.out.println("Ingrese la cantidad de coches tipo A vendidos");

        cantA=lector.nextInt();

        System.out.println("Ingrese la cantidad de coches tipo B vendidos");

        cantB=lector.nextInt();

        System.out.println("Ingrese la cantidad de coches tipo C vendidos");

        cantC=lector.nextInt();

        comision = cantA*A + cantB*B + cantC*C;

        System.out.println("La comisión ha pagar es de " + comision + "euros.");

    }


}

