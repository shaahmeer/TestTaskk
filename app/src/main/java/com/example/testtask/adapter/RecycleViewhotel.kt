import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testtask.R
import com.example.testtask.databinding.HotellayoutBinding
import com.example.testtask.model.HotelItem

class RecycleViewhotel(private val mList: List<HotelItem>) : RecyclerView.Adapter<RecycleViewhotel.HotelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = HotellayoutBinding.inflate(inflater, parent, false)
        return HotelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HotelViewHolder, position: Int) {
        val item = mList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class HotelViewHolder(private val binding: HotellayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: HotelItem) {
            binding.itemImage.setImageResource(item.itemImage)
            binding.rating.text = item.itemRating.toString()
            binding.itemHeading.text = item.itemHeading
            binding.itemDescription.text = item.itemDescription
        }
    }
}