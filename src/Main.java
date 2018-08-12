import java.io.*;

public class Main {

/*
    В каждом слове сонета Вильяма Шекспира заменить первую букву слова
    на прописную.
*/

    public static void main(String[] args) {

        try {
            FileInputStream fs = new FileInputStream("Text.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));
            String line;

            while ((line=br.readLine()) != null){
                String[] inputLineWords = line.split(" ");

                for (int i=0; i<inputLineWords.length; i++){
                    String uppercasedLetter = inputLineWords[i].substring(0, 1).toUpperCase();
                    String uppercasedWord = uppercasedLetter + inputLineWords[i].substring(1);
                    System.out.print(uppercasedWord + " ");
                }
                System.out.print("\n");
            }

        }catch (IOException e){
            System.out.println("Ошибка");
        }

    }
}
