package com.example.productcasestudy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.productcasestudy.api.ProductAPI;
import com.example.productcasestudy.model.Product;
import com.example.productcasestudy.repo.ProductRepository;

@SpringBootTest
class ProductcasestudyApplicationTests {



@InjectMocks
ProductAPI productapi;


@Mock
ProductRepository productRepository;

@Test
void contextLoads() {
}

@Test
public void testFindAll()
{
// given

List<Product> products = new ArrayList<>();
products.add(new Product());
products.add(new Product());
products.add(new Product());
products.add(new Product());



when(productRepository.findAll()).thenReturn(products);

// when
List<Product> result = productapi.findAll().getBody();

// then
assertThat(result.size()).isEqualTo(4);

// assertThat(result.get(0).getFirstName())
// .isEqualTo(employee1.getFirstName());
//
// assertThat(result.getEmployeeList().get(1).getFirstName())
// .isEqualTo(employee2.getFirstName());
}

}