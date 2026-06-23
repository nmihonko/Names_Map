package app;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    Map<Integer, String> map = new DataRepository().getData();

    public String getAll() {
        if (map == null) {
            throw new IllegalArgumentException("Map cannot be null");
        }

        if (map.isEmpty()) {
            return "\nNo data!";
        }

        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(0);

        map.forEach((id, name) -> sb.append(String.format("%d) %d, %s%n", count.incrementAndGet(), id, name)));

        return "\nALL NAMES:\n" + sb;
    }

    public String getById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id must be greater than 0");
        }

        if (map == null) {
            throw new IllegalArgumentException("Map cannot be null");
        }

        if (map.containsKey(id)) {
            return "\nNAME: id " + id + ", " + map.get(id);
        } else {
            throw new IllegalArgumentException("No data found by id " + id);
        }
    }

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

        if (map == null) {
            throw new IllegalArgumentException("Map cannot be null");
        }

        map.put(id, name);
    }
}