
public class CommercialProject extends DeadLineProject {

	private int teamNr = 0;

	public CommercialProject(Manager manager, String title, double fund, String deadLine) {
		super(manager, title, fund, deadLine);

	}

	public double getMarketingFund() {
		return getFund() / 2;
	}

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

	@Override
	public double getRisk() {
		return teamNr * 3 / getMembers().size() / (getFund() - getMarketingFund());
	}

}
