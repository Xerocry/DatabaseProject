package com.xerocry.domain;

//import com.xerocry.domain.query.QProduct;
import com.xerocry.ExampleBaseTestCase;
import com.xerocry.service.LoadExampleData;
import main.BaseTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class PatientTest extends BaseTest {

  @Test
  public void findSome() throws FileNotFoundException{

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