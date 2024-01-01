package business;

import core.logging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    ICategoryDao iCategoryDao;
    ILogger[] loggers;
//    private List<Category> categoryList = new ArrayList<>();

    // Kategorileri içeren bir liste oluştur
    List<Category> categoryList = new ArrayList<>();

    public CategoryManager(ICategoryDao iCategoryDao, ILogger[] loggers) {
        this.iCategoryDao = iCategoryDao;
        this.loggers = loggers;

        categoryList.add(new Category(1, "Elektronik"));
        categoryList.add(new Category(2, "Giyim"));
        categoryList.add(new Category(3, "Kitaplar"));
        categoryList.add(new Category(4, "Mobilya"));
    }

    public void add(Category category) throws Exception {
        for (Category category1 : categoryList) {
            if (category1.getCategoryName().equals(category.getCategoryName())) {
                throw new RuntimeException("Kategori adı mevcut");
            }
        }

        categoryList.add(category);
    }

    public void showCategoryName() {
        for (Category category : categoryList) {
            System.out.println("Category name: " + category.getCategoryName());
        }
    }
}
