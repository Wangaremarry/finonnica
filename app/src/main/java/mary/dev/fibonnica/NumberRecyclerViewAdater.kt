package mary.dev.fibonnica

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberRecyclerViewAdater(var numberList:List<Int>):RecyclerView.Adapter<NumberViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
       var itemView=LayoutInflater.from(parent.context)
           .inflate(R.layout.number_item_list,parent,false)
        return NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
      holder.tvnum.text=numberList.get(position).toString()
    }

    override fun getItemCount(): Int {
     return numberList.size
    }
}
class NumberViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvnum=itemView.findViewById<TextView>(R.id.tvnum)
}