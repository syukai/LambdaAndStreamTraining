package java8lambda;

public class 社員 {
	public String id;
	public String 社員名;
	public int 年齢;
	public int 評価ポイント;
	
	
	public 社員(String id, String 社員名,int 年齢, int 評価ポイント){
		this.id=id;
		this.社員名=社員名;
		this.年齢 = 年齢; 
		this.評価ポイント = 評価ポイント;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		return sb.append("id[").append(this.id)
				.append("]\t社員名[").append(this.社員名)
				.append("]\t年齢[").append(this.年齢)
				.append("]\t評価ポイント[").append(this.評価ポイント)
				.append("]").toString();
	}


	public String getId() {
		return id;
	}


	public String get社員名() {
		return 社員名;
	}


	public int get年齢() {
		return 年齢;
	}


	public int get評価ポイント() {
		return 評価ポイント;
	}
	
	
	
}
