package java8lambda.main07;

import java.util.List;

/**
 * 昇順にソートするためのクラス
 * @author u0268
 *
 */
public class 昇順<T>{
	
	比較項目<T> 比較;
	
	/**
	 * コンストラクタ
	 * @param sortitem
	 */
	public 昇順(比較項目<T> sortitem){
		this.比較 = sortitem;
	}

	/**
	 * ソート処理
	 */
	public List<T> sort(List<T> alist) {
		List<T> list = alist;
		for(int i=0 ; i<alist.size();i++){
			for(int j=i+1 ; j<alist.size();j++){

				// 比較項目を直接使わずにインタフェース経由で使う
				if(比較.get(list.get(i))>比較.get(list.get(j))){
					T wk = list.get(i);
					list.set(i, list.get(j));
					list.set(j, wk);
				}
			}
		}
		return list;
	}
	
}
