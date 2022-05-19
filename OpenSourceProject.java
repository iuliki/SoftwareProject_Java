
public class OpenSourceProject extends Project {

	public OpenSourceProject(Manager manager, String title, double fund) {
		super(manager, title, fund);

	}

	private String mailing_list;

	public String getMailing_list() {
		return mailing_list;
	}

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

	public void setMailing_list(String mailing_list) {
		this.mailing_list = mailing_list;
	}

	@Override
	public double getRisk() {
		return teamNr / getFund();
	}

}
