package text;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@SuppressWarnings("hiding")
public class FastJson{
public  static String parseResponseData(String responseStr) {
    String result = null;
    try {
        JSONObject object = JSON.parseObject(responseStr);
      
        //��ȡJson��symbols�µ����ݣ�������ph_en��ph_am��
       // System.out.println(object.getString("symbols"));
        JSONArray jsonArray = JSON.parseArray(object.getString("symbols"));
        JSONObject jsObj2=JSON.parseObject(jsonArray.get(0).toString());
        //System.out.println(jsObj2.getString("ph_en"));
        result = jsObj2.getString("ph_am");
        
        //JSONArray jsonArray = object.getJSONArray("symbols");
        //result = JSON.parseArray(jsonArray.toJSONString(), TopTripType.class);
       // System.out.println(jsonArray.toJSONString());
       // System.out.println("///"+result);
    } catch (Exception e) {
       
        System.out.println("erro");
       
    }
    return result;

}}