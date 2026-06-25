package app;

import java.util.HashMap;
import java.util.Map;

public class DataRepository {

    private static final Map<Integer, String> map = new HashMap<>();

    public void setData(int id, String name) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id must be greater than 0");
        }

        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        map.put(id, name);
    }

    public Map<Integer, String> getData() {
        return new HashMap<>(map);
    }
}

