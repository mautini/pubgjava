package com.mautini.pubgjava.model.asset;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.generic.Entity;

public class Asset extends Entity {

    @SerializedName("attributes")
    private AssetAttributes assetAttributes;

    public Asset() {
    }

    public AssetAttributes getAssetAttributes() {
        return assetAttributes;
    }

    public void setAssetAttributes(AssetAttributes assetAttributes) {
        this.assetAttributes = assetAttributes;
    }
}
