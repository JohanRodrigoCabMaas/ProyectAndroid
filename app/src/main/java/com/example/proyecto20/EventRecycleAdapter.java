package com.example.proyecto20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EventRecycleAdapter extends RecyclerView.Adapter<EventRecycleAdapter.MyViewHolder> {
    Context context;
    ArrayList<Events> arrayList;

    public EventRecycleAdapter(Context context, ArrayList<Events> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.show_events_rowlayout,parent)
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Events events= arrayList.get(position);
        holder.Event.setText(events.getEVENT());
        holder.DateTxt.setText(events.getDATE);
        holder.Time.setText(events.getTime),

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView DataTxt,Event,Time;
        public MyViewHolder(@Nullable View itemView){
            super(itemView);
            DataTxt=itemView.findViewById(R.id.eventdate);
                Event= itemView.findViewById(R.id.eventname);
                Time= itemView.findViewById(R.id.eventtime);
        }
    }
}
