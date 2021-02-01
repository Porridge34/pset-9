public class ProblemSet9 {
    public int[] evenOdd(int[] arr) {
        if(arr != null) {
            int[] result = new int[arr.length];
            int[] odd = new int[arr.length];
            int evencount = 0;
            int oddcount = 0;
            for (int i : arr) {
                if (i % 2 == 0) {
                    result[evencount] = i;
                    evencount++;
                } else {
                    odd[oddcount] = i;
                    oddcount++;
                }
            }
            for (int i = evencount; i < arr.length; i++) {
                result[i] = odd[i - evencount];
            }
            return result;
        }
        return null;
    }

    public int[] notAlone(int[] arr, int alone) {
        if (arr != null && arr.length != 0){
            int[] result = new int[arr.length];
            for (int i = 0; i < arr.length; i++){
                result[i] = arr[i];
            }
            for (int i = 1; i < arr.length - 1; i++){
                if (result[i] == alone && result[i - 1] != alone && result[i + 1] != alone) {
                    if (result[i - 1] > result[i + 1]) {
                        result[i] = result[i - 1];
                    }
                    else{
                        result[i] = result[i + 1];
                    }
                }
            }
            return result;
        }
        return null;
    }

    public int[] shiftLeft(int[] arr) {
        if(arr != null) {
            if (arr.length == 0) {
                return arr;
            }
            int[] result = new int[arr.length];
            for (int i = 0; i < arr.length - 1; i++) {
                result[i] = arr[i + 1];
            }
            result[arr.length - 1] = arr[0];
            return result;
        }
        return null;
    }

    public int[] fillIn(int start, int end) {
        if (start <= end) {
            int[] result = new int[end - start];
            for (int i = 0; i < end - start; i++) {
                result[i] = start + i;
            }
            return result;
        }
        return null;
    }

    public boolean triple(int[] arr) {
        if (arr != null) {
            int threecount = 0;
            for (int i : arr){
                if (i == 3) {
                    threecount++;
                }
            }
            if (threecount == 3) {
                return true;
            }
        }
        return false;
    }

    public int pairs(int[] a, int[] b) {
        if (a != null && b != null && a.length == b.length) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (Math.abs(a[i] - b[i]) <= 3 && a[i] != b[i]) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    public boolean twentyFour(int[] arr) {
        if (arr != null) {
            boolean twoTrue = false;
            boolean fourTrue = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == 4 && arr[i - 1] == 4){
                    fourTrue = true;
                }
                else if (arr[i] == 2 && arr[i - 1] == 2){
                    twoTrue = true;
                }
            }
            if (twoTrue == true && fourTrue == true){
                return false;
            }
            else if (twoTrue == true || fourTrue == true) {
                return true;
            }
        }
        return false;
    }

    public boolean fourteen(int[] arr) {
        if (arr != null) {
            for (int i : arr) {
                if (i != 4 && i != 1) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int centeredAverage(int[] arr) {
        if (arr != null && arr.length >= 3) {
            int largest = arr[0];
            int smallest = arr[0];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            sum -= (largest + smallest);
            return (sum / (arr.length - 2));
        }
        return -1;
    }

    public int outliers(int[] arr) {
        if (arr != null && arr.length >= 1) {
            int smallest = arr[0];
            int largest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            return (largest - smallest);
        }
        return -1;
    }
}
