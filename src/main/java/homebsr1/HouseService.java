package homebsr1;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    private List<House> houses; // Assume this is populated elsewhere

    public List<House> filterHouses(String location, Double minPrice, Double maxPrice, String type) {
        return houses.stream()
                .filter(h -> (location == null || h.getLocation().equalsIgnoreCase(location)) &&
                        (minPrice == null || h.getPrice() >= minPrice) &&
                        (maxPrice == null || h.getPrice() <= maxPrice) &&
                        (type == null || h.getType().equalsIgnoreCase(type)))
                .collect(Collectors.toList());
    }
}