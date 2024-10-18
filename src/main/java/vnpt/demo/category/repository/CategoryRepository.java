package vnpt.demo.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vnpt.demo.category.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
