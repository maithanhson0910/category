package vnpt.demo.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vnpt.demo.category.model.Category;
import vnpt.demo.category.repository.CategoryRepository;

@RestController
public class CategoryController {


    private final CategoryRepository repository;

    @Autowired
    public CategoryController(CategoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/category/{id}")
    public Object getCategoryByCode(@PathVariable Long id) {
        return repository.findById(id);
    }

    @GetMapping("/category")
    public Object list() {
        return repository.findAll();
    }

    @PostMapping("/category")
    public Object create(@RequestBody Category category) {
        return repository.save(category);
    }
}
