package java8lambda.main02;

import java.util.List;

import java8lambda.商品;

public class 原価昇順{

	public List<商品> sort(List<商品> alist) {
		List<商品> list = alist;
		for(int i=0 ; i<alist.size();i++){
			for(int j=i+1 ; j<alist.size();j++){
				if(list.get(i).get原価()>list.get(j).get原価()){
					商品 wk商品 = list.get(i);
					list.set(i, list.get(j));
					list.set(j, wk商品);
				}
			}
		}
		return list;
	}
	
}
