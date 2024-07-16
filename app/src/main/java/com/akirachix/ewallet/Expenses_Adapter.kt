package com.akirachix.ewallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Expenses_Adapter(val expensesList: List<Expenses>): RecyclerView.Adapter<ExpensesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.expense_list_item, parent, false)
        return ExpensesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return expensesList.size
    }
    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
        val expenses = expensesList[position]
        holder.tvDate.text=expenses.date
        holder.tvExpense.text = expenses.expense
        holder.tvAmount.text = expenses.amount


    }
}
class ExpensesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var tvExpense:TextView = itemView.findViewById(R.id.tvExpense)
    var tvAmount:TextView = itemView.findViewById(R.id.tvAmount)
    var tvDate:TextView = itemView.findViewById(R.id.tvDate)
}