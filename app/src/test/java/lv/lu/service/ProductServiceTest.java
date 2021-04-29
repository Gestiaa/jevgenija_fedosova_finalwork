package lv.lu.service;

import lv.lu.finalwork.repository.ProductRepository;
import lv.lu.finalwork.service.ProductService;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ProductServiceTest {

    private ProductService service;

    private ProductRepository repository;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        service = new ProductService();
    }

    @Test
    public void shouldThrowErrorWhenFindByNull() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Product Id can't be null");

        service.findById(null);
    }
}