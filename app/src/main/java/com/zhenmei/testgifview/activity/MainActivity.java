package com.zhenmei.testgifview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ant.liao.GifView;
import com.zhenmei.testgifview.R;

/**
 * 加载动态图片
 */
public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private GifView gifView;

    private void initView() {
        /**
         * 初始化GifView
         */
        gifView = (GifView) findViewById(R.id.gifView);
        /**
         * 设置Gif图片
         */
        gifView.setGifImage(R.mipmap.test);
        /**
         * 添加监听器
         */
        gifView.setOnClickListener(this);
        /**
         * 设置显示的大小，拉伸或者压缩
         */
//        gifView.setShowDimension(800,800);
        /**
         * 设置加载方式
         * WAIT_FINISH 在解码过程中，不显示图片，直到解码全部成功后，再显示
         * SYNC_DECODER 和解码过程同步，解码进行到哪里，图片显示到哪里
         * COVER 在解码过程中，只显示第一帧图片
         */
        gifView.setGifImageType(GifView.GifImageType.COVER);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.gifView:
                Toast.makeText(this, "点击", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
