package api;

public class Accident {


	private String occrrncDt;
	private String occrrncDaycd;
	private int dthDnvCnt;
	private int injpsnCnt;
	
	public Accident(String occrrncDt, String occrrncDaycd, int dthDnvCnt, int injpsnCnt) {
		super();
		this.occrrncDt = occrrncDt;
		this.occrrncDaycd = occrrncDaycd;
		this.dthDnvCnt = dthDnvCnt;
		this.injpsnCnt = injpsnCnt;
	}
	public String getOccrrncDt() {
		return occrrncDt;
	}
	public void setOccrrncDt(String occrrncDt) {
		this.occrrncDt = occrrncDt;
	}
	public String getOccrrncDaycd() {
		return occrrncDaycd;
	}
	public void setOccrrncDaycd(String occrrncDaycd) {
		this.occrrncDaycd = occrrncDaycd;
	}
	public int getDthDnvCnt() {
		return dthDnvCnt;
	}
	public void setDthDnvCnt(int dthDnvCnt) {
		this.dthDnvCnt = dthDnvCnt;
	}
	public int getInjpsnCnt() {
		return injpsnCnt;
	}
	public void setInjpsnCnt(int injpsnCnt) {
		this.injpsnCnt = injpsnCnt;
	}
	@Override
	public String toString() {
		return "Accident [occrrncDt=" + occrrncDt + ", occrrncDaycd=" + occrrncDaycd + ", dthDnvCnt=" + dthDnvCnt
				+ ", injpsnCnt=" + injpsnCnt + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dthDnvCnt;
		result = prime * result + injpsnCnt;
		result = prime * result + ((occrrncDaycd == null) ? 0 : occrrncDaycd.hashCode());
		result = prime * result + ((occrrncDt == null) ? 0 : occrrncDt.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accident other = (Accident) obj;
		if (dthDnvCnt != other.dthDnvCnt)
			return false;
		if (injpsnCnt != other.injpsnCnt)
			return false;
		if (occrrncDaycd == null) {
			if (other.occrrncDaycd != null)
				return false;
		} else if (!occrrncDaycd.equals(other.occrrncDaycd))
			return false;
		if (occrrncDt == null) {
			if (other.occrrncDt != null)
				return false;
		} else if (!occrrncDt.equals(other.occrrncDt))
			return false;
		return true;
	}
	
	

	
}
