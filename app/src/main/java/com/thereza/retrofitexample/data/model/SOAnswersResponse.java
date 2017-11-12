package com.thereza.retrofitexample.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by theReza on 11/10/2017.
 */

    public class SOAnswersResponse {

        @SerializedName("items")
        @Expose
        private List<Item> items = null;
        @SerializedName("has_more")
        @Expose
        private Boolean hasMore;
        @SerializedName("quota_max")
        @Expose
        private Integer quotaMax;
        @SerializedName("quota_remaining")
        @Expose
        private Integer quotaRemaining;

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public Boolean getHasMore() {
            return hasMore;
        }

        public void setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
        }

        public Integer getQuotaMax() {
            return quotaMax;
        }

        public void setQuotaMax(Integer quotaMax) {
            this.quotaMax = quotaMax;
        }

        public Integer getQuotaRemaining() {
            return quotaRemaining;
        }

        public void setQuotaRemaining(Integer quotaRemaining) {
            this.quotaRemaining = quotaRemaining;
        }

    }
