package java8lambda.main09;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8lambda.商品;

public class Main_09 {

	public static List<商品> main(List<商品> _list){
		List<商品> list = _list;

		
		// Listをstreamに変換
		Stream<商品> st = list.stream();
		
		// streamを原価でソート（結果はStreamの内部にそのまま反映）
		Stream<商品> st2 = st.sorted(Comparator.comparing(商品::get原価));
		
		// streamをリストに戻す
		List<商品> list_02 = st2.collect(Collectors.toList());

		// 結果出力
		System.out.println("---原価昇順  Streamを使う---------------------------------------");
		list_02.forEach(System.out::println);
		
		
		
		// 一気に書くとこう（売価降順)
		System.out.println("---売価降順  Streamで一気に処理---------------------------------------");
		list.stream()
			.sorted(Comparator.comparing(商品::get売価).reversed())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		
		
		// 並び替え以外にもいろいろなStream APIがある
		
		// filter - 条件に合うものだけに絞り込み
		// （forEachするだけならListに戻す必要無し）
		System.out.println("---Stream filter 原価50以上---------------------------------------");
		list.stream()
			.filter(i -> i.get原価()>50)
			.forEach(System.out::println);
		
		
		// map - 特定の項目だけに変換
		System.out.println("---Stream map 商品名のリストに変換---------------------------------------");
		list.stream()
			.map(商品::get商品名)
			.forEach(System.out::println);
		
		
		// max - 売価が一番高い商品を出力
		// ※maxの戻り値はOptional<T>となる
		System.out.println("---売価が一番高い商品を出力---------------------------------------");
		list.stream()
			.max(Comparator.comparing(商品::get売価))
			.ifPresent(System.out::println);
		
		// filter & map & sorted - 原価が奇数の商品を売価の昇順でIDだけ出力
		System.out.println("---原価が奇数の商品を売価の昇順でIDだけ出力---------------------------------------");
		list.stream()
			.filter(i->i.原価%2==1)
			.sorted(Comparator.comparing(商品::get売価))
			.map(商品::getId)
			.forEach(System.out::println);
		
		// sorted & limit 売価が高い順に3件
		System.out.println("---売価が高い順に3件---------------------------------------");
		list.stream()
			.sorted(Comparator.comparing(商品::get売価).reversed())
			.limit(3)
			.forEach(System.out::println);
		
		return list;
		
	}
}
