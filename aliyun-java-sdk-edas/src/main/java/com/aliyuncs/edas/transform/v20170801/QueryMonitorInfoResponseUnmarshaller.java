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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.QueryMonitorInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMonitorInfoResponseUnmarshaller {

	public static QueryMonitorInfoResponse unmarshall(QueryMonitorInfoResponse queryMonitorInfoResponse, UnmarshallerContext context) {
		
		queryMonitorInfoResponse.setRequestId(context.stringValue("QueryMonitorInfoResponse.RequestId"));
		queryMonitorInfoResponse.setCode(context.integerValue("QueryMonitorInfoResponse.Code"));
		queryMonitorInfoResponse.setMessage(context.stringValue("QueryMonitorInfoResponse.Message"));
		queryMonitorInfoResponse.setMonitorInfo(context.stringValue("QueryMonitorInfoResponse.MonitorInfo"));
	 
	 	return queryMonitorInfoResponse;
	}
}