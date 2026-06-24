package app;

import java.util.Map;

public class DataHandler {

    private final DataRepository dataRepository;

    public DataHandler(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public String getAll() {
        Map<Integer, String> map = dataRepository.getData();
        if (map == null) {
            throw new IllegalArgumentException("Map cannot be null");
        }

        if (map.isEmpty()) {
            return "\nNo data!";
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            sb.append("%d) %d, %s%n".formatted(count, entry.getKey(), entry.getValue()));
            count++;
        }

        return "\nALL NAMES:\n" + sb;
    }

    public String getById(int id) {

        if (id <= 0) {
            throw new IllegalArgumentException("Id must be greater than 0");
        }

        Map<Integer, String> map = dataRepository.getData();

        if (!map.containsKey(id)) {
            throw new IllegalArgumentException("No data found by id %d".formatted(id));
        } else {
            return "\nNAME: id %d, %s".formatted(id, map.get(id));
        }
    }
}