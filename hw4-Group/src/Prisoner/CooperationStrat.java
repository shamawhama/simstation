package Prisoner;

import mvc.Utilities;

public abstract class CooperationStrat 
{
	abstract public boolean cooperate(boolean isLastOpponentCooperated);
	
	public CooperationStrat getRandomStrat()
	{
		int randomNumber = Utilities.rng.nextInt(4);
		if(randomNumber == 0)
			return new AlwaysCoopStrat();
		else if(randomNumber == 1)
			return new AlwaysCheatStrat();
		else if(randomNumber == 2)
			return new RandomStrat();
		else
			return new LastOpCoopStrat();
	}
}