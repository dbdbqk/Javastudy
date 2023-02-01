package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class XMLMainClass {

	public static void ex01() {
		/*
		   한국공항공사_항공기 운항정보 : 공항 코드 정보
		   1. 서비스 URL : http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList
		   2. 요청 변수(Request Parameter)
		   	1) ServiceKey : 인증키
		*/
	
		
		// 보통은 디코딩 -> 인코딩 이걸로 공부 
		String serviceKey ="6zNEYvSwCWrEUa2z2+gfvYOLXnZoiH7X3coYmPYw/nGHGWHAE4knIzsDVlvjlrCiG6elMU98fcime4+KVPKHMQ==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			
			
		//순서대로작업
		apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
		url = new URL(apiURL);
		con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");
		con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");
		
		int responseCode = con.getResponseCode();
		if(responseCode == 200) {	// HttpURLconnerction.HTTP_OK 200을 의미 동일함
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
		}else {
			reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
		}
		
		String line = null;
		StringBuilder sb = new StringBuilder();
		while((line = reader.readLine()) != null) {
			sb.append(line);
		}
		
		reader.close();
		con.disconnect();
		
		File file = new File("C:" + File.separator + "storage", "공항코드정보.xml");
		writer = new BufferedWriter(new FileWriter(file));
		writer.write(sb.toString());
		writer.close();
		System.out.println("공항코드정보.xml이 생성되었습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	
	
	}
	
	public static void ex02() {
		
		/*
		   한국공항공사_항공기 운항정보 : 국제선 운항 스케줄
		   1. 서비스 URL : http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList
		   2. 요청 변수(Request Parameter)
		   	1) serviceKey : 인증키
		   	2) pageNo : 조회할 페이지번호
		   	3) schDate : 검색일자
		   	4) schDeptCityCode : 출발도시코드
		   	5) schArrvCityCode : 도착도시코드
		*/
		
		String serviceKey ="6zNEYvSwCWrEUa2z2+gfvYOLXnZoiH7X3coYmPYw/nGHGWHAE4knIzsDVlvjlrCiG6elMU98fcime4+KVPKHMQ==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		
		try {
			
			//순서대로작업  영어로만 됐음 인코딩 안해도 괜찮음 만약 필요 할 경우 인코딩 처리 해야함
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			apiURL += "&pageNo=1";
			apiURL += "&schDate=20230201";
			apiURL += "&schDeptCityCode=ICN";
			apiURL += "&schArrvCityCode=JFK";
			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {	// HttpURLconnerction.HTTP_OK 200을 의미 동일함
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
				
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			File file = new File("C:" + File.separator + "storage", "국제선운항스케줄.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			System.out.println("국제선운항스케줄.xml이 생성되었습니다.");
			
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		
		
		}
	
	
	
	public static void main(String[] args) {
		ex02();
		
	}

}
