package java8lambda.main06;

import java.util.List;

import java8lambda.商品;

public class Main_06 {

	
	public static List<商品> main(List<商品> list){
		
		System.out.println("---原価昇順---------------------------------------");
		// Main_05の最後と同じ
		list = new 昇順(item->item.get原価()).sort(list);
		list.forEach(System.out::println);
		
		System.out.println("---売価昇順---------------------------------------");
		// メソッド参照を使用
		// どのクラスのどのメソッドを使うかさえわかれば問題ないので、
		// メソッド参照という方法で直接メソッドを指定する
		list = new 昇順(商品::get売価).sort(list);
		list.forEach(System.out::println);
		
		return list;
		
	}
}
