package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiMain {

	public static void main(String[] args) {
		String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
		String serviceKey = "6zNEYvSwCWrEUa2z2+gfvYOLXnZoiH7X3coYmPYw/nGHGWHAE4knIzsDVlvjlrCiG6elMU98fcime4+KVPKHMQ==";
		URL url = null;
		BufferedReader reader = null;
		BufferedWriter bw = null;
		HttpURLConnection con = null;
		
		
		try {
			StringBuilder sbURL = new StringBuilder();
			
			
			sbURL.append(apiURL);
			sbURL.append("?serviceKEY=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&searchYear=2021");
			sbURL.append("&siDo=1100");
			sbURL.append("&guGun=1125");
			sbURL.append("&Type=json");	
			sbURL.append("&numOfRows=10");	
			sbURL.append("&pageNo=1");	
			
			
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
			String day;
			File file = new File("C:" + File.separator + "storage", "accident.txt");
		    JSONArray items = new JSONObject(sb.toString()).getJSONObject("items").getJSONArray("item");
			List<Accident> accidentList = new ArrayList<Accident>();
			bw = new BufferedWriter(new FileWriter(file));
			for(int i = 0; i < items.length(); i++) {
			    	JSONObject item = items.getJSONObject(i);
					switch(item.getInt("occrrnc_day_cd")) {
					case 1: day = "일요일" ; break;
					case 2: day = "월요일" ; break;
					case 3: day = "화요일" ; break;
					case 4: day = "수요일" ; break;
					case 5: day = "목요일" ; break;
					case 6: day = "금요일" ; break;
					default: day = "토요일";
					}
					Accident accident = new Accident(item.getString("occrrnc_dt"), day, item.getInt("dth_dnv_cnt"), item.getInt("injpsn_cnt"));
					accidentList.add(accident);
			    	bw.write(("발생일자 " + accidentList.get(i).getOccrrncDt() + " " + accidentList.get(i).getOccrrncDaycd() + ", 사망자수 " + accidentList.get(i).getDthDnvCnt() + "명, 부상자수 " + accidentList.get(i).getInjpsnCnt() + "명" + '\n'));
			    }
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
