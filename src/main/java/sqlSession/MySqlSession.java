package sqlSession;

import java.lang.reflect.Proxy;

/**
 * @Author: linjinghui
 * @Date: 2019/5/28 15:20
 * @Version 2.8.6
 */
public class MySqlSession {
    private Executor executor = new MyExecutor();

    private MyConfiguration myConfiguration = new MyConfiguration();
    public <T> T selectOne(String statement, Object parameter) {
        return executor.query(statement, parameter);
    }

    @SuppressWarnings("unchecked")
    public <T> T getMapper(Class<T> tClass) {
        //动态代理
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(), new Class[]{tClass},
        new MyMapperProxy(myConfiguration, this));
    }
}
