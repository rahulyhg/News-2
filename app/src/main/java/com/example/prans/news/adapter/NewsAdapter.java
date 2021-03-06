package com.example.prans.news.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.prans.news.R;
import com.example.prans.news.data.News;

import java.util.List;

/**
 * Created by prans on 08-01-2018.
 */

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(@NonNull Context context, List<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.news_item, parent, false);
        }

        News news = getItem(position);

        TextView tv_title = view.findViewById(R.id.title);
        assert news != null;
        String html = (news.getTitle()).replaceAll("<(.*?)\\>", " ");
        tv_title.setText(html);

        TextView tv_source = view.findViewById(R.id.source);
        tv_source.setText(news.getSource());

        ImageView urlToImage = view.findViewById(R.id.urlToImage);
        Glide.with(getContext()).load(news.getUrlToImage()).into(urlToImage);

        return view;
    }
}
