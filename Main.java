import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }*/
        String str=sc.next();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            /*if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }*/
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);

        }
        int t=sc.nextInt();
        while(t-->0)
        {
            char c=sc.next().charAt(0);
            System.out.println(map.get(c));
        }
        /*int t=sc.nextInt();
        while(t-->0)
        {
            int n1=sc.nextInt();
            System.out.println(map.get(n1));
        }*/
    }
}