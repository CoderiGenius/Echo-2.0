package text;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cross {
	//创建主构造方法
	public Cross(){
		
	}
	//需要查询的sentence
	private static String sentence;
	//需要查询的美音英音
	private boolean judge;
	private static final String URL = "http://dict-co.iciba.com/api/dictionary.php?key=A4A0D2D09749301B2126CD07D0A20D0E";

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<String> main(String unProcessed) throws UnsupportedEncodingException {
		List<String> fatch = null;
		List<String> fatched = new ArrayList();
		//String sentence = "this will be the best\ni can speak";

		// 创建List 以储存正则表达式处理后的结果
		List<String> List = null;
		List = Regex.Regexer(unProcessed);
		
		String[] tem = new String[List.size()];
		
		// 将数据依次get查询,得到json值并储存进tem数组
			for (int i = 0; i < List.size(); i++) {
			tem[i] = HttpGetPost.sendGet(URL, List.get(i));
			
		// 将数据储存于List fatch中
			if (i == 0) {
				fatch = new ArrayList(Arrays.asList(tem[i]));
			} else
				fatch.addAll(Arrays.asList(tem[i]));
		}

		
		for (int i = 0; i < fatch.size(); i++) {
			// System.out.println(fatch.get(i));
			String tem1 = null;
			tem1 = FastJson.parseResponseData(fatch.get(i));
			if (tem1 == null)
				continue;
			else
				fatched.add(tem1);
		}
		
		System.out.println(fatched);
		return fatched;

	}
}
