package java8lambda.main07;

import java.util.ArrayList;
import java.util.List;

import java8lambda.商品;
import java8lambda.社員;

public class Main_07 {

	private static List<社員> create社員リスト(){
		List<社員> list = new ArrayList<>();
		list.add(new 社員("U0001", "山田", 28, 51));
		list.add(new 社員("U0010", "高橋", 35, 116));
		list.add(new 社員("U0003", "手嶋", 53, 482));
		list.add(new 社員("U0105", "大塚", 23, 12));
		list.add(new 社員("U0008", "三船", 55, 426));
		list.add(new 社員("U0022", "城田", 46, 490));
		list.add(new 社員("U0041", "大木", 31, 220));
		list.add(new 社員("U0053", "高峰", 38, 308));
		list.add(new 社員("U0101", "虎尾", 25, 92));
		
		return list;
	}
	
	public static List<商品> main(List<商品> list){
		
		// 「昇順」だけ少し書き換えてやると・・・
		// （比較項目）は変更なし
		
		System.out.println("---原価昇順---------------------------------------");
		list = new 昇順<商品>(item->item.get原価()).sort(list);
		list.forEach(System.out::println);
		
		System.out.println("---売価昇順---------------------------------------");
		list = new 昇順<商品>(商品::get売価).sort(list);
		list.forEach(System.out::println);

		
		
		// 実は「商品」じゃなくても大丈夫
		List<社員> slist = create社員リスト();
		System.out.println("---年齢昇順---------------------------------------");
		new 昇順<社員>(社員::get年齢).sort(slist).forEach(System.out::println);

		System.out.println("---評価ポイント昇順---------------------------------------");
		new 昇順<社員>(社員::get評価ポイント).sort(slist).forEach(System.out::println);
		
		
		// 実は「比較項目」に書いてる「商品」は商品クラスを意味して無い。
		// ジェネリクスの「T」の代わりに「商品」と書いてるだけ。
		// （商品クラスをimportしてないよね？）
		
		return list;
		
	}
}
