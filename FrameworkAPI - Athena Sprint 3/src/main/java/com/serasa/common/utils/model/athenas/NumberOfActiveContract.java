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
 * Number of active contracts
 */
@ApiModel(description = "Number of active contracts")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-31T13:50:57.646-03:00")
public class NumberOfActiveContract   {
  @JsonProperty("numberOfActiveContract")
  private Integer numberOfActiveContract = null;

  public NumberOfActiveContract numberOfActiveContract(Integer numberOfActiveContract) {
    this.numberOfActiveContract = numberOfActiveContract;
    return this;
  }

  /**
   * Number of active contracts
   * @return numberOfActiveContract
   **/
  @JsonProperty("numberOfActiveContract")
  @ApiModelProperty(value = "Number of active contracts")
  public Integer getNumberOfActiveContract() {
    return numberOfActiveContract;
  }

  public void setNumberOfActiveContract(Integer numberOfActiveContract) {
    this.numberOfActiveContract = numberOfActiveContract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOfActiveContract numberOfActiveContract = (NumberOfActiveContract) o;
    return Objects.equals(this.numberOfActiveContract, numberOfActiveContract.numberOfActiveContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfActiveContract);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOfActiveContract {\n");
    
    sb.append("    numberOfActiveContract: ").append(toIndentedString(numberOfActiveContract)).append("\n");
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

