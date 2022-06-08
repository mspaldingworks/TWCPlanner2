package com.mad.e.twcplanner2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mad.e.twcplanner2.R
import com.mad.e.twcplanner2.model.entities.Workshop

class WorkshopListAdapter (private val onWorkshopCLicked:  (Workshop) -> Unit,
) : ListAdapter<Workshop, WorkshopListAdapter.WorkshopViewHolder>(WorkshopItemCallback) {

    inner class WorkshopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(workshop: Workshop) {
            val textView = itemView.findViewById<TextView>(R.id.imv_session_list)

            textView.text = workshop.title
            itemView.setOnClickListener {
                onWorkshopCLicked(workshop)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkshopViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.fragment_session_list, parent, false)

        return WorkshopViewHolder(itemView)

    }


    override fun onBindViewHolder(holder: WorkshopViewHolder, position: Int) {
        val session = getItem(position)
        holder.bind(session)

    }

    object WorkshopItemCallback : DiffUtil.ItemCallback<Workshop>() {
        override fun areItemsTheSame(oldItem: Workshop, newItem: Workshop): Boolean {
            return oldItem.id == newItem.id


        }

        override fun areContentsTheSame(oldItem: Workshop, newItem: Workshop): Boolean {
            return oldItem == newItem        }

    }
}