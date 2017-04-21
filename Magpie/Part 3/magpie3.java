public class magpie3
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		if(statement.trim().length() ==0)
		{
			response = "Say something, please.";
		}
		 
		else if (findKeyword(statement,"no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement,"mother") >= 0
				|| findKeyword(statement,"father") >= 0
				|| findKeyword(statement,"sister") >= 0
				|| findKeyword(statement,"brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		else if (findKeyword(statement,"cat") >= 0
				|| findKeyword(statement,"dog") >= 0
				|| findKeyword(statement,"fish") >= 0
				|| findKeyword(statement,"turtle") >= 0)
		{
			response = "Tell me more about your pet.";
		}
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{			
			response = transformIWantToStatement(statement);
		}
		else if (findKeyword(statement, "I like you", 0) >= 0)
		{
			response = transformIYouStatement(statement);
		}
		else
		{
			
			int psn = findKeyword(statement, "you", 0);
			if (psn >= 0
				&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		return response;
	}
	/*i basically did exactly the same thing as the answer key this time. all i did was change up the statement and spit it back out*/
	private String transformIWantToStatement(String statement)
	{
		statement = statement.trim();
		String c = statement.substring(statement.length() - 1);
		if (c.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword (statement, "I want to", 0);
		String r = statement.substring(psn + 9);
		return "What would it mean to" + r;
	}
	
	private String transformYouMeStatement(String statement)
	{
		statement = statement.trim();
		String c = statement.substring(statement.length() - 1);
		if (c.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int y = findKeyword (statement,"you",0);
		int m = findKeyword (statement,"me",y + 3);
		String r = statement.substring(y + 3,m);
		return "What makes you think that I" + r + "you";
	}
	
	private String transformIYouStatement(String statement)
	{
		statement = statement.trim();
		int p = findKeyword (statement, "I like you", 0);
		if (p>=0)
			return "Why do you like me?";
		else 
			return "";
	}
	
	private int findKeyword(String statement, String goal, int startPos)
	{
		String[] f = {",", "?", "!", ".", " ", "\t", "\n"};
		statement = statement.toLowerCase().trim();
		goal = goal.toLowerCase();
		int psn = statement.indexOf(goal,startPos);
	
		while(psn>=0)
		{
			int p=0,q=0;
			for(String t: f)
			{
				if(psn+goal.length()<=statement.length()-1)
				{
					if(t.compareTo(""+statement.charAt(psn+goal.length()))==0)
					p=1;
				}
				if(psn>0)
				{
					if(t.compareTo(""+statement.charAt(psn-1))==0)
					q=1;
				}
			}
			if(p==1 && q==1)
				return psn;
			else if(psn==0 && p==1)
				return psn;
			else if (psn+goal.length()==statement.length() && q==1)
				return psn;
			else if (statement.equals(goal))
				return psn;
			else
				psn = statement.indexOf(goal, psn + 1);
		}
		
		return -1;

	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
