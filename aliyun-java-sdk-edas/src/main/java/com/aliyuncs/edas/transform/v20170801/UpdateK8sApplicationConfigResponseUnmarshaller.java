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

import com.aliyuncs.edas.model.v20170801.UpdateK8sApplicationConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateK8sApplicationConfigResponseUnmarshaller {

	public static UpdateK8sApplicationConfigResponse unmarshall(UpdateK8sApplicationConfigResponse updateK8sApplicationConfigResponse, UnmarshallerContext context) {
		
		updateK8sApplicationConfigResponse.setRequestId(context.stringValue("UpdateK8sApplicationConfigResponse.RequestId"));
		updateK8sApplicationConfigResponse.setCode(context.integerValue("UpdateK8sApplicationConfigResponse.Code"));
		updateK8sApplicationConfigResponse.setMessage(context.stringValue("UpdateK8sApplicationConfigResponse.Message"));
		updateK8sApplicationConfigResponse.setChangeOrderId(context.stringValue("UpdateK8sApplicationConfigResponse.ChangeOrderId"));
	 
	 	return updateK8sApplicationConfigResponse;
	}
}