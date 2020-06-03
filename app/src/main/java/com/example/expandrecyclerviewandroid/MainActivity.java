package com.example.expandrecyclerviewandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvData;
    DataAdapter dataAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        //Load data
        rcvData = findViewById(R.id.rcvData);
        rcvData.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Google adSense"));
        products.add(new Product("Google Drive"));
        products.add(new Product("Google Mail"));
        products.add(new Product("Google Doc"));
        products.add(new Product("Android"));

        Company google = new Company("google", products);
        companies.add(google);

        ArrayList<Product> microsoftProduct = new ArrayList<>();
        microsoftProduct.add(new Product("windows"));
        microsoftProduct.add(new Product("SkyDrive"));
        microsoftProduct.add(new Product("Microsoft Store"));
        microsoftProduct.add(new Product("Microsoft office"));

        Company microsoft = new Company("microsoft",microsoftProduct);
        companies.add(microsoft);

        ArrayList<Product> microsoftProduct1 = new ArrayList<>();
        microsoftProduct1.add(new Product("windows"));
        microsoftProduct1.add(new Product("SkyDrive"));
        microsoftProduct1.add(new Product("Microsoft Store"));
        microsoftProduct1.add(new Product("Microsoft office"));

        Company microsoft1 = new Company("Tuấn Anh",microsoftProduct);
        companies.add(microsoft1);

        //đổ data lên adapter
        dataAdapter = new DataAdapter(companies);
        rcvData.setAdapter(dataAdapter);
    }
}
