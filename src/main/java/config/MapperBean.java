package config;

import java.util.List;

/**
 * @Author: linjinghui
 * @Date: 2019/5/28 15:16
 * @Version 2.8.6
 */
public class MapperBean {
    private String interfaceName;
    private List<Function> list;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public List<Function> getList() {
        return list;
    }

    public void setList(List<Function> list) {
        this.list = list;
    }
}
