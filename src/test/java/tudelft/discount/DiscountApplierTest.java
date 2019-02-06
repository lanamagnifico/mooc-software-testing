package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void testSet(){
        Product product1 = new Product("Abc",12.5,"HOME");
        Product product2 = new Product("Def",10.0,"BUSINESS");
        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> result = Arrays.asList(product1,product2);
        Mockito.when(dao.all()).thenReturn(result);

        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();

        Assertions.assertEquals(11.25, product1.getPrice());
        Assertions.assertEquals(11.0, product2.getPrice());
    }
}
