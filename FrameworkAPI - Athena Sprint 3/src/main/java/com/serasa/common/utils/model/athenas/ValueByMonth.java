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
 * Value by month
 */
@ApiModel(description = "Value by month")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-31T13:50:57.646-03:00")
public class ValueByMonth   {
  @JsonProperty("month")
  private Integer month = null;

  @JsonProperty("value")
  private Float value = null;

  public ValueByMonth month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Invoice month
   * @return month
   **/
  @JsonProperty("month")
  @ApiModelProperty(value = "Invoice month")
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public ValueByMonth value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Invoice value
   * @return value
   **/
  @JsonProperty("value")
  @ApiModelProperty(value = "Invoice value")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueByMonth valueByMonth = (ValueByMonth) o;
    return Objects.equals(this.month, valueByMonth.month) &&
        Objects.equals(this.value, valueByMonth.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueByMonth {\n");
    
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
