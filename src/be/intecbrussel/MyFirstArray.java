package be.intecbrussel;

public class MyFirstArray {

    public static void main(String[] args) {

        int[] myArr = new int[5];
        myArr[0] = 10;
        myArr[1] = 20;
        myArr[4] = 5;

        System.out.println(myArr[1]);

        myArr[1] = 3000;

        System.out.println(myArr[1]);


        byte[] myArr1 = new byte[1];
        myArr1[0] = 89;
        System.out.println(myArr1[0]);

        short[] myArr2 = new short[2];
        myArr2[1] = 456;
        System.out.println(myArr2[1]);

        long[] myArr3 = new long[3];
        myArr3[2] = 5679878;
        System.out.println(myArr3[2]);

        float[] myArr4 = new float[4];
        myArr4[3] = 65.765F;
        System.out.println(myArr4[3]);

        double[] myArr5 = new double[5];
        myArr5[4] = 6754365.89789654;
        System.out.println(myArr5[4]);

        boolean[] myArr6 = new boolean[7];
        myArr6[1] = true;
        System.out.println(myArr6[0]);

        char[] myArr7 = new char[8];
        myArr7[5] = 'l';
        System.out.println(myArr7[5]);

        String[] myArr8 = new String[9];
        myArr8[1] = "hello";
        System.out.println(myArr8[1]);
        System.out.println(myArr8.length);


        String[] names = {"john", "joey"};
        System.out.println(names.length);
        double[] numbers = {10.0, 25.9, 78.9, 65.987};
        System.out.println(numbers[3]);
        System.out.println(numbers);

        for(int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }


        String[] myStr = {"Avi", "Halil", "Nikita"};

        for(int index = 0; index < myStr.length; index++) {
            System.out.println(myStr[index]);
        }

        float[] myFlo = {32.9F, 56.8F, 37};

        for(int index = 0; index < myFlo.length; index++) {
            System.out.println(myFlo[index]);
        }


        // for each
        for(double num : numbers) {
            System.out.println(num);
        }

        for (String str : myStr) {
            System.out.println(str);
        }


        int sum = 0;
        int[] numb = {1,2,3,4,5,6,7,8,9,10};
        for (int index = 0; index < numb.length; index++) {
            sum += numb[index];
        }
        System.out.println(sum);


        double summ = 0;
        double[] deciNumb = {10.5, 20.8, 33.45};
        for (int index = 0; index < deciNumb.length; index++) {
            summ += deciNumb[2]; ///... -> deciNumb[index]
        }
        System.out.println(summ);


    }
}
