package java8lambda;

import java.util.ArrayList;
import java.util.List;

import java8lambda.main01.Main_01;
import java8lambda.main02.Main_02;
import java8lambda.main03.Main_03;
import java8lambda.main04.Main_04;
import java8lambda.main05.Main_05;
import java8lambda.main06.Main_06;
import java8lambda.main07.Main_07;
import java8lambda.main08.Main_08;
import java8lambda.main09.Main_09;

public class Java8Lambda {
	

	
	private static List<商品> createList(){
		ArrayList<商品> list = new ArrayList<>();
		list.add(new 商品("K-0005", "伝統烏龍", 150, 47));
		list.add(new 商品("K-0003", "強ソーダ", 120, 45));
		list.add(new 商品("K-0004", "ザ・レモン", 160, 50));
		list.add(new 商品("K-0001", "完全果汁", 130, 60));
		list.add(new 商品("K-0002", "香ドリップ", 110, 41));

		list.add(new 商品("N-0003", "生姜炭酸", 140, 52));
		list.add(new 商品("N-0001", "スカット！", 180, 70));
		list.add(new 商品("N-0004", "甘薄珈琲", 120, 58));
		list.add(new 商品("N-0002", "薬味茶", 148, 33));
		
		
		return list;
	}
	
	public static void main(String[] args){
		List<商品> list = createList();
		
		// ソート処理をベタ実装
		System.out.println("===  Main_01 ===");
		Main_01.main(list);
		
		// ソート処理を外部クラスとして実装
		System.out.println("===  Main_02 ===");
		Main_02.main(list);
		
		// 比較項目をインタフェースにしてソート処理を１本化、比較項目の取得だけを外部クラスに切り出し
		// （ここまでインタフェースのおさらい）
		System.out.println("===  Main_03 ===");
		Main_03.main(list);
		
		// 無名クラス、ラムダ式に置き換え
		System.out.println("===  Main_04 ===");
		Main_04.main(list);

		// 変数宣言を無くす
		System.out.println("===  Main_05 ===");
		Main_05.main(list);
		
		// メソッド参照
		System.out.println("===  Main_06 ===");
		Main_06.main(list);
		
		// ちなみに・・・
		System.out.println("===  Main_07 ===");
		Main_07.main(list);
		
		// 標準API
		System.out.println("===  Main_08 ===");
		Main_08.main(list);
		
		// Stream
		System.out.println("===  Main_09 ===");
		Main_09.main(list);
		
	}
	
}
