import java.util.Scanner;
public class ListaCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lista[] = new String[50];
        String product;
        int ultimoNum = 0;
        int ultimo = 0;
        String productElimin[] = new String[10];
        int ultimoElim = 0;
        System.out.println("Dime los productos que quieres añadir a tu lista de la compra (Escribe fin si quieres terminar): ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print("");
            product = sc.nextLine();
            lista[i] = product;
            ultimoNum++;
            if (product.equalsIgnoreCase("fin")) { //Esto es para que ignore las mayusculas y solo interprete lo que ponen en pantalla
                ultimoNum--;
                break; //Esto es para terminar el bucle
            }
        }
        int orden;
        do {
            menu(); //Esto es para importar el menu que hemos creado fuera del main
            orden = sc.nextInt();
            sc.nextLine(); //Limpiar el buffer
            System.out.println("");
            if (orden != 1 && orden != 2 && orden != 3 && orden != 4 && orden != 5) {
                System.out.println("Tiene que ser un numero de los que se han indicado");
            } else if (orden == 1) {
                if (ultimoNum == 50) {
                    System.out.println("La lista de la compra esta llena");
                } else {
                    System.out.println("Dime el producto que quieras añadir");
                    product = sc.nextLine();
                    System.out.println("Se ha añadido " + product + " a la lista");
                    lista[ultimoNum] = product;
                    ultimoNum++;
                }
            } else if (orden == 2) {
                if (ultimoNum == 0) {
                    System.out.println("La lista esta vacia");
                } else {
                    System.out.println("Esta es la lista de la compra");
                    for (int i = 0; i < ultimoNum; i++) {
                        System.out.println((i + 1) + ". " + lista[i]);
                    }
                }
            } else if (orden == 3) {
                if (ultimoNum > 0) {
                    System.out.println("Esta es la lista de la compra");
                    for (int i = 0; i < ultimoNum; i++) {
                        System.out.println((i + 1) + ". " + lista[i]);
                    }
                    System.out.println("Dime el numero del producto que quieres eliminar");
                    int elimin = sc.nextInt();
                    sc.nextLine();

                    if (elimin > 0 && elimin <= ultimoNum) {
                        System.out.println("Se ha eliminado " + lista[elimin - 1]);
                        if (ultimoElim < 10) {
                            productElimin[ultimoElim] = lista[elimin - 1];
                            ultimoElim++;
                            ultimo++;
                        } else {
                            for (int i = 0; i < 9; i++) {
                                productElimin[i] = productElimin[i + 1];
                            }
                            productElimin[9] = lista[elimin - 1];
                            ultimo++;
                        }
                        for (int i = elimin - 1; i < ultimoNum - 1; i++) {
                            lista[i] = lista[i + 1];
                        }
                        lista[ultimoNum - 1] = null;
                        ultimoNum--;
                    } else {
                        System.out.println("Numero de producto invalido.");
                    }
                } else {
                    System.out.println("La lista de la compra esta vacia. No hay productos para eliminar.");
                }
            } else if (orden == 4) {
                if (ultimoElim > 0) {
                    System.out.println("Esta es la lista de eliminados");
                    for (int i = 0; i < ultimoElim; i++) {
                        System.out.println((i + 1) + ". " + productElimin[i]);
                    }
                    System.out.println("Escribe el numero del producto que quieres recuperar (0 para cancelar)");
                    int recup = sc.nextInt();
                    sc.nextLine();
                    if (recup > 0 && recup <= ultimoElim && ultimoNum < 50) {
                        System.out.println("El producto " + productElimin[recup - 1] + " ha sido recuperado");
                        lista[ultimoNum] = productElimin[recup - 1];
                        for (int i = recup - 1; i < ultimoElim - 1; i++) {
                            productElimin[i] = productElimin[i + 1];
                        }
                        if (ultimoElim > 0) {
                            productElimin[ultimoElim - 1] = null;
                        }
                        ultimoElim--;
                        ultimoNum++;
                    } else if (recup != 0) {
                        System.out.println("Numero de producto invalido o la lista de compra esta llena.");
                    }
                } else {
                    System.out.println("No hay productos eliminados para recuperar.");
                }
            }
        } while (orden != 5);
        System.out.println("Vale, adios");
        sc.close();
    }
    public static void menu() {
        System.out.println("");
        System.out.println("¿Que quieres hacer ahora? Escribe el numero indicado");
        System.out.println("1. Añadir producto a la lista de la compra");
        System.out.println("2. Ver la lista de la compra");
        System.out.println("3. Eliminar un producto");
        System.out.println("4. Recuperar productos eliminados (Solo se pueden recuperar los ultimos 10 productos)");
        System.out.println("5. Salir");
    }
}
