package com.xerocry.domain;

//import com.xerocry.domain.query.QProduct;
import com.xerocry.ExampleBaseTestCase;
import com.xerocry.service.LoadExampleData;
import org.testng.annotations.Test;

import java.util.List;

public class PatientTest extends ExampleBaseTestCase {

  @Test
  public void findSome() {

    LoadExampleData.load();

//    List<Product> products = new QProduct()
//        .name.istartsWith("c")
//        .findList();
//
//    products.size();
//
//
//    List<Product> products1 = Product.find.where()
//        .name.istartsWith("c")
//        .findList();
//  }
  }
}