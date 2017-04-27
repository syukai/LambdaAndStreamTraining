package java8lambda.main02;

import java.util.List;

import java8lambda.商品;

public class Main_02 {

	/**
	 * 原価昇順、売価昇順のそれぞれのクラスを作成
	 * @param list
	 * @return
	 */
	public static List<商品> main(List<商品> list){
		
		System.out.println("---原価昇順---------------------------------------");
		list = new 原価昇順().sort(list);
		list.forEach(System.out::println);
		
		System.out.println("---売価昇順---------------------------------------");
		
		list = new 売価昇順().sort(list);
		list.forEach(System.out::println);
		
		
		return list;
		
	}
}
