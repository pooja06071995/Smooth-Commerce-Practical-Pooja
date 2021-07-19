package com.smooth_commerce_practical_pooja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

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
        callcolor("KEYWORDS");
        rvColors.setLayoutManager(new GridLayoutManager(this, 2));
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etSearch.getText().toString() != null && etSearch.getText().toString().length() > 0) {
                    if (etSearch.getText().toString().length() < 3 && etSearch.getText().toString().length() > 10) {
                        Toast.makeText(MainActivity.this, "Please Enter Title in range of 3 to 10 characters!!!", Toast.LENGTH_LONG).show();

                    } else {
                        callcolor(etSearch.getText().toString());
                    }


                } else {
                    Toast.makeText(MainActivity.this, "Please Enter Title First!!!", Toast.LENGTH_LONG).show();
                }

            }
        });


    }

    public void callcolor(String keyword) {
        Call<ArrayList<Colors>> call2 = apiInterface.getColors(keyword, "json", "20");
        call2.enqueue(new Callback<ArrayList<Colors>>() {
            @Override
            public void onResponse(Call<ArrayList<Colors>> call, Response<ArrayList<Colors>> response) {

                Log.d("responsefrom", "responsefrom" + response.body().toString());
                ArrayList<Colors> colors = response.body();
                customAdapter = new CustomAdapter(MainActivity.this, colors);
                rvColors.setAdapter(customAdapter);


            }

            @Override
            public void onFailure(Call<ArrayList<Colors>> call, Throwable t) {
                call.cancel();
            }
        });
    }
}