package module2.HomeWork_2_1;

/**
 * Created by Admin on 28.01.2017.
 */
public class HomeWork_2_1 {

    public static void main(String[] args) {
        double[] doubArray = {-1.2, -1.5, 2.4, 2.5, 3.7, 3.5, 4.4, -4.5, 4.7, 4.9};
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, -9, 10};
        double doSum, doMin, doMax, doMaxPos, doMult, doSecLar;
        doSum =  doMaxPos = doSecLar = 0;
        doMult = 1;
        doMin = doMax = doubArray[0];
        int intSum, intMin, intMax, intMaxPos, intMult, intSecLar;
        intSum = intMaxPos = intSecLar = 0;
        intMult = 1;
        intMin = intMax = intArray[0];

        for (int i = 0; i < doubArray.length; i++) {
            doSum += doubArray[i];  // считаем суммы
            if (doMin > doubArray[i]) doMin = doubArray[i];
            if (doMax < doubArray[i]) doMax = doubArray[i];
            if (doMaxPos < doubArray[i] && doubArray[i] > 0) doMaxPos = doubArray[i];
            doMult *= doubArray[i]; // multiplication

            intSum += intArray[i]; // т.к размеры массивов одинаковы, то чтоб не повторяться.
            if (intMin > intArray[i]) intMin = intArray[i];
            if (intMax < intArray[i]) intMax = intArray[i];
            if (intMaxPos < intArray[i] && intArray[i] > 0) intMaxPos = intArray[i];
            intMult *= intArray[i];
        }
        for (int i = 0; i < 10 ; i++) {
            if (doSecLar < doubArray[i] && doubArray[i] != doMax) doSecLar = doubArray[i];
            if (intSecLar < intArray[i] && intArray[i] != intMax) intSecLar = intArray[i];

        }

        System.out.println("Sum double -> " + doSum);
        System.out.println("Sum int -> " + intSum);
        System.out.println("Min double -> " + doMin);
        System.out.println("Min int -> " + intMin);
        System.out.println("Max double -> " + doMax);
        System.out.println("Max int -> " + intMax);
        System.out.println("Max positive double -> " + doMaxPos);
        System.out.println("Max positive int -> " + intMaxPos);
        System.out.println("Multiple double -> " + doMult);
        System.out.println("Multiple int -> " + intMult);
        System.out.println("Modulus 1 double -> " + Math.abs(doubArray[0]) + "  Modulus last double -> " + Math.abs(doubArray[doubArray.length -1]));
        System.out.println("Modulus 1 ins -> " + Math.abs(intArray[0]) + "  Modulus last int -> " + Math.abs(intArray[intArray.length -1]));
        System.out.println("Second largest double -> " + doSecLar);
        System.out.println("Second largest int -> " + intSecLar);



    }
}
