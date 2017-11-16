package text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HttpGetPost
{

	// MySql�������ݿ�����
	// GRANT ALL PRIVILEGES ON *.* TO 'admin'@'10.22.69.182' IDENTIFIED BY
	// '123456' WITH GRANT OPTION;
	// flush privileges; //�޸���Ч
	// public static final String
	// BASE_URL="http://127.0.0.1:808/MyWebSite_01/InsertTmpServlet";
	public static final String BASE_URL = "http://dict-co.iciba.com/api/dictionary.php";

	/**
	 * ��ָ��URL����GET����������
	 * 
	 * @param url
	 *            ���������URL
	 * @param param
	 *            ����������������Ӧ����name1=value1&name2=value2����ʽ��
	 * @return URL������Զ����Դ����Ӧ
	 */

	public static String sendGet(String url, String param)
	{
		String result = "";
		BufferedReader in = null;
		try {
			String urlName = url + "&" + "w=" + param + "&type=json";
			// Log.i("ConnUtil", urlName);
			System.out.println(urlName);
			URL realUrl = new URL(urlName);
			// �򿪺�URL֮�������
			URLConnection conn = realUrl.openConnection();
			// ����ͨ�õ���������
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
			// ���ó�ʱʱ��
			conn.setConnectTimeout(10000);
			conn.setReadTimeout(10000);
			// ����ʵ�ʵ�����
			conn.connect();
			// ��ȡ������Ӧͷ�ֶ�
			Map<String, List<String>> map = conn.getHeaderFields();
			// �������е���Ӧͷ�ֶ�
			for (String key : map.keySet()) {
				map.get(key);
			}
			try {
				// System.out.println(conn.getInputStream());
				// ����BufferedReader����������ȡURL����Ӧ
				in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line;
				while ((line = in.readLine()) != null) {
					result += "\n" + line;
				}
			} catch (Exception e) {
				System.out.println("123");
			}
		} catch (Exception e) {
			result = "Get:����������ʧ�ܣ�";
			e.printStackTrace();
		}
		// ʹ��finally�����ر�������
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(result);
		return result;
	}
}