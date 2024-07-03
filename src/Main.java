//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ChecaString verifica = new ChecaString();

        System.out.println(verifica.ChecaStr("Programação", "ão"));

        System.out.println(verifica.ChecaStr("olá", "mundo"));

        System.out.println(verifica.ChecaStr("", "abc"));

        System.out.println(verifica.ChecaStr("Teste", "te"));

    }
}
