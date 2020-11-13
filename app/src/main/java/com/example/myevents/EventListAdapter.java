package com.example.myevents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventViewHolder> {
    private ArrayList<Event> events;
    public EventListAdapter(ArrayList<Event> events)
    {
        this.events = events;
    }
    @NonNull
    @Override
    public EventListAdapter.EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_list_item, parent, false);
        return new EventListAdapter.EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        holder.date.setText(events.get(position).getDate());
        holder.description.setText(events.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder
    {
        TextView date;
        TextView description;
        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.date_textView);
            description = itemView.findViewById(R.id.description_textView);
        }
    }

}

