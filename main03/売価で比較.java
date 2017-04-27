package java8lambda.main03;

import java8lambda.商品;

public class 売価で比較 implements 比較項目<商品> {

	// 売価を返すだけ
	@Override
	public int get(商品 item) {
		return item.get売価();
	}

}
