package com.org.completeSpringapplication.service;

import com.org.completeSpringapplication.Entity.Product;
import com.org.completeSpringapplication.Repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)//to enable @Mock usage
class ProductServiceTest
{
    @Mock
    ProductRepository productRepository;
    @InjectMocks // injects dependencies from @Mock annotation to this
    ProductService productService;
    @Test // it will considered as test method
    public void addProductTest()
    {
        Product p= new Product();
        p.setId(1);
        p.setName("bottle");
        p.setDescription("to drink");
        p.setPrice(10d);
        Mockito.when(productService.addProduct(p)).thenReturn(p);

        Product result=productService.addProduct(p);

        assertEquals(2,result.getId());
        assertEquals("bottle",result.getName());

        assertNotNull(result);//if result is null it will fail
        assertTrue(1==result.getId());// if given condition is true this will pass else fail
        System.out.println("Test 1");
    }
}