
public class MilitaryProject extends DeadLineProject {

	private int teamNr = 0;

	public int getTeamNr() {
		return teamNr;
	}

	public boolean setTeamNr(int teamNr) {
		if (teamNr < getMembers().size()) {
			this.teamNr = teamNr;
			return true;
		}
		return false;
	}

	public MilitaryProject(Manager manager, String title, double fund, String deadLine) {
		super(manager, title, fund, deadLine);
		// TODO Auto-generated constructor stub
	}

	private String password;

	@Override
	public double getRisk() {
		return teamNr / password.length() / getFund();
	}
}
