package com.mad.e.twcplanner2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mad.e.twcplanner2.R
import com.mad.e.twcplanner2.adapters.WorkshopAdapter
import com.mad.e.twcplanner2.adapters.WorkshopListAdapter
import com.mad.e.twcplanner2.model.entities.Workshop
import com.mad.e.twcplanner2.viewmodel.WorkshopViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AllWorkshopsFragment : Fragment(R.layout.fragment_session_list) {

    private var adapter: WorkshopAdapter = WorkshopAdapter()

    private val workshopAdapter = WorkshopListAdapter(this::onWorkshopClicked)

    private fun onWorkshopClicked(workshop: Workshop): Workshop {
        return (workshop)

    }

    private val viewModel: WorkshopViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        adapter.setOnClickListener()
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(0)
        recyclerView.adapter = workshopAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        viewModel.workshops.observe(viewLifecycleOwner) {
        }
    }
}