import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("String invertida: " + reversed);

        scanner.close();
    }

    public static String reverseString(String str) {
        // Converte a string para um array de caracteres
        char[] charArray = str.toCharArray();

        // Inverte os caracteres no array
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            // Troca os caracteres de posição
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            // Move para os próximos caracteres
            left++;
            right--;
        }

        // Converte o array de caracteres de volta para uma string
        return new String(charArray);
    }
}