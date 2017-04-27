package java8lambda.main03;

/**
 * 比較対象となる値を返すメソッドを持つインタフェース
 * @author u0268
 *
 * @param <商品>
 */
public interface 比較項目<商品> {
	public int get(商品 item);
}
