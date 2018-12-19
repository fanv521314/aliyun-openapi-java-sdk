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

import com.aliyuncs.edas.model.v20170801.DisableFlowControlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableFlowControlResponseUnmarshaller {

	public static DisableFlowControlResponse unmarshall(DisableFlowControlResponse disableFlowControlResponse, UnmarshallerContext context) {
		
		disableFlowControlResponse.setRequestId(context.stringValue("DisableFlowControlResponse.RequestId"));
		disableFlowControlResponse.setCode(context.integerValue("DisableFlowControlResponse.Code"));
		disableFlowControlResponse.setMessage(context.stringValue("DisableFlowControlResponse.Message"));
	 
	 	return disableFlowControlResponse;
	}
}