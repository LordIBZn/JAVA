public class TemperaturaIfAnidado {
    public static void main(String[] args) {
        int temperatura = 4;
        boolean nevando = true;

        if (temperatura > 15) {
            if (temperatura > 25) {
                // Si la temperatura es mayor que 25 ...
                System.out.println("A la playa!!!");
            } else {
                System.out.println("A la montaña!!!");
            }
        } else if (temperatura < 5) {
            if (nevando) {
                System.out.println("A esquiar!!!");
            }
        } else {
            System.out.println("A descansar... zZz");
        }

        // while(boolean_expresion){
        //     //Todo
        // }
    }
}
