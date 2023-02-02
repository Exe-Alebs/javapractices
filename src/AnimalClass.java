/*
create a program to show loading message to your application users
 */
public class AnimalClass {
    public static void main(String[] args) {
        Loading loading = new Loading();
        loading.LoadingMessage();
    }
}
    class Loading {
        public static void LoadingMessage(){
            System.out.println("Loading");
        }
    }

