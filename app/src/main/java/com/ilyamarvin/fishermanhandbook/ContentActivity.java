package com.ilyamarvin.fishermanhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContentActivity extends AppCompatActivity {
    private TextView text_content;
    private int category = 0;
    private int position = 0;
    private ImageView imContent;
    private int[] array_starter = {R.string.starter};
    private int[] array_fish = {
            R.string.fish_1, R.string.fish_2, R.string.fish_3, R.string.fish_4, R.string.fish_5,
            R.string.fish_6, R.string.fish_7, R.string.fish_8, R.string.fish_9, R.string.fish_10, R.string.fish_11,
            R.string.fish_12, R.string.fish_13, R.string.fish_14, R.string.fish_15, R.string.fish_16, R.string.fish_17
    };
    private int[] array_image_fish = {R.drawable.ukleyka};
    private int[] array_hooks = {
            R.string.hook_1, R.string.hook_2, R.string.hook_3, R.string.hook_4,
            R.string.hook_5, R.string.hook_6, R.string.hook_7
    };
    private int[] array_artbait = {
            R.string.artbait_1, R.string.artbait_2, R.string.artbait_3, R.string.artbait_4,
            R.string.artbait_5, R.string.artbait_6, R.string.artbait_7
    };
    private int[] array_bait = {
            R.string.bait_1, R.string.bait_2, R.string.bait_3, R.string.bait_4, R.string.bait_5, R.string.bait_6,
            R.string.bait_7, R.string.bait_8, R.string.bait_9, R.string.bait_10, R.string.bait_11, R.string.bait_12
    };
    private int[] array_rig = {
            R.string.rig_1, R.string.rig_2, R.string.rig_3, R.string.rig_4,
            R.string.rig_5, R.string.rig_6, R.string.rig_7
    };
    private int[] array_lure = {R.string.menu_lure};
    private int[] array_tips = {R.string.menu_tips};
    private int[] array_weather = {R.string.menu_weather};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        text_content = findViewById(R.id.text_fish_content);
        imContent = findViewById(R.id.imageContent);
        receiveIntent();
    }

    private void receiveIntent() {
        Intent intent = getIntent();
        if(intent != null) {
            category = intent.getIntExtra("category", 0);
            position = intent.getIntExtra("position", 0);
        }
        switch (category){
            case 0:
                text_content.setText(array_starter[position]);
                break;
            case 1:
             //   imContent.setImageResource(array_image_fish[position]);
                text_content.setText(array_fish[position]);
                break;
            case 2:
                text_content.setText(array_hooks[position]);
                break;
            case 3:
                text_content.setText(array_artbait[position]);
                break;
            case 4:
                text_content.setText(array_bait[position]);
                break;
            case 5:
                text_content.setText(array_rig[position]);
                break;
            case 6:
                text_content.setText(array_lure[position]);
                break;
            case 7:
                text_content.setText(array_tips[position]);
                break;
            case 8:
                text_content.setText(array_weather[position]);
                break;
        }
    }
}
