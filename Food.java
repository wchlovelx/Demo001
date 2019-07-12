package com.qf.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 2019/7/8
 * Administrator
 * springboot0708
 * 面向对象面向君  不负代码不负卿
 */
@Entity
public class Food implements Serializable {
    @Id
    @Column(name = "foodid")
    @JsonProperty("id") //java对象转换成json格式时的key
    @JSONField(name = "productId")   //json->java的key
    private String foodId;
    @Column(name = "foodname")
    @JsonProperty("name")
    private String foodName;
    @Column(name = "foodprice")
    @JsonProperty("price")
    private Double foodPrice;
    @Column(name = "fooddesc")
    @JsonProperty("description")
    private String foodDesc;
    @Column(name = "foodicon")
    @JsonProperty("icon")
    private String foodIcon;
    @Column(name = "foodimage")
    private String foodImage;
    @Column(name = "foodtypeid")
    private int foodTypeId;
    @Column(name = "foodstatus")
    private Integer foodStatus;
    @Column(name = "foodcount")
    private Integer foodCount;
    @Column(name = "createtime")
    private Date createTime;
    @Column(name = "updatetime")
    private Date updateTime;

    @ManyToOne
    @JoinColumn(name = "foodtypeid",updatable = false,insertable = false)
    @JsonBackReference  //取消被修饰的属性的序列化操作
    private Foodtype foodType;

    @OneToMany(mappedBy = "food")//取消被修饰的属性的序列化操作
    @JsonBackReference
    private List<Orderdetail> orderDetailList;


    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    public String getFoodIcon() {
        return foodIcon;
    }

    public void setFoodIcon(String foodIcon) {
        this.foodIcon = foodIcon;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public int getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(int foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    public Integer getFoodStatus() {
        return foodStatus;
    }

    public void setFoodStatus(Integer foodStatus) {
        this.foodStatus = foodStatus;
    }

    public Integer getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(Integer foodCount) {
        this.foodCount = foodCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Foodtype getFoodType() {
        return foodType;
    }

    public void setFoodType(Foodtype foodType) {
        this.foodType = foodType;
    }

    public List<Orderdetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<Orderdetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }



}
