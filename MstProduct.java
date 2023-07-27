package jp.co.internous.sunflower.model.domain;

import java.sql.Timestamp;

/**
 * mst_productのドメイン
 * @author インターノウス
 *
 */
public class MstProduct {
	
	//mst_productテーブルが持つカラムをフィールドとして定義
	private int id;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int price;
	private String imageFullPath;
	private String releaseDate;
	private String releaseCompany;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	//idの設定と取得
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//product_nameの設定と取得
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	//product_name_kanaの設定と取得
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	
	//product_descriptionの設定と取得
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	//priceの設定と取得
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//image_full_pathの設定と取得
	public String getImageFullPath() {
		return imageFullPath;
	}
	public void setImageFullPath(String imageFullPath) {
		this.imageFullPath = imageFullPath;
	}
	
	//release_dateの設定と取得
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	//release_companyの設定と取得
	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
	
	//createdAtの設定と取得
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	//updatedAtの設定と取得
	public Timestamp getupdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = createdAt;
	}
}
