
import java.util.*;

public class program {

    public static void main (String[] args){
        Pbook();
    }

    public static void Pbook(){
        PhoneBook pb = new PhoneBook();

        pb.add("fox", "11111");
        pb.add("bear", "22222");
        pb.add("wolf", "333333");
        pb.add("fox", "44444");
        pb.add("raven", "55555");
        pb.add("raven", "666666");
        pb.add("dog", "777777");
        pb.add("dog", "888888");
        pb.add("cat", "999999");
        pb.add("cat", "00000000");
      
        Scanner in = new Scanner(System.in);
        System.out.print("Input a abonent: ");
        String abonent = in.nextLine();

        System.out.printf(abonent + " - " + pb.get(abonent));
    

        
    }

    static class PhoneBook{
        private final Map<String, ArrayList<String>> book = new HashMap<>();

        public void add(String name, String phone) {
            ArrayList<String> phoneList;
            if (book.containsKey(name)) {
                phoneList = book.get(name);
            } else {
                phoneList = new ArrayList<>();
            }
            phoneList.add(phone);
            book.put(name, phoneList);
        }

        public List<String> get(String name) {
            return book.get(name);
        }
    }
}
