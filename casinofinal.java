import java.util.Random;
import java.util.Scanner;
public class casinofinal {
    // Variables globales
    static Scanner entrada = new Scanner(System.in);
    static Random random = new Random();

    static int monedas = 100;
    static int partidas = 0;
    static int victorias = 0;
    static int derrotas = 0;
    // Método princial
    public static void main(String[] args) {
        int opcion;
    do {
        menu();
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                lanzarDado();
                break;

            case 2:
                lanzarMoneda();
                break;
            case 3:
                tragamonedas();
                break;

            case 4:
                ruleta();
                break;

            case 5:
                piedraPapelTijera();
                break;

            case 6:
                carreraCaballos();
                break;

            case 7:
                estadisticas();
                break;

            case 8:
                salir();
                break;

            default:
                System.out.println("Opción incorrecta.");
            }

        }while(opcion != 8);
    }
    // Método del menú
    public static void menu() {
        System.out.println("==========================");
        System.out.println("      CASINO JAVA");
        System.out.println("==========================");
        System.out.println("Monedas: " + monedas);

        System.out.println("1. Lanzar dado");
        System.out.println("2. Lanzar moneda");
        System.out.println("3. Tragamonedas");
        System.out.println("4. Ruleta");
        System.out.println("5. Piedra, Papel o Tijera");
        System.out.println("6. Carrera de Caballos");
        System.out.println("7. Ver estadísticas");
        System.out.println("8. Salir");

        System.out.print("Seleccione una opción: ");
    }
    // Método lanzar dado
    public static void lanzarDado() {
        if(monedas < 10){
        System.out.println("No tienes suficientes monedas.");
        return;
    }
        monedas -=10;
        partidas++;

       System.out.println("Lanzando dado...");
       int dado = random.nextInt(6)+1;
       System.out.println("Resultado: "+dado);

    if(dado==6){
        monedas+=30;
        victorias++;
        System.out.println("Ganaste 30 monedas.");
    }else if(dado==5){
        monedas+=20;
        victorias++;
        System.out.println("Ganaste 20 monedas.");

    }else if(dado==4){
        monedas+=10;
        victorias++;
        System.out.println("Ganaste 10 monedas.");

    }else{

        derrotas++;
        System.out.println("No ganaste.");
    }
    System.out.println("Monedas actuales: "+monedas);

    }

    // Método lanzar moneda
    public static void lanzarMoneda() {
        if (monedas < 10) {
        System.out.println("No tienes suficientes monedas.");
        return;
    }

    monedas -= 10;
    partidas++;

    System.out.println("===== LANZAR MONEDA =====");
    System.out.println("1. Cara");
    System.out.println("2. Sello");
    System.out.print("Elige una opción: ");

    int jugador = entrada.nextInt();

    int moneda = random.nextInt(2) + 1;

    if (moneda == 1) {
        System.out.println("Salió: Cara");
    } else {
        System.out.println("Salió: Sello");
    }

    if (jugador == moneda) {

        System.out.println("¡¡Ganaste 20 monedas!!");
        monedas += 20;
        victorias++;

    } else {

        System.out.println("Perdiste.");
        derrotas++;

    }

    System.out.println("Monedas actuales: " + monedas);

    }

    // Método tragamonedas
    public static void tragamonedas() {
        if (monedas < 10) {
        System.out.println("No tienes suficientes monedas.");
        return;
    }

       monedas -= 10;
        partidas++;

        System.out.println("===== TRAGAMONEDAS =====");

       int simbolo1 = random.nextInt(5) + 1;
       int simbolo2 = random.nextInt(5) + 1;
      int simbolo3 = random.nextInt(5) + 1;

       mostrarSimbolo(simbolo1);
       mostrarSimbolo(simbolo2);
       mostrarSimbolo(simbolo3);

       System.out.println();

    if (simbolo1 == simbolo2 && simbolo2 == simbolo3) {

        System.out.println("¡¡JACKPOT!!");
        System.out.println("Ganaste 100 monedas.");

        monedas += 100;
        victorias++;

    } else if (simbolo1 == simbolo2 ||
               simbolo1 == simbolo3 ||
               simbolo2 == simbolo3) {

        System.out.println("¡¡Dos iguales!!");
        System.out.println("Ganaste 30 monedas.");
        monedas += 30;
        victorias++;
    } else {
        System.out.println("No obtuviste premio.");

        derrotas++;
    }
      System.out.println("Monedas actuales: " + monedas);

    }
    // Método mostrar símbolo
    public static void mostrarSimbolo(int numero) {
        switch (numero) {

        case 1:
            System.out.print("[C] ");
            break;

        case 2:
            System.out.print("[L] ");
            break;

        case 3:
            System.out.print("[U] ");
            break;

        case 4:
            System.out.print("[E] ");
            break;

        case 5:
            System.out.print("[7] ");
            break;
        }
    }
    // Método ruleta
    public static void ruleta() {
        if (monedas < 10) {
        System.out.println("No tienes suficientes monedas.");
        return;
    }
      monedas -= 10;
      partidas++;
      System.out.println("===== RULETA =====");
      System.out.print("Apuesta un número (0 - 36): ");
      int apuesta = entrada.nextInt();
    while (apuesta < 0 || apuesta > 36) {
        System.out.print("Número inválido. Intenta nuevamente: ");
        apuesta = entrada.nextInt();
    }
      int numeroRuleta = random.nextInt(37);
      System.out.println("La ruleta cayó en: " + numeroRuleta);

    if (apuesta == numeroRuleta) {
        System.out.println("¡¡Felicidades!!");
        System.out.println("Ganaste 100 monedas.");
        monedas += 100;
        victorias++;
    } else {
        System.out.println("No acertaste.");
        derrotas++;
    }
    System.out.println("Monedas actuales: " + monedas);
    }
    // Método piedra, papel o tijera
    public static void piedraPapelTijera() {
        if (monedas < 10) {
        System.out.println("No tienes suficientes monedas.");
        return;
    }
      monedas -= 10;
      partidas++;
      System.out.println("===== PIEDRA, PAPEL O TIJERA =====");
      System.out.println("1. Piedra");
      System.out.println("2. Papel");
      System.out.println("3. Tijera");
      System.out.print("Elige una opción: ");
      int jugador = entrada.nextInt();

    while (jugador < 1 || jugador > 3) {
        System.out.print("Opción inválida. Elige nuevamente: ");
        jugador = entrada.nextInt();
    }
      int computadora = random.nextInt(3) + 1;
      System.out.print("La computadora eligió: ");

    switch (computadora) {

        case 1:
            System.out.println("Piedra");
            break;

        case 2:
            System.out.println("Papel");
            break;

        case 3:
            System.out.println("Tijera");
            break;
        }

    if (jugador == computadora) {

        System.out.println("Empate.");
        System.out.println("Se devolvieron tus 10 monedas.");

        monedas += 10;

    } else if ((jugador == 1 && computadora == 3) ||
               (jugador == 2 && computadora == 1) ||
               (jugador == 3 && computadora == 2)) {
        System.out.println("¡¡Ganaste!!");
        monedas += 20;
        victorias++;
    } else {
        System.out.println("Perdiste.");
        derrotas++;

    }
    System.out.println("Monedas actuales: " + monedas);
    }

    // Método carrera de caballos
    public static void carreraCaballos() {

    if (monedas < 10) {
        System.out.println("No tienes suficientes monedas.");
        return;
    }

    monedas -= 10;
    partidas++;

    System.out.println("===== CARRERA DE CABALLOS =====");
    System.out.println("1. Caballo 1");
    System.out.println("2. Caballo 2");
    System.out.println("3. Caballo 3");
    System.out.println("4. Caballo 4");
    System.out.println("5. Caballo 5");

    System.out.print("Elige un caballo: ");
    int elegido = entrada.nextInt();

    while (elegido < 1 || elegido > 5) {
        System.out.print("Caballo inválido. Elige nuevamente: ");
        elegido = entrada.nextInt();
    }

      int c1 = 0;
      int c2 = 0;
      int c3 = 0;
      int c4 = 0;
      int c5 = 0;
      int ganador = 0;
     System.out.println("¡¡Comienza la carrera!!");
    // Solo habrá 5 rondas
    for (int ronda = 1; ronda <= 5; ronda++) {

        c1 += random.nextInt(3) + 1;
        c2 += random.nextInt(3) + 1;
        c3 += random.nextInt(3) + 1;
        c4 += random.nextInt(3) + 1;
        c5 += random.nextInt(3) + 1;

        System.out.println("----------------------------------------");
        System.out.println("RONDA " + ronda);

        System.out.print("Caballo 1: ");
        for (int i = 0; i < c1; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Caballo 2: ");
        for (int i = 0; i < c2; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Caballo 3: ");
        for (int i = 0; i < c3; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Caballo 4: ");
        for (int i = 0; i < c4; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Caballo 5: ");
        for (int i = 0; i < c5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Buscar el caballo que avanzó más
    int mayor = c1;
    ganador = 1;

    if (c2 > mayor) {
        mayor = c2;
        ganador = 2;
    }

    if (c3 > mayor) {
        mayor = c3;
        ganador = 3;
    }

    if (c4 > mayor) {
        mayor = c4;
        ganador = 4;
    }

    if (c5 > mayor) {
        mayor = c5;
        ganador = 5;
    }

    System.out.println("----------------------------------------");
    System.out.println(" El caballo ganador fue el Caballo " + ganador);

    if (elegido == ganador) {
        System.out.println("¡¡Felicidades!!");
        System.out.println("Ganaste 50 monedas.");
        monedas += 50;
        victorias++;
    } else {
        System.out.println("No acertaste al caballo ganador.");
        derrotas++;
    }

    System.out.println("Monedas actuales: " + monedas);
}
    // Método estadísticas
    public static void estadisticas() {

       System.out.println("======================");
        System.out.println("     ESTADÍSTICAS");
        System.out.println("======================");

        System.out.println("Monedas actuales: " + monedas);
        System.out.println("Partidas jugadas: " + partidas);
        System.out.println("Victorias: " + victorias);
        System.out.println("Derrotas: " + derrotas);

    if (partidas > 0) {

        double porcentaje = (victorias * 100.0) / partidas;

           System.out.printf("Porcentaje de victorias: %.2f%%", porcentaje);

        } else {

            System.out.println("Porcentaje de victorias: 0%");

        }
    }
    // Método salir
    public static void salir() {
        System.out.println("======================");
        System.out.println("    FIN DEL CASINO");
        System.out.println("======================");

        System.out.println("Monedas finales: " + monedas);
        System.out.println("Partidas jugadas: " + partidas);
        System.out.println("Victorias: " + victorias);
        System.out.println("Derrotas: " + derrotas);

     if (partidas > 0) {
        double porcentaje = (victorias * 100.0) / partidas;
        System.out.printf("Porcentaje de victorias: %.2f%%", porcentaje);

    }

        System.out.println("¡Gracias por jugar!");

    }

}