package com.example.magictestapp
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter : RecyclerView.Adapter<CardAdapter.ViewHolder>() {
    val cards: MutableList<Card> = mutableListOf()

    override fun getItemCount() = this.cards.size

    fun addCard(card: Card){
        this.cards.add(0, card)
        this.notifyItemInserted(0)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val checkBox: CheckBox = view.findViewById(R.id.card_checkbox)
        private val cardTextTV: TextView = view.findViewById(R.id.card_list_text)

        init {
            checkBox.setOnCheckedChangeListener { button, isChecked ->
                cards[absoluteAdapterPosition].completed = isChecked
            }
        }

        fun bind(card: Card){
            this.checkBox.isChecked = card.completed
            this.cardTextTV.text = card.text
        }
    }
}