package java8lambda.main03;

import java.util.List;

import java8lambda.商品;

/**
 * 昇順にソートするためのクラス
 * @author u0268
 *
 */
public class 昇順{
	
	比較項目<商品> 比較;
	
	/**
	 * コンストラクタ
	 * @param sortitem
	 */
	public 昇順(比較項目<商品> sortitem){
		this.比較 = sortitem;
	}

	/**
	 * ソート処理
	 */
	public List<商品> sort(List<商品> alist) {
		List<商品> list = alist;
		for(int i=0 ; i<alist.size();i++){
			for(int j=i+1 ; j<alist.size();j++){

				// 比較項目を直接使わずにインタフェース経由で使う
				if(比較.get(list.get(i))>比較.get(list.get(j))){
					商品 wk商品 = list.get(i);
					list.set(i, list.get(j));
					list.set(j, wk商品);
				}
			}
		}
		return list;
	}
	
}
