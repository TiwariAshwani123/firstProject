import java.util.Scanner;

class RemoveDupChar{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    System.out.println("Enter the Word :");

    String word = sc.nextLine();
    char[] ca = word.toCharArray();

    for(int i = 0 ; i < ca.length ; i++){
      boolean flag = false;

      for(int j = i+1 ; j < ca.length ; j++){
        if(ca[i] == ca[j]){
          flag = true;
          break;
        }
      }

      if(!flag){
        sb.append(ca[i]);
      }
    }

    System.out.println(sb);
    sc.close();
  }
}