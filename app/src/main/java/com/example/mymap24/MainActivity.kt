import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var googleMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        this.googleMap = googleMap

        // Középpont beállítása
        val location = LatLng(47.0,  19.0)
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,  10f))

        // Marker hozzáadása
        val myMarkers = MyMarkers(this, googleMap)
        myMarkers.addMarker(47.0,  19.0, "Marker Title", "Marker Description")

        // Útvonal hozzáadása
        val myPath = MyPath(googleMap)
        myPath.drawPath(47.0,  19.0,  47.1,  19.1)
    }
}
