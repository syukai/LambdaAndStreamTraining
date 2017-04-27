package java8lambda.main05;

import java.util.List;

import java8lambda.商品;

public class Main_05 {

	
	public static List<商品> main(List<商品> list){
		
		System.out.println("---原価昇順---------------------------------------");
		// 普通に変数宣言を省略
		// Main_04の変数宣言を直接パラメータに書いただけ
		list = new 昇順(new 比較項目<商品>(){
			public int get(商品 item){
				return item.get原価();
			}
		}).sort(list);
		list.forEach(System.out::println);
		
		
		System.out.println("---売価昇順---------------------------------------");
		// ラムダ式を使って変数宣言を省略
		// Main_04の変数宣言を直接パラメータに書いただけ
		list = new 昇順((比較項目<商品>)(商品 item)-> item.get売価()).sort(list);
		list.forEach(System.out::println);

		
		System.out.println("---売価昇順その２---------------------------------------");
		// さらに型も省略
		// １．「昇順」のコンストラクタで必要なのは 「比較項目<商品>」とわかっているので省略可能
		// ２．比較項目<商品>のgetメソッドのパラメータの型は<商品>なのがわかっているので省略可能
		// ３．パラメータが1個の場合はカッコも省略可能
		list = new 昇順(item-> item.get売価()).sort(list);
		list.forEach(System.out::println);
		
		
		System.out.println("---売価降順---------------------------------------");
		// -1かければ降順にできる
		list = new 昇順(item-> item.get売価()*-1).sort(list);
		list.forEach(System.out::println);

		return list;
		

		// ちなみに、非同期処理の書き方をラムダ式にするとこんな感じ
		// （メール送信処理 sendMail を非同期で実行）
		// new Thread(()->sendMail(target)).start();

		// ラムダ式使わない場合はこんな感じ
//		new Thread(new Runnable(){
//			@Override
//			public void run() {
//				sendMail(target);
//			}
//		}).start();
		
	}
}
