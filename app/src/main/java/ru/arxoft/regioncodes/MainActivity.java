package ru.arxoft.regioncodes;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView editNumber;
    TextView tvRegion;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonDel;
    Button buttonC;
    String str = "";



    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber = findViewById(R.id.editNumber);
        tvRegion = findViewById(R.id.tvRegion);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDel = findViewById(R.id.buttonDel);
        buttonC = findViewById(R.id.buttonC);


        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonDel.setOnClickListener(this);
        buttonC.setOnClickListener(this);

        if (savedInstanceState != null) {
            str = savedInstanceState.getString("edit_number");
            editNumber.setText(savedInstanceState
                    .getString("edit_number"));

            if (Map.containsKey(str)) {
                tvRegion.setText(Objects.requireNonNull(Map.get(str)));
            } else if (str.length() > 2) {
                tvRegion.setText("Такого кода не существует!");
                Toast.makeText(this, "Такого региона не существует. " +
                        "Трехзначный код региона должен начинаться с единицы или семерки!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                str = editNumber.getText().toString() + "0";
                editNumber.setText(str);
                break;
            case R.id.button1:
                str = editNumber.getText().toString() + "1";
                editNumber.setText(str);
                break;

            case R.id.button2:
                str = editNumber.getText().toString() + "2";
                editNumber.setText(str);
                break;

            case R.id.button3:
                str = editNumber.getText().toString() + "3";
                editNumber.setText(str);
                break;

            case R.id.button4:
                str = editNumber.getText().toString() + "4";
                editNumber.setText(str);
                break;

            case R.id.button5:
                str = editNumber.getText().toString() + "5";
                editNumber.setText(str);
                break;

            case R.id.button6:
                str = editNumber.getText().toString() + "6";
                editNumber.setText(str);
                break;

            case R.id.button7:
                str = editNumber.getText().toString() + "7";
                editNumber.setText(str);
                break;

            case R.id.button8:
                str = editNumber.getText().toString() + "8";
                editNumber.setText(str);
                break;

            case R.id.button9:
                str = editNumber.getText().toString() + "9";
                editNumber.setText(str);
                break;

            case R.id.buttonDel:
                if (str.length() > 0) {
                    str = editNumber.getText().toString().substring(0, str.length() - 1);
                    editNumber.setText(str);
                    break;
                }

            case R.id.buttonC:
                str = "";
                tvRegion.setText("Введите номер региона");
                editNumber.setText(str);


        }
        if (Map.containsKey(str)) {
            tvRegion.setText(Objects.requireNonNull(Map.get(str)));
        } else if (str.length() > 2) {

            tvRegion.setText("Такого кода не существует!");
            Toast.makeText(this, "Такого региона не существует. " +
                    "Трехзначный код региона должен начинаться с единицы или семерки!", Toast.LENGTH_SHORT).show();
        }
    }

    public void allRegions(View view) {
        Intent intent = new Intent(this, ListRegions.class);
        startActivity(intent);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("edit_number", editNumber.getText().toString());
    }
    static ArrayList<String> allRegionsStr = new ArrayList<>();
    static Map<String, String> Map;

    static {
        HashMap<String, String> map = new HashMap<>();
        map.put("01", "Республика Адыгея");
        map.put("02", "Республика Башкортостан");
        map.put("03", "Республика Бурятия");
        map.put("04", "Республика Алтай");
        map.put("05", "Республика Дагестан");
        map.put("06", "Республика Ингушетия");
        map.put("07", "Кабардино-Балкарская Республика");
        map.put("08", "Республика Калмыкия");
        map.put("09", "Карачаево-Черкесская Республика");
        map.put("10", "Республика Карелия");
        map.put("11", "Республика Коми");
        map.put("12", "Республика Марий-Эл");
        map.put("13", "Республика Мордовия");
        map.put("14", "Республика Саха-Якутия");
        map.put("15", "Республика Северная Осетия-Алания");
        map.put("16", "Республика Татарстан");
        map.put("17", "Республика Тува");
        map.put("18", "Удмуртская Республика");
        map.put("19", "Республика Хакасия");
        map.put("20", "Чеченская Республика");
        map.put("21", "Чувашская Республика");
        map.put("22", "Алтайский край");
        map.put("23", "Краснодарский край");
        map.put("24", "Красноярский край");
        map.put("25", "Приморский край");
        map.put("26", "Ставропольский край");
        map.put("27", "Хабаровский край");
        map.put("28", "Амурская область");
        map.put("29", "Архангельская область");
        map.put("30", "Астраханская область");
        map.put("31", "Белгородская область");
        map.put("32", "Брянская область");
        map.put("33", "Владимирская область");
        map.put("34", "Волгоградская область");
        map.put("35", "Вологодская область");
        map.put("36", "Воронежская область");
        map.put("37", "Ивановская область");
        map.put("38", "Иркутская область");
        map.put("39", "Калининградская область");
        map.put("40", "Калужская область");
        map.put("41", "Камчатский край");
        map.put("42", "Кемеровская область");
        map.put("43", "Кировская область");
        map.put("44", "Костромская область");
        map.put("45", "Курганская область");
        map.put("46", "Курская область");
        map.put("47", "Ленинградская область");
        map.put("48", "Липецкая область");
        map.put("49", "Магаданская область");
        map.put("50", "Московская область");
        map.put("51", "Мурманская область");
        map.put("52", "Нижегородская область");
        map.put("53", "Новгородская область");
        map.put("54", "Новосибирская область");
        map.put("55", "Омская область");
        map.put("56", "Оренбургская область");
        map.put("57", "Орловская область");
        map.put("58", "Пензенская область");
        map.put("59", "Пермский край");
        map.put("60", "Псковская область");
        map.put("61", "Ростовская область");
        map.put("62", "Рязанская область");
        map.put("63", "Самарская область");
        map.put("64", "Саратовская область");
        map.put("65", "Сахалинская область");
        map.put("66", "Свердловская область");
        map.put("67", "Смоленская область");
        map.put("68", "Тамбовская область");
        map.put("69", "Тверская область");
        map.put("70", "Томская область");
        map.put("71", "Тульская область");
        map.put("72", "Тюменская область");
        map.put("73", "Ульяновская область");
        map.put("74", "Челябинская область");
        map.put("75", "Забайкальский край");
        map.put("76", "Ярославская область");
        map.put("77", "город Москва");
        map.put("78", "город Санкт-Петербург");
        map.put("79", "Еврейская автономная область");
        map.put("80", "бывший Агинский Бурятский автономный округ");
        map.put("81", "бывший Коми-Пермяцкий автономный округ");
        map.put("82", "Республика Крым");
        map.put("83", "Ненецкий автономный округ");
        map.put("84", "бывший Таймырский автономный округ");
        map.put("85", "бывший Усть-Ордынский Бурятский автономный округ");
        map.put("86", "Ханты-Мансийский автономный округ");
        map.put("87", "Чукотский автономный округ");
        map.put("88", "бывший Эвенкийский автономный округ");
        map.put("89", "Ямало-Ненецкий автономный округ");
        map.put("90", "Московская область");
        map.put("91", "Калининградская область");
        map.put("92", "город Севастополь");
        map.put("93", "Краснодарский край");
        map.put("94", "Байконур");
        map.put("95", "Чеченская республика");
        map.put("96", "Свердловская область");
        map.put("97", "город Москва");
        map.put("98", "город Санкт-Петербург");
        map.put("99", "город Москва");
        map.put("102", "Республика Башкортостан");
        map.put("113", "Республика Мордовия");
        map.put("116", "Республика Татарстан");
        map.put("121", "Чувашская Республика");
        map.put("123", "Краснодарский край");
        map.put("124", "Красноярский край");
        map.put("125", "Приморский край");
        map.put("126", "Ставропольский край");
        map.put("134", "Волгоградская область");
        map.put("136", "Воронежская область");
        map.put("138", "Иркутская область");
        map.put("142", "Кемеровская область");
        map.put("150", "Московская область");
        map.put("152", "Нижегородская область");
        map.put("154", "Новосибирская область");
        map.put("159", "Пермский край");
        map.put("161", "Ростовская область");
        map.put("163", "Самарская область");
        map.put("164", "Саратовская область");
        map.put("173", "Ульяновская область");
        map.put("174", "Челябинская область");
        map.put("177", "город Москва");
        map.put("178", "город Санкт-Петербург");
        map.put("186", "Ханты-Мансийский автономный округ");
        map.put("190", "Московская область");
        map.put("196", "Свердловская область");
        map.put("197", "город Москва");
        map.put("198", "Санкт-Петербург");
        map.put("199", "город Москва");
        map.put("750", "Московская область");
        map.put("716", "Республика Татарстан");
        map.put("761", "Ростовская область");
        map.put("763", "Самарская область");
        map.put("777", "город Москва");
        map.put("799", "город Москва");
        Map = Collections.unmodifiableMap(map);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
        allRegionsStr.add(key + " - " + value);
        Collections.sort(allRegionsStr);
    }



        // do what you have to do here
        // In your case, another loop.
    }
    }
