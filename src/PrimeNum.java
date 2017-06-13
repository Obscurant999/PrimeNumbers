/**
 * Created by 057000-07165 on 13.06.2017.
 */
public class PrimeNum {

    int array1[];

    PrimeNum() {

    }

    void createArray() {
        array1 = new int[200];
        for (int i = 2; i < array1.length; i++) {
            array1[i] = 1;
        }
        array1[0] = 0;
        array1[1] = 0;
    }

    void setPrimeNumbers() {
        for (int i = 2; i < array1.length; i++) {
            if (array1[i] == 1) {
                for (int j = 2; (i*j) < array1.length; j++) {
                    array1[i*j] = 0;
                }
            }
        }
    }

    void getPrimeNumbers() {
        for (int k = 0; k < array1.length; k++) {
            if (array1[k] == 1) {
                System.out.println(k);
            }
        }
    }
}