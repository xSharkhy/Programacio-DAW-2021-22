package unitatDidactica_06;

import java.util.*;

public class UD06_02v1 {
    static final Scanner sc = new Scanner(System.in);
    static final Random rd = new Random();
    static final StringBuilder sb = new StringBuilder();
    static final String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
    static final String numbers = "0123456789";
    static final HashMap<String, String> diccionario = new HashMap<>() {{
        put("espíritu", "spirit");
        put("pulir", "polish");
        put("morder", "bite");
        put("artesano", "craftsman");
        put("cubrir", "cover");
        put("pareja", "partner");
        put("lino", "linen");
        put("dibujo", "drawing");
        put("lesión", "injury");
        put("distinto", "distinct");
        put("lámpara", "lamp");
        put("número", "number");
        put("compromiso", "compromise");
        put("repetición", "repetition");
        put("negociación", "negotiation");
        put("obligar", "coerce");
        put("foro", "forum");
        put("provocar", "provoke");
        put("aprobación", "approval");
        put("empujar", "push");
    }};

    public static void main(String[] args) {
        UD06_02v1 program = new UD06_02v1();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 5 ) o salir ( 6 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer86();
                case 2 -> ejer87();
                case 3 -> ejer88();
                case 4 -> ejer89();
                case 5 -> ejer90();
                case 6 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer90() {
        String[] keys = new String[diccionario.size()];
        String[] values = new String[diccionario.size()];
        Integer[] indexes = new Integer[20];

        int i = 0;
        for (Map.Entry<String, String> mapEntry : diccionario.entrySet()) {
            keys[i] = mapEntry.getKey();
            values[i] = mapEntry.getValue();
            i++;
        }

        List<Integer> list = Arrays.asList(indexes);
        Arrays.setAll(indexes, j -> j);
        Collections.shuffle(list);
        list.toArray(indexes);

        byte aciertos = 0;
        byte fallos = 0;
        for (int j = 0; j < 5; j++) {
            System.out.printf("La palabra es... %s!%n", keys[indexes[j]]);
            String solucion = sc.nextLine();
            if (solucion.equalsIgnoreCase(values[indexes[j]])) aciertos++;
            else fallos++;
        }
        System.out.printf("%nHas acertado %d y has fallado %d!%n", aciertos, fallos);
    }

    public void ejer89() {
        while (true) {
            System.out.println("Introduce una palabra: ");
            String palabra = sc.nextLine();
            if (palabra.equalsIgnoreCase("salir")) break;
            else if (diccionario.containsKey(palabra))
                System.out.println("La tracucción es: " + diccionario.get(palabra));
            else System.out.println("No contenemos esa palabra!");
        }
    }

    private void ejer88() {
        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;
        int length = 10;
        for (int i = 0; i < length; i++) {
            int index = rd.nextInt(alphaNumeric.length());
            char rdChar = alphaNumeric.charAt(index);
            sb.append(rdChar);
        }
        String pass = sb.toString();
        System.out.println("PSST! Te soplo el Acceso del jefe...");
        System.out.println("Usuario: PacoKing");
        System.out.println("Contraseña: " + pass);
        System.out.println("\n¡¡¡ÁREA RESTRINGIDA!!!");
        HashMap<String, String> logIn = new HashMap<>();
        logIn.put("PacoKing", pass);
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce un usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Introduce una contraseña: ");
            String contra = sc.nextLine();
            if (!logIn.containsKey(usuario) || !logIn.containsValue(contra)) {
                System.out.printf("Fallo %d de 3%n", i);
                if (i == 2) {
                    System.out.println("Lo siento, no tienes acceso al área restringida");
                }
            } else {
                System.out.println("Ha accedido al área restringida");
                break;
            }
        }
    }

    private void ejer87() {
        ArrayList<Integer> numeros = new ArrayList<>();
        int random = (int) (rd.nextDouble() * 10 + 10);
        for (int i = 0; i < random; i++) {
            int ran_dom = (int) (rd.nextDouble() * 100);
            numeros.add(ran_dom);
        }
        for (int numero : numeros) System.out.println(numero);
    }

    private void ejer86() {
        ArrayList<String> companys = new ArrayList<>();
        companys.add("Raquel");
        companys.add("Tino");
        companys.add("Vicente");
        companys.add("Carp");
        companys.add("Javier");
        companys.add("Ximo");
        System.out.println("\n##########################\n");
        companys.forEach(System.out::println);
    }
}
