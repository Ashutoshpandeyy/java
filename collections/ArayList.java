import java.util.ArrayList;
public class ArayList {
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ashu");
        arrayList.add(":");
        arrayList.add("How");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.get(0));
        // for(int i=0;i<arrayList.size();i++)
        // {
        //     System.out.println(arrayList.get(i));
        // }
        // foreach Loop
        for(Object i:arrayList)
        {
            System.out.println(i);

        }

    }
    
}
