import android.graphics.Color
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.PolylineOptions
import com.google.android.gms.maps.GoogleMap

class MyPath(private val googleMap: GoogleMap) {

    fun drawPath(latitude1: Double, longitude1: Double, latitude2: Double, longitude2: Double) {
        val polylineOptions = PolylineOptions()
            .add(LatLng(latitude1, longitude1))
            .add(LatLng(latitude2, longitude2))
            .color(Color.RED)
            .width(5f)

        googleMap.addPolyline(polylineOptions)
    }
}
