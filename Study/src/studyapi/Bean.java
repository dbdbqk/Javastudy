package studyapi;

import org.json.JSONObject;

public class Bean {

	
	private JSONObject obj;

	public JSONObject getObj() {
		return obj;
	}

	public void setObj(JSONObject obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "bean [obj=" + obj + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	public Bean(JSONObject obj) {
		super();
		this.obj = obj;
	}




}
