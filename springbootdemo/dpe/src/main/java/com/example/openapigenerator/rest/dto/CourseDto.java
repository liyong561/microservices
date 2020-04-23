package com.example.openapigenerator.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 展示详情时课程对象
 */
@ApiModel(description = "展示详情时课程对象")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-03T22:20:10.567+08:00[Asia/Shanghai]")

public class CourseDto   {
  @JsonProperty("id")
  private Long id;

  /**
   * 课程状态[审核中，已发布，已下架，编辑中，未通过，被下架]
   */
  public enum StatusEnum {
    UNDERREVIEW("underReview"),
    
    PUBLISHED("published"),
    
    INACTIVE("inactive"),
    
    EDITING("editing"),
    
    REJECTED("rejected"),
    
    REMOVED("removed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("price")
  private Double price;

  @JsonProperty("title")
  private String title;

  @JsonProperty("cover")
  private String cover;

  @JsonProperty("presenterRef")
  private Long presenterRef;

  @JsonProperty("shortDesc")
  private String shortDesc;

  @JsonProperty("albumRef")
  private Long albumRef;

  @JsonProperty("homepageRef")
  private Long homepageRef;

  @JsonProperty("poster")
  private String poster;

  @JsonProperty("createdTime")
  private LocalDate createdTime;

  public CourseDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CourseDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * 课程状态[审核中，已发布，已下架，编辑中，未通过，被下架]
   * @return status
  **/
  @ApiModelProperty(value = "课程状态[审核中，已发布，已下架，编辑中，未通过，被下架]")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CourseDto price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public CourseDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CourseDto cover(String cover) {
    this.cover = cover;
    return this;
  }

  /**
   * Get cover
   * @return cover
  **/
  @ApiModelProperty(value = "")


  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public CourseDto presenterRef(Long presenterRef) {
    this.presenterRef = presenterRef;
    return this;
  }

  /**
   * Get presenterRef
   * @return presenterRef
  **/
  @ApiModelProperty(value = "")


  public Long getPresenterRef() {
    return presenterRef;
  }

  public void setPresenterRef(Long presenterRef) {
    this.presenterRef = presenterRef;
  }

  public CourseDto shortDesc(String shortDesc) {
    this.shortDesc = shortDesc;
    return this;
  }

  /**
   * Get shortDesc
   * @return shortDesc
  **/
  @ApiModelProperty(value = "")


  public String getShortDesc() {
    return shortDesc;
  }

  public void setShortDesc(String shortDesc) {
    this.shortDesc = shortDesc;
  }

  public CourseDto albumRef(Long albumRef) {
    this.albumRef = albumRef;
    return this;
  }

  /**
   * 主站专辑id引用
   * @return albumRef
  **/
  @ApiModelProperty(value = "主站专辑id引用")


  public Long getAlbumRef() {
    return albumRef;
  }

  public void setAlbumRef(Long albumRef) {
    this.albumRef = albumRef;
  }

  public CourseDto homepageRef(Long homepageRef) {
    this.homepageRef = homepageRef;
    return this;
  }

  /**
   * 个人主页id引用
   * @return homepageRef
  **/
  @ApiModelProperty(value = "个人主页id引用")


  public Long getHomepageRef() {
    return homepageRef;
  }

  public void setHomepageRef(Long homepageRef) {
    this.homepageRef = homepageRef;
  }

  public CourseDto poster(String poster) {
    this.poster = poster;
    return this;
  }

  /**
   * 海报
   * @return poster
  **/
  @ApiModelProperty(value = "海报")


  public String getPoster() {
    return poster;
  }

  public void setPoster(String poster) {
    this.poster = poster;
  }

  public CourseDto createdTime(LocalDate createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(LocalDate createdTime) {
    this.createdTime = createdTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseDto courseDto = (CourseDto) o;
    return Objects.equals(this.id, courseDto.id) &&
        Objects.equals(this.status, courseDto.status) &&
        Objects.equals(this.price, courseDto.price) &&
        Objects.equals(this.title, courseDto.title) &&
        Objects.equals(this.cover, courseDto.cover) &&
        Objects.equals(this.presenterRef, courseDto.presenterRef) &&
        Objects.equals(this.shortDesc, courseDto.shortDesc) &&
        Objects.equals(this.albumRef, courseDto.albumRef) &&
        Objects.equals(this.homepageRef, courseDto.homepageRef) &&
        Objects.equals(this.poster, courseDto.poster) &&
        Objects.equals(this.createdTime, courseDto.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, price, title, cover, presenterRef, shortDesc, albumRef, homepageRef, poster, createdTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    presenterRef: ").append(toIndentedString(presenterRef)).append("\n");
    sb.append("    shortDesc: ").append(toIndentedString(shortDesc)).append("\n");
    sb.append("    albumRef: ").append(toIndentedString(albumRef)).append("\n");
    sb.append("    homepageRef: ").append(toIndentedString(homepageRef)).append("\n");
    sb.append("    poster: ").append(toIndentedString(poster)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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

