package java8lambda.main01;

import java.util.List;

import java8lambda.商品;

public class Main_01 {

	
	/**
	 * バブルソートで原価の昇順にソート
	 * @param alist
	 * @return
	 */
	private static List<商品> sort原価昇順(List<商品> alist){
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
	
	public static List<商品> main(List<商品> list){
		
		// ソート処理を呼び出す
		sort原価昇順(list);
		
		// 結果を出力（実は今日の最終形その１）
		list.forEach(System.out::println);
// これと同じ
//		for(商品 i : list){
//			System.out.println(i);
//		}
		
		return list;
		
	}
}
