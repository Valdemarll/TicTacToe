package Lesson4.Task1;

public class IntArray {

    protected int[] add(int[] array1, int[] array2){
        int[] newArray = new int[array1.length];
        for(int i=0; i<array1.length; i++){
            newArray[i] = array1[i] + array2[i];
        }
        return newArray;
    }

    protected int[] extend(int[] array1, int[] array2){
        int[] newArray = new int[array1.length + array2.length];
        for(int i=0; i<newArray.length; i++){
            if (i<array1.length) {
                newArray[i] = array1[i];
            }else{
                newArray[i] = array2[i - array1.length];
            }
        }
        return newArray;
    }

    protected boolean compare(int[] array1, int[] array2){
        if (array1.length == array2.length){
            for (int num : array1){
                if (countArray(array1, num) != countArray(array2, num)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    protected int[] append(int[] array, int el){
        int[] newArray = new int[array.length + 1];
        for (int i=0; i<array.length; i++){
            newArray[i] = array[i];
        }
        newArray[array.length] = el;
        return newArray;
    }

    protected int[] remove(int[] array, int el){
        if (countArray(array, el) > 0){
            int[] newArray = new int[array.length - countArray(array, el)];
            int j = 0;
            for (int i=0; i<array.length; i++){
                if (array[i] != el){
                    newArray[j] = array[i];
                    j += 1;
                }
            }
            return newArray;
        }
        return array;
    }

    protected String print(int[] array){
        String res = "";
        for (int el : array){
            res += Integer.toString(el) + " ";
        }
        return res;
    }

    protected int countArray(int[] array, int num){
        int count = 0;
        for (int i : array){
            if (i == num){
                count += 1;
            }
        }
        return count;
    }


}
