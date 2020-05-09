package com.mao.market;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    private String[] names={"京东商城","QQ","QQ斗地主","新浪微博","天猫","UC浏览器","微信"};

    private int[] icons={R.drawable.jd,R.drawable.qq,R.drawable.qq_dizhu,R.drawable.sina,
            R.drawable.tmall,R.drawable.uc,R.drawable.weixin};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       lv =(ListView) findViewById(R.id.lv);

       lv.setAdapter(new MyAdapter());

    }

    public class MyAdapter extends BaseAdapter{

//        总条目数
        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

//            把xml文件转化为View对象
            View view=View.inflate(MainActivity.this,R.layout.list_item,null);

            ImageView iv=(ImageView)view.findViewById(R.id.image);

            iv.setBackgroundResource(icons[position]);

            TextView tv=(TextView)view.findViewById(R.id.tv_list);

            tv.setText(names[position]);

            return view;
        }
    }
}
