package hyj.model;

import java.io.Serializable;

public class VehicleModelInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 车辆Id
	 * 
	 */
	private Integer VehicleId;
	/**
	 * 车型名称
	 * 
	 */
	private String brandName;
	/**
	 * 车型代码
	 * 
	 */
	private String modelCode;
	
	/**
	 * 快速查询码
	 * 
	 */
	private String fastSearchCode;
	/**
	 * 厂家名称
	 * 
	 */
	private String factoryName;
	/**
	 * 厂家编码
	 * 
	 */
	private String factoryCode;
	/**
	 * 品牌名称
	 * 
	 */
	private String vehicleBrandName;
	/**
	 * 品牌编码
	 * 
	 */
	private String vehicleBrandCode;
	/**
	 * 车系名称
	 * 
	 */
	private String vehicleSeriesName;
	/**
	 * 车系编码
	 * 
	 */
	private String vehicleSeriesCode;
	/**
	 * 车辆种类名称（轿车类，越野车类等）
	 * 
	 */
	private String vehicleClassName;
	
	/**
	 * 车辆种类编码
	 * 
	 */
	private String vehicleClassCode;
	/**
	 * 新车购置价（不含税）
	 * 
	 */
	private String purchasePriceNoTax;
	/**
	 * 新车购置价（含税）
	 * 
	 */
	private String purchasePrice;
	/**
	 * 车辆年份
	 * 
	 */
	private String vehicleYear;
	/**
	 * 气囊个数
	 * 
	 */
	private String srsNumber;
	/**
	 * 整备质量
	 * 
	 */
	private String curbWeight;
	/**
	 *变速类型 
	 * 
	 */
	private String gearboxType;
	
	/**
	 * 额定载质量（吨）
	 * 
	 */
	private String loadWeight;
	
	/**
	 * 排量
	 * 
	 */
	private String displacement;
	
	/**
	 * 座位数
	 * 
	 */
	private Integer seatCount;
	
	/**
	 *  国别性质：01-国产、02-进口、03-合资
	 * 
	 */
	private String countryNature;
	
	/**
	 * 能源类型
	 * 
	 */
	private String fuelType;
	
	/**
	 * 轴距
	 * 
	 */
	private String wheelbase;
	
	/**
	 * 整备质量最小值
	 * 
	 */
	private String curbWeightMin;
	
	/**
	 * 整备质量最大值
	 * 
	 */
	private String curbWeightMax;
	
	/**
	 * 查询码
	 * 
	 */
	private String searchCode;
	
	/**
	 * 防盗标志
	 * 
	 */
	private String stealFlag;
	
	/**
	 * 车型别名
	 * 
	 */
	private String vehicleAlias;
	
	/**
	 * 行业车型编码
	 * 
	 */
	private String modelIndustryCode;
	
	/**
	 * 行业车型名称
	 * 
	 */
	private String modelIndustryName;
	
	/**
	 * 车辆状态
	 * 
	 */
	private String vehicleStatus;
	
	/**
	 *	备注信息
	 * 
	 */
	private String remark;
	
	private String updateTime;
	
	public Integer getVehicleId() {
		return VehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		VehicleId = vehicleId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getFastSearchCode() {
		return fastSearchCode;
	}

	public void setFastSearchCode(String fastSearchCode) {
		this.fastSearchCode = fastSearchCode;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public String getFactoryCode() {
		return factoryCode;
	}

	public void setFactoryCode(String factoryCode) {
		this.factoryCode = factoryCode;
	}

	public String getVehicleBrandName() {
		return vehicleBrandName;
	}

	public void setVehicleBrandName(String vehicleBrandName) {
		this.vehicleBrandName = vehicleBrandName;
	}

	public String getVehicleBrandCode() {
		return vehicleBrandCode;
	}

	public void setVehicleBrandCode(String vehicleBrandCode) {
		this.vehicleBrandCode = vehicleBrandCode;
	}

	public String getVehicleSeriesName() {
		return vehicleSeriesName;
	}

	public void setVehicleSeriesName(String vehicleSeriesName) {
		this.vehicleSeriesName = vehicleSeriesName;
	}

	public String getVehicleSeriesCode() {
		return vehicleSeriesCode;
	}

	public void setVehicleSeriesCode(String vehicleSeriesCode) {
		this.vehicleSeriesCode = vehicleSeriesCode;
	}


	public String getVehicleClassName() {
		return vehicleClassName;
	}

	public void setVehicleClassName(String vehicleClassName) {
		this.vehicleClassName = vehicleClassName;
	}


	public String getVehicleClassCode() {
		return vehicleClassCode;
	}

	public void setVehicleClassCode(String vehicleClassCode) {
		this.vehicleClassCode = vehicleClassCode;
	}

	public String getPurchasePriceNoTax() {
		return purchasePriceNoTax;
	}

	public void setPurchasePriceNoTax(String purchasePriceNoTax) {
		this.purchasePriceNoTax = purchasePriceNoTax;
	}

	public String getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getVehicleYear() {
		return vehicleYear;
	}

	public void setVehicleYear(String vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

	public String getSrsNumber() {
		return srsNumber;
	}

	public void setSrsNumber(String srsNumber) {
		this.srsNumber = srsNumber;
	}

	public String getCurbWeight() {
		return curbWeight;
	}

	public void setCurbWeight(String curbWeight) {
		this.curbWeight = curbWeight;
	}

	public String getGearboxType() {
		return gearboxType;
	}

	public void setGearboxType(String gearboxType) {
		this.gearboxType = gearboxType;
	}

	public String getLoadWeight() {
		return loadWeight;
	}

	public void setLoadWeight(String loadWeight) {
		this.loadWeight = loadWeight;
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public Integer getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}

	public String getCountryNature() {
		return countryNature;
	}

	public void setCountryNature(String countryNature) {
		this.countryNature = countryNature;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getWheelbase() {
		return wheelbase;
	}

	public void setWheelbase(String wheelbase) {
		this.wheelbase = wheelbase;
	}

	public String getCurbWeightMin() {
		return curbWeightMin;
	}

	public void setCurbWeightMin(String curbWeightMin) {
		this.curbWeightMin = curbWeightMin;
	}

	public String getCurbWeightMax() {
		return curbWeightMax;
	}

	public void setCurbWeightMax(String curbWeightMax) {
		this.curbWeightMax = curbWeightMax;
	}

	public String getSearchCode() {
		return searchCode;
	}

	public void setSearchCode(String searchCode) {
		this.searchCode = searchCode;
	}

	public String getStealFlag() {
		return stealFlag;
	}

	public void setStealFlag(String stealFlag) {
		this.stealFlag = stealFlag;
	}

	public String getVehicleAlias() {
		return vehicleAlias;
	}

	public void setVehicleAlias(String vehicleAlias) {
		this.vehicleAlias = vehicleAlias;
	}

	public String getModelIndustryCode() {
		return modelIndustryCode;
	}

	public void setModelIndustryCode(String modelIndustryCode) {
		this.modelIndustryCode = modelIndustryCode;
	}

	public String getModelIndustryName() {
		return modelIndustryName;
	}

	public void setModelIndustryName(String modelIndustryName) {
		this.modelIndustryName = modelIndustryName;
	}

	public String getVehicleStatus() {
		return vehicleStatus;
	}

	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
