import java.util.Set;
import java.util.HashSet;
public class subArray0Sum 
{
    public static boolean subArrayWith0Sum(int a[])
    {
        int n=a.length;
        Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum += a[i];
			if(set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
    }
    public static void main(String[] args) 
    {
        int a[] = {2, 3, 1, -4, 4, -2};
        System.out.println(subArrayWith0Sum(a));
    }
}
