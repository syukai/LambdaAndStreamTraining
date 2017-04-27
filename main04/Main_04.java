package java8lambda.main04;

import java.util.List;

import java8lambda.商品;

/**
 * 無名クラス、ラムダ式に置き換え
 * @author u0268
 *
 */
public class Main_04 {

	
	public static List<商品> main(List<商品> list){
		
		System.out.println("---原価昇順---------------------------------------");
		// 無名クラス
		// 一度しか使わないクラスの場合、クラスファイルを作らず、代入式に直接クラス宣言を書くことができる
		比較項目<商品> 原価比較 = new 比較項目<商品>(){
			// メソッド実装
			public int get(商品 item){
				return item.get原価();
			}
		}; 
		
		list = new 昇順(原価比較).sort(list);
		list.forEach(System.out::println);
		

		
		System.out.println("---売価昇順---------------------------------------");
		// 無名クラスをラムダ式で書く！
		// １．宣言するクラスは変数の型から明白なので省略
		// ２．メソッドが１つしかないインタフェースなので、メソッド宣言も省略
		@SuppressWarnings("unused")
		比較項目<商品> 売価比較_prot = /* new 比較項目<商品>(){
			public int get */(商品 item)->{
				return item.get売価();
			/*}*/
		}; 

		// ↓コメント消して書き直し

		比較項目<商品> 売価比較 = (商品 item)->{
				return item.get売価();
			}; 

		list = new 昇順(売価比較).sort(list);
		list.forEach(System.out::println);

		System.out.println("---売価昇順その２---------------------------------------");
		// 無名クラス ラムダ式！
		// ３．処理の部分が１行だけなのでメソッドのカッコとreturnも省略
		比較項目<商品> 売価比較_2 = (商品 item)->item.get売価();

		list = new 昇順(売価比較_2).sort(list);
		list.forEach(System.out::println);
		
		
		
		return list;
		
	}
}
