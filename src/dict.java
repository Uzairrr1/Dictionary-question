import java.util.*;

class Dict {
    static HashMap<String, List<String>> dic = new HashMap<>();
    public static void main(String[] args) {
        System.out.print("Enter the word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.print("Enter no of meanings: ");
        Scanner scc = new Scanner(System.in);
        int n= scc.nextInt();
        for (int i =1;i<=n;i++) {
            String meaning1 = sc.nextLine();
            add(word, meaning1);
        }
        System.out.println(dic);
    }
    public static void add(String word, String meaning)
    {
        if(dic.containsKey(word)){
            List<String> list=dic.get(word);
            list.add(meaning);
            dic.put(word,list);
        }
        else {
            List<String> list=new ArrayList<>();
            list.add(meaning);
            dic.put(word,list);
        }
    }
}
