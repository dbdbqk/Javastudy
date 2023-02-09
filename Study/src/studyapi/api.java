package studyapi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class api {
	public static void ex02() {
		
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth";
		String serviceKey = "6zNEYvSwCWrEUa2z2+gfvYOLXnZoiH7X3coYmPYw/nGHGWHAE4knIzsDVlvjlrCiG6elMU98fcime4+KVPKHMQ==";
		URL url = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		HttpURLConnection con = null;
		
		try {
			StringBuilder sbURL = new StringBuilder();
			
			sbURL.append(apiURL);
			sbURL.append("?serviceKEY=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&returnType=json");
			sbURL.append("&searchDate=2023-01-30");
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content=Type", "application/json; charset=UTF-8");
			
			int response = con.getResponseCode();
			if(response == 200) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			con.disconnect();
			reader.close();
			Bean bean = null;
			JSONObject good = new JSONObject(sb.toString()).getJSONObject("response").getJSONObject("body");
			bean = new Bean(good);
			
			JSONArray array = null;
			array = bean.getObj().getJSONArray("items");
			System.out.println(array.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		ex02();
		
	}

}
