package com.pulkit4tech.footzy.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pulkit4tech.footzy.R;
import com.pulkit4tech.footzy.match_detail_data;
import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.List;

;

/**
 * Created by PULKIT on 2/20/2016.
 */
public class Score_Recycler_adapter extends RecyclerView.Adapter<Score_Recycler_adapter.MyHolder> {

    private LayoutInflater inflater;
    List<match_detail_data> data = Collections.emptyList();
    private Context context;

    public Score_Recycler_adapter(Context context,List<match_detail_data> data){
        this.context = context;
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewHolder = inflater.inflate(R.layout.showing_score_custom_row,
                parent,
                false);

        MyHolder myHolder = new MyHolder(viewHolder);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        match_detail_data row_data = data.get(position);
        holder.match_headline.setText(row_data.getMatch_headline());
        holder.schedule.setText(row_data.getSchedule());
        holder.team1_name.setText(row_data.getTeam1());
        holder.team2_name.setText(row_data.getTeam2());
        holder.score.setText(row_data.getScore());

        Picasso.with(context).load(row_data.getTeam1_icon()).placeholder(R.drawable.ic_launcher).error(R.drawable.ic_launcher)
                .into(holder.team1_icon);

        Picasso.with(context).load(row_data.getTeam2_icon()).placeholder(R.drawable.ic_launcher).error(R.drawable.ic_launcher)
                .into(holder.team2_icon);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        TextView match_headline;
        TextView schedule;
        ImageView team1_icon;
        TextView team1_name;
        ImageView team2_icon;
        TextView team2_name;
        TextView score;

        public MyHolder(View itemView) {
            super(itemView);

            match_headline = (TextView) itemView.findViewById(R.id.match_headline);
            schedule = (TextView) itemView.findViewById(R.id.match_schedule);
            team1_icon = (ImageView) itemView.findViewById(R.id.team_one_icon);
            team2_icon = (ImageView) itemView.findViewById(R.id.team_two_icon);
            team1_name = (TextView) itemView.findViewById(R.id.team_one_name);
            team2_name = (TextView) itemView.findViewById(R.id.team_two_name);
            score = (TextView) itemView.findViewById(R.id.score);
        }
    }
}


