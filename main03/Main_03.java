package java8lambda.main03;

import java.util.List;

import java8lambda.商品;

public class Main_03 {

	/**
	 * 比較処理をインタフェースに切り出して少し使いやすくする
	 * @param list
	 * @return
	 */
	public static List<商品> main(List<商品> list){
		
		System.out.println("---原価昇順---------------------------------------");
		// ソート処理に比較用のクラスを渡す
		list = new 昇順(new 原価で比較()).sort(list);
		list.forEach(System.out::println);
		
		System.out.println("---売価昇順---------------------------------------");
		// ソート処理に比較用のクラスを渡す
		list = new 昇順(new 売価で比較()).sort(list);
		list.forEach(System.out::println);
		
		
		return list;
		
	}
}
