public class EstruturaDeRepeticao {

    //while, do while e o for

    public static void main(String[] args) {

//        int contador = 0;
//        while (contador < 10) {
//            System.out.println(contador++);
//            if (contador == 6) {
//                break;
//            }
//        }

//        int contador = 0;
//        do {
//            System.out.println("Dentro do DO");
//            contador++;
//        } while (contador < 10);

        // 1   2   3   4   5
        // [], [], [], [], []
        //  0, 1,  2,  3,  4
        int arrayInteiros[] = new int[5];
        arrayInteiros[0] = 1;
        arrayInteiros[1] = 2;
        arrayInteiros[2] = 3;
        arrayInteiros[3] = 4;
        arrayInteiros[4] = 5;

        String[] arrayString = new String[3];
        arrayString[0] = "Teste";


        for (int i = arrayInteiros.length - 1; i >= 0; i--) {
            System.out.println(arrayInteiros[i]);
        }

    }

}
