package com.xerocry.domain;

//import com.xerocry.domain.query.QProduct;

import com.xerocry.service.LoadExampleData;
import io.ebean.Platform;
import io.ebean.dbmigration.DbMigration;
import org.testng.annotations.Test;

import java.io.IOException;

public class PatientTest {

    @Test
    public void findSome() throws IOException {
        LoadExampleData.load(10);

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