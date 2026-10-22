
        public class Main {
            public static void main(String[] args) {

                Contador miContador = new Contador(5);


                miContador.incrementar();
                miContador.incrementar();
                System.out.println("Valor actual: " + miContador.getValor());

                miContador.decrementar();
                System.out.println("Valor tras decrementar: " + miContador.getValor());

                miContador.resetear();
                System.out.println("Valor tras resetear: " + miContador.getValor());
            }
        }


