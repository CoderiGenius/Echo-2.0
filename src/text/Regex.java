package text;
import java.util.*;
public class Regex
{
	static int h;

	@SuppressWarnings({ "null", "rawtypes", "unchecked" })
	public static List<String> Regexer(String sentence)
	{
		int i;
		List<String> List = null;

		// ��һ���и���ж����и�
		String regex1 = ",";
		String regexed1 = sentence.replace(","," ");
		String regex2 = ".";
		
		
			String regexed2 = regexed1.replace("."," ");
		System.out.println(regexed2);
		// �ڶ����и���б����źͿո���и�
		String regex3 = " ";
		
			String[] tem = regexed2.split(regex3);
			for(i=0;i<tem.length;i++){
			if (i == 0) 
			{
				List = new ArrayList(Arrays.asList(tem[i]));
			} 
			else
			List.addAll(Arrays.asList(tem[i]));
			System.out.println(List);
			}
		return List;

	}
}
