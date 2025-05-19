import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacion;
        String[] lista = new String[10];
        int ultimaOperacion = 1;
        int antigua = 0;
        System.out.println("Introduce aqui la operacion que quieres hacer ejemplo: (1 + 1):");
        operacion = sc.nextLine();
            lista[0] = operacion;
        String[] partes = operacion.split(" "); //Esto detecta los espacios y separa el String en partes
        if (partes.length != 3) {
            System.out.println("Solo pueden ser 1 operacion y tiene que ir separado por espacios");
            return;
        }
        double num = Double.parseDouble(partes[0]); //Esto convierte el String en un double
        String simbolo = partes[1];
        double num1 = Double.parseDouble(partes[2]);
        double resultado = resuelto (simbolo, num, num1);
    System.out.println(operacion+ " = " +resultado);
    int siguiente;
    do {
        menu();
    siguiente = sc.nextInt();
    sc.nextLine();
    if (siguiente != 1 && siguiente != 2 && siguiente != 3) {
        System.out.println("Esa opcion no existe");
        return;
    } else if (siguiente == 1) {
        System.out.println("Dime la operacion:");
        operacion = sc.nextLine();
            lista[ultimaOperacion] = operacion;
            ultimaOperacion++;
            if (ultimaOperacion > lista.length) {
            lista[antigua] = null;
            lista[antigua] = operacion;
                antigua++;
                ultimaOperacion = antigua;
            }
        partes = operacion.split(" ");
        if (partes.length != 3) {
            System.out.println("Solo pueden ser 1 operacion y tiene que ir separado por espacios");
            return;
        }
        num = Double.parseDouble(partes[0]);
        simbolo = partes[1];
        num1 = Double.parseDouble(partes[2]);
        resultado = resuelto (simbolo, num, num1);
        System.out.println(operacion+ " = " +resultado);
    } else if (siguiente == 2) {
        System.out.println("Estas son las operaciones que has realizado");
        for (int i = 0; i < ultimaOperacion; i++) {
            System.out.println(+(i + 1)+ ". " +lista[i]);
        }
    }
    } while (siguiente != 3);
    System.out.println("Vale, adios");
    sc.close();
    }
static double resuelto (String simbolo, double num, double num1) {
            if (simbolo.equals("+")) { //Esto lo que hace que detecta si el String contiene este simbolo
        double resultado = num + num1;
        return resultado;
    } else if (simbolo.equals("/")) {
        if (num1 == 0) {
            System.out.println("No puedo dividir entre 0");
            return 0;
        } else {
        double resultado = num / num1;
        return resultado;
        }
    } else if (simbolo.equals("-")) {
        double resultado = num - num1;
      return resultado;
    } else if (simbolo.equals("*")) {
        double resultado = num * num1;
    return resultado;
    } else {
        System.out.println("No puedo darte el resultado de esta operacion");
        return 0;
    }
}
public static void menu () {
    System.out.println(" ");
    System.out.println("Estas son las acciones que puedes hacer elige el numero de la accion:");
    System.out.println("1. Nueva operacion");
    System.out.println("2. Historial de operaciones");
    System.out.println("3. Salir");
}
}