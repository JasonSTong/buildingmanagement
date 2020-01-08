package com.chinasoft.pojo;

import java.sql.Date;

public class Material {
	private int materialId ;
	private String materialName ;
	private int materialCount;
	private float materialPrice;
	private int typeId;
	private Date materialInDate ;
	private Date materialOutDate;
	private int materialStat;
	private int materialDelete;
	
	public Material() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Material(int materialId, String materialName, int materialCount, float materialPrice, int typeId,
			Date materialInDate, Date materialOutDate, int materialStat, int materialDelete) {
		super();
		this.materialId = materialId;
		this.materialName = materialName;
		this.materialCount = materialCount;
		this.materialPrice = materialPrice;
		this.typeId = typeId;
		this.materialInDate = materialInDate;
		this.materialOutDate = materialOutDate;
		this.materialStat = materialStat;
		this.materialDelete = materialDelete;
	}
	public int getMaterialId() {
		return materialId;
	}
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public int getMaterialCount() {
		return materialCount;
	}
	public void setMaterialCount(int materialCount) {
		this.materialCount = materialCount;
	}
	public float getMaterialPrice() {
		return materialPrice;
	}
	public void setMaterialPrice(float materialPrice) {
		this.materialPrice = materialPrice;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public Date getMaterialInDate() {
		return materialInDate;
	}
	public void setMaterialInDate(Date materialInDate) {
		this.materialInDate = materialInDate;
	}
	public Date getMaterialOutDate() {
		return materialOutDate;
	}
	public void setMaterialOutDate(Date materialOutDate) {
		this.materialOutDate = materialOutDate;
	}
	public int getMaterialStat() {
		return materialStat;
	}
	public void setMaterialStat(int materialStat) {
		this.materialStat = materialStat;
	}
	public int getMaterialDelete() {
		return materialDelete;
	}
	public void setMaterialDelete(int materialDelete) {
		this.materialDelete = materialDelete;
	}
}
