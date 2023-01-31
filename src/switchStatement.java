import java.util.Scanner;
 public class switchStatement {
     public static void main(String[] args){
         Scanner emotionReader = new Scanner(System.in);
         int emotion = emotionReader.nextInt();
          switch(emotion){
            case 1:
            System.out.println("You are happy");
break;     case 2:
                System.out.println("You are Sad");
 break;          case 3:
                  System.out.println("You are Angry");
 break;       case 4:
                  System.out.println("You are Surprised");
break;
              default:
             System.out.println("Unknown Emotions");
}
}
}