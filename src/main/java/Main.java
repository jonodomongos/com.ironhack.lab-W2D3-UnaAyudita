import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    INSTRUCCIONES:
    1. SWITCH:
    Preguntas estación del año. Mediante un switch, respondes una cosa u otra.
    Ejemplo "primavera". Respuesta: "la primavera me alteraaa".

    2. WHILE:
    Una asociación benéfica te envía a pedir caridad. Preguntas "una ayudita?"
    Si te dicen que sí, preguntas cuánto quieren poner. Si te dicen que no, te deprimes y te vas para tu casa.
    Al final, tienes que decir cuánta gente te ha ayudado y cuánto dinero has recaudado.

    3. SWITCH - WHILE:
    El archivo sonoro!
    Usando una variable byte, preguntas cuál de los sonidos quieres escuchar.
    Cuando eligen un número, aparece la onomatopeya de ese sonido.
    Luego le preguntas: quieres escuchar otro? Y sigue hasta que diga no.

    Ejemplo: elige 1- cohete, y suena ziuuum!, elige 3- moto, y suena brrrmmm!
    Puedes probar la opción do...while para asegurar de que pregunta al menos una vez.
    */
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 1:");
        ejercicioSwitch(sc);

        System.out.println("\nEJERCICIO 2:");
        ejercicioWhile(sc);

        System.out.println("\nEJERCICIO 3:");
        ejercicioSwitchWhile(sc);

        sc.close();
    }

    // Ejercicio 1
    public static void ejercicioSwitch(Scanner sc) {
        System.out.print("¿Cuál es tu estación del año favorita? ");
        String estacion = sc.nextLine().toLowerCase();

        switch (estacion) {
            case "primavera":
                System.out.println("🌸 La primavera, la sangre altera!");
                break;
            case "verano":
                System.out.println("☀️ Hace un calor que TETOrras!");
                break;
            case "otoño":
                System.out.println("🍂 Cuando no sabes si llevar manga corta o abrigo polar.");
                break;
            case "invierno":
                System.out.println("❄️ Plan perfecto: peli+manta❤️");
                break;
            default:
                System.out.println("Estación no válida!");
        }
    }

    // Ejercicio 2
    public static void ejercicioWhile(Scanner sc) {
        int personas = 0;
        double total = 0;

        System.out.println("Asociación benéfica: ¿una ayudita? (sí/no)");
        String respuesta = sc.nextLine().toLowerCase();

        while (respuesta.equals("sí") || respuesta.equals("si")) {
            System.out.print("¿Cuánto quieres donar?: ");
            double cantidad = sc.nextDouble();
            sc.nextLine(); // limpiar buffer

            personas++;
            total += cantidad;

            System.out.println("¿Otra persona quiere ayudar? (sí/no)");
            respuesta = sc.nextLine().toLowerCase();
        }

        System.out.println("\nTe han ayudado " + personas + " personas, con un total de " + total + "€ recaudados.");
    }

    // Ejercicio 3
    public static void ejercicioSwitchWhile(Scanner sc) {
        byte opcion;
        String continuar;

        do {
            System.out.println("\n--- ARCHIVO SONORO ---");
            System.out.println("1 - Cohete");
            System.out.println("2 - Perro");
            System.out.println("3 - Moto");
            System.out.println("4 - Campana");
            System.out.print("Elige un sonido (1-4): ");

            opcion = sc.nextByte();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("🚀 Ziuuuuum!");
                    break;
                case 2:
                    System.out.println("🐶 Guau, guau!");
                    break;
                case 3:
                    System.out.println("🏍️ Brrrmmm!");
                    break;
                case 4:
                    System.out.println("🔔 Ding dong!");
                    break;
                default:
                    System.out.println("Opción no válida!");
            }

            System.out.print("¿Quieres escuchar otro sonido? (sí/no): ");
            continuar = sc.nextLine().toLowerCase();

        } while (continuar.equals("sí") || continuar.equals("si"));
    }
}