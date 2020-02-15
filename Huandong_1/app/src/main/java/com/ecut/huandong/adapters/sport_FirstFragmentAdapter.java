package com.ecut.huandong.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ecut.huandong.R;

import java.util.ArrayList;
import java.util.List;

public class sport_FirstFragmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private RecyclerView mrec ;
    public sport_FirstFragmentAdapter(Context context)
    {

        this.mContext=context;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =LayoutInflater.from(mContext).inflate(R.layout.first_fragment, parent, false);
        mrec=view.findViewById(R.id.recycle_view);
        if (viewType == 0)
        {

            return new SportRecommend_ViewHolder1(LayoutInflater.from(mContext).inflate(R.layout.sport_layoutitem1,parent,false));
        }
        else if (viewType==1)
        {

            return new SportRecommend_ViewHolder2(LayoutInflater.from(mContext).inflate(R.layout.sport_layoutitem2,parent,false));
        }
        else if (viewType==2)
        {
            mrec.setLayoutManager(new GridLayoutManager(mContext,2));
            return new SportRecommend_ViewHolder3(LayoutInflater.from(mContext).inflate(R.layout.sport_layoutitem3,parent,false));
        }
        else if (viewType==3)
        {

            return new SportRecommend_ViewHolder4(LayoutInflater.from(mContext).inflate(R.layout.sport_layoutitem4,parent,false));
        }
        else if (viewType==4)
        {

            return new SportRecommend_ViewHolder3(LayoutInflater.from(mContext).inflate(R.layout.sport_layoutitem3,parent,false));
        }
        else
        {
           return new SportRecommend_ViewHolder5(LayoutInflater.from(mContext).inflate(R.layout.sport_layoutitem5,parent,false));

        }

    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0)
        {
            return 0;
        }
        else if (position==1)
        {
            return 1;
        }
        else if (position==2)
        {
            return 2;
        }
        else if(position==3)
        {
            return 3;
        }
        else if (position==4)
        {
            return 4;
        }
        else
        {
            return 5;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       if (getItemViewType(position)==0)
       {
           ((SportRecommend_ViewHolder1)holder).imageView1.setImageResource(R.drawable.sport1);
           ((SportRecommend_ViewHolder1)holder).imageView2.setImageResource(R.drawable.sport2);
           ((SportRecommend_ViewHolder1)holder).imageView3.setImageResource(R.drawable.sport3);
           ((SportRecommend_ViewHolder1)holder).imageView4.setImageResource(R.drawable.sport4);
       }
       else if (getItemViewType(position)==1)
       {
           ((SportRecommend_ViewHolder2)holder).textView2_1.setText("在校大学生注册免押金，运动健身赢奖金");
           ((SportRecommend_ViewHolder2)holder).textView2_2.setText("如果有人想要击倒你，那只代表你比他们优秀");
           ((SportRecommend_ViewHolder2)holder).textView2_3.setText("自律给我自由!");

       }
       else if (getItemViewType(position)==2)
       {
           ((SportRecommend_ViewHolder3)holder).imageView1.setImageResource(R.drawable.sport5);
           ((SportRecommend_ViewHolder3)holder).imageView2.setImageResource(R.drawable.sport6);
           ((SportRecommend_ViewHolder3)holder).imageView3.setImageResource(R.drawable.sport7);
           ((SportRecommend_ViewHolder3)holder).textView1.setText("实战推荐");
           ((SportRecommend_ViewHolder3)holder).textView2.setText(Html.fromHtml("有氧操，全身燃动<br><font><small>免费 &nbsp&nbsp&nbsp&nbsp 初级</small></font>"));
           ((SportRecommend_ViewHolder3)holder).textView3.setText(Html.fromHtml("腹肌塑造初级<br><font><small>¥366 &nbsp&nbsp&nbsp&nbsp 初级</small></font>"));
           ((SportRecommend_ViewHolder3)holder).textView4.setText(Html.fromHtml("Karlie Kloss超模全身塑形<br><font><small>¥366 &nbsp&nbsp</small></font>"));
           ((SportRecommend_ViewHolder3)holder).button1.setText("更多>");
           ((SportRecommend_ViewHolder3)holder).button2.setText("零基础减脂，全身激活!\n免费  ");
           ((SportRecommend_ViewHolder3)holder).button3.setText("哑铃全身耐力进阶！\n ¥366");


       }
       else if (getItemViewType(position)==3)
       {
           ((SportRecommend_ViewHolder4)holder).textView1_1.setText("时间会证明一切，汗水从不会骗人");
           ((SportRecommend_ViewHolder4)holder).textView1_2.setText("如果有人想要击倒你，那只代表你比他们优秀");
           ((SportRecommend_ViewHolder4)holder).textView2_1.setText("自律给我自由!");
           ((SportRecommend_ViewHolder4)holder).textView2_2.setText("放弃可以找到一万个理由，坚持只需一个信念!");
           ((SportRecommend_ViewHolder4)holder).textView3_1.setText("不怕千人阻挡，只怕自己投降。逆风的方向，更适合飞翔");
           ((SportRecommend_ViewHolder4)holder).textView3_2.setText("努力运动健身的你也会这样可爱的哦!");
       }
       else if (getItemViewType(position)==4)
       {
           ((SportRecommend_ViewHolder3)holder).imageView1.setImageResource(R.drawable.sport8);
           ((SportRecommend_ViewHolder3)holder).imageView2.setImageResource(R.drawable.sport9);
           ((SportRecommend_ViewHolder3)holder).imageView3.setImageResource(R.drawable.sport10);
           ((SportRecommend_ViewHolder3)holder).textView1.setText("新上好课");
           ((SportRecommend_ViewHolder3)holder).textView2.setText(Html.fromHtml("零基础腿部塑形<br><font><small>免费 &nbsp&nbsp&nbsp&nbsp 初级</small></font>"));
           ((SportRecommend_ViewHolder3)holder).textView3.setText(Html.fromHtml("女性胸部改善，呼吸与核心<br><font><small>¥366 &nbsp&nbsp&nbsp&nbsp 中级</small></font>"));
           ((SportRecommend_ViewHolder3)holder).textView4.setText(Html.fromHtml("完美蜜桃臀打造<br><font><small>¥366 &nbsp&nbsp</small></font>"));
           ((SportRecommend_ViewHolder3)holder).button1.setText("好课排行");
           ((SportRecommend_ViewHolder3)holder).button2.setText("最适合女生的课程\n马甲线养成\n¥266");
           ((SportRecommend_ViewHolder3)holder).button3.setText("全网最热热身课程\n练前综合热身\n¥366");

       }
       else
       {
           ((SportRecommend_ViewHolder5)holder).imageView5_1.setImageResource(R.drawable.sport11);
           ((SportRecommend_ViewHolder5)holder).imageView5_2.setImageResource(R.drawable.sport12);
           ((SportRecommend_ViewHolder5)holder).imageView5_3.setImageResource(R.drawable.sport13);
           ((SportRecommend_ViewHolder5)holder).textView5_1.setText("新手入门");
           ((SportRecommend_ViewHolder5)holder).textView5_2.setText( Html.fromHtml("人鱼线雕刻<br><font><small>免费 &nbsp&nbsp&nbsp&nbsp 初级</small></font>"));
           ((SportRecommend_ViewHolder5)holder).textView5_3.setText( Html.fromHtml("钢铁手臂塑造<br><font><small>¥366 &nbsp&nbsp&nbsp&nbsp 高级</small></font>"));
           ((SportRecommend_ViewHolder5)holder).textView5_4.setText(Html.fromHtml("无器械仅需一张瑜伽垫<br>腹肌塑造初级<br><font><small>¥366 &nbsp&nbsp</small></font>"));
           ((SportRecommend_ViewHolder5)holder).button5_1.setText("健身潮流，减肥塑形 >");
           ((SportRecommend_ViewHolder5)holder).button5_2.setText("上班族福音\n久坐族臀部激活\n免费");
           ((SportRecommend_ViewHolder5)holder).button5_3.setText("给身体放个假\nHIIT适应，全身循环\n免费");
           ((SportRecommend_ViewHolder5)holder).button5_4.setText("新手入门课\n零噪音减脂入门\n免费");
           ((SportRecommend_ViewHolder5)holder).button5_5.setText("减脂入门课程\n全网最热平板支撑入门\n¥366");

       }

    }

    @Override
    public int getItemCount() {
//        return list.size();
        return 6;
    }

    class SportRecommend_ViewHolder1 extends RecyclerView.ViewHolder
    {
        private ImageView imageView1,imageView2,imageView3,imageView4;
        private ViewFlipper viewFlipper3;
        public SportRecommend_ViewHolder1(@NonNull View itemView) {
            super(itemView);
            viewFlipper3=itemView.findViewById(R.id.sport_viewflipper3);
            viewFlipper3.addView(View.inflate(mContext,R.layout.sport_carousel_1,null));
            viewFlipper3.addView(View.inflate(mContext,R.layout.sport_carousel_2,null));
            viewFlipper3.addView(View.inflate(mContext,R.layout.sport_carousel_3,null));
            viewFlipper3.addView(View.inflate(mContext,R.layout.sport_carousel_4,null));
            imageView1=itemView.findViewById(R.id.sport_carousel_1_image);
            imageView2=itemView.findViewById(R.id.sport_carousel_2_image);
            imageView3=itemView.findViewById(R.id.sport_carousel_3_image);
            imageView4=itemView.findViewById(R.id.sport_carousel_4_image);
        }
    }

    class SportRecommend_ViewHolder2 extends RecyclerView.ViewHolder
    {
        private ViewFlipper viewFlipper1;
        private TextView textView2_1,textView2_2,textView2_3;
        public SportRecommend_ViewHolder2(@NonNull View itemView) {
            super(itemView);
            viewFlipper1=itemView.findViewById(R.id.sport_viewflipper2);
            viewFlipper1.addView(View.inflate(mContext,R.layout.sport_layoutitem2_view1,null));
            viewFlipper1.addView(View.inflate(mContext,R.layout.sport_layoutitem2_view2,null));
            viewFlipper1.addView(View.inflate(mContext,R.layout.sport_layoutitem2_view3,null));
            textView2_1=itemView.findViewById(R.id.sport_layoutitem2_view1_text1);
            textView2_2=itemView.findViewById(R.id.sport_layoutitem2_view2_text1);
            textView2_3=itemView.findViewById(R.id.sport_layoutitem2_view3_text1);

        }
    }

    class SportRecommend_ViewHolder3 extends RecyclerView.ViewHolder
    {
        private ImageView imageView1,imageView2,imageView3;
        private TextView textView1,textView2,textView3,textView4;
        private Button button1,button2,button3;
        public SportRecommend_ViewHolder3(@NonNull View itemView) {
            super(itemView);
            imageView1=itemView.findViewById(R.id.sport_layoutitem3_image1);
            imageView2=itemView.findViewById(R.id.sport_layoutitem3_image2);
            imageView3=itemView.findViewById(R.id.sport_layoutitem3_image3);
            textView1=itemView.findViewById(R.id.sport3_text);
            textView2=itemView.findViewById(R.id.sport3_layoutitem3_text1);
            textView3=itemView.findViewById(R.id.sport3_layoutitem3_text2);
            textView4=itemView.findViewById(R.id.sport3_layoutitem3_text3);
            button1=itemView.findViewById(R.id.sportButton1);
            button2=itemView.findViewById(R.id.sport_layoutitem3_button1);
            button3=itemView.findViewById(R.id.sport_layoutitem3_button2);
        }
    }

    class SportRecommend_ViewHolder4 extends RecyclerView.ViewHolder
    {
        private ViewFlipper viewFlipper;
        private TextView textView1_1,textView1_2,textView2_1,textView2_2,textView3_1,textView3_2;
        public SportRecommend_ViewHolder4(@NonNull View itemView) {
            super(itemView);
            viewFlipper=itemView.findViewById(R.id.sport_viewflipper1);
            viewFlipper.addView(View.inflate(mContext,R.layout.sport_layoutitem4_view1,null));
            viewFlipper.addView(View.inflate(mContext,R.layout.sport_layoutitem4_view2,null));
            viewFlipper.addView(View.inflate(mContext,R.layout.sport_layoutitem4_view3,null));
            textView1_1=itemView.findViewById(R.id.sport_layoutitem4_view1_text1);
            textView1_2=itemView.findViewById(R.id.sport_layoutitem4_view1_text2);
            textView2_1=itemView.findViewById(R.id.sport_layoutitem4_view2_text1);
            textView2_2=itemView.findViewById(R.id.sport_layoutitem4_view2_text2);
            textView3_1=itemView.findViewById(R.id.sport_layoutitem4_view3_text1);
            textView3_2=itemView.findViewById(R.id.sport_layoutitem4_view3_text2);

        }
    }

    class SportRecommend_ViewHolder5 extends RecyclerView.ViewHolder
    {
        private ImageView imageView5_1,imageView5_2,imageView5_3;
        private TextView textView5_1,textView5_2,textView5_3,textView5_4;
        private Button button5_1,button5_2,button5_3,button5_4,button5_5;
        public SportRecommend_ViewHolder5(@NonNull View itemView) {
            super(itemView);
            imageView5_1=itemView.findViewById(R.id.sport_layoutitem5_1_image1);
            imageView5_2=itemView.findViewById(R.id.sport_layoutitem5_1_image2);
            imageView5_3=itemView.findViewById(R.id.sport_layoutitem5_1_image3);

            textView5_1=itemView.findViewById(R.id.sport5_1_text);
            textView5_2=itemView.findViewById(R.id.sport5_layoutitem5_1_text1);
            textView5_3=itemView.findViewById(R.id.sport5_layoutitem5_1_text2);
            textView5_4=itemView.findViewById(R.id.sport5_layoutitem5_1_text3);
            button5_1=itemView.findViewById(R.id.sportButton5_1);
            button5_2=itemView.findViewById(R.id.sport_layoutitem5_button1);
            button5_3=itemView.findViewById(R.id.sport_layoutitem5_button2);
            button5_4=itemView.findViewById(R.id.sport_layoutitem5_button3);
            button5_5=itemView.findViewById(R.id.sport_layoutitem5_button4);

        }
    }
}

