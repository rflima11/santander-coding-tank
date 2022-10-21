public class Array {

    public static void main(String[] args) {

//        int[] arrayInteiros = new int[3];
//
//        arrayInteiros[0] = 3;
//        arrayInteiros[1] = 5;
//        arrayInteiros[2] = 7;
//
//        System.out.println(arrayInteiros[0]);
//        System.out.println(arrayInteiros[1]);
//        System.out.println(arrayInteiros[2]);
//
//        String[] arrayStrings = new String[2];
//
//        System.out.println("========================================");
//
//        System.out.println(arrayStrings[0]);
//        System.out.println(arrayStrings[1]);
//
//        System.out.println("========================================");
//
//        int[] arrayInteiros2 = {1,2,3,4,5,6};
//        int[] arrayInteiros3 = new int[]{1,2,3};
//
//
//        for(int i = 0; i < arrayInteiros2.length; i++) {
//            if (arrayInteiros2[i] == 3) {
//                System.out.println("O objeto está no índice " + i);
//            }
//        }
//
//        for(int inteiro : arrayInteiros2) {
//            if (inteiro == 3)
//                System.out.println("Existe o valor 3 no arrayInteiros2");
//        }

        int[][] matriz = new int[3][];
        matriz[0] = new int[5];
        matriz[1] = new int[3];

        int[][] arrayMultidimensaoInt = new int[2][2];

        arrayMultidimensaoInt[0][0] = 3;
        arrayMultidimensaoInt[0][1] = 5;

        arrayMultidimensaoInt[1][0] = 10;
        arrayMultidimensaoInt[1][1] = 12;


//        for(int i = 0; i < arrayMultidimensaoInt.length; i++) {
//            for(int j = 0; j < arrayMultidimensaoInt[i].length; j++) {
//                System.out.print(arrayMultidimensaoInt[i][j] + " ");
//            }
//            System.out.println();
//        }


//        int[][] matrizInteiros = new int[3][2];
//        matrizInteiros[0][0] = 5;
//        matrizInteiros[0][1] = 10;
//
//        matrizInteiros[1][0] = 20;
//        matrizInteiros[1][1] = 30;
//
//        matrizInteiros[2][0] = 40;
//        matrizInteiros[2][1] = 50;

        int[][] matrizInteiros = {{5,10}, {20,30,50,40}, {40,50,1,2,3,4,5,7}};

        for(int i = 0; i < matrizInteiros.length; i++) {
            for(int j = 0; j < matrizInteiros[i].length; j++) {
                System.out.print(matrizInteiros[i][j] + " ");
            }
            System.out.println();
        }
    }




}


