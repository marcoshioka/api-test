/*
 * Invoice API
 * This Invoice API allows you to get informations about invoices.
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
 * Invoices amount and total value
 */
@ApiModel(description = "Invoices amount and total value")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-08-02T11:46:37.783-03:00")
public class InvoicesAmount   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("totalValue")
  private Float totalValue = null;

  public InvoicesAmount count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of open invoices
   * @return count
   **/
  @JsonProperty("count")
  @ApiModelProperty(value = "Number of open invoices")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public InvoicesAmount totalValue(Float totalValue) {
    this.totalValue = totalValue;
    return this;
  }

  /**
   * Total value of open invoices
   * @return totalValue
   **/
  @JsonProperty("totalValue")
  @ApiModelProperty(value = "Total value of open invoices")
  public Float getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(Float totalValue) {
    this.totalValue = totalValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicesAmount invoicesAmount = (InvoicesAmount) o;
    return Objects.equals(this.count, invoicesAmount.count) &&
        Objects.equals(this.totalValue, invoicesAmount.totalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, totalValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicesAmount {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
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

