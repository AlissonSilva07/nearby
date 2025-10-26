package br.com.alissonrego.nearby.ui.screen.market_details

import br.com.alissonrego.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null,
)