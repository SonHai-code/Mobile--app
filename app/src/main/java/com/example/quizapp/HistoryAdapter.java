package com.example.quizapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizapp.databinding.ItemHistoryBinding;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {

    private Context mContext;
    private List<History> mHistoryList;

    public HistoryAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<History> list) {
        this.mHistoryList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, parent, false);
        return new HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {
        History history = mHistoryList.get(position);
        if (history == null){
            return;
        }
        holder.tvScore.setText(history.getScore());
        holder.tvCategory.setText(history.getCategory());
        holder.tvDifficulty.setText(history.getDifficulty());
        holder.tvDate.setText(history.getDate());
    }

    @Override
    public int getItemCount() {
        if (mHistoryList != null) {
            return mHistoryList.size();
        }
        return 0;
    }


    public class HistoryViewHolder extends RecyclerView.ViewHolder {
        private TextView tvScore;
        private TextView tvCategory;
        private TextView tvDifficulty;
        private TextView tvDate;

        public HistoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tvScore = itemView.findViewById(R.id.tv_score);
            tvCategory = itemView.findViewById(R.id.tv_category);
            tvDifficulty = itemView.findViewById(R.id.tv_difficulty);
            tvDate = itemView.findViewById(R.id.tv_date);

        }
    }
}
