/*
 * Contract API
 * The Contract API allows you to select contract data
 *
 * OpenAPI spec version: 1.0.0
 * Contact: CorporateSystemsSaoCarlos@br.experian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.serasa.common.utils.model.athenas;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Information about the contract
 */
@ApiModel(description = "Information about the contract")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-31T13:50:57.646-03:00")
public class ActiveContract   {
  @JsonProperty("contractNumber")
  private String contractNumber = null;

  public ActiveContract contractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
    return this;
  }

  /**
   * Contract Number
   * @return contractNumber
   **/
  @JsonProperty("contractNumber")
  @ApiModelProperty(value = "Contract Number")
  public String getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveContract activeContract = (ActiveContract) o;
    return Objects.equals(this.contractNumber, activeContract.contractNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveContract {\n");
    
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

