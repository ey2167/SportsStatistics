
public class Sport {
/**Elohe Yonas
 * CSC201
 * sports class will contain attributes of # of fans, # of teams, and # of average player income (income)
 *  
 * 
 */
	private int fans;
	private int teams;
	private double income;
	protected Sport(){
		
	}
	
	protected Sport(int fans, int teams, double income){
		this.fans = fans;
		this.teams = teams;
		this.income = income;
		
	}
	
	protected int getsportfans(){
		return fans;
	}
	protected void setsportfans(int fans){
		this.fans = fans;
	}
	protected int getsportteams(){
		return teams;
	}
	protected void setsportteams(int teams){
		this.teams = teams;
	}
	protected double getsportincome(){
		return income;
	}
	protected void setsportincome(float income){
		this.income = income;
	}
		public String toString(){
			return "the number of fans is " + fans + ". the amount of teams is" + teams + ", and the average income for players is " + income;
		}
	}
	
	
	
	
	

