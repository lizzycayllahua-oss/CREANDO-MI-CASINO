import java.util.Random;
import java.util.Scanner;
public class casino {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int monedas = 100;
        int partidas = 0;
        int victorias = 0;
        int derrotas = 0;
        int opcion = 0;
        while (opcion != 8) {
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
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    if (monedas < 10) {
                        System.out.println("No tienes suficientes monedas.");
                        break;
                    }
                    monedas -= 10;
                    partidas++;
                    System.out.println("=====LANZAR DADO =====");
                    System.out.println("Lanzando dado...");
                    int dado = random.nextInt(6) + 1;
                    System.out.println("Resultado: " + dado);
                    if (dado == 6) {
                        monedas += 30;
                        victorias++;
                        System.out.println("¡Ganaste 30 monedas!");
                    } else if (dado == 5) {
                        monedas += 20;
                        victorias++;
                        System.out.println("¡Ganaste 20 monedas!");
                    } else if (dado == 4) {
                        monedas += 10;
                        victorias++;
                        System.out.println("¡Ganaste 10 monedas!");
                    } else {
                        derrotas++;
                        System.out.println("No ganaste.");
                    }

                    System.out.println("Monedas actuales: " + monedas);

                    break;
                case 2:
                    if (monedas < 10) {
                        System.out.println("No tienes suficientes monedas.");
                        break;
                    }
                    monedas -= 10;
                    partidas++;
                    System.out.println("=====LANZAR MONEDA =====");
                    System.out.println("1. Cara");
                    System.out.println("2. Sello");
                    System.out.print("Elige: ");
                    int jugador = entrada.nextInt();
                    int moneda = random.nextInt(2) + 1;
                    if (moneda == 1) {
                        System.out.println("Salió Cara");
                    } else {
                        System.out.println("Salió Sello");
                    }
                    if (jugador == moneda) {
                        monedas += 20;
                        victorias++;
                        System.out.println("¡Ganaste 20 monedas!");
                    } else {
                        derrotas++;
                        System.out.println("Perdiste.");
                    }
                    System.out.println("Monedas actuales: " + monedas);
                    break;
                case 3:
                    if (monedas < 10) {
                        System.out.println("No tienes suficientes monedas.");
                        break;
                    }
                        monedas -= 10;
                       partidas++;
                       System.out.println("=====TRAGAMODENAS  =====");
                       System.out.println("Girando tragamonedas...");
                       int simbolo1 = random.nextInt(5) + 1;
                       int simbolo2 = random.nextInt(5) + 1;
                       int simbolo3 = random.nextInt(5) + 1;
                    switch (simbolo1) {
                       case 1: System.out.print("[C] "); break;
                       case 2: System.out.print("[L] "); break;
                       case 3: System.out.print("[U] "); break;
                       case 4: System.out.print("[E] "); break;
                       case 5: System.out.print("[7] "); break;
                    }
                    switch (simbolo2) {
                       case 1: System.out.print("[C] "); break;
                       case 2: System.out.print("[L] "); break;
                       case 3: System.out.print("[U] "); break;
                       case 4: System.out.print("[E] "); break;
                       case 5: System.out.print("[7] "); break;
                    }
                    switch (simbolo3) {
                      case 1: System.out.print("[C] "); break;
                      case 2: System.out.print("[L] "); break;
                      case 3: System.out.print("[U] "); break;
                      case 4: System.out.print("[E] "); break;
                      case 5: System.out.print("[7] "); break;
                    }
                       System.out.println();
                   if (simbolo1 == simbolo2 && simbolo2 == simbolo3) {
                        monedas += 100;
                       victorias++;
                       System.out.println("¡¡JACKPOT!!");
                       System.out.println("Ganaste 100 monedas.");
                    } else if (simbolo1 == simbolo2 || simbolo1 == simbolo3 || simbolo2 == simbolo3) {
                        monedas += 30;
                        victorias++;
                        System.out.println("¡¡Dos iguales!!");
                        System.out.println("Ganaste 30 monedas.");
                    } else {
                       derrotas++;
                       System.out.println("No obtuviste premio.");
                    }
                      System.out.println("Monedas actuales: " + monedas);
                      break;
                case 4:
                     if (monedas < 10) {
                     System.out.println("No tienes suficientes monedas.");
                     break;
                    }
                       monedas -= 10;
                      partidas++;
                       System.out.println("=====RULETA =====");
                       System.out.print("Apuesta un número (0-36): ");
                       int apuesta = entrada.nextInt();
                       int numeroRuleta = random.nextInt(37);
                       System.out.println("La ruleta cayó en: " + numeroRuleta);
                   if (apuesta == numeroRuleta) {
                       monedas += 100;
                      victorias++;
                       System.out.println("¡Ganaste 100 monedas!");
                    } else {
                        derrotas++;
                       System.out.println("No acertaste.");
                    }
                       System.out.println("Monedas actuales: " + monedas);
                       break;
                case 5:
                    if (monedas < 10) {
                      System.out.println("No tienes suficientes monedas.");
                      break;
                    }
                       monedas -= 10;
                       partidas++;
                        System.out.println("=====PIEDRA ,PAPEL O TIJERA  =====");
                        System.out.println("1. Piedra");
                        System.out.println("2. Papel");
                        System.out.println("3. Tijera");
                        System.out.print("Elige: ");
                        int usuario = entrada.nextInt();
                        int pc = random.nextInt(3) + 1;
                        System.out.println("La computadora eligió: " + pc);
                    if (usuario == pc) {
                        monedas += 10;
                        System.out.println("Empate. Se devolvieron tus monedas.");
                    } else if ((usuario == 1 && pc == 3) ||
                       (usuario == 2 && pc == 1) ||
                       (usuario == 3 && pc == 2)) {
                       monedas += 20;
                       victorias++;
                       System.out.println("¡Ganaste!");
                    } else {
                      derrotas++;
                       System.out.println("Perdiste.");
                    }
                       System.out.println("Monedas actuales: " + monedas);
                       break;
                case 6:
                    if (monedas < 10) {
                      System.out.println("No tienes suficientes monedas.");
                      break;
                    }
                       monedas -= 10;
                       partidas++;

                       System.out.println("===== CARRERA DE CABALLOS =====");
                       System.out.println("1. Caballo 1");
                       System.out.println("2. Caballo 2");
                       System.out.println("3. Caballo 3");
                       System.out.println("4. Caballo 4");
                       System.out.println("5. Caballo 5");

                       System.out.print("Elige un caballo (1-5): ");
                       int elegido = entrada.nextInt();

                       int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
                   for (int ronda = 1; ronda <= 5; ronda++) {
                        System.out.println("------ RONDA " + ronda + " ------");

                        c1 += random.nextInt(3) + 1;
                        c2 += random.nextInt(3) + 1;
                        c3 += random.nextInt(3) + 1;
                        c4 += random.nextInt(3) + 1;
                        c5 += random.nextInt(3) + 1;

                        System.out.print("Caballo 1: ");
                   for (int i = 0; i < c1; i++) System.out.print("*");
                       System.out.println();
 
                       System.out.print("Caballo 2: ");
                   for (int i = 0; i < c2; i++) System.out.print("*");
                       System.out.println();

                        System.out.print("Caballo 3: ");
                   for (int i = 0; i < c3; i++) System.out.print("*");
                       System.out.println();

                       System.out.print("Caballo 4: ");
                   for (int i = 0; i < c4; i++) System.out.print("*");
                        System.out.println();

                        System.out.print("Caballo 5: ");
                   for (int i = 0; i < c5; i++) System.out.print("*");
                        System.out.println();
                    }

                        int ganador = 1;
                       int mayor = c1;

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
                      System.out.println(" El caballo ganador fue el Caballo " + ganador);
                    if (elegido == ganador) {
                       monedas += 50;
                        victorias++;
                        System.out.println(" ¡Felicidades! Ganaste 50 monedas.");
                    } else {
                        derrotas++;
                        System.out.println(" Tu caballo perdió.");
                    }
                        System.out.println("Monedas actuales: " + monedas);
                       break;
                case 7:
                    System.out.println("======================");
                    System.out.println("ESTADÍSTICAS");
                    System.out.println("======================");
                    System.out.println("Monedas: " + monedas);
                    System.out.println("Partidas: " + partidas);
                    System.out.println("Victorias: " + victorias);
                    System.out.println("Derrotas: " + derrotas);
                    if (partidas > 0) {
                        double porcentaje = (victorias * 100.0) / partidas;
                        System.out.println("Porcentaje de victorias: " + porcentaje + "%");
                    } else {
                        System.out.println("Porcentaje de victorias: 0%");
                    }
                    break;
             case 8:
                    System.out.println("======================");
                    System.out.println("FIN DEL CASINO");
                    System.out.println("======================");
                    System.out.println("Monedas finales: " + monedas);
                    System.out.println("Partidas: " + partidas);
                    System.out.println("Victorias: " + victorias);
                    System.out.println("Derrotas: " + derrotas);
                    System.out.println("Gracias por jugar.");
                    break;
             default:
                System.out.println("Opción incorrecta.");
            }

        }

    }

}