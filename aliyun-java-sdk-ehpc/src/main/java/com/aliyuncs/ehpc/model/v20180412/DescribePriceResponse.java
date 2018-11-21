/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.DescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceResponse extends AcsResponse {

	private String requestId;

	private Float totalTradePrice;

	private List<PriceInfo> prices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Float getTotalTradePrice() {
		return this.totalTradePrice;
	}

	public void setTotalTradePrice(Float totalTradePrice) {
		this.totalTradePrice = totalTradePrice;
	}

	public List<PriceInfo> getPrices() {
		return this.prices;
	}

	public void setPrices(List<PriceInfo> prices) {
		this.prices = prices;
	}

	public static class PriceInfo {

		private String nodeType;

		private Float originalPrice;

		private Float tradePrice;

		private String currency;

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public Float getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(Float originalPrice) {
			this.originalPrice = originalPrice;
		}

		public Float getTradePrice() {
			return this.tradePrice;
		}

		public void setTradePrice(Float tradePrice) {
			this.tradePrice = tradePrice;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}