import androidx.lifecycle.ViewModel
import com.example.testtask.R
import com.example.testtask.model.ItemsViewModel

class TicketViewModel : ViewModel() {
    private val ticketList = ArrayList<ItemsViewModel>()

    init {

        for (i in 1..20) {
            ticketList.add(ItemsViewModel(R.drawable.ticket))
        }
    }

    fun getTickets(): List<ItemsViewModel> {
        return ticketList
    }
}