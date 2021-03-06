package com.zhiyou.model;

public class Drug {
    private String drugNum;

    private String drugUrl;

    private Double purchasPrice;

    private Double salePrice;

    private String drugName;

    private Integer drugType;

    private String simpleDetail;

    private String prodecedDate;

    private String expirationDate;

    private Integer qualityDate;

    private String detail;

    private String manufacture;

    private String useInfor;

    private Integer totalStock;

    private Integer surplus;

    private Integer status;

    private String noted;
    

    @Override
	public String toString() {
		return "Drug [drugNum=" + drugNum + ", drugUrl=" + drugUrl + ", purchasPrice=" + purchasPrice + ", salePrice="
				+ salePrice + ", drugName=" + drugName + ", drugType=" + drugType + ", simpleDetail=" + simpleDetail
				+ ", prodecedDate=" + prodecedDate + ", expirationDate=" + expirationDate + ", qualityDate="
				+ qualityDate + ", detail=" + detail + ", manufacture=" + manufacture + ", useInfor=" + useInfor
				+ ", totalStock=" + totalStock + ", surplus=" + surplus + ", status=" + status + ", noted=" + noted
				+ "]";
	}

	public String getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(String drugNum) {
        this.drugNum = drugNum;
    }

    public String getDrugUrl() {
        return drugUrl;
    }

    public void setDrugUrl(String drugUrl) {
        this.drugUrl = drugUrl;
    }

    public Double getPurchasPrice() {
        return purchasPrice;
    }

    public void setPurchasPrice(Double purchasPrice) {
        this.purchasPrice = purchasPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Integer getDrugType() {
        return drugType;
    }

    public void setDrugType(Integer drugType) {
        this.drugType = drugType;
    }

    public String getSimpleDetail() {
        return simpleDetail;
    }

    public void setSimpleDetail(String simpleDetail) {
        this.simpleDetail = simpleDetail;
    }

    public String getProdecedDate() {
        return prodecedDate;
    }

    public void setProdecedDate(String prodecedDate) {
        this.prodecedDate = prodecedDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getQualityDate() {
        return qualityDate;
    }

    public void setQualityDate(Integer qualityDate) {
        this.qualityDate = qualityDate;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getUseInfor() {
        return useInfor;
    }

    public void setUseInfor(String useInfor) {
        this.useInfor = useInfor;
    }

    public Integer getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNoted() {
        return noted;
    }

    public void setNoted(String noted) {
        this.noted = noted;
    }
}