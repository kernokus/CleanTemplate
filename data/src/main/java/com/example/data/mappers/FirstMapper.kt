package com.example.data.mappers

import com.example.data.models.FirstModelData
import com.example.domain.models.FirstModelDomain
import javax.inject.Inject


class FirstMapper @Inject constructor() {

        fun toMap(shareModelServer: FirstModelData): FirstModelDomain {
            return FirstModelDomain(
                shareModelServer.shareMessage ?: "",
                shareModelServer.shareUrl ?: "",
                shareModelServer.source ?: ""
            )
        }
    }
