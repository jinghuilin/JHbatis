package sqlSession;

/**
 * @Author: linjinghui
 * @Date: 2019/5/28 15:17
 * @Version 2.8.6
 */
public interface Executor {
   <T> T query(String statement, Object parameter);
}
