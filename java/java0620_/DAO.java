package java0620_;

import java.util.*;

public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    private T get(String id) {
        return map.get(id);
    }

    private void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(get(key));//也可以额直接使用get方法
        }
        return list;
    }

    private void delete(String id) {
        map.remove(id);

    }

    private void save(String id, T entity) {//把这个entity保存到map
        map.put(id,entity);
    }
}
