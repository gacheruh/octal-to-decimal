public class octalToDec{
    public static void main(String[] args) {
        System.out.println(octalToDecimal(63));
    }

    public static int octalToDecimal(int i){
        StringBuilder oct = new StringBuilder(Integer.toString(i));
        oct = oct.reverse();
        int dec;
        int sum = 0;

        for(int j = 0; j < oct.length(); j++){
            dec = (int)(Character.getNumericValue(oct.charAt(j)) * Math.pow(8, j));
            sum += dec;
        }

        return sum;
    }
}