/*
 * Copyright (c) 2018 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.hybrid.gateway.throttling.synchronizer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "")
public class QueryParameterConditionDTO extends ThrottleConditionDTO {

  private String parameterName = null;

  private String parameterValue = null;

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("parameterName")
  public String getParameterName() {
    return parameterName;
  }
  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("parameterValue")
  public String getParameterValue() {
    return parameterValue;
  }
  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryParameterConditionDTO {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  parameterName: ").append(parameterName).append("\n");
    sb.append("  parameterValue: ").append(parameterValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
