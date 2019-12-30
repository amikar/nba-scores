package nba_score_parent.nba_score.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import nba_score_parent.nba_score.dto.Example;

@RestController
public class ControllerAPI {

	@GetMapping("/nba")
	public List<ControllerResponse> homePage() throws IOException {

		String year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
		//Month is indexed from 0 so +1
		String month = String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1);
		String day = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		
		String https_url = "http://data.nba.net/prod/v1/" + year + month + day + "/scoreboard.json";
		System.out.println(https_url);

		URL obj = new URL(https_url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		
		int responseCode = con.getResponseCode();
		StringBuffer response = new StringBuffer();

		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response.toString());
		} else {
			System.out.println("GET request does not worked");
		}
		
		Gson gson = new Gson();
		Example ex = gson.fromJson(response.toString(), Example.class);
		
		List<ControllerResponse> resList = new ArrayList<ControllerResponse>();

		for (int i=0; i<ex.getNumGames(); i++) {
			ControllerResponse res = new ControllerResponse();
			//Hosting Team
			res.setTeam1Name(ex.getGames().get(i).getHTeam().getTriCode());
			res.setTeam1Score(ex.getGames().get(i).getHTeam().getScore());
			//Visiting team
			res.setTeam2Name(ex.getGames().get(i).getVTeam().getTriCode());
			res.setTeam2Score(ex.getGames().get(i).getVTeam().getScore());
			res.setIsGameActivated(ex.getGames().get(i).getIsGameActivated());
			resList.add(res);
		}
		
		System.out.println(resList);
		return resList;
	}

}
