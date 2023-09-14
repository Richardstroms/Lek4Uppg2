import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbordet = new Scanner(System.in);   
        System.out.println("");
        System.out.println("Hej! Mata in en text:");
        String text = tangentbordet.nextLine();
        int storlek = text.length();
        System.out.println(text+" innehåller "+storlek+" bokstäver");

        String word ="i";
        int word_index = text.indexOf(word);
        System.out.println("bokstaven "+word+" ligger på plats "+word_index);
    }
}
