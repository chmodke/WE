package datastruct.datastruct.interfaces;
/**
 * 元素比较接口
 * @author KeHao
 *
 */
public interface Strategy<E>{
	/**
	 * 比较两个元素是否相同
	 * @param o1 元素1
	 * @param o2 元素2
	 * @return true 相同 false 不相同
	 */
	public boolean equal(E o1, E o2);
	/**
	 * @param o1 元素1
	 * @param o2 元素2
	 * @return 如果o1<o2,返回-1;如果o1=o2,返回0;如果o1=o2,返回1
	 */
	public int compare(E o1, E o2);
}
