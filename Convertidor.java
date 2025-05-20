import java.util.Scanner;
    public class Convertidor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int convertir;
            double num;
            do {
            menu();
            convertir = sc.nextInt();
            sc.nextLine();
            if (convertir == 1) {
                System.out.println(" ");
                System.out.println("Dime de que unidades a que unidades quieres convertir (ejemplo: metros a centimetros):");
                System.out.println(" ");
                String unidades = sc.nextLine();
                String[] partes = unidades.split(" a ");
                if (partes.length != 2) {
                    System.out.println(" ");
                    System.out.println("Porfavor escribalo como en el ejemplo");
                    continue;
                }
                partes[0] = partes[0].toLowerCase();
                partes[1] = partes[1].toLowerCase();
                partes[0] = partes[0].replace("ñ", "n").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u"); //Reemplaza la primera letra por la segunda
                partes[1] = partes[1].replace("ñ", "n").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
                System.out.println(" ");
                System.out.println("Dime cuantos " +partes[0]+ " quieres pasar a " +partes[1]+ ": ");
                System.out.println(" ");
                num = sc.nextInt();
                double result = convertido(partes, num);
                System.out.println(" ");
                System.out.println(+num+ " " +partes[0]+ " son " +result+ " " +partes[1]);
            } else if (convertir == 2) {
                System.out.println(" ");
                System.out.println("Dime de que unidades a que unidades quieres convertir (ejemplo: gramos a kilogramos):");
                System.out.println(" ");
                String unidades = sc.nextLine();
                String[] partes = unidades.split(" a ");
                if (partes.length != 2) {
                    System.out.println(" ");
                    System.out.println("Porfavor escribalo como en el ejemplo");
                    continue; //En vez de parar el programa vuelve a empezar el bucle
                }
                partes[0] = partes[0].toLowerCase();
                partes[1] = partes[1].toLowerCase();
                partes[0] = partes[0].replace("ñ", "n").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
                partes[1] = partes[1].replace("ñ", "n").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
                System.out.println(" ");
                System.out.println("Dime cuantos " +partes[0]+ " quieres pasar a " +partes[1]+ ": ");
                System.out.println(" ");
                num = sc.nextInt();
                double result = convertido1(partes, num);
                System.out.println(" ");
                System.out.println(+num+ " " +partes[0]+ " son " +result+ " " +partes[1]);
            } else if (convertir == 3) {
                System.out.println(" ");
                System.out.println("Dime de que unidades a que unidades quieres convertir (ejemplo: celsius a kelvin):");
                System.out.println(" ");
                String unidades = sc.nextLine();
                String[] partes = unidades.split(" a ");
                if (partes.length != 2) {
                    System.out.println(" ");
                    System.out.println("Porfavor escribalo como en el ejemplo");
                    continue;
                }
                partes[0] = partes[0].toLowerCase();
                partes[1] = partes[1].toLowerCase();
                partes[0] = partes[0].replace("ñ", "n").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
                partes[1] = partes[1].replace("ñ", "n").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
                System.out.println(" ");
                System.out.println("Dime cuantos " +partes[0]+ " quieres pasar a " +partes[1]+ ": ");
                System.out.println(" ");
                num = sc.nextInt();
                double result = convertido2(partes, num);
                System.out.println(" ");
                System.out.println(+num+ " " +partes[0]+ " son " +result+ " grados " +partes[1]);
            } else if (convertir == 4) {
                System.out.println(" ");
                System.out.println("Dime de que unidades a que unidades quieres convertir (ejemplo: litros a mililitros):");
                System.out.println(" ");
                String unidades = sc.nextLine();
                String[] partes = unidades.split(" a ");
                if (partes.length != 2) {
                    System.out.println(" ");
                    System.out.println("Porfavor escribalo como en el ejemplo");
                    continue;
                }
                partes[0] = partes[0].toLowerCase();
                partes[1] = partes[1].toLowerCase();
                partes[0] = partes[0].replace("ñ", "n").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
                partes[1] = partes[1].replace("ñ", "n").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
                System.out.println(" ");
                System.out.println("Dime cuantos " +partes[0]+ " quieres pasar a " +partes[1]+ ": ");
                System.out.println(" ");
                num = sc.nextInt();
                double result = convertido3(partes, num);
                System.out.println(" ");
                System.out.println(+num+ " " +partes[0]+ " son " +result+ " " +partes[1]);
            } else if (convertir == 5) {
                System.out.println(" ");
                System.out.println("Dime de que unidades a que unidades quieres convertir (ejemplo: segundos a horas):");
                System.out.println("Este programa no soporta la ñ por lo que tendra que escribir anos en vez de años");
                System.out.println(" ");
                String unidades = sc.nextLine();
                String[] partes = unidades.split(" a ");
                if (partes.length != 2) {
                    System.out.println(" ");
                    System.out.println("Porfavor escribalo como en el ejemplo");
                    continue;
                }
                partes[0] = partes[0].toLowerCase();
                partes[1] = partes[1].toLowerCase();
                partes[0] = partes[0].replace("ñ", "n").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
                partes[1] = partes[1].replace("ñ", "n").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
                System.out.println(" ");
                System.out.println("Dime cuantos " +partes[0]+ " quieres pasar a " +partes[1]+ ": ");
                System.out.println(" ");
                num = sc.nextInt();
                double result = convertido4(partes, num);
                System.out.println(" ");
                System.out.println(+num+ " " +partes[0]+ " son " +result+ " " +partes[1]);
            }
        } while (convertir != 6);
        System.out.println("Vale, adios");
        sc.close();
        }
        static void menu() {
            System.out.println(" ");
            System.out.println("Escribe el numero que tiene cada sistema para elegir el sistema de unidades que quieres convertir: ");
            System.out.println("1. Longuitud");
            System.out.println("2. Peso");
            System.out.println("3. Temperatura");
            System.out.println("4. Volumen");   
            System.out.println("5. Tiempo");
            System.out.println("6. Salir");
            System.out.println(" ");
        }
        static double convertido(String[] partes, double num) {
    double resultado = Double.NaN;
    switch (partes[0]) {
        case "milimetro":
        case "milimetros":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 1;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num / 10;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num / 100;
                    break;
                case "metro":
                case "metros":
                    resultado = num / 1000;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num / 10000;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num / 100000;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num / 1000000;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num / 25.4;
                    break;
                case "pie":
                case "pies":
                    resultado = num / 304.8;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num / 914.4;
                    break;
                case "milla":
                case "millas":
                    resultado = num / 1609000;
                    break;
            }
            break;
        case "centimetro":
        case "centimetros":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 10;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num * 1;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num / 10;
                    break;
                case "metro":
                case "metros":
                    resultado = num / 100;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num / 1000;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num / 10000;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num / 100000;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num / 2.54;
                    break;
                case "pie":
                case "pies":
                    resultado = num / 30.48;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num / 91.44;
                    break;
                case "milla":
                case "millas":
                    resultado = num / 160900;
                    break;
            }
            break;
        case "decimetro":
        case "decimetros":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 100;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num * 10;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num * 1;
                    break;
                case "metro":
                case "metros":
                    resultado = num / 10;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num / 100;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num / 1000;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num / 10000;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num * 3.937;
                    break;
                case "pie":
                case "pies":
                    resultado = num / 3.048;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num / 9.144;
                    break;
                case "milla":
                case "millas":
                    resultado = num / 16090;
                    break;
            }
            break;
        case "metro":
        case "metros":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 1000;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num * 100;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num * 10;
                    break;
                case "metro":
                case "metros":
                    resultado = num * 1;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num / 10;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num / 100;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num / 1000;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num * 39.37;
                    break;
                case "pie":
                case "pies":
                    resultado = num * 3.281;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num * 1.094;
                    break;
                case "milla":
                case "millas":
                    resultado = num / 1609;
                    break;
            }
            break;
        case "decametro":
        case "decametros":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 10000;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num * 1000;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num * 100;
                    break;
                case "metro":
                case "metros":
                    resultado = num * 10;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num * 1;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num / 10;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num / 100;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num * 393.7;
                    break;
                case "pie":
                case "pies":
                    resultado = num * 32.808;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num * 10.936;
                    break;
                case "milla":
                case "millas":
                    resultado = num / 160.9;
                    break;
            }
            break;
        case "hectometro":
        case "hectometros":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 100000;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num * 10000;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num * 1000;
                    break;
                case "metro":
                case "metros":
                    resultado = num * 100;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num * 10;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num * 1;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num / 10;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num * 3937;
                    break;
                case "pie":
                case "pies":
                    resultado = num * 328.1;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num * 109.4;
                    break;
                case "milla":
                case "millas":
                    resultado = num / 16.093;
                    break;
            }
            break;
        case "kilometro":
        case "kilometros":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 1000000;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num * 100000;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num * 10000;
                    break;
                case "metro":
                case "metros":
                    resultado = num * 1000;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num * 100;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num * 10;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num * 1;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num * 39370;
                    break;
                case "pie":
                case "pies":
                    resultado = num * 3281;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num * 1094;
                    break;
                case "milla":
                case "millas":
                    resultado = num / 1.609;
                    break;
            }
            break;
        case "pulgada":
        case "pulgadas":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 25.4;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num * 2.54;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num / 3.937;
                    break;
                case "metro":
                case "metros":
                    resultado = num / 39.37;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num / 393.7;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num / 3937;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num / 39370;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num * 1;
                    break;
                case "pie":
                case "pies":
                    resultado = num / 12;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num / 36;
                    break;
                case "milla":
                case "millas":
                    resultado = num / 63360;
                    break;
            }
            break;
        case "pie":
        case "pies":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 304.8;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num * 30.48;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num * 3.048;
                    break;
                case "metro":
                case "metros":
                    resultado = num / 3.281;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num / 32.808;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num / 328.1;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num / 3281;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num * 12;
                    break;
                case "pie":
                case "pies":
                    resultado = num * 1;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num / 3;
                    break;
                case "milla":
                case "millas":
                    resultado = num / 5280;
                    break;
            }
            break;
        case "yarda":
        case "yardas":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 914.4;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num * 91.44;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num * 9.144;
                    break;
                case "metro":
                case "metros":
                    resultado = num / 1.094;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num / 10.936;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num / 109.4;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num / 1094;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num * 36;
                    break;
                case "pie":
                case "pies":
                    resultado = num * 3;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num * 1;
                    break;
                case "milla":
                case "millas":
                    resultado = num / 1760;
                    break;
            }
            break;
        case "milla":
        case "millas":
            switch (partes[1]) {
                case "milimetro":
                case "milimetros":
                    resultado = num * 1609000;
                    break;
                case "centimetro":
                case "centimetros":
                    resultado = num * 160900;
                    break;
                case "decimetro":
                case "decimetros":
                    resultado = num * 16090;
                    break;
                case "metro":
                case "metros":
                    resultado = num * 1609;
                    break;
                case "decametro":
                case "decametros":
                    resultado = num * 160.9;
                    break;
                case "hectometro":
                case "hectometros":
                    resultado = num * 16.093;
                    break;
                case "kilometro":
                case "kilometros":
                    resultado = num * 1.609;
                    break;
                case "pulgada":
                case "pulgadas":
                    resultado = num * 63360;
                    break;
                case "pie":
                case "pies":
                    resultado = num * 5280;
                    break;
                case "yarda":
                case "yardas":
                    resultado = num * 1760;
                    break;
                case "milla":
                case "millas":
                    resultado = num * 1;
                    break;
            }
            break;
        default:
            System.out.println(" ");
            System.out.println("Esa unidad de longuitud no existe o no la puedo usar");
            break;
    }
    return resultado;
}
        static double convertido1(String[] partes, double num) {
    double resultado = Double.NaN;
    switch (partes[0]) {
        case "gramo":
        case "gramos":
            switch (partes[1]) {
                case "gramo":
                case "gramos":
                    resultado = num * 1;
                    break;
                case "kilogramo":
                case "kilogramos":
                    resultado = num / 1000;
                    break;
                case "miligramo":
                case "miligramos":
                    resultado = num * 1000;
                    break;
                case "tonelada":
                case "toneladas":
                    resultado = num / 1000000;
                    break;
                case "libra":
                case "libras":
                    resultado = num / 453.592;
                    break;
                case "onza":
                case "onzas":
                    resultado = num / 28.3495;
                    break;
                case "quintal":
                case "quintales":
                    resultado = num / 100000;
                    break;
            }
            break;
        case "kilogramo":
        case "kilogramos":
            switch (partes[1]) {
                case "gramo":
                case "gramos":
                    resultado = num * 1000;
                    break;
                case "kilogramo":
                case "kilogramos":
                    resultado = num * 1;
                    break;
                case "miligramo":
                case "miligramos":
                    resultado = num * 1000000;
                    break;
                case "tonelada":
                case "toneladas":
                    resultado = num / 1000;
                    break;
                case "libra":
                case "libras":
                    resultado = num * 2.20462;
                    break;
                case "onza":
                case "onzas":
                    resultado = num * 35.274;
                    break;
                case "quintal":
                case "quintales":
                    resultado = num / 100;
                    break;
            }
            break;
        case "miligramo":
        case "miligramos":
            switch (partes[1]) {
                case "gramo":
                case "gramos":
                    resultado = num / 1000;
                    break;
                case "kilogramo":
                case "kilogramos":
                    resultado = num / 1000000;
                    break;
                case "miligramo":
                case "miligramos":
                    resultado = num * 1;
                    break;
                case "tonelada":
                case "toneladas":
                    resultado = num / 1000000000;
                    break;
                case "libra":
                case "libras":
                    resultado = num / 453592;
                    break;
                case "onza":
                case "onzas":
                    resultado = num / 28349.5;
                    break;
                case "quintal":
                case "quintales":
                    resultado = num / 100000000;
                    break;
            }
            break;
        case "tonelada":
        case "toneladas":
            switch (partes[1]) {
                case "gramo":
                case "gramos":
                    resultado = num * 1000000;
                    break;
                case "kilogramo":
                case "kilogramos":
                    resultado = num * 1000;
                    break;
                case "miligramo":
                case "miligramos":
                    resultado = num * 1000000000;
                    break;
                case "tonelada":
                case "toneladas":
                    resultado = num * 1;
                    break;
                case "libra":
                case "libras":
                    resultado = num * 2204.62;
                    break;
                case "onza":
                case "onzas":
                    resultado = num * 35274;
                    break;
                case "quintal":
                case "quintales":
                    resultado = num * 10;
                    break;
            }
            break;
        case "libra":
        case "libras":
            switch (partes[1]) {
                case "gramo":
                case "gramos":
                    resultado = num * 453.592;
                    break;
                case "kilogramo":
                case "kilogramos":
                    resultado = num / 2.20462;
                    break;
                case "miligramo":
                case "miligramos":
                    resultado = num * 453592;
                    break;
                case "tonelada":
                case "toneladas":
                    resultado = num / 2204.62;
                    break;
                case "onza":
                case "onzas":
                    resultado = num * 16;
                    break;
                case "quintal":
                case "quintales":
                    resultado = num / 220.462;
                    break;
                case "libra":
                case "libras":
                    resultado = num * 1;
                    break;
            }
            break;
        case "onza":
        case "onzas":
            switch (partes[1]) {
                case "gramo":
                case "gramos":
                    resultado = num * 28.3495;
                    break;
                case "kilogramo":
                case "kilogramos":
                    resultado = num / 35.274;
                    break;
                case "miligramo":
                case "miligramos":
                    resultado = num * 28349.5;
                    break;
                case "tonelada":
                case "toneladas":
                    resultado = num / 35274;
                    break;
                case "libra":
                case "libras":
                    resultado = num / 16;
                    break;
                case "quintal":
                case "quintales":
                    resultado = num / 3527.4;
                    break;
                case "onza":
                case "onzas":
                    resultado = num * 1;
                    break;
            }
            break;
        case "quintal":
        case "quintales":
            switch (partes[1]) {
                case "gramo":
                case "gramos":
                    resultado = num * 100000;
                    break;
                case "kilogramo":
                case "kilogramos":
                    resultado = num * 100;
                    break;
                case "miligramo":
                case "miligramos":
                    resultado = num * 100000000;
                    break;
                case "tonelada":
                case "toneladas":
                    resultado = num / 10;
                    break;
                case "libra":
                case "libras":
                    resultado = num * 220.462;
                    break;
                case "onza":
                case "onzas":
                    resultado = num * 3527.4;
                    break;
                case "quintal":
                case "quintales":
                    resultado = num * 1;
                    break;
            }
            break;
        default:
            System.out.println(" ");
            System.out.println("Esa unidad de peso no existe o no la puedo usar");
            break;
    }
    return resultado;
}
static double convertido2(String[] partes, double num) {
    double resultado = Double.NaN;
    switch (partes[0]) {
        case "celsius":
        case "grado celsius":
        case "grados celsius":
            switch (partes[1]) {
                case "celsius":
                case "grado celsius":
                case "grados celsius":
                    resultado = num * 1;
                    break;
                case "fahrenheit":
                case "grado fahrenheit":
                case "grados fahrenheit":
                    resultado = (num * 9 / 5) + 32;
                    break;
                case "kelvin":
                case "grado kelvin":
                case "grados kelvin":
                    resultado = num + 273.15;
                    break;
            }
            break;
        case "fahrenheit":
        case "grado fahrenheit":
        case "grados fahrenheit":
            switch (partes[1]) {
                case "celsius":
                case "grado celsius":
                case "grados celsius":
                    resultado = (num - 32) * 5 / 9;
                    break;
                case "fahrenheit":
                case "grado fahrenheit":
                case "grados fahrenheit":
                    resultado = num * 1;
                    break;
                case "kelvin":
                case "grado kelvin":
                case "grados kelvin":
                    resultado = (num - 32) * 5 / 9 + 273.15;
                    break;
            }
            break;
        case "kelvin":
        case "grado kelvin":
        case "grados kelvin":
            switch (partes[1]) {
                case "celsius":
                case "grado celsius":
                case "grados celsius":
                    resultado = num - 273.15;
                    break;
                case "fahrenheit":
                case "grado fahrenheit":
                case "grados fahrenheit":
                    resultado = (num - 273.15) * 9 / 5 + 32;
                    break;
                case "kelvin":
                case "grado kelvin":
                case "grados kelvin":
                    resultado = num * 1;
                    break;
            }
            break;
        default:
            System.out.println(" ");
            System.out.println("Esa unidad de temperatura no existe o no la puedo usar");
            break;
    }
    return resultado;
}
static double convertido3(String[] partes, double num) {
    double resultado = Double.NaN;
    switch (partes[0]) {
        case "litros":
            switch (partes[1]) {
                case "litros":
                    resultado = num * 1;
                    break;
                case "mililitros":
                    resultado = num * 1000;
                    break;
                case "centilitros":
                    resultado = num * 100;
                    break;
                case "decilitros":
                    resultado = num * 10;
                    break;
                case "decalitros":
                    resultado = num / 10;
                    break;
                case "hectolitros":
                    resultado = num / 100;
                    break;
                case "kilolitros":
                    resultado = num / 1000;
                    break;
                case "galones":
                    resultado = num / 3.78541;
                    break;
                case "cuartos":
                    resultado = num / 0.946353;
                    break;
                case "pintas":
                    resultado = num / 0.473176;
                    break;
                case "onzas liquidas":
                    resultado = num / 0.0295735;
                    break;
                case "tazas":
                    resultado = num / 0.236588;
                    break;
            }
            break;
        case "mililitros":
            switch (partes[1]) {
                case "litros":
                    resultado = num / 1000;
                    break;
                case "mililitros":
                    resultado = num * 1;
                    break;
                case "centilitros":
                    resultado = num / 10;
                    break;
                case "decilitros":
                    resultado = num / 100;
                    break;
                case "decalitros":
                    resultado = num / 10000;
                    break;
                case "hectolitros":
                    resultado = num / 100000;
                    break;
                case "kilolitros":
                    resultado = num / 1000000;
                    break;
                case "galones":
                    resultado = num / 3785.41;
                    break;
                case "cuartos":
                    resultado = num / 946.353;
                    break;
                case "pintas":
                    resultado = num / 473.176;
                    break;
                case "onzas liquidas":
                    resultado = num / 29.5735;
                    break;
                case "tazas":
                    resultado = num / 236.588;
                    break;
            }
            break;
        case "centilitros":
            switch (partes[1]) {
                case "litros":
                    resultado = num / 100;
                    break;
                case "mililitros":
                    resultado = num * 10;
                    break;
                case "centilitros":
                    resultado = num * 1;
                    break;
                case "decilitros":
                    resultado = num / 10;
                    break;
                case "decalitros":
                    resultado = num / 1000;
                    break;
                case "hectolitros":
                    resultado = num / 10000;
                    break;
                case "kilolitros":
                    resultado = num / 100000;
                    break;
                case "galones":
                    resultado = num / 378.541;
                    break;
                case "cuartos":
                    resultado = num / 94.6353;
                    break;
                case "pintas":
                    resultado = num / 47.3176;
                    break;
                case "onzas liquidas":
                    resultado = num / 2.95735;
                    break;
                case "tazas":
                    resultado = num / 23.6588;
                    break;
            }
            break;
        case "decilitros":
            switch (partes[1]) {
                case "litros":
                    resultado = num / 10;
                    break;
                case "mililitros":
                    resultado = num * 100;
                    break;
                case "centilitros":
                    resultado = num * 10;
                    break;
                case "decilitros":
                    resultado = num * 1;
                    break;
                case "decalitros":
                    resultado = num / 100;
                    break;
                case "hectolitros":
                    resultado = num / 1000;
                    break;
                case "kilolitros":
                    resultado = num / 10000;
                    break;
                case "galones":
                    resultado = num / 37.8541;
                    break;
                case "cuartos":
                    resultado = num / 9.46353;
                    break;
                case "pintas":
                    resultado = num / 4.73176;
                    break;
                case "onzas liquidas":
                    resultado = num / 0.295735;
                    break;
                case "tazas":
                    resultado = num / 2.36588;
                    break;
            }
            break;
        case "decalitros":
            switch (partes[1]) {
                case "litros":
                    resultado = num * 10;
                    break;
                case "mililitros":
                    resultado = num * 10000;
                    break;
                case "centilitros":
                    resultado = num * 1000;
                    break;
                case "decilitros":
                    resultado = num * 100;
                    break;
                case "decalitros":
                    resultado = num * 1;
                    break;
                case "hectolitros":
                    resultado = num / 10;
                    break;
                case "kilolitros":
                    resultado = num / 100;
                    break;
                case "galones":
                    resultado = num / 0.378541;
                    break;
                case "cuartos":
                    resultado = num / 0.0946353;
                    break;
                case "pintas":
                    resultado = num / 0.0473176;
                    break;
                case "onzas liquidas":
                    resultado = num / 0.00295735;
                    break;
                case "tazas":
                    resultado = num / 0.236588;
                    break;
            }
            break;
        case "hectolitros":
            switch (partes[1]) {
                case "litros":
                    resultado = num * 100;
                    break;
                case "mililitros":
                    resultado = num * 100000;
                    break;
                case "centilitros":
                    resultado = num * 10000;
                    break;
                case "decilitros":
                    resultado = num * 1000;
                    break;
                case "decalitros":
                    resultado = num * 10;
                    break;
                case "hectolitros":
                    resultado = num * 1;
                    break;
                case "kilolitros":
                    resultado = num / 10;
                    break;
                case "galones":
                    resultado = num * 26.4172;
                    break;
                case "cuartos":
                    resultado = num * 105.669;
                    break;
                case "pintas":
                    resultado = num * 211.338;
                    break;
                case "onzas liquidas":
                    resultado = num * 3381.4;
                    break;
                case "tazas":
                    resultado = num * 422.675;
                    break;
            }
            break;
        case "kilolitros":
            switch (partes[1]) {
                case "litros":
                    resultado = num * 1000;
                    break;
                case "mililitros":
                    resultado = num * 1000000;
                    break;
                case "centilitros":
                    resultado = num * 100000;
                    break;
                case "decilitros":
                    resultado = num * 10000;
                    break;
                case "decalitros":
                    resultado = num * 100;
                    break;
                case "hectolitros":
                    resultado = num * 10;
                    break;
                case "kilolitros":
                    resultado = num * 1;
                    break;
                case "galones":
                    resultado = num * 264.172;
                    break;
                case "cuartos":
                    resultado = num * 1056.69;
                    break;
                case "pintas":
                    resultado = num * 2113.38;
                    break;
                case "onzas liquidas":
                    resultado = num * 33814;
                    break;
                case "tazas":
                    resultado = num * 4226.75;
                    break;
            }
            break;
        case "galones":
            switch (partes[1]) {
                case "litros":
                    resultado = num * 3.78541;
                    break;
                case "mililitros":
                    resultado = num * 3785.41;
                    break;
                case "centilitros":
                    resultado = num * 378.541;
                    break;
                case "decilitros":
                    resultado = num * 37.8541;
                    break;
                case "decalitros":
                    resultado = num * 0.378541;
                    break;
                case "hectolitros":
                    resultado = num / 26.4172;
                    break;
                case "kilolitros":
                    resultado = num / 264.172;
                    break;
                case "galones":
                    resultado = num * 1;
                    break;
                case "cuartos":
                    resultado = num * 4;
                    break;
                case "pintas":
                    resultado = num * 8;
                    break;
                case "onzas liquidas":
                    resultado = num * 128;
                    break;
                case "tazas":
                    resultado = num * 16;
                    break;
            }
            break;
        case "cuartos":
            switch (partes[1]) {
                case "litros":
                    resultado = num * 0.946353;
                    break;
                case "mililitros":
                    resultado = num * 946.353;
                    break;
                case "centilitros":
                    resultado = num * 94.6353;
                    break;
                case "decilitros":
                    resultado = num * 9.46353;
                    break;
                case "decalitros":
                    resultado = num * 0.0946353;
                    break;
                case "hectolitros":
                    resultado = num / 105.669;
                    break;
                case "kilolitros":
                    resultado = num / 1056.69;
                    break;
                case "galones":
                    resultado = num / 4;
                    break;
                case "cuartos":
                    resultado = num * 1;
                    break;
                case "pintas":
                    resultado = num * 2;
                    break;
                case "onzas liquidas":
                    resultado = num * 32;
                    break;
                case "tazas":
                    resultado = num * 4;
                    break;
            }
            break;
        case "pintas":
            switch (partes[1]) {
                case "litros":
                    resultado = num * 0.473176;
                    break;
                case "mililitros":
                    resultado = num * 473.176;
                    break;
                case "centilitros":
                    resultado = num * 47.3176;
                    break;
                case "decilitros":
                    resultado = num * 4.73176;
                    break;
                case "decalitros":
                    resultado = num * 0.0473176;
                    break;
                case "hectolitros":
                    resultado = num / 211.338;
                    break;
                case "kilolitros":
                    resultado = num / 2113.38;
                    break;
                case "galones":
                    resultado = num / 8;
                    break;
                case "cuartos":
                    resultado = num / 2;
                    break;
                case "pintas":
                    resultado = num * 1;
                    break;
                case "onzas liquidas":
                    resultado = num * 16;
                    break;
                case "tazas":
                    resultado = num * 2;
                    break;
            }
            break;
        case "onzas liquidas":
            switch (partes[1]) {
                case "litros":
                    resultado = num * 0.0295735;
                    break;
                case "mililitros":
                    resultado = num * 29.5735;
                    break;
                case "centilitros":
                    resultado = num * 2.95735;
                    break;
                case "decilitros":
                    resultado = num * 0.295735;
                    break;
                case "decalitros":
                    resultado = num * 0.00295735;
                    break;
                case "hectolitros":
                    resultado = num / 3381.4;
                    break;
                case "kilolitros":
                    resultado = num / 33814;
                    break;
                case "galones":
                    resultado = num / 128;
                    break;
                case "cuartos":
                    resultado = num / 32;
                    break;
                case "pintas":
                    resultado = num / 16;
                    break;
                case "onzas liquidas":
                    resultado = num * 1;
                    break;
                case "tazas":
                    resultado = num / 8;
                    break;
            }
            break;
        case "tazas":
            switch (partes[1]) {
                case "litros":
                    resultado = num * 0.236588;
                    break;
                case "mililitros":
                    resultado = num * 236.588;
                    break;
                case "centilitros":
                    resultado = num * 23.6588;
                    break;
                case "decilitros":
                    resultado = num * 2.36588;
                    break;
                case "decalitros":
                    resultado = num * 0.236588;
                    break;
                case "hectolitros":
                    resultado = num / 422.675;
                    break;
                case "kilolitros":
                    resultado = num / 4226.75;
                    break;
                case "galones":
                    resultado = num / 16;
                    break;
                case "cuartos":
                    resultado = num / 4;
                    break;
                case "pintas":
                    resultado = num / 2;
                    break;
                case "onzas liquidas":
                    resultado = num * 8;
                    break;
                case "tazas":
                    resultado = num * 1;
                    break;
            }
            break;
        default:
            System.out.println(" ");
            System.out.println("Esa unidad de volumen no existe o no la puedo usar");
            break;
    }
    return resultado;
}
static double convertido4(String[] partes, double num) {
    double resultado = Double.NaN;
    switch (partes[0]) {
        case "segundo":
        case "segundos":
            switch (partes[1]) {
                case "segundo":
                case "segundos":
                    resultado = num * 1;
                    break;
                case "minuto":
                case "minutos":
                    resultado = num / 60;
                    break;
                case "hora":
                case "horas":
                    resultado = num / 3600;
                    break;
                case "dia":
                case "dias":
                    resultado = num / 86400;
                    break;
                case "semana":
                case "semanas":
                    resultado = num / 604800;
                    break;
                case "ano":
                case "anos":
                    resultado = num / 31536000;
                    break;
                case "lustro":
                case "lustros":
                    resultado = num / (31536000 * 5);
                    break;
                case "decada":
                case "decadas":
                    resultado = num / (31536000 * 10);
                    break;
                case "siglo":
                case "siglos":
                    resultado = num / (31536000 * 100);
                    break;
                case "milenio":
                case "milenios":
                    resultado = num / (31536000 * 1000);
                    break;
            }
            break;
        case "minuto":
        case "minutos":
            switch (partes[1]) {
                case "segundo":
                case "segundos":
                    resultado = num * 60;
                    break;
                case "minuto":
                case "minutos":
                    resultado = num * 1;
                    break;
                case "hora":
                case "horas":
                    resultado = num / 60;
                    break;
                case "dia":
                case "dias":
                    resultado = num / 1440;
                    break;
                case "semana":
                case "semanas":
                    resultado = num / 10080;
                    break;
                case "ano":
                case "anos":
                    resultado = num / 525600;
                    break;
                case "lustro":
                case "lustros":
                    resultado = num / (525600 * 5);
                    break;
                case "decada":
                case "decadas":
                    resultado = num / (525600 * 10);
                    break;
                case "siglo":
                case "siglos":
                    resultado = num / (525600 * 100);
                    break;
                case "milenio":
                case "milenios":
                    resultado = num / (525600 * 1000);
                    break;
            }
            break;
        case "hora":
        case "horas":
            switch (partes[1]) {
                case "segundo":
                case "segundos":
                    resultado = num * 3600;
                    break;
                case "minuto":
                case "minutos":
                    resultado = num * 60;
                    break;
                case "hora":
                case "horas":
                    resultado = num * 1;
                    break;
                case "dia":
                case "dias":
                    resultado = num / 24;
                    break;
                case "semana":
                case "semanas":
                    resultado = num / 168;
                    break;
                case "ano":
                case "anos":
                    resultado = num / 8760;
                    break;
                case "lustro":
                case "lustros":
                    resultado = num / (8760 * 5);
                    break;
                case "decada":
                case "decadas":
                    resultado = num / (8760 * 10);
                    break;
                case "siglo":
                case "siglos":
                    resultado = num / (8760 * 100);
                    break;
                case "milenio":
                case "milenios":
                    resultado = num / (8760 * 1000);
                    break;
            }
            break;
        case "dia":
        case "dias":
            switch (partes[1]) {
                case "segundo":
                case "segundos":
                    resultado = num * 86400;
                    break;
                case "minuto":
                case "minutos":
                    resultado = num * 1440;
                    break;
                case "hora":
                case "horas":
                    resultado = num * 24;
                    break;
                case "dia":
                case "dias":
                    resultado = num * 1;
                    break;
                case "semana":
                case "semanas":
                    resultado = num / 7;
                    break;
                case "ano":
                case "anos":
                    resultado = num / 365;
                    break;
                case "lustro":
                case "lustros":
                    resultado = num / (365 * 5);
                    break;
                case "decada":
                case "decadas":
                    resultado = num / (365 * 10);
                    break;
                case "siglo":
                case "siglos":
                    resultado = num / (365 * 100);
                    break;
                case "milenio":
                case "milenios":
                    resultado = num / (365 * 1000);
                    break;
            }
            break;
        case "semana":
        case "semanas":
            switch (partes[1]) {
                case "segundo":
                case "segundos":
                    resultado = num * 604800;
                    break;
                case "minuto":
                case "minutos":
                    resultado = num * 10080;
                    break;
                case "hora":
                case "horas":
                    resultado = num * 168;
                    break;
                case "dia":
                case "dias":
                    resultado = num * 7;
                    break;
                case "semana":
                case "semanas":
                    resultado = num * 1;
                    break;
                case "ano":
                case "anos":
                    resultado = num / 52.1429;
                    break;
                case "lustro":
                case "lustros":
                    resultado = num / (52.1429 * 5);
                    break;
                case "decada":
                case "decadas":
                    resultado = num / (52.1429 * 10);
                    break;
                case "siglo":
                case "siglos":
                    resultado = num / (52.1429 * 100);
                    break;
                case "milenio":
                case "milenios":
                    resultado = num / (52.1429 * 1000);
                    break;
            }
            break;
        case "ano":
        case "anos":
            switch (partes[1]) {
                case "segundo":
                case "segundos":
                    resultado = num * 31536000;
                    break;
                case "minuto":
                case "minutos":
                    resultado = num * 525600;
                    break;
                case "hora":
                case "horas":
                    resultado = num * 8760;
                    break;
                case "dia":
                case "dias":
                    resultado = num * 365;
                    break;
                case "semana":
                case "semanas":
                    resultado = num * 52.1429;
                    break;
                case "ano":
                case "anos":
                    resultado = num * 1;
                    break;
                case "lustro":
                case "lustros":
                    resultado = num / 5;
                    break;
                case "decada":
                case "decadas":
                    resultado = num / 10;
                    break;
                case "siglo":
                case "siglos":
                    resultado = num / 100;
                    break;
                case "milenio":
                case "milenios":
                    resultado = num / 1000;
                    break;
            }
            break;
        case "lustro":
        case "lustros":
            switch (partes[1]) {
                case "segundo":
                case "segundos":
                    resultado = num * (31536000 * 5);
                    break;
                case "minuto":
                case "minutos":
                    resultado = num * (525600 * 5);
                    break;
                case "hora":
                case "horas":
                    resultado = num * (8760 * 5);
                    break;
                case "dia":
                case "dias":
                    resultado = num * (365 * 5);
                    break;
                case "semana":
                case "semanas":
                    resultado = num * (52.1429 * 5);
                    break;
                case "ano":
                case "anos":
                    resultado = num * 5;
                    break;
                case "lustro":
                case "lustros":
                    resultado = num * 1;
                    break;
                case "decada":
                case "decadas":
                    resultado = num / 2;
                    break;
                case "siglo":
                case "siglos":
                    resultado = num / 20;
                    break;
                case "milenio":
                case "milenios":
                    resultado = num / 200;
                    break;
            }
            break;
        case "decada":
        case "decadas":
            switch (partes[1]) {
                case "segundo":
                case "segundos":
                    resultado = num * (31536000 * 10);
                    break;
                case "minuto":
                case "minutos":
                    resultado = num * (525600 * 10);
                    break;
                case "hora":
                case "horas":
                    resultado = num * (8760 * 10);
                    break;
                case "dia":
                case "dias":
                    resultado = num * (365 * 10);
                    break;
                case "semana":
                case "semanas":
                    resultado = num * (52.1429 * 10);
                    break;
                case "ano":
                case "anos":
                    resultado = num * 10;
                    break;
                case "lustro":
                case "lustros":
                    resultado = num * 2;
                    break;
                case "decada":
                case "decadas":
                    resultado = num * 1;
                    break;
                case "siglo":
                case "siglos":
                    resultado = num / 10;
                    break;
                case "milenio":
                case "milenios":
                    resultado = num / 100;
                    break;
            }
            break;
        case "siglo":
        case "siglos":
            switch (partes[1]) {
                case "segundo":
                case "segundos":
                    resultado = num * (31536000 * 100);
                    break;
                case "minuto":
                case "minutos":
                    resultado = num * (525600 * 100);
                    break;
                case "hora":
                case "horas":
                    resultado = num * (8760 * 100);
                    break;
                case "dia":
                case "dias":
                    resultado = num * (365 * 100);
                    break;
                case "semana":
                    resultado = num * (52.1429 * 100);
                    break;
                case "ano":
                case "anos":
                    resultado = num * 100;
                    break;
                case "lustro":
                case "lustros":
                    resultado = num * 20;
                    break;
                case "decada":
                case "decadas":
                    resultado = num * 10;
                    break;
                case "siglo":
                case "siglos":
                    resultado = num * 1;
                    break;
                case "milenio":
                case "milenios":
                    resultado = num / 10;
                    break;
            }
            break;
        case "milenio":
        case "milenios":
            switch (partes[1]) {
                case "segundo":
                case "segundos":
                    resultado = num * (31536000 * 1000);
                    break;
                case "minuto":
                case "minutos":
                    resultado = num * (525600 * 1000);
                    break;
                case "hora":
                case "horas":
                    resultado = num * (8760 * 1000);
                    break;
                case "dia":
                case "dias":
                    resultado = num * (365 * 1000);
                    break;
                case "semana":
                case "semanas":
                    resultado = num * (52.1429 * 1000);
                    break;
                case "ano":
                case "anos":
                    resultado = num * 1000;
                    break;
                case "lustro":
                case "lustros":
                    resultado = num * 200;
                    break;
                case "decada":
                case "decadas":
                    resultado = num * 100;
                    break;
                case "siglo":
                case "siglos":
                    resultado = num * 10;
                    break;
                case "milenio":
                case "milenios":
                    resultado = num * 1;
                    break;
            }
            break;
        default:
            System.out.println(" ");
            System.out.println("Esa unidad de tiempo no existe o no la puedo usar");
            break;
    }
    return resultado;
}
    }