package br.com.alissonrego.nearby.ui.screen.home

import br.com.alissonrego.nearby.data.model.Market
import br.com.alissonrego.nearby.data.model.NearbyCategory
import com.google.android.gms.maps.model.LatLng

data class HomeUiState(
    val categories: List<NearbyCategory>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null
)