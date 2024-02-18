import android.content.Context
import android.graphics.drawable.Drawable
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.GoogleMap

class MyMarkers(private val context: Context, private val googleMap: GoogleMap) {

    fun addMarker(latitude: Double, longitude: Double, title: String, snippet: String) {
        val markerOptions = MarkerOptions()
            .position(LatLng(latitude, longitude))
            .title(title)
            .snippet(snippet)

        googleMap.addMarker(markerOptions)
    }
}
