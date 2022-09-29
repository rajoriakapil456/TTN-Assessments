import java.util.*;
class Main {
    public static void main(String[] args)
    {
        List<Float> list=new ArrayList<Float>();
        list.add(1.2f);
        list.add(3.1f);
        list.add(4.5f);
        list.add(9.1f);
        list.add(6.7f);
        Iterator<Float> it = list.iterator();
        Float s = 0f;
        while(it.hasNext())
        {
            s+= it.next();
        }
        System.out.println(s);
    }
}
