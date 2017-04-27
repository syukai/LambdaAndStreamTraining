package java8lambda;

public class 商品 {
	public String id;
	public String 商品名;
	public int 売価;
	public int 原価;
	
	
	public 商品(String id, String 商品名,int 売価, int 原価){
		this.id=id;
		this.商品名=商品名;
		this.売価 = 売価; 
		this.原価 = 原価;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		return sb.append("id[").append(this.id)
				.append("]\t商品名[").append(this.商品名)
				.append("]\t売価[").append(this.売価)
				.append("]\t原価[").append(this.原価)
				.append("]").toString();
	}


	public String getId() {
		return id;
	}


	public String get商品名() {
		return 商品名;
	}


	public int get売価() {
		return 売価;
	}


	public int get原価() {
		return 原価;
	}
	
	
	
}
