import java.util.*;

class Dictionaries{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name,phone);    
        }
        // System.out.println(map);
        ArrayList<String> arr = new ArrayList<>();
        while(in.hasNext()){
            String s = in.next();
            arr.add(s);
        }
        for(int i=0; i<arr.size(); i++){
            if(map.containsKey(arr.get(i))){
                System.out.println(arr.get(i)+"="+map.get(arr.get(i)));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}