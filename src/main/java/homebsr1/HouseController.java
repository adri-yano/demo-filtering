package homebsr1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseController {
    private HouseService houseService = new HouseService(); // Initialize your service

    @GetMapping("/filter")
    public List<House> filterHouses(@RequestParam(required = false) String location,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) String type) {
        return houseService.filterHouses(location, minPrice, maxPrice, type);
    }
}
