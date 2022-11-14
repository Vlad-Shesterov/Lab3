package Lab3;

public class Task9 {
    public static void main(String[] args) {
        int arr_size = 10;
        char[] requiredArray = new char[arr_size];
        char[] excSymArray = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char current_symbol = 'A';
        int counter_char;
        int counter_array_length;

        for(counter_char = 0; counter_char < arr_size; current_symbol++)
        {
            for(counter_array_length = 0; counter_array_length < excSymArray.length; counter_array_length++) {
                if (current_symbol == excSymArray[counter_array_length]) {
                    current_symbol++;
                else requiredArray[counter_char] = current_symbol;
            }
            counter_char++;
        }
        for (char c : requiredArray) {
            System.out.print(c + " ");
        }
    }
}

