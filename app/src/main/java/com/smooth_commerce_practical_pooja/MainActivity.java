package com.smooth_commerce_practical_pooja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.smooth_commerce_practical_pooja.Adapter.CustomAdapter;

import com.smooth_commerce_practical_pooja.Model.Colors;
import com.smooth_commerce_practical_pooja.retrofit.APIClient;
import com.smooth_commerce_practical_pooja.retrofit.APIInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private LinearLayout llSearch;
    private EditText etSearch;
    private Button btnSearch;
    private RecyclerView rvColors;
    private CustomAdapter customAdapter;
    APIInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        llSearch = (LinearLayout) findViewById(R.id.llSearch);
        etSearch = (EditText) findViewById(R.id.etSearch);
        btnSearch = (Button) findViewById(R.id.btnSearch);
        rvColors = (RecyclerView) findViewById(R.id.rvColors);

        rvColors.setLayoutManager(new GridLayoutManager(this,2));



        Call<ArrayList<Colors>> call2 = apiInterface.getColors("KEYWORDS","json","20");
        call2.enqueue(new Callback<ArrayList<Colors>>() {
            @Override
            public void onResponse(Call<ArrayList<Colors>> call, Response<ArrayList<Colors>> response) {

                Log.d("responsefrom","responsefrom"+response.body().toString());
                ArrayList<Colors> colors=response.body();
                customAdapter=new CustomAdapter(MainActivity.this,colors);
                rvColors.setAdapter(customAdapter);


            }

            @Override
            public void onFailure(Call<ArrayList<Colors>> call, Throwable t) {
                call.cancel();
            }
        });



    }
}