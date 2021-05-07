package com.promineo.tech;

import java.util.ArrayList;
import com.promineo.tech.Models.Actor;
import com.promineo.tech.Service.ActorService;

public class Week5 {

	public static void main(String[] args) {
		
		try
		{
			ActorService actorService = new ActorService();
			ArrayList<Actor> actors = actorService.getActors();
			for(Actor actor : actors)
			{
				System.out.println(actor);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
