package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMainClass {

	public static void ex01() {
		
		String serviceKey = "6zNEYvSwCWrEUa2z2+gfvYOLXnZoiH7X3coYmPYw/nGHGWHAE4knIzsDVlvjlrCiG6elMU98fcime4+KVPKHMQ==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			
			String sidoName = "서울";
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?serviceKEY=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&returnType=json");
			sbURL.append("&sidoName=" + URLEncoder.encode(sidoName, "UTF-8"));
			
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
			StringBuilder sb = new StringBuilder();
			String line = null;
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			//굉장히 중요한 부분 JSON 파싱(분석) 꼭 꼭 꼭 공부
			JSONObject obj = new JSONObject(sb.toString());
			JSONObject body = obj.getJSONObject("response").getJSONObject("body");
			JSONArray items = body.getJSONArray("items");
			
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				String stationName = item.getString("stationName");
				String pm10Value = item.getString("pm10Value");
				String o3Value = item.getString("o3Value");
				System.out.println(stationName + " : 미세먼지 - " + pm10Value + ", 오존농도 - " + o3Value);
			}
			
		/*	File file = new File("C:" + File.separator + "storage", "대기.json");
			writer = new BufferedWriter(new FileWriter(file));
			
			writer.write(sb.toString());
			writer.close();
			System.out.println("대기.json 파일 생성 완료");
			*/
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
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
			JSONArray items = new JSONObject(sb.toString()).getJSONObject("response").getJSONObject("body").getJSONArray("items");
			
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				System.out.println(item.getString("frcstOneDt") + " : " + item.getString("frcstOneCn"));
				System.out.println(item.getString("frcstTwoDt") + " : " + item.getString("frcstTwoCn"));
				System.out.println(item.getString("frcstThreeDt") + " : " + item.getString("frcstThreeCn"));
				System.out.println(item.getString("frcstFourDt") + " : " + item.getString("frcstFourCn"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex02();
		
	}

}
