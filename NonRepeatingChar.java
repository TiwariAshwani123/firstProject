//To Search the first non repeating character

public class NonRepeatingChar {

  public static void main(String[] args) {
    String word = args[0];

    System.out.println("Enter Word is : " + word);

    for (int i = 0; i < word.length(); i++) {
      boolean flag = false;
      for (int j = 0; j < word.length(); j++) {
        if (i != j && word.charAt(i) == word.charAt(j)) {
          flag = true;
          break;
        }
      }

      if (!flag) {
        System.out.println(word.charAt(i));
        break;
      }
    }
  }
}
