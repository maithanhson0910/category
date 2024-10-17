package vnpt.demo.category.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CategoryController {

    // Dummy data for demonstration
    private static final Map<String, String> categories = new HashMap<>();

    static {
        categories.put("001", "Electronics");
        categories.put("002", "Books");
        categories.put("003", "Clothing");
    }

    @GetMapping("/getCategoryByCode/{code}")
    public String getCategoryByCode(@PathVariable String code) {
        return categories.getOrDefault(code, "Category not found");
    }
}
