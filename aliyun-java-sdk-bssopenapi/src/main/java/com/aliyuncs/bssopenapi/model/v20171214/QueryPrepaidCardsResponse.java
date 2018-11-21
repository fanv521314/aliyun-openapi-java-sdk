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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryPrepaidCardsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPrepaidCardsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<PrepaidCard> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<PrepaidCard> getData() {
		return this.data;
	}

	public void setData(List<PrepaidCard> data) {
		this.data = data;
	}

	public static class PrepaidCard {

		private Long prepaidCardId;

		private String prepaidCardNo;

		private String grantedTime;

		private String effectiveTime;

		private String expiryTime;

		private String applicableProducts;

		private String applicableScenarios;

		private String nominalValue;

		private String balance;

		private String status;

		public Long getPrepaidCardId() {
			return this.prepaidCardId;
		}

		public void setPrepaidCardId(Long prepaidCardId) {
			this.prepaidCardId = prepaidCardId;
		}

		public String getPrepaidCardNo() {
			return this.prepaidCardNo;
		}

		public void setPrepaidCardNo(String prepaidCardNo) {
			this.prepaidCardNo = prepaidCardNo;
		}

		public String getGrantedTime() {
			return this.grantedTime;
		}

		public void setGrantedTime(String grantedTime) {
			this.grantedTime = grantedTime;
		}

		public String getEffectiveTime() {
			return this.effectiveTime;
		}

		public void setEffectiveTime(String effectiveTime) {
			this.effectiveTime = effectiveTime;
		}

		public String getExpiryTime() {
			return this.expiryTime;
		}

		public void setExpiryTime(String expiryTime) {
			this.expiryTime = expiryTime;
		}

		public String getApplicableProducts() {
			return this.applicableProducts;
		}

		public void setApplicableProducts(String applicableProducts) {
			this.applicableProducts = applicableProducts;
		}

		public String getApplicableScenarios() {
			return this.applicableScenarios;
		}

		public void setApplicableScenarios(String applicableScenarios) {
			this.applicableScenarios = applicableScenarios;
		}

		public String getNominalValue() {
			return this.nominalValue;
		}

		public void setNominalValue(String nominalValue) {
			this.nominalValue = nominalValue;
		}

		public String getBalance() {
			return this.balance;
		}

		public void setBalance(String balance) {
			this.balance = balance;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public QueryPrepaidCardsResponse getInstance(UnmarshallerContext context) {
		return	QueryPrepaidCardsResponseUnmarshaller.unmarshall(this, context);
	}
}