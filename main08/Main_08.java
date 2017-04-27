package java8lambda.main08;

import java.util.Comparator;
import java.util.List;

import java8lambda.商品;

public class Main_08 {

	public static List<商品> main(List<商品> list){
		
		// 実はソートはListに標準で用意されている
		System.out.println("---原価昇順---------------------------------------");
		list.sort((o1, o2)->o1.get原価() - o2.get原価());
		list.forEach(System.out::println);
		
		
		// Comparatorを使って原価の昇順
		System.out.println("---原価昇順  Comparatorを使う---------------------------------------");
		list.sort(Comparator.comparing(商品::get原価));
		list.forEach(System.out::println);

		
		// 売価の「降順」
		System.out.println("---売価降順---------------------------------------");
		list.sort(Comparator.comparing(商品::get売価).reversed());
		list.forEach(System.out::println);
		
		
		// StringでもＯＫ　商品名の昇順
		System.out.println("---ID昇順---------------------------------------");
		list.sort(Comparator.comparing(商品::getId));
		list.forEach(System.out::println);
		
		return list;
		
	}
}
